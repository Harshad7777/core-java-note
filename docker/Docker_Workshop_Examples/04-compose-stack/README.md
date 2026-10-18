# 04 — Docker Compose: run the stack from YAML

This example defines three services in one `compose.yaml`:
- `mysql-db`: MySQL with a named volume and health check.
- `java-query`: builds the Java JDBC application and runs the SELECT query after MySQL is healthy.
- `web`: builds the custom Nginx image and publishes host port 8081 to container port 80.

## Run it
From this folder:
```bash
docker compose config
docker compose up --build -d
docker compose ps
docker compose logs java-query
```
Expected Java output in logs: `Hello from MySQL`. Open `http://localhost:8081` for the Nginx page.

## Stop it
```bash
docker compose down
```
This removes project containers and the Compose network but keeps the named volume. To remove the database data too:
```bash
docker compose down -v
```
Be careful: `-v` deletes the project named volume and its data.

## What Compose improves
- Keeps service settings, build contexts, environment, port mappings, networks, health checks and volumes in one versionable YAML file.
- Creates a project network automatically and provides service-name DNS.
- Repeats the same multi-container setup with one command.

## Limitations
- Compose is not a full production orchestrator and is usually used for local development, demos, CI integration tests, or a single Docker host.
- `depends_on` without a health condition only controls startup order; it does not prove a dependency is ready. This example uses a MySQL health check.
- The Java query process is a one-shot job and exits after printing the result. `docker compose ps` may show it as exited; that is expected.
- Compose does not supply application high availability, backups, monitoring, secret management, autoscaling, or production rollout strategy by itself.
- The sample credentials are intentionally simple and must never be reused for real systems.
