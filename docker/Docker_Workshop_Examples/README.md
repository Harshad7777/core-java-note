# Docker Workshop — Hands-on Examples

Follow the examples in this order. Run commands from the example folder unless noted.

1. `01-volume-persistence` — understand a container writable layer, named volumes, bind mounts, and persistence.
2. `02-nginx-port-publish` — build a custom Nginx image; compare `EXPOSE` with `-p`.
3. `03-java-mysql-network` — build and run a Java JDBC app and MySQL on a user-defined network.
4. `04-compose-stack` — run the same Nginx + Java + MySQL pattern using Compose.

Requirements: Docker Desktop with Linux containers enabled. Java and Maven are not required on the host; Java is built in Docker.
Demo passwords are for local learning only. Do not use them in production.

## Compose limitations to discuss
- Compose is primarily for one Docker host/local development and integration testing; it is not a replacement for Kubernetes or a production orchestrator.
- `depends_on` controls start order; by itself it does not guarantee an application is ready unless a health check/condition is configured.
- Compose does not automatically make application code production-ready, highly available, backed up, monitored, or secure.
- A named volume persists across container recreation, but `docker compose down -v` deletes project volumes and their data.
