Asignment  1 1. Run create-gitignore.sh when .gitignore does not exist.
2. Check that the file is created with the expected rules.
3. Add a custom line to .gitignore.
4. Run the script again.
5. Prove that your existing custom line was not overwritten.

Sub part : you have to try creating other gitignore file can be anything txt file. readme.md   and should create template)



# Assignment 1: Create and Test `create-gitignore.sh`

This assignment checks whether your Bash script can create a `.gitignore` file without overwriting existing rules or custom lines. We'll perform every step using Git Bash on Windows.

## 1. Create the project folder

Open Git Bash and run:

```
mkdir gitignore-assignment
cd gitignore-assignment
```

Create the script:

```
touch create-gitignore.sh
```

Open the folder in VS Code if installed:

```
code .
```

## 2. Write the `create-gitignore.sh` script

Copy this complete script into `create-gitignore.sh`.

```

#!/bin/bash

# Create .gitignore only if it does not exist

if [ -f ".gitignore" ]; then
    echo ".gitignore already exists. No changes made."
else
    cat > .gitignore <<'EOF'
# Java
*.class
target/

# IDE
.vscode/
.idea/

# Logs
*.log

# Environment files
.env

# OS files
.DS_Store
Thumbs.db
EOF

    echo ".gitignore created successfully."
fi

```

How it works:

- `[ -f ".gitignore" ]` checks whether the file already exists.
- If it exists, the script leaves it unchanged.
- If it does not exist, the script creates the file with the default rules.
- `cat > .gitignore` writes the initial template only when the file is missing.

Save the file.

## 3. Run the script when `.gitignore` does not exist

Run:

```
bash create-gitignore.sh
```

Expected output:

```
.gitignore created successfully.
```

Verify the file:

```
ls -la
cat .gitignore
```

You should see rules for Java class files, the `target/` folder, IDE files, logs, environment files, and OS files.

## 4. Add a custom line to `.gitignore`

Add your own rule to the end of the file:

```
echo "my-custom-file.txt" >> .gitignore
```

Verify it:

```
cat .gitignore
```

The last line should be:

```
my-custom-file.txt
```

This is your custom rule. The script must preserve it when run again.

## 5. Run the script again

Execute:

```
bash create-gitignore.sh
```

Expected output:

```
.gitignore already exists. No changes made.
```

Check the contents:

```
cat .gitignore
```

The custom line should still exist.

## 6. Prove that the custom line was not overwritten

Run these commands:

```
grep -n "my-custom-file.txt" .gitignore
```

Expected output:

```
18:my-custom-file.txt
```

The line number may differ depending on your file.

For stronger proof, compare the file before and after rerunning the script:

```
sha256sum .gitignore > before.txt

bash create-gitignore.sh

sha256sum .gitignore > after.txt

diff before.txt after.txt
```

Expected result: `diff` prints nothing, proving that the file's contents did not change when the script ran again.

## 7. Subpart: Create `README.md` and a `.txt` file

Create two additional files:

```
touch README.md
touch notes.txt
```

Add a README template:

```
cat > README.md <<'EOF'
# GitIgnore Assignment

## Description
This project demonstrates how to create a .gitignore file safely.

## Files
- create-gitignore.sh
- .gitignore
- README.md
- notes.txt

## How to Run
bash create-gitignore.sh
EOF
```

Add sample content to `notes.txt`:

```
echo "This is a sample text file." > notes.txt
```

View the files:

```
ls -la
cat README.md
cat notes.txt
```

You should now have a project structure similar to this:

```
gitignore-assignment/
├── create-gitignore.sh
├── .gitignore
├── README.md
├── notes.txt
├── before.txt
└── after.txt
```

The `before.txt` and `after.txt` files are created during the verification step. You can remove them after testing.

### Optional: Ignore the text file

If you want Git to ignore `notes.txt`, add this rule to `.gitignore`:

```
echo "notes.txt" >> .gitignore
```

Initialize Git and check the status:

```
git init
git status --short
```

If `notes.txt` is ignored successfully, it will not appear as an untracked file. To verify ignored files explicitly, run:

```
git check-ignore -v notes.txt
```

## 8. Final testing checklist

Created create-gitignore.sh

Ran it when .gitignore was missing

Verified the default ignore rules

Added my-custom-file.txt manually

Reran the script without overwriting existing content

Verified the custom line with grep

Created README.md using a template

Created and tested notes.txt

0 of 8 completed

Reset

Important: The main requirement is that `create-gitignore.sh` creates `.gitignore` only when the file does not exist. Running it again must preserve all existing rules and custom lines.