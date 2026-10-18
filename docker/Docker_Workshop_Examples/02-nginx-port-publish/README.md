# 02 — Custom Nginx image, EXPOSE, and `-p`

## Files
- `Dockerfile` builds a custom image from the official Nginx image.
- `index.html` is copied into Nginx's default web root.

## Build and run
```bash
docker build -t workshop-nginx:1.0 .
docker run -d --name web-demo -p 8081:80 workshop-nginx:1.0
```
Open `http://localhost:8081`.

## `EXPOSE` vs `-p`
- `EXPOSE 80` in the Dockerfile documents that the app listens on container port 80. It **does not** publish the port to the host.
- `-p 8081:80` at runtime publishes host port 8081 and forwards it to container port 80.
- Syntax: `-p HOST_PORT:CONTAINER_PORT`.

Inspect and clean up:
```bash
docker ps
docker port web-demo
docker logs web-demo
docker rm -f web-demo
```
Try omitting `-p`: the container may run, but your host browser cannot reach Nginx through a published host port.
