✅ Q. What is a Database?

A database is a collection of related data that is stored in an organized manner so that it can be easily accessed, managed, and updated.

It is a system that provides a standard way to store data permanently and maintain relationships between different data.

👉 In a relational system, a database is a collection of tables.
-------------------------------------------------
✅ Q. Why use Databases? / What are the benefits of Databases?

Databases are used to store, manage, and retrieve data efficiently. They provide several advantages as follows:

🔹 1. Permanent Data Storage
Data is stored permanently in the system.
It can be accessed anytime when required.

🔹 2. Organized Data Storage
Data is stored in structured formats such as tables (rows and columns).
It helps in maintaining relationships between different data.
Example: School database (Student, Teacher, Course tables)

🔹 3. Easy Data Retrieval
Data can be quickly searched and retrieved using queries.
Saves time and improves efficiency.

🔹 4. Data Security
Access control is provided to users.
Permissions can be set (read, write, update, delete).

🔹 5. Data Consistency
Ensures accurate and reliable data using constraints.
Avoids duplication and incorrect data.

🔹 6. Multi-User Facility
Multiple users can access the database at the same time.
Different access levels can be assigned to users.

🔹 7. Backup and Recovery
Database systems provide backup features.
Data can be restored in case of failure or loss.
---------------------------------------------------

✅ Q. How many ways to manage data? / Types of Database

There are different ways to manage data in a database system. The main types of databases are:

🔹 1. Relational Database (RDBMS)
Data is stored in the form of tables (rows and columns).
Row = Record
Column = Attribute
Example: MySQL, Oracle Database

🔹 2. Hierarchical Database
Data is stored in parent-child structure (tree format).
Similar to folder structure in operating systems.

🔹 3. Object-Oriented Database
Data is stored in the form of objects (like OOP concepts).
Example: MongoDB, Firebase

🔹 4. Cloud Database
Data is stored on remote servers and accessed via the internet.
No need to install locally.
Example: Google Docs

🔹 5. Distributed Database
Data is stored across multiple servers connected over a network.
Works as a single database system.

✅ Steps to Work with Relational Database
Install database software like MySQL or Oracle Database
https://dev.mysql.com/downloads/workbench/
Create a database
Create tables
Insert and manage data using SQL
---------------------------------------------------

✅ What is SQL?

SQL (Structured Query Language) is a language used to perform operations on relational databases such as:
    Creating tables
    Inserting data
    Updating data
    Retrieving data

✅ Q. How to create user-defined database in MySQL?

To create a user-defined database in MySQL, we use the following SQL commands:

🔹 1. Create Database
Syntax:
CREATE DATABASE databasename;

Example:
CREATE DATABASE aug2025;

🔹 2. Use Database
After creating the database, we need to select it:

Syntax:
USE databasename;

Example:
USE aug2025;

👉 Once selected, we can start working with tables and data.
-------------------------------------------------------------------
✅ Types of SQL Commands

🔸 1. DDL (Data Definition Language)
Used to define or modify table structure

Commands:
CREATE
DESC
ALTER
DROP
TRUNCATE

🔸 2. DML (Data Manipulation Language)
Used to manage data inside tables

Commands:
INSERT
UPDATE
DELETE

🔸 3. DQL (Data Query Language)
Used to retrieve data

Command:
SELECT

🔸 4. TCL (Transaction Control Language)
Used to manage transactions

Commands:
COMMIT
ROLLBACK
SAVEPOINT

🔸 5. DCL (Data Control Language)
Used to control user permissions

Commands:
GRANT
REVOKE

-------------------------------------------------------------------
✅ DDL Commands (Data Definition Language)

DDL commands are used to define and modify the structure of database objects such as tables, views, indexes, etc.

🔹 1. CREATE Command
Used to create database objects like:
create Table
create Procedure
create Function
create Index
create View
create Trigger
✅ Create Table

Syntax:

CREATE TABLE tablename(
  columnname datatype(size),
  columnname datatype(size)
);

Example:

CREATE TABLE employee(
  eid INT(5),
  name VARCHAR(200),
  salary INT(5)
);

🔹 2. DESCRIBE (DESC)
Used to view table structure

Syntax:
DESC tablename;

Example:
DESC employee;

🔹 3. ALTER Command
Used to modify table structure

    🔸 (a) ADD Column
    Single column:
    ALTER TABLE employee ADD COLUMN email VARCHAR(100);

    Multiple columns:
    ALTER TABLE employee ADD COLUMN (email VARCHAR(100), contact VARCHAR(15));

    🔸 (b) MODIFY Column
    Change datatype or size
    ALTER TABLE employee MODIFY COLUMN contact INT(10);

    🔸 (c) DROP Column
    Delete a column
    ALTER TABLE employee DROP COLUMN contact;

    🔸 (d) RENAME Column
    Change column name
    ALTER TABLE employee RENAME COLUMN contact TO phone;

🔹 4. TRUNCATE Command
    Deletes all records from table
    Structure remains same
    TRUNCATE TABLE employee;

🔹 5. DROP Command
    Deletes entire table (structure + data)
    DROP TABLE employee;

---------------------------------------------------------------------

✅ DML Commands (Data Manipulation Language)

DML commands are used to work with data inside tables (not structure) such as inserting, updating, and deleting records.

🔹 1. INSERT Command
Used to insert data into a table

🔸 (a) Full Insert (All Columns)
Values are provided for all columns

Syntax:
INSERT INTO tablename VALUES(value1, value2, ..., valueN);

Example:
INSERT INTO employee VALUES(1, 'Ram', 50000);

🔸 (b) Partial Insert (Specific Columns)
Values are inserted only into selected columns

Syntax:
INSERT INTO tablename(column1, column2) 
VALUES(value1, value2);

Example:
INSERT INTO employee(eid, name) VALUES(2, 'Shyam');

🔸 (c) Insert Multiple Records
INSERT INTO employee VALUES
(3, 'Amit', 40000),
(4, 'Neha', 45000);

🔹 2. DELETE Command
Used to delete records from a table
🔸 (a) Delete All Records
DELETE FROM employee;

🔸 (b) Delete Specific Records
DELETE FROM employee WHERE eid = 2;

🔹 3. UPDATE Command
Used to modify existing data
🔸 (a) Update All Records
UPDATE employee SET salary = 60000;

🔸 (b) Update Specific Record
UPDATE employee 
SET salary = 150000 
WHERE eid = 3;

------------------------------------------------------------------------
🔷 SQL Operators

✅ 1. Logical Operators
🔹 AND (&&)
Used when both conditions must be true

SELECT * FROM employee
WHERE id = 3 AND name = 'ganesh';

🔹 OR (||)
Used when any one condition is true

SELECT * FROM employee
WHERE id = 1 OR name = 'ganesh';

🔹 NOT
Used to exclude a condition
not , != , <>

SELECT * FROM employee
WHERE NOT name = 'ganesh';

✅ 2. IN Operator

👉 Used instead of multiple OR conditions

SELECT * FROM employee
WHERE salary IN (20000, 40000, 50000);

✔ Better than:
WHERE salary = 20000 OR salary = 40000 OR salary = 50000;

✅ 3. BETWEEN Operator
👉 Used for range (>= AND <=)

SELECT * FROM employee
WHERE salary BETWEEN 20000 AND 40000;

✔ Equivalent to:
WHERE salary >= 20000 AND salary <= 40000;

✅ 4 LIKE Operator (Pattern Matching)
Wildcards operator:
  % → multiple characters
  _ → single character

🔹 Starts with 'a'
  SELECT * FROM employee
  WHERE name LIKE 'a%';

🔹 Ends with 'sh'
  SELECT * FROM employee
  WHERE name LIKE '%sh';

🔹 Contains 'a'
SELECT * FROM employee
WHERE name LIKE '%a%';

🔹 Exactly 3 letters
SELECT * FROM employee
WHERE name LIKE '___';

🔹 Starts with 'm' and at least 3 letters
SELECT * FROM employee
WHERE name LIKE 'm__%';

----------------------------------------------------------------------

🔷 SQL Clauses
✅ 1. WHERE Clause
👉 Used to apply conditions

SELECT * FROM employee
WHERE salary > 20000;

✅ 2. GROUP BY Clause
👉 Groups similar values

SELECT salary
FROM employee
GROUP BY salary;

✔ Important:
Column must be in SELECT
Used with aggregate functions

🔷 type of Aggregate (Group) Functions
  perform operation on single column

🔹 COUNT()
  SELECT COUNT(salary) FROM employee;
  👉 Counts non-null values

  SELECT COUNT(*) FROM employee;
  👉 Counts all rows (including NULL)

  🔹 SUM()
  SELECT SUM(salary) FROM employee;

  🔹 AVG()
  SELECT AVG(salary) FROM employee;

  🔹 MAX()
  SELECT MAX(salary) FROM employee;

  🔹 MIN()
  SELECT MIN(salary) FROM employee;


✅ 3 HAVING Clause
👉 Used with GROUP BY (for aggregate conditions)

SELECT salary, COUNT(salary)
FROM employee
GROUP BY salary
HAVING COUNT(*) > 1;

✔ Used to find duplicate salaries

✅ 4  ORDER BY Clause
👉 Used to sort data

SELECT * FROM employee
ORDER BY salary DESC; //desending

✔ Default = ASC

🔷 Correct Order of SQL Clauses
SELECT column
FROM table
WHERE condition
GROUP BY column
HAVING condition
ORDER BY column;

👉 Sequence:
WHERE → GROUP BY → HAVING → ORDER BY

🔷 Combined Example (Important 🔥)

👉 Find:
Non-null salaries
Salary > 20000
Occurs at least once
Sort by count (DESC)

SELECT salary, COUNT(salary) 
FROM employee
WHERE  salary > 20000
GROUP BY salary
HAVING COUNT(salary) >= 1
ORDER BY count(salary) DESC;

------------------------------------------------------------------------

🔷 Constraints in SQL
✅ What are Constraints?

👉 Constraints are rules applied on table columns to control the type of data that can be stored.
✔ They help maintain:
  Data accuracy
  Data consistency
  Data integrity

🎯 Benefits of Constraints
  ❌ Prevent wrong/invalid data
  🚫 Avoid NULL values
  🔑 Ensure unique identity
  🔗 Create relationships between tables
  🎯 Set default values

✔ Validate data before inserting

🔷 Types of Constraints

✅ 1. NOT NULL Constraint
  👉 Column cannot store NULL value

  CREATE TABLE employee (
    name VARCHAR(100) NOT NULL
  );

  ✔ If user:
  Inserts NULL → ❌ Error
  Skips value → ❌ Error

✅ 2. UNIQUE Constraint
👉 Prevents duplicate values

CREATE TABLE employee (
  email VARCHAR(100) UNIQUE
);

✔ Used for:
Email
Phone number
Username

✔ Combination:
email VARCHAR(100) UNIQUE NOT NULL

✅ 3. PRIMARY KEY Constraint
👉 Combination of: UNIQUE + NOT NULL

CREATE TABLE employee (
  eid INT PRIMARY KEY,
  name VARCHAR(100) NOT NULL
);

✔ Rules:
Only one primary key per table
No duplicate values
No NULL values

🔥 Example
INSERT INTO employee VALUES (1, 'abc');
INSERT INTO employee VALUES (1, 'xyz'); -- ❌ ERROR

✅ 4. FOREIGN KEY Constraint
👉 Used to create relationship between tables

CREATE TABLE dept (
  deptid INT PRIMARY KEY
);

CREATE TABLE employee (
  eid INT PRIMARY KEY,
  deptid INT,
  FOREIGN KEY (deptid) REFERENCES dept(deptid)
);

✔ Key points:
Parent table → Primary Key
Child table → Foreign Key
Maintains referential integrity

🔷 Primary Key vs Unique Key

| Feature         | Primary Key | Unique Key               |
| --------------- | ----------- | ------------------------ |
| NULL allowed    | ❌ No       | ✅ Yes (one NULL allowed) |
| Duplicate       | ❌ No       | ❌ No                     |
| Count per table | Only 1      | Multiple allowed         |
| Index type      | Clustered   | Non-clustered            |

🔷 Important Notes
  A table must have one primary key (recommended)
  You can apply multiple constraints on one column
  Foreign key connects tables (Parent → Child)

✅ Q. How to create Foreign Key (Practically in MySQL)?

A foreign key is used to create a relationship between two tables.
It links a column in one table (child) to the primary key of another table (parent).

🔹 Syntax
CREATE TABLE tablename(
  columnname datatype(size),
  FOREIGN KEY(columnname) 
  REFERENCES parenttablename(primary_key_column)
);

🔹 Example (Practical)
✅ Create Parent Table

CREATE TABLE dept(
  deptid INT(5) PRIMARY KEY,
  deptname VARCHAR(200) NOT NULL UNIQUE
);

✅ Create Child Table with Foreign Key
CREATE TABLE employee(
  eid INT(5) PRIMARY KEY,
  ename VARCHAR(200) NOT NULL,
  email VARCHAR(200) NOT NULL UNIQUE,
  contact VARCHAR(200) NOT NULL UNIQUE,
  deptid INT(5),
  FOREIGN KEY(deptid) REFERENCES dept(deptid)
);

    ⚠️ Important Note (Very Important for Exam)
    If a parent record (primary key) is referenced in a child table:
    ❌ You cannot delete or update it directly

    delete from dept where deptid = 1;

    It will give an error

    👉 Example:
    If deptid = 1 exists in both dept and employee tables
    → You must delete child records first
    → Then delete parent record

    delete from employee where deptid = 1; (child)
    delete from dept where deptid = 1;  (parent)

    ❗ Problem in Real Systems
    In large databases, manually deleting child records is difficult.

    ✅ Solution: CASCADE Options

    🔸 1. ON DELETE CASCADE
    When parent record is deleted
    👉 All related child records are automatically deleted

    CREATE TABLE dept(
      deptid INT(5) PRIMARY KEY AUTO_INCREMENT,
      name VARCHAR(200) NOT NULL
    );

    CREATE TABLE employee(
      eid INT(5) PRIMARY KEY,
      name VARCHAR(200),
      email VARCHAR(200) UNIQUE,
    contact VARCHAR(15) UNIQUE
      deptid INT(5),
      FOREIGN KEY(deptid) 
      REFERENCES dept(deptid)
      ON DELETE CASCADE
    );

    📌 Example:
    Step 1: Insert into dept
    INSERT INTO dept(name) VALUES('IT'), ('HR');

    Step 2: Insert into employee
    INSERT INTO employee VALUES
    (1, 'Ram', 'ram@gmail.com', '9999999999', 1),
    (2, 'Shyam', 'shyam@gmail.com', '8888888888', 1);

    ❗ Now delete parent record:
    DELETE FROM dept WHERE deptid = 1;

    🔸 2. ON UPDATE CASCADE
    👉 When a primary key value (parent table) is updated,
    👉 The foreign key values (child table) are automatically updated.

    🔹 Syntax
    CREATE TABLE tablename(
      columnname datatype(size),
      FOREIGN KEY(columnname) 
      REFERENCES parenttablename(columnname)
      ON UPDATE CASCADE
    );
    🔹 Example
    CREATE TABLE dept(
      deptid INT(5) PRIMARY KEY AUTO_INCREMENT,
      name VARCHAR(200) NOT NULL
    );

    CREATE TABLE employee(
      eid INT PRIMARY KEY,
      deptid INT,
      FOREIGN KEY(deptid)
      REFERENCES dept(deptid)
      ON UPDATE CASCADE
      ON DELETE CASCADE
    );

    📌 Example:
    Step 1: Insert into dept
    INSERT INTO dept(name) VALUES('IT'), ('HR');

    Step 2: Insert into employee
    INSERT INTO employee VALUES
    (1, 'Ram', 'ram@gmail.com', '9999999999', 1),
    (2, 'Shyam', 'shyam@gmail.com', '8888888888', 1);

    ❗ Now update parent record:
    update dept set deptid = 1 where name = 'prod';

    🔹 Using Both CASCADE Options Together
    👉 You can use ON UPDATE CASCADE and ON DELETE CASCADE together:

    🔸 3. ON DELETE SET NULL
    When parent record is deleted
    👉 Foreign key in child table becomes NULL

    CREATE TABLE dept(
      deptid INT(5) PRIMARY KEY AUTO_INCREMENT,
      name VARCHAR(200) NOT NULL
    );

    CREATE TABLE employee(
      eid INT(5) PRIMARY KEY,
      name VARCHAR(200),
      email VARCHAR(200),
      contact VARCHAR(200),
      deptid INT(5),
      FOREIGN KEY(deptid) 
      REFERENCES dept(deptid)
      ON DELETE SET NULL
    );

    📌 Example:
    Step 1: Insert into dept
    INSERT INTO dept(name) VALUES('IT'), ('HR');

    Step 2: Insert into employee
    INSERT INTO employee VALUES
    (1, 'Ram', 'ram@gmail.com', '9999999999', 1),
    (2, 'Shyam', 'shyam@gmail.com', '8888888888', 1);

    ❗ Now delete parent record:
    delete from dept where deptid = 1;

✅ 4. CHECK Constraint
✅ Definition

CHECK constraint is used to apply a condition on a column at the time of table creation.
👉 If the condition is true, data is inserted
👉 If false, it gives an error

🔹 Syntax
CREATE TABLE tablename(
  columnname datatype(size) CHECK(condition)
);

🔹 Example
CREATE TABLE employee(
  eid INT(5) PRIMARY KEY,
  name VARCHAR(200),
  age INT(5) CHECK(age > 18)
);
⚠️ Important
If age = 10 → ❌ Error (condition fails)
Error like: constraint violated

✅ 5. DEFAULT Constraint
✅ Definition

DEFAULT constraint assigns a default value to a column
👉 If user does not provide value → default value is used

🔹 Syntax
CREATE TABLE tablename(
  columnname datatype(size) DEFAULT value
);
🔹 Example
CREATE TABLE employee(
  eid INT(5) PRIMARY KEY,
  name VARCHAR(200),
  desig VARCHAR(200) DEFAULT 'SE'
);
🔹 Insert Example
INSERT INTO employee (eid, name) VALUES(1, 'RAM');
👉 Output: desig = 'SE' (default applied)

INSERT INTO employee (eid, name, desig) VALUES(2, 'SHYAM', 'SD');
👉 Output: desig = 'SD' (user value overrides default)

🔹 3. AUTO_INCREMENT
✅ Definition

AUTO_INCREMENT automatically generates unique values (usually for primary key).

🔹 Syntax
CREATE TABLE employee(
  eid INT(5) PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(200),
  desig VARCHAR(200) DEFAULT 'SE'
);
🔹 Insert Example
INSERT INTO employee (eid, name) VALUES(NULL, 'RAM');

👉 eid will be generated automatically (1, ram, se)


------------------------------------------------------------------------
✅ Joins in SQL
🔹 Q. What is Join?

A JOIN is used to fetch data from two or more tables that are related using a common column (usually Primary Key & Foreign Key).

SELECT ltr.column_name, rtr.column_name
FROM left_table ltr
JOIN_TYPE right_table rtr
ON ltr.common_column = rtr.common_column;

✅ Types of Joins
🔸 1. INNER JOIN
Returns only matching (common) records from both tables

SELECT d.deptname, e.name, e.email, e.contact
FROM dept d 
INNER JOIN employee e 
ON d.deptid = e.deptid;

👉 Only records where deptid matches in both tables

🔸 2. LEFT JOIN
Returns all records from left table + matching from right

SELECT d.deptname, e.name , e.email, e.contact
FROM dept d 
LEFT JOIN employee e 
ON d.deptid = e.deptid;

👉 Non-matching right values → NULL

🔸 3. RIGHT JOIN
Returns all records from right table + matching from left

SELECT d.deptname, e.name, e.mail, e.contact 
FROM dept d 
RIGHT JOIN employee e 
ON d.deptid = e.deptid;

👉 Non-matching left values → NULL

🔸 4. FULL OUTER JOIN
Returns all records from both tables
👉 In MySQL, FULL JOIN is not direct → use UNION

SELECT d.deptname, e.name 
FROM dept d 
LEFT JOIN employee e ON d.deptid = e.deptid
UNION
SELECT d.deptname, e.name 
FROM dept d 
RIGHT JOIN employee e ON d.deptid = e.deptid;

🔸 5. SELF JOIN
Join a table with itself

SELECT a.name, b.name 
FROM employee a, employee b 
WHERE a.manager_id = b.eid;

or

SELECT a.name AS Employee, b.name AS Manager
FROM employee a
INNER JOIN employee b
ON a.manager_id = b.eid;

🔸 6. CROSS JOIN (Cartesian Product)
Returns all combinations (m × n)

SELECT d.deptname, e.name 
FROM employee e 
CROSS JOIN dept d;

------------------------------------------------------------------------
✅ Important SQL Queries (Exam Based)

🔹 1. Dept without Employees

SELECT d.deptname, COUNT(e.deptid)
FROM dept d 
LEFT JOIN employee e ON d.deptid = e.deptid
GROUP BY d.deptname
HAVING COUNT(e.deptid) = 0;

🔹 2. Employees without Department
SELECT e.name, COUNT(e.deptid)
FROM dept d 
RIGHT JOIN employee e ON d.deptid = e.deptid
GROUP BY e.eid
HAVING COUNT(e.deptid) = 0;
🔹 3. Dept without Employees (Name starts with H)
SELECT d.deptname, COUNT(e.deptid)
FROM dept d 
LEFT JOIN employee e ON d.deptid = e.deptid
WHERE d.deptname LIKE 'H%'
GROUP BY d.deptname
HAVING COUNT(e.deptid) = 0;

--------------------------------------------------------------
✅ Joins with Multiple Tables

![alt text](image.png)

mysql> create table course(cid int(5) primary key auto_increment,cname varchar(200));
Query OK, 0 rows affected, 1 warning (0.21 sec)

mysql> create table student(sid int(5) primary key auto_increment,sname varchar(200));
Query OK, 0 rows affected, 1 warning (0.03 sec)

mysql> create table batch(bid int(5) primary key auto_increment,bname varchar(200),cid int(5),foreign key(cid) references course(cid));
Query OK, 0 rows affected, 2 warnings (0.08 sec)

mysql> create table sbjoin(sid int(5),foreign key(sid) references student(sid),bid int(5),foreign key(bid) references batch(bid));
Query OK, 0 rows affected, 2 warnings (0.07 sec)

mysql> create table csjoin(cid int(5),foreign key(cid) references course(cid),sid int(5),foreign key(sid) references student(sid));
Query OK, 0 rows affected, 2 warnings (0.07 sec)

mysql> create table placement(pid int(5) primary key auto_increment,compname varchar(200),package int(5),sid int(5),foreign key(sid) references student(sid));
Query OK, 0 rows affected, 3 warnings (0.07 sec)


🔹 Example: Course-wise Student List
SELECT c.cname, s.sname
FROM course c
INNER JOIN csjoin cs ON c.cid = cs.cid
INNER JOIN student s ON cs.sid = s.sid;

🔹 Course-wise Admission Count
SELECT c.cname, COUNT(cs.sid) AS total_students
FROM course c
INNER JOIN csjoin cs ON c.cid = cs.cid
GROUP BY c.cname;

🔹 3. Placement Details (Course + Student + Company + Package)
SELECT c.cname, s.sname, p.compname, p.package

FROM course c
INNER JOIN csjoin cs ON c.cid = cs.cid
INNER JOIN student s ON s.sid = cs.sid
INNER JOIN placement p ON p.sid = s.sid;

🔹 Placement with Batch Name
SELECT c.cname, s.sname, p.compname, p.package, b.bname
FROM course c
INNER JOIN csjoin cs ON c.cid = cs.cid
INNER JOIN student s ON s.sid = cs.sid
INNER JOIN placement p ON p.sid = s.sid
INNER JOIN sbjoin sb ON sb.sid = s.sid
INNER JOIN batch b ON b.bid = sb.bid;

🔹 Course-wise Placement Count
SELECT c.cname, COUNT(p.sid) AS placed_students
FROM course c
INNER JOIN csjoin cs ON c.cid = cs.cid
INNER JOIN placement p ON p.sid = cs.sid
GROUP BY c.cid;

------------------------------------------------------------------------
------------------------------------------------------------------------

🔷 What is Normalization?

👉 Normalization = Breaking a large table into smaller tables
to:

❌ Avoid data duplication
❌ Remove anomalies
✔ Improve data integrity

🔷 Important Concepts Before Normalization
Association 
Dependency 
Keys concepts 
Normalization 

✅ 1. Association (Relationship)

👉 Defines relationship between tables

🔹 One-to-Many
One record → many records

✔ Example: One course → many students

🔹 Many-to-Many
Many ↔ many
✔ Example: Students ↔ Courses

👉 Requires intermediate table (junction table)

CREATE TABLE student_course (
  sid INT,
  cid INT,3
  FOREIGN KEY (sid) REFERENCES student(sid),
  FOREIGN KEY (cid) REFERENCES course(cid)
);
🔹 One-to-One
One ↔ one

✔ Example: User → Profile

CREATE TABLE profile (
  pid INT PRIMARY KEY,
  userid INT UNIQUE,
  FOREIGN KEY (userid) REFERENCES users(userid)
);
🔷 2. Dependency in DBMS

👉 Dependency = How one column depends on another

🔹 Functional Dependency

👉 One column identifies another
📌 Format: X → Y

✔ Example:

userid → username
🔹 Full Functional Dependency

👉 Depends on entire composite key

✔ Example:

(sid, subid) → score
🔹 Partial Dependency

👉 Depends on part of composite key

✔ Example:

subid → teachername

❌ Problem → leads to redundancy

🔹 Transitive Dependency

👉 Non-key depends on another non-key

✔ Example:

sid → examid → totalmarks

❌ Problem → violates 3NF

🔷 3. Key Concepts
🔹 Primary Key
Unique + Not Null
Only one per table
🔹 Candidate Key
All possible unique keys

✔ Example:

sid
email
contact
🔹 Super Key
Any combination that uniquely identifies

✔ Example:

{sid}, {sid,name}, {email}
🔹 Composite Key

👉 Combination of columns

PRIMARY KEY (sid, subid)
🔹 Foreign Key

👉 Connects tables

🔷 4. Normal Forms
✅ 1NF (First Normal Form)
Rules:
Atomic values (no multiple values in one column)
Unique column names
Same data type

❌ Wrong:

course = C, C++

✔ Correct:

Separate rows for each course
✅ 2NF (Second Normal Form)
Rules:
Must be in 1NF
❌ No partial dependency

✔ Fix:

Move partially dependent columns to another table
✅ 3NF (Third Normal Form)
Rules:
Must be in 2NF
❌ No transitive dependency

✔ Fix:

Move non-key dependent columns to new table
🔥 Anomalies (Problems without Normalization)
❌ Insertion Anomaly
Cannot insert incomplete data
❌ Deletion Anomaly
Deleting one record removes other important data
❌ Update Anomaly
Same data repeated → multiple updates required
🔷 Subquery (Nested Query)

👉 Query inside another query

🔹 Example: Second Highest Salary
SELECT MAX(salary)
FROM employee
WHERE salary < (SELECT MAX(salary) FROM employee);
🔹 Types
✔ Inner Subquery
Executes first
✔ Co-related Subquery
SELECT * FROM employee e
WHERE EXISTS (
  SELECT 1 FROM dept d WHERE e.deptid = d.deptid
);
🔷 IN vs EXISTS
IN	EXISTS
Faster	Slower
Not work with NULL	Works with NULL
Bottom-up	Top-down
Used for values	Used for existence
🔷 ANY Operator

👉 True if any value matches

SELECT * FROM employee
WHERE salary > ANY (
  SELECT salary FROM employee WHERE deptid = 3
);
🔷 ALL Operator

👉 True if all values match

SELECT * FROM employee
WHERE salary > ALL (
  SELECT salary FROM employee WHERE deptid = 3
);
🔷 View in SQL

👉 Virtual table (no physical storage)

✅ Create View
CREATE VIEW emp_view AS
SELECT name, email FROM employee;
🎯 Benefits of View
🔐 Security (hide columns)
♻ Reuse complex queries
📉 Simplify joins
🔥 Example (Join View)
CREATE VIEW empjoinview AS
SELECT e.name, e.email, d.deptname
FROM employee e
JOIN dept d ON e.deptid = d.deptid;
✅ Final Quick Summary
Normalization → remove redundancy
1NF → atomic values
2NF → remove partial dependency
3NF → remove transitive dependency
Subquery → query inside query
View → virtual table