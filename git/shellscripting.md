# Shell Scripting Practical Assignments Guide

> Complete, step-by-step practical guide for all 3 shell scripting assignments using Git Bash in your project folder `D:/AWS_Sh_creating`.

---

## 📌 Project Overview & Structure

Your assignment repository structure:

```text
AWS_Sh_creating/
├── README.md
├── first-script.sh
├── student.sh
└── create-branches.sh
```

---

## Assignment 1 — Create `first-script.sh`

**Objective:** Write a script to print your name, the current working directory, and the current system date and time.

### Step 1: Open Git Bash and navigate to the project directory

```bash
cd /d/AWS_Sh_creating
```

### Step 2: Create and edit the script

```bash
touch first-script.sh
notepad first-script.sh
```

Add the following code and save the file:

```bash
#!/bin/bash

echo "My Name: Harshad Rakshe"
echo "Current Folder: $(pwd)"
echo "Current Date: $(date)"
```

### Step 3: Run the script

```bash
bash first-script.sh
```

**Expected Output:**

```text
My Name: Harshad Rakshe
Current Folder: /d/AWS_Sh_creating
Current Date: Tue Oct 13 16:00:00 IST 2026
```

*(Note: The date and timestamp reflect your local system time.)*

---

## Assignment 2 — Create `student.sh`

**Objective:** Accept student name and course as positional arguments (`$1` and `$2`), and display the script name (`$0`) and total argument count (`$#`).

### Step 1: Create and edit the script

```bash
cd /d/AWS_Sh_creating
touch student.sh
notepad student.sh
```

Add the following code and save the file:

```bash
#!/bin/bash

echo "Script Name: $0"
echo "Student Name: $1"
echo "Course: $2"
echo "Number of Arguments: $#"
```

### Step 2: Run the script with arguments

```bash
bash student.sh "Harshad Rakshe" "Java Full Stack"
```

**Expected Output:**

```text
Script Name: student.sh
Student Name: Harshad Rakshe
Course: Java Full Stack
Number of Arguments: 2
```

### Step 3: Test with missing arguments

```bash
bash student.sh Harshad
```

**Expected Output:**

```text
Script Name: student.sh
Student Name: Harshad
Course: 
Number of Arguments: 1
```

### 💡 Quick Reference: Special Shell Variables

| Variable | Meaning | Example Value |
| :--- | :--- | :--- |
| `$0` | Script name | `student.sh` |
| `$1` | First argument | `Harshad Rakshe` |
| `$2` | Second argument | `Java Full Stack` |
| `$#` | Number of arguments passed | `2` |

---

## Assignment 3 — Create and Test `create-branches.sh`

**Objective:** Develop a robust Git branch automation script that validates arguments, checks for a clean working tree, asks for confirmation, and creates branches safely.

We will test 5 specific validation cases:
1. Missing ticket argument
2. Invalid branch type
3. Dirty working tree detection
4. User cancellation
5. Successful branch creation

---

### Step 1: Create the script

Return to your project folder:

```bash
cd /d/AWS_Sh_creating
touch create-branches.sh
notepad create-branches.sh
```

Paste the following script and save:

```bash
#!/bin/bash

# Check required arguments
if [ $# -ne 2 ] || [ -z "$1" ] || [ -z "$2" ]; then
    echo "Usage: bash create-branches.sh TICKET TYPE"
    exit 1
fi

TICKET=$1
TYPE=$2

# Validate branch type
if [[ "$TYPE" != "feature" && "$TYPE" != "bugfix" && "$TYPE" != "hotfix" ]]; then
    echo "Error: Invalid branch type."
    echo "Allowed types: feature, bugfix, hotfix"
    exit 1
fi

# Verify that we are inside a Git repository
if ! git rev-parse --is-inside-work-tree >/dev/null 2>&1; then
    echo "Error: Not inside a Git repository."
    exit 1
fi

# Refuse to create a branch when the working tree is dirty
if [ -n "$(git status --porcelain)" ]; then
    echo "Error: Working tree is dirty."
    echo "Commit or stash your changes before continuing."
    exit 1
fi

BRANCH_NAME="$TYPE/$TICKET"

# Check if the branch already exists
if git show-ref --verify --quiet "refs/heads/$BRANCH_NAME"; then
    echo "Error: Branch '$BRANCH_NAME' already exists."
    exit 1
fi

# Ask for confirmation
read -r -p "Create branch '$BRANCH_NAME'? (y/n): " ANSWER

if [[ "$ANSWER" != "y" && "$ANSWER" != "Y" ]]; then
    echo "Operation cancelled."
    exit 0
fi

# Create and switch to the new branch
if git switch -c "$BRANCH_NAME"; then
    echo "Success: Created branch '$BRANCH_NAME'."
else
    echo "Error: Could not create the branch."
    exit 1
fi
```

---

### Step 2: Set up a separate test repository

> [!IMPORTANT]
> Always run these five test cases inside a dedicated test repository (`/d/AWS_Sh_test_repo`), not in your original assignment folder. The tests create temporary files and test branches that could pollute your main repo.

Create the test repository:

```bash
cd /d
mkdir AWS_Sh_test_repo
cd AWS_Sh_test_repo
git init -b main
```

Configure your Git identity if needed:

```bash
git config user.name "Harshad Rakshe"
git config user.email "harshadrakshe28@gmail.com"
```

Create the initial commit:

```bash
echo "Test repository" > README.md
git add README.md
git commit -m "Initial commit"
```

Copy your script into the test repository and commit it:

```bash
cp /d/AWS_Sh_creating/create-branches.sh .
git add create-branches.sh
git commit -m "Add branch creation script"
```

You now have a clean test repository on the `main` branch.

---

### Step 3: Run the 5 Test Cases

#### Test 1 — Missing Ticket

Run:

```bash
bash create-branches.sh "" feature
```

**Expected Output:**

```text
Usage: bash create-branches.sh TICKET TYPE
```

---

#### Test 2 — Invalid Branch Type

Run:

```bash
bash create-branches.sh ABC-101 invalid
```

**Expected Output:**

```text
Error: Invalid branch type.
Allowed types: feature, bugfix, hotfix
```

---

#### Test 3 — Dirty Working Tree Detection

Create an untracked file to make the working tree dirty:

```bash
touch dirty.txt
bash create-branches.sh ABC-102 feature
```

**Expected Output:**

```text
Error: Working tree is dirty.
Commit or stash your changes before continuing.
```

Clean up the test file:

```bash
rm dirty.txt
```

---

#### Test 4 — User Cancellation

Run:

```bash
bash create-branches.sh ABC-103 feature
```

When prompted, type `n` and press **Enter**:

```text
Create branch 'feature/ABC-103'? (y/n): n
Operation cancelled.
```

Verify that the branch was not created:

```bash
git branch
```

*(Should only show `* main`)*

---

#### Test 5 — Successful Branch Creation

Run:

```bash
bash create-branches.sh ABC-104 feature
```

When prompted, type `y` and press **Enter**.

**Expected Output:**

```text
Create branch 'feature/ABC-104'? (y/n): y
Switched to a new branch 'feature/ABC-104'
Success: Created branch 'feature/ABC-104'.
```

Verify the branch:

```bash
git branch
git status
```

*(Confirms branch `feature/ABC-104` was created and checked out)*

---

### Step 4: Final Verification & Commit in Main Project

Return to your primary assignment repository:

```bash
cd /d/AWS_Sh_creating
git status
git add -A
git commit -m "Complete shell scripting assignments"
```

If all changes have already been committed, Git will report `nothing to commit, working tree clean`.

---

### 📂 Final File Verification

Ensure your project contains all required files:

```text
AWS_Sh_creating/
├── README.md
├── first-script.sh
├── student.sh
└── create-branches.sh
```