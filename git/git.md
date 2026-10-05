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

## 5. Create a new branch

Your branch name was `first-branh`, which had a spelling mistake.

Create a correctly named branch:

```bash
git checkout -b first-branch
```

Modern Git equivalent:

```bash
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

Open the file in Notepad:

```bash
notepad README.md
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

Add a specific file:

```bash
git add README.md
```

Add multiple files:

```bash
git add README.md index.html
```

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

Simple history:

```bash
git log
```

One line per commit:

```bash
git log --oneline
```

Graph view:

```bash
git log --oneline --graph --all
```

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

```bash
git fetch
```

Fetch a specific remote:

```bash
git fetch origin
```

Then check branches:

```bash
git branch -a
```

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
