# 01 — Docker volumes and mounts, from the beginning

## Key terms
- **Container writable layer:** changes stored only in a container's own layer; removed when the container is removed.
- **Mount:** connects storage to a path inside a container.
- **Named volume:** storage managed by Docker, referenced by a name such as `training-data`.
- **Bind mount:** a specific file/folder from your computer mounted into a container.

## A. Prove container-only data disappears
```bash
docker run --name temporary alpine:3.24.2 sh -c "echo temporary > /tmp/note.txt && cat /tmp/note.txt"
docker rm temporary
```
The file was in that container's writable layer.

## B. Named volume: create → mount → write → remove container → read
```bash
docker volume create training-data
docker volume ls
docker volume inspect training-data

docker run --name writer -v training-data:/data alpine:3.24.2 sh -c "echo 'Hello from persistent volume' > /data/message.txt && cat /data/message.txt"
docker rm writer

docker run --rm -v training-data:/data alpine:3.24.2 cat /data/message.txt
```
Expected: `Hello from persistent volume`

### Understand `-v training-data:/data`
- `-v` mounts storage.
- `training-data` is the Docker named volume.
- `/data` is the destination path inside the container.
- Both containers mount the same volume, so the second container reads the first container's file.

## C. Bind mount a host folder
Run this from this example folder.

### PowerShell
```powershell
docker run --rm --mount "type=bind,source=$($PWD.Path),target=/source,readonly" alpine:3.24.2 cat /source/message.txt
```

### CMD
```cmd
docker run --rm -v "%cd%:/source:ro" alpine:3.24.2 cat /source/message.txt
```

### Bash / WSL / macOS
```bash
docker run --rm -v "$PWD:/source:ro" alpine:3.24.2 cat /source/message.txt
```
The file is stored on the host. `target=/source` makes it available inside the container; `readonly` / `:ro` prevents the container from changing the host file.

## D. Inspect and clean up
```bash
docker volume ls
docker volume inspect training-data
docker volume rm training-data
```
Only remove the volume after you no longer need its data. Removing a container and removing a volume are different operations.
