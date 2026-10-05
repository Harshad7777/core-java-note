# Ubuntu Setup Guide for Java, Spring Boot, and MySQL

This guide is written for beginners using Ubuntu via WSL on Windows. It covers installation, basic Linux commands, and the essentials needed for Java/Spring Boot development.

## 1. Why use Ubuntu?

Ubuntu is useful for:

- Java development (JDK, Maven, Spring Boot)
- VS Code, Eclipse, IntelliJ IDEA
- Git and GitHub
- MySQL database
- Docker
- Node.js / React
- Linux terminal practice
- Running projects such as RMS or Sankalp

## 2. Check if Ubuntu is installed

Open Windows Command Prompt as Administrator and run:

```bash
wsl --list --verbose
```

Or:

```bash
wsl -l -v
```

Example output:

```bash
NAME              STATE      VERSION
docker-desktop    Stopped    2
Ubuntu            Stopped    2
```

If Ubuntu appears in the list, it is installed correctly.

## 3. Start Ubuntu

From CMD, run:

```bash
wsl -d Ubuntu
```

Or simply:

```bash
wsl
```

You should then see a prompt similar to this:

```bash
username@computer:~$
```

## 4. First-time Ubuntu setup

When Ubuntu starts for the first time, it may ask to create a Linux username.

Example:

```bash
Create a default Unix user account: harsh
```

Then it will ask for a password.

Important:

- When typing the password, nothing will appear on screen.
- This is normal in Linux.
- Re-enter the same password when prompted.

After setup, you will see a prompt like:

```bash
harsh@DESKTOP-XXXX:~$
```

That means Ubuntu is ready.

## 5. Verify your Ubuntu environment

Run these commands inside the Ubuntu terminal:

```bash
whoami
pwd
ls
```

Expected results:

- `whoami` → your Linux username, for example `harsh`
- `pwd` → your current directory, usually `/home/harsh`

## 6. Basic Ubuntu commands

### 6.1 Basic terminal commands

```bash
pwd
```
Shows the current directory.

```bash
ls
```
Lists files and folders.

```bash
ls -la
```
Lists all files, including hidden ones.

```bash
cd folder_name
```
Moves into a folder.

```bash
cd ..
```
Goes one directory back.

```bash
cd ~
```
Goes to your home directory.

```bash
clear
```
Clears the terminal screen.

```bash
history
```
Shows previous commands.

```bash
whoami
```
Shows the current username.

```bash
hostname
```
Shows the computer/WSL hostname.

```bash
date
```
Shows the current date and time.

### 6.2 Create files and folders

```bash
mkdir test
```
Create a folder.

```bash
mkdir folder1 folder2 folder3
```
Create multiple folders.

```bash
mkdir -p project/src/main/java
```
Create nested folders.

```bash
touch test.txt
```
Create an empty file.

```bash
touch a.txt b.txt c.txt
```
Create multiple files.

```bash
cat test.txt
```
View file contents.

```bash
nano test.txt
```
Open a file in the Nano editor.

To save in Nano:

```bash
Ctrl + O
Enter
Ctrl + X
```

### 6.3 Copy, move, and delete

```bash
cp test.txt backup.txt
```
Copy a file.

```bash
cp -r folder1 folder2
```
Copy a folder.

```bash
mv test.txt documents/
```
Move a file.

```bash
mv old.txt new.txt
```
Rename a file.

```bash
rm test.txt
```
Delete a file.

```bash
rm -r folder1
```
Delete a folder.

Warning: Be careful with `rm`; deleted files may not go to the Windows Recycle Bin.

## 7. Ubuntu package commands

Update package information:

```bash
sudo apt update
```

Upgrade installed packages:

```bash
sudo apt upgrade
```

Update and upgrade together:

```bash
sudo apt update && sudo apt upgrade
```

Install software:

```bash
sudo apt install package-name
```

Example:

```bash
sudo apt install git
```

Remove software:

```bash
sudo apt remove package-name
```

Search for a package:

```bash
apt search package-name
```

Show installed packages:

```bash
apt list --installed
```

## 8. System information

```bash
uname -a
```
Shows system details.

```bash
lsb_release -a
```
Shows Ubuntu release information.

```bash
hostnamectl
```
Shows host information.

Check memory:

```bash
free -h
```

Check disk usage:

```bash
df -h
```

Check folder size:

```bash
du -sh folder_name
```

Check running processes:

```bash
ps
```

Detailed process list:

```bash
ps aux
```

Live process monitor:

```bash
top
```

To exit `top`:

```bash
q
```

## 9. Find files and search inside files

Find a file by name:

```bash
find . -name "test.txt"
```

Find Java files:

```bash
find . -name "*.java"
```

Find files from the root:

```bash
sudo find / -name "test.txt"
```

Warning: this can take time.

Search inside a file:

```bash
grep "hello" test.txt
```

Search recursively:

```bash
grep -r "hello" .
```

Ignore case:

```bash
grep -ri "hello" .
```

## 10. Permissions and ownership

Check permissions:

```bash
ls -l
```

Give execute permission:

```bash
chmod +x file.sh
```

Change permissions:

```bash
chmod 755 file.sh
```

Change owner:

```bash
sudo chown username file.txt
```

## 11. Using `sudo`

`sudo` runs a command with administrator privileges.

```bash
sudo command
```

Example:

```bash
sudo apt update
```

Open a root shell:

```bash
sudo -i
```

Exit the root shell:

```bash
exit
```

Warning: Do not use `sudo` unnecessarily.

## 12. User commands

Check current user:

```bash
whoami
```

User information:

```bash
id
```

List users:

```bash
cat /etc/passwd
```

Add a user:

```bash
sudo adduser username
```

Switch user:

```bash
su - username
```

## 13. Network commands

Check IP:

```bash
ip addr
```

Short form:

```bash
ip a
```

Check routes:

```bash
ip route
```

Test internet connection:

```bash
ping google.com
```

Stop the ping test:

```bash
Ctrl + C
```

Test a website:

```bash
curl https://example.com
```

Download a file:

```bash
wget https://example.com/file.zip
```

Check listening ports:

```bash
ss -tuln
```

## 14. Process commands

Show all processes:

```bash
ps aux
```

Find a process:

```bash
ps aux | grep java
```

Kill a process:

```bash
kill PID
```

Force kill:

```bash
kill -9 PID
```

Example:

```bash
kill -9 1234
```

## 15. Environment variables

Show all environment variables:

```bash
env
```

Show PATH:

```bash
echo $PATH
```

Set a variable temporarily:

```bash
export NAME=Harsh
```

Check it:

```bash
echo $NAME
```

## 16. Linux paths

Linux root directory:

```bash
/
```

Your home directory:

```bash
/home/harsh
```

Windows C drive from WSL:

```bash
/mnt/c
```

Windows Desktop:

```bash
cd /mnt/c/Users/<WindowsUsername>/Desktop
```

Example:

```bash
cd /mnt/c/Users/Harsh/Desktop
```

Check the Windows C drive:

```bash
ls /mnt/c
```

## 17. Access Windows files from Ubuntu

Your Windows drives are mounted under `/mnt`.

```bash
cd /mnt/c
ls
```

Open Windows Downloads:

```bash
cd /mnt/c/Users/<WindowsUsername>/Downloads
```

Open Windows Documents:

```bash
cd /mnt/c/Users/<WindowsUsername>/Documents
```

## 18. Git commands

Install Git:

```bash
sudo apt update
sudo apt install git
```

Check version:

```bash
git --version
```

Configure username:

```bash
git config --global user.name "Your Name"
```

Configure email:

```bash
git config --global user.email "your@email.com"
```

Clone a repository:

```bash
git clone REPOSITORY_URL
```

Enter the repository:

```bash
cd repository-name
```

Check status:

```bash
git status
```

Add files:

```bash
git add .
```

Commit changes:

```bash
git commit -m "Initial commit"
```

Push changes:

```bash
git push
```

Pull changes:

```bash
git pull
```

## 19. Java commands

Check Java:

```bash
java -version
```

Check the compiler:

```bash
javac -version
```

Compile a file:

```bash
javac Main.java
```

Run the program:

```bash
java Main
```

For Java and Spring Boot development, JDK 21 is typically recommended.

## 20. Maven commands

Check Maven:

```bash
mvn -version
```

Build a Maven project:

```bash
mvn clean package
```

Skip tests during build:

```bash
mvn clean package -DskipTests
```

Run a Spring Boot application:

```bash
mvn spring-boot:run
```

## 21. MySQL commands

Check if MySQL is installed:

```bash
mysql --version
```

Log in:

```bash
sudo mysql
```

Show databases:

```sql
SHOW DATABASES;
```

Create a database:

```sql
CREATE DATABASE RMS;
```

Use a database:

```sql
USE RMS;
```

Show tables:

```sql
SHOW TABLES;
```

Exit MySQL:

```sql
EXIT;
```

## 22. SSH commands

Check SSH version:

```bash
ssh -V
```

Connect to a server:

```bash
ssh username@server-ip
```

Generate an SSH key:

```bash
ssh-keygen
```

## 23. Archive commands

Extract `.tar.gz`:

```bash
tar -xzf file.tar.gz
```

Create `.tar.gz`:

```bash
tar -czf backup.tar.gz folder/
```

Create ZIP:

```bash
zip -r project.zip project/
```

Extract ZIP:

```bash
unzip project.zip
```

Install ZIP support if needed:

```bash
sudo apt install zip unzip
```

## 24. Services

Check a service:

```bash
sudo systemctl status service-name
```

Start a service:

```bash
sudo systemctl start service-name
```

Stop a service:

```bash
sudo systemctl stop service-name
```

Restart a service:

```bash
sudo systemctl restart service-name
```

Enable service at startup:

```bash
sudo systemctl enable service-name
```

Note: On WSL, `systemd` may not behave exactly like a full Linux server, so not every service command will work immediately.

## 25. Useful terminal shortcuts

| Shortcut | Purpose |
|---|---|
| `Ctrl + C` | Stop the current command |
| `Ctrl + L` | Clear the screen |
| `Ctrl + D` | Exit the shell |
| `Ctrl + Z` | Suspend a process |
| `Tab` | Auto-complete |
| `↑` | Previous command |
| `↓` | Next command |
| `Ctrl + R` | Search command history |

## 26. Most important commands for development

These are the most useful commands for day-to-day Ubuntu development:

```bash
pwd
ls
cd
mkdir
touch
cp
mv
rm
cat
nano
sudo
apt
find
grep
ps
kill
ip
ping
git
java
javac
mvn
```

## 27. First setup for your Ubuntu development environment

Run this first:

```bash
sudo apt update && sudo apt upgrade -y
```

Then install the basic tools:

```bash
sudo apt install -y git curl wget unzip zip build-essential
```

Verify installation:

```bash
git --version
curl --version
wget --version
```

## 28. Recommended environment for your project

For Java + Spring Boot development, the typical setup is:

```text
Windows
  └── WSL 2
      └── Ubuntu
          ├── Java 21
          ├── Maven
          ├── Git
          ├── MySQL
          ├── VS Code
          └── Spring Boot / RMS project
```

This setup is ideal for working on Java applications and backend projects in Ubuntu while still using Windows for daily work.

## 29. Final note

Once Ubuntu is installed and running, you do not need to use Administrator CMD for every command. After WSL is configured, you can open Ubuntu directly from the Windows Start menu and work in the Linux terminal.

If you want, the next step can be:

1. Install Java 21
2. Install Maven
3. Install Git
4. Install MySQL
5. Install VS Code in Ubuntu
6. Set up your Spring Boot / RMS project

That is the best next step for your development environment.