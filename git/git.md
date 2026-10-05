# Git and GitHub Practical Workflow

Yes. You want a complete Git/GitHub practical flow: create GitHub repository → create local folder → clone → create branch → create files/content → add → commit → push → pull → merge → delete branch, etc.

Your previous work is already successful: `first-branh` was pushed to GitHub. The main mistake was running Git commands from the wrong directory.

> This guide includes the important Git commands in a clean, practical format for daily use.

## Quick command cheat sheet

```bash
git --version
git config --global user.name "Harshad"
git config --global user.email "harshadrakshe28@gmail.com"
git clone https://github.com/Harshad7777/demoDevops.git
git checkout -b first-branch
git status
git add .
git commit -m "Add project files"
git push -u origin first-branch
git pull origin main
git merge feature-login
git branch -d feature-login
git log --oneline --graph --all
```

---

## 1. One-time Git configuration

Run these once:

```bash
git --version
```

Set your GitHub identity:

```bash
git config --global user.name "Harshad"
git config --global user.email "harshadrakshe28@gmail.com"
```

Check the configuration:

```bash
git config --global --list
```

You can also check individually:

```bash
git config --global user.name
git config --global user.email
```

> Use `--global` when you want the setting for all repositories.

---

## 2. Create a local development folder

From anywhere:

```bash
cd /c
```

Create a `dev` folder:

```bash
mkdir dev
```

If it already exists, that's fine. Then:

```bash
cd dev
```

Check your current directory:

```bash
pwd
```

Expected output:

```bash
/c/dev
```

---

## 3. Clone an existing GitHub repository

Repository URL:

```bash
https://github.com/Harshad7777/demoDevops.git
```

Clone it:

```bash
git clone https://github.com/Harshad7777/demoDevops.git
```

Go inside the repository:

```bash
cd demoDevops
```

Check your location:

```bash
pwd
```

Expected output:

```bash
/c/dev/demoDevops
```

Check Git status:

```bash
git status
```

Check remote repository:

```bash
git remote -v
```

You should see:

```bash
origin  https://github.com/Harshad7777/demoDevops.git (fetch)
origin  https://github.com/Harshad7777/demoDevops.git (push)
```

---

## 4. Check branches

```bash
git branch
```

Remote branches:

```bash
git branch -r
```

All branches:

```bash
git branch -a
```

---

## 5. Create a new branch from `main`

Your branch name was `first-branh`, which had a spelling mistake.

If your repository does not have a `main` branch yet, this command will fail:

```bash
git switch main
```

This happens when there is no local or remote `main` branch. In your case:

```bash
git branch -a
```

shows only:

```bash
* first-branh
  remotes/origin/first-branh
```

So `main` does not exist yet.

If you want to create a new `main` branch from the current branch, use:

```bash
git branch -M main
```

Then push it:

```bash
git push -u origin main
```

If you want to keep the current branch and create a new branch from it, use:

```bash
git checkout -b main
```

Or:

```bash
git switch -c main
```

If you want a correctly named branch from `main` after `main` exists, use:

```bash
git checkout main
git checkout -b first-branch
```

Or:

```bash
git switch main
git switch -c first-branch
```

Check the branch list:

```bash
git branch
```

You should see:

```bash
* first-branch
```

---

## 6. Create files

Create a README file:

```bash
touch README.md
```

Create another file:

```bash
touch index.html
```

Create a folder:

```bash
mkdir src
```

Create a file inside it:

```bash
touch src/app.txt
```

Check everything:

```bash
ls
```

For recursive listing:

```bash
ls -R
```

---

## 7. Add content to a file

Open the file in VS Code or Notepad:

```bash
code README.md
```

If `code` is not available in your terminal, use:

```bash
notepad README.md
```

Example:

```bash
harsh@harshad UCRT64 /c/dev/demoDevops/src (first-branh)
$ code README.md
```

Add content such as:

```md
# Demo DevOps

This is my first DevOps Git project.
```

Save and close the file.

Check status:

```bash
git status
```

---

## 8. Add files to staging

Correct command:

```bash
git add .
```

Important: there must be a space between `add` and `.`.

✅ Correct

```bash
git add .
```

❌ Wrong

```bash
git add.
git .add
git add
```

If you type only:

```bash
git .
```

this is invalid because Git does not recognize `.` as a command. The correct command is always:

```bash
git add .
```

Add a specific file:

```bash
git add README.md
```

You can also add a file from a parent directory:

```bash
git add ../index.html
```

This stages the file `index.html` from the parent folder relative to your current location.

Add multiple files:

```bash
git add README.md index.html
```

Stage changes to files Git already tracks:

```bash
git add -u
```

`-u` means “update.” It stages modifications and deletions to tracked files, but does not stage new, untracked files. To stage new files too, use `git add --all`.

---

## 9. Check staging

```bash
git status
```

You should see something like:

```bash
Changes to be committed:
  new file:   README.md
  new file:   index.html
```

See staged changes:

```bash
git diff --cached
```

---

## 10. Commit

```bash
git commit -m "Add project files"
```

Check status:

```bash
git status
```

Expected result:

```bash
nothing to commit, working tree clean
```

### Fix the last commit

The correct command is:

```bash
git commit --amend
```

Use this when you want to modify the most recent commit message or add files to the previous commit.

Example:

```bash
git commit --amend -m "Add project files and setup"
```

This will replace the last commit with a new one.

### Add everything to staging

```bash
git add --all
```

This stages all tracked and untracked changes in the repository, including file deletions. Unlike `git add -u`, it also stages new files.

By contrast, `git add -u` stages only modifications and deletions to tracked files; it does not stage new, untracked files.

---

## 11. Push your branch to GitHub

For the first push:

```bash
git push -u origin first-branch
```

After `-u` is configured, you can simply run:

```bash
git push
```

You can also push to the current branch using the remote name only:

```bash
git push origin
```

This pushes the current branch to the `origin` remote.

---

## 12. Check GitHub branches

```bash
git branch -a
```

You should see something similar to:

```bash
* first-branch
  remotes/origin/main
  remotes/origin/first-branch
```

---

## 13. Switch branches

Switch to `main`:

```bash
git checkout main
```

Or:

```bash
git switch main
```

Switch back:

```bash
git checkout first-branch
```

Or:

```bash
git switch first-branch
```

---

## 14. Pull latest code

Before starting work:

```bash
git pull
```

Or explicitly:

```bash
git pull origin main
```

---

## 15. Create another branch

From `main`:

```bash
git checkout main
```

Update it:

```bash
git pull origin main
```

Create a feature branch:

```bash
git checkout -b feature-login
```

Work on files:

```bash
notepad README.md
```

Then run:

```bash
git status
git add .
git commit -m "Add login feature"
git push -u origin feature-login
```

---

## 16. Merge a branch

First go to `main`:

```bash
git checkout main
```

Update `main`:

```bash
git pull origin main
```

Merge your feature branch:

```bash
git merge feature-login
```

Then push:

```bash
git push origin main
```

---

## 17. Delete a local branch

After merging:

```bash
git branch -d feature-login
```

If you really need to force delete:

```bash
git branch -D feature-login
```

---

## 18. Delete a remote branch

```bash
git push origin --delete feature-login
```

---

## 19. See commit history

`git log` shows the commit history of the current branch.

Simple history:

```bash
git log
```

Example output:

```bash
commit a1b2c3d4e5f6g7h8
Author: Harshad <harshadrakshe28@gmail.com>
Date:   Mon Oct 5 2026

    Add project files
```

One line per commit:

```bash
git log --oneline
```

Example:

```bash
a1b2c3d Add project files
b4c5d6e Fix login page
f7g8h9i Initial commit
```

Graph view:

```bash
git log --oneline --graph --all
```

This is useful to see branch history and merge structure.

---

## 20. See changes

Before staging:

```bash
git diff
```

After staging:

```bash
git diff --cached
```

---

## 21. Undo a file change before `git add`

If you changed `README.md` but do not want the changes:

```bash
git restore README.md
```

---

## 22. Remove a file from staging

If you accidentally ran:

```bash
git add README.md
```

Remove it from staging:

```bash
git restore --staged README.md
```

The file itself will remain.

---

## 23. Rename a file

```bash
git mv old.txt new.txt
```

Then commit:

```bash
git commit -m "Rename file"
```

---

.gitignore

`.gitignore` is a special file used to tell Git which files or folders should be ignored and not uploaded to GitHub.

Example:

```gitignore
node_modules/
.env
*.log
.DS_Store
*.html
```

This means:
- `node_modules/` is ignored
- `.env` is ignored
- all `.log` files are ignored
- `.DS_Store` is ignored
- all `.html` files are ignored

If you want to ignore only HTML files, use:

```gitignore
*.html
```

Create it:

```bash
touch .gitignore
```

Open it:

```bash
code .gitignore
```

Then add patterns to ignore unnecessary files.

Example workflow:

```bash
git status
git add .gitignore
git commit -m "Add gitignore"
git push origin
```

---

## 24. Delete a file using Git

```bash
git rm old.txt
```

Then commit:

```bash
git commit -m "Remove old file"
```

---

## 25. See the remote repository

```bash
git remote -v
```

Change the remote URL if needed:

```bash
git remote set-url origin https://github.com/Harshad7777/demoDevops.git
```

---

## 26. Fetch remote changes

`git fetch` downloads new changes from the remote repository without merging them into your current branch.

```bash
git fetch
```

Fetch a specific remote:

```bash
git fetch origin
```

This updates your remote-tracking branches such as `origin/main` and `origin/first-branch`.

Then check branches:

```bash
git branch -a
```

Example output:

```bash
* main
  remotes/origin/main
  remotes/origin/feature-login
```

> `git pull` is different from `git fetch`: `fetch` downloads only, while `pull` downloads and merges.

---

## 27. Clone a repository into a specific folder

Instead of:

```bash
git clone https://github.com/Harshad7777/demoDevops.git
```

You can specify the target folder name:

```bash
git clone https://github.com/Harshad7777/demoDevops.git MyProject
```

Then:

```bash
cd MyProject
```

---

## 28. Create a completely new local Git repository

If you are not cloning from GitHub and want to start a new project locally:

```bash
mkdir MyProject
cd MyProject
git init
```

Create a file:

```bash
touch README.md
```

Add it to staging:

```bash
git add .
```

Commit:

```bash
git commit -m "Initial commit"
```

Connect to GitHub:

```bash
git remote add origin https://github.com/Harshad7777/demoDevops.git
```

Rename the branch to `main`:

```bash
git branch -M main
```

Push it:

```bash
git push -u origin main
```

---

## 29. Complete workflow to remember

This is the most important daily workflow:

```bash
cd /c/dev
git clone https://github.com/Harshad7777/demoDevops.git
cd demoDevops

git checkout -b feature1

# create/edit files
notepad README.md

git status
git add .
git status
git commit -m "Add feature1"
git push -u origin feature1
```

Later, when you want to merge:

```bash
git checkout main
git pull origin main

git merge feature1
git push origin main
```

---

## 30. Daily developer workflow

Usually, you will only need these commands:

```bash
git status
git pull
git checkout -b my-feature
```

Then, after coding:

```bash
git status
git add .
git status
git commit -m "Describe my changes"
git push -u origin my-feature
```

---

## Your current repository

You have already successfully done the following:

```text
GitHub repository
       ↓
git clone
       ↓
/c/dev/demoDevops
       ↓
first-branh
       ↓
readme.md
       ↓
git add .
       ↓
git commit
       ↓
git push
       ↓
GitHub
```

Your push was successful:

```text
[new branch] first-branh -> first-branh
```

So nothing is broken in your repository.

> One important correction: you currently have both `~/Dev/DemoDevops` and `/c/dev/demoDevops`. The second one is the repository you successfully pushed. For practice, it is recommended to use `/c/dev/demoDevops`.
