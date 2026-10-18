Understood, Harshad. You need complete documentation for Assignment 2, with every command in execution order, expected outputs, explanations, troubleshooting, and GitHub push verification. You can copy this into your assignment document or `README.md`.

# Assignment 2: Git Save, Commit and Push Script

## 1. Objective

- Create a Git test repository.
- Make a small change to a file.
- Create and execute `git-save-push.sh`.
- Test the optional `--gitignore` parameter.
- Review staged changes before committing.
- Verify commits and push them to GitHub.
- Handle missing or incorrect Git remotes.

## 2. Prerequisites

- Git for Windows and Git Bash installed.
- A GitHub account.
- A GitHub repository for the assignment.

Repository URL: [Harshad7777/git-save-push-assignment](https://github.com/Harshad7777/git-save-push-assignment)

## 3. Complete command sequence

### Step 1 — Create the repository

```
cd ~
mkdir git-save-push-assignment
cd git-save-push-assignment
git init -b main
```

If the directory already exists, do not create it again. Instead, enter it:

```
cd ~/git-save-push-assignment
```

Configure your Git identity:

```
git config user.name "Harshad Rakshe"
git config user.email "YOUR_GITHUB_EMAIL"
```

Replace `YOUR_GITHUB_EMAIL` with your GitHub email address.

### Step 2 — Create initial files

```
echo "# Git Save Push Assignment" > README.md
echo "Version 1" > app.txt
```

Check the files and Git status:

```
ls -la
git status
```

Stage and commit the initial files:

```
git add README.md app.txt
git commit -m "Initial commit for save push assignment"
```

Verify:

```
git log --oneline -1
```

### Step 3 — Make a small change

```
echo "Version 2 - Assignment 2 test" >> app.txt
```

Review the difference before staging:

```
git diff
git status --short
```

Expected change:

```
+Version 2 - Assignment 2 test
```

### Step 4 — Create the shell script

Create the file:

```
notepad git-save-push.sh
```

Paste the complete script below, save it, and close Notepad.

```
#!/bin/bash

set -e

COMMIT_MSG=""
CREATE_GITIGNORE=false

while [ $# -gt 0 ]; do
    case "$1" in
        --gitignore)
            CREATE_GITIGNORE=true
            ;;
        *)
            if [ -z "$COMMIT_MSG" ]; then
                COMMIT_MSG="$1"
            else
                COMMIT_MSG="$COMMIT_MSG $1"
            fi
            ;;
    esac
    shift
done

if [ -z "$COMMIT_MSG" ]; then
    echo 'Usage: bash git-save-push.sh "commit message" [--gitignore]'
    exit 1
fi

if ! git rev-parse --is-inside-work-tree >/dev/null 2>&1; then
    echo "Error: Not inside a Git repository."
    exit 1
fi

if [ "$CREATE_GITIGNORE" = true ]; then
    if [ ! -f .gitignore ]; then
        printf '%s\n' '*.log' '*.tmp' 'target/' '.idea/' '.vscode/' > .gitignore
        echo ".gitignore created successfully."
    else
        echo ".gitignore already exists; preserving it."
    fi
fi

git add -A

echo ""
echo "===== STAGED FILES ====="
git status --short

echo ""
echo "===== STAGED DIFF ====="
git diff --cached

if git diff --cached --quiet; then
    echo "No staged changes to commit."
    exit 0
fi

read -r -p "Commit these changes? (y/n): " ANSWER

if [[ "$ANSWER" != "y" && "$ANSWER" != "Y" ]]; then
    echo "Commit cancelled. Changes remain staged."
    exit 0
fi

git commit -m "$COMMIT_MSG"

if git remote get-url origin >/dev/null 2>&1; then
    git push -u origin "$(git branch --show-current)"
else
    echo "ERROR: No origin remote configured."
    echo "Commit saved locally; push skipped."
fi
```

### Step 5 — Verify the script

```
ls -l git-save-push.sh
head -n 10 git-save-push.sh
```

### Step 6 — Execute the script with a meaningful commit message

```
bash git-save-push.sh "Update app version for assignment 2"
```

The script stages changes and displays the staged diff.

Review the output. If the listed files are correct, enter:

```
y
```

Press Enter to confirm the commit.

If unintended files appear, enter `n` and investigate before continuing.

### Step 7 — Test the optional `--gitignore` parameter

Create test files:

```
echo "temporary log" > debug.log
echo "Assignment test file" > test.txt
```

Execute the script:

```
bash git-save-push.sh "Add gitignore rules for assignment 2" --gitignore
```

The script creates `.gitignore` if it does not exist. It does not overwrite an existing `.gitignore`.

Expected content:

```
*.log
*.tmp
target/
.idea/
.vscode/
```

Inspect the file:

```
cat .gitignore
```

Review the staged diff and confirm only the intended files are included. If `debug.log` appears, cancel the commit and investigate.

If it was staged, remove it from the index:

```
git rm --cached --ignore-unmatch debug.log
git restore --staged debug.log 2>/dev/null || true
git status --short
```

If `.gitignore` already exists, the script preserves it. Check that it contains the intended rules before testing again.

### Step 8 — Verify commits

```
git status
git log --oneline -5
git show --stat HEAD
```

These commands show the working-tree status, recent commits, and files in the latest commit.

### Step 9 — Check the remote configuration

```
git remote -v
```

If no remote appears, configure your GitHub repository.

If the repository does not exist yet, create an empty repository named `git-save-push-assignment` on GitHub.

Add the remote:

```
git remote add origin https://github.com/Harshad7777/git-save-push-assignment.git
```

Verify:

```
git remote -v
```

If `origin` already exists but has the wrong URL, update it:

```
git remote set-url origin https://github.com/Harshad7777/git-save-push-assignment.git
```

### Step 10 — Push to GitHub

```
git push -u origin main
```

Expected successful output includes:

```
[new branch]      main -> main
```

If GitHub reports `Repository not found`, verify the repository URL, repository existence, and your account permissions.

### Step 11 — Final verification

```
git status -sb
git log --oneline -5
git show --stat HEAD
git remote -v
cat .gitignore
git ls-files debug.log
git check-ignore debug.log
```

Expected results:

- The `main` branch tracks `origin/main`.
- The commit history contains your changes.
- The remote points to your GitHub repository.
- `.gitignore` contains the expected rules.
- `git ls-files debug.log` returns no output if the log file is not tracked.
- `git check-ignore debug.log` identifies the matching ignore rule.

## 4. Troubleshooting

| Problem                        | Solution                                                                                          |
| ------------------------------ | ------------------------------------------------------------------------------------------------- |
| `.gitignore` does not exist    | Run the script with `--gitignore` and inspect its output.                                         |
| Script executes without output | Re-create the script using Step 4 and verify its contents with `head`.                            |
| `Repository not found`         | Check the URL, repository existence, and GitHub permissions.                                      |
| No remote configured           | Add `origin` using Step 9.                                                                        |
| `debug.log` is staged          | Cancel, remove it from the index if needed, and review the staged diff again.                     |
| LF/CRLF warning                | This is a line-ending warning commonly seen on Windows; it does not necessarily indicate failure. |
| `Everything up-to-date`        | There are no new local commits to push.                                                           |

## 5. Conclusion

The assignment demonstrates how to automate Git staging, review staged changes, commit with a meaningful message, create `.gitignore` using an optional parameter, and push commits to GitHub. Reviewing the staged diff before confirmation helps prevent unintended files from being committed.

**GitHub repository:** [https://github.com/Harshad7777/git-save-push-assignment](https://github.com/Harshad7777/git-save-push-assignment)