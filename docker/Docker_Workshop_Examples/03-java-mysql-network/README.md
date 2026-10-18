# 03 — Java + MySQL over a Docker network

## Why a network?
Containers on a user-defined bridge network can reach each other by container name. Java connects to `mysql-db:3306`; it should not use `localhost`, because `localhost` inside Java means the Java container itself.

## 1. Build Java image
```bash
docker build -t java-mysql-demo:1.0 ./java-app
```

## 2. Create network and persistent database volume
```bash
docker network create demo-net
docker volume create mysql-data
```

## 3. Start MySQL on the network
```bash
docker run -d --name mysql-db --network demo-net \
  -e MYSQL_ROOT_PASSWORD=localroot123 \
  -e MYSQL_DATABASE=demo \
  -e MYSQL_USER=demo \
  -e MYSQL_PASSWORD=demo123 \
  -v mysql-data:/var/lib/mysql \
  --health-cmd="mysqladmin ping -h localhost -p$MYSQL_ROOT_PASSWORD" \
  --health-interval=5s --health-timeout=3s --health-retries=20 \
  mysql:8.4
```
For a beginner demo, wait until this command reports healthy:
```bash
docker ps
docker logs mysql-db
```

## 4. Run Java query container
```bash
docker run --rm --name java-query --network demo-net \
  -e DB_HOST=mysql-db -e MYSQL_DATABASE=demo \
  -e MYSQL_USER=demo -e MYSQL_PASSWORD=demo123 \
  java-mysql-demo:1.0
```
Expected output: `Hello from MySQL`

The Java app executes:
```sql
SELECT 'Hello from MySQL' AS message;
```

## 5. Inspect network and cleanup
```bash
docker network inspect demo-net
docker rm -f mysql-db
docker network rm demo-net
```
`mysql-data` survives container removal. Remove it only if you intend to delete the demo database:
```bash
docker volume rm mysql-data
```
Demo credentials are not for production. The MySQL port is not published to the host because Java only needs internal network access.
