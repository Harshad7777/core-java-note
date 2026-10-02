# SQL Notes

[Overview](#overview) | [Database Basics](#database-basics) | [SQL Commands](#sql-commands) | [Operators and Clauses](#operators-and-clauses) | [Constraints](#constraints) | [Joins](#joins) | [Normalization](#normalization) | [Subqueries and Views](#subqueries-and-views) | [Interview Tips](#interview-tips)

---

## Overview

SQL stands for Structured Query Language.

It is used to:

- create databases and tables
- insert, modify, and delete data
- retrieve data using queries
- manage relationships between tables
- control user access and transactions

SQL is mainly used with relational databases such as MySQL, Oracle, PostgreSQL, and SQL Server.

---

## Database Basics

### What is a database?

A database is a collection of related data stored in an organized manner so it can be accessed, managed, and updated easily.

### Why use databases?

- permanent data storage
- organized data structure
- faster retrieval
- data security
- consistency and integrity
- multi-user access
- backup and recovery

### Types of databases

- Relational Database (RDBMS)
- Hierarchical Database
- Object-Oriented Database
- Cloud Database
- Distributed Database

### Relational database basics

- table = collection of rows and columns
- row = record
- column = attribute

### Create database

```sql
CREATE DATABASE aug2025;
USE aug2025;
```

---

## SQL Commands

### 1. DDL (Data Definition Language)

Used to create and modify table structures.

Commands:

- `CREATE`
- `DESC`
- `ALTER`
- `DROP`
- `TRUNCATE`

### Example: create table

```sql
CREATE TABLE employee(
    eid INT(5),
    name VARCHAR(200),
    salary INT(5)
);
```

### Example: describe table

```sql
DESC employee;
```

### Example: alter table

```sql
ALTER TABLE employee ADD COLUMN email VARCHAR(100);
ALTER TABLE employee MODIFY COLUMN contact INT(10);
ALTER TABLE employee DROP COLUMN contact;
ALTER TABLE employee RENAME COLUMN contact TO phone;
```

### Example: truncate and drop

```sql
TRUNCATE TABLE employee;
DROP TABLE employee;
```

### 2. DML (Data Manipulation Language)

Used to manipulate data inside tables.

Commands:

- `INSERT`
- `UPDATE`
- `DELETE`

### Insert examples

```sql
INSERT INTO employee VALUES(1, 'Ram', 50000);

INSERT INTO employee(eid, name) VALUES(2, 'Shyam');

INSERT INTO employee VALUES
(3, 'Amit', 40000),
(4, 'Neha', 45000);
```

### Delete examples

```sql
DELETE FROM employee;
DELETE FROM employee WHERE eid = 2;
```

### Update examples

```sql
UPDATE employee SET salary = 60000;
UPDATE employee SET salary = 150000 WHERE eid = 3;
```

### 3. DQL (Data Query Language)

Used to retrieve data.

Command:

- `SELECT`

Example:

```sql
SELECT * FROM employee;
SELECT name, salary FROM employee WHERE salary > 20000;
```

### 4. DCL (Data Control Language)

Used to manage permissions.

Commands:

- `GRANT`
- `REVOKE`

### 5. TCL (Transaction Control Language)

Used to control transactions.

Commands:

- `COMMIT`
- `ROLLBACK`
- `SAVEPOINT`

---

## Operators and Clauses

### Logical operators

#### AND

```sql
SELECT * FROM employee
WHERE id = 3 AND name = 'ganesh';
```

#### OR

```sql
SELECT * FROM employee
WHERE id = 1 OR name = 'ganesh';
```

#### NOT

```sql
SELECT * FROM employee
WHERE NOT name = 'ganesh';
```

### IN operator

```sql
SELECT * FROM employee
WHERE salary IN (20000, 40000, 50000);
```

### BETWEEN operator

```sql
SELECT * FROM employee
WHERE salary BETWEEN 20000 AND 40000;
```

### LIKE operator

```sql
SELECT * FROM employee WHERE name LIKE 'a%';
SELECT * FROM employee WHERE name LIKE '%sh';
SELECT * FROM employee WHERE name LIKE '%a%';
SELECT * FROM employee WHERE name LIKE '___';
```

### WHERE clause

```sql
SELECT * FROM employee WHERE salary > 20000;
```

### GROUP BY clause

```sql
SELECT salary
FROM employee
GROUP BY salary;
```

### HAVING clause

```sql
SELECT salary, COUNT(salary)
FROM employee
GROUP BY salary
HAVING COUNT(*) > 1;
```

### ORDER BY clause

```sql
SELECT * FROM employee ORDER BY salary DESC;
```

### Correct SQL clause order

```sql
SELECT column
FROM table
WHERE condition
GROUP BY column
HAVING condition
ORDER BY column;
```

---

## Aggregate Functions

```sql
SELECT COUNT(salary) FROM employee;
SELECT COUNT(*) FROM employee;
SELECT SUM(salary) FROM employee;
SELECT AVG(salary) FROM employee;
SELECT MAX(salary) FROM employee;
SELECT MIN(salary) FROM employee;
```

---

## Constraints

Constraints are rules used to ensure valid and consistent data.

### 1. NOT NULL

```sql
CREATE TABLE employee (
    name VARCHAR(100) NOT NULL
);
```

### 2. UNIQUE

```sql
CREATE TABLE employee (
    email VARCHAR(100) UNIQUE
);
```

### 3. PRIMARY KEY

```sql
CREATE TABLE employee (
    eid INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);
```

### 4. FOREIGN KEY

```sql
CREATE TABLE dept (
  deptid INT PRIMARY KEY
);

CREATE TABLE employee (
  eid INT PRIMARY KEY,
  deptid INT,
  FOREIGN KEY (deptid) REFERENCES dept(deptid)
);
```

### 5. CHECK

```sql
CREATE TABLE employee (
  eid INT PRIMARY KEY,
  age INT CHECK(age > 18)
);
```

### 6. DEFAULT

```sql
CREATE TABLE employee (
  eid INT PRIMARY KEY,
  desig VARCHAR(200) DEFAULT 'SE'
);
```

### 7. AUTO_INCREMENT

```sql
CREATE TABLE employee (
  eid INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(200)
);
```

### Foreign key cascade options

```sql
FOREIGN KEY(deptid)
REFERENCES dept(deptid)
ON DELETE CASCADE
ON UPDATE CASCADE;
```

Also useful:

```sql
ON DELETE SET NULL
```

---

## Joins

A join is used to combine data from two or more related tables.

### Inner Join

```sql
SELECT d.deptname, e.name, e.email
FROM dept d
INNER JOIN employee e
ON d.deptid = e.deptid;
```

### Left Join

```sql
SELECT d.deptname, e.name
FROM dept d
LEFT JOIN employee e
ON d.deptid = e.deptid;
```

### Right Join

```sql
SELECT d.deptname, e.name
FROM dept d
RIGHT JOIN employee e
ON d.deptid = e.deptid;
```

### Self Join

```sql
SELECT a.name AS Employee, b.name AS Manager
FROM employee a
INNER JOIN employee b
ON a.manager_id = b.eid;
```

### Cross Join

```sql
SELECT d.deptname, e.name
FROM employee e
CROSS JOIN dept d;
```

### Full Outer Join

In MySQL, use `UNION` with left and right joins.

```sql
SELECT d.deptname, e.name
FROM dept d
LEFT JOIN employee e ON d.deptid = e.deptid
UNION
SELECT d.deptname, e.name
FROM dept d
RIGHT JOIN employee e ON d.deptid = e.deptid;
```

---

## Normalization

Normalization is the process of splitting large tables into smaller tables to avoid redundancy and improve consistency.

### Why use normalization?

- avoid duplication
- reduce anomalies
- improve data integrity
- improve maintainability

### Types of anomalies

#### Insertion anomaly

Data cannot be inserted properly because required fields are missing or repeated.

#### Deletion anomaly

Deleting a record removes other important information accidentally.

#### Update anomaly

The same information has to be updated in many rows.

### 1NF (First Normal Form)

Rules:

- unique column names
- atomic values
- same type of values in a column

Example:

```sql
-- not in 1NF
course = 'C, C++'
```

Correct version:

```sql
sid  name  course
1    A     C
1    A     C++
```

### 2NF (Second Normal Form)

Rules:

- must be in 1NF
- no partial dependency

Partial dependency happens when a non-key column depends on only part of a composite key.

### 3NF (Third Normal Form)

Rules:

- must be in 2NF
- no transitive dependency

Transitive dependency means a non-key column depends on another non-key column.

### BCNF

BCNF is stronger than 3NF.

A table is in BCNF if every determinant is a super key.

### 4NF

A table is in 4NF if it contains no multivalued dependency.

---

## Subqueries and Views

### Subquery

A query inside another query.

### Example: second highest salary

```sql
SELECT MAX(salary)
FROM employee
WHERE salary < (SELECT MAX(salary) FROM employee);
```

### EXISTS

```sql
SELECT * FROM employee e
WHERE EXISTS (
    SELECT 1 FROM dept d WHERE e.deptid = d.deptid
);
```

### ANY

```sql
SELECT * FROM employee
WHERE salary > ANY (
    SELECT salary FROM employee WHERE deptid = 3
);
```

### ALL

```sql
SELECT * FROM employee
WHERE salary > ALL (
    SELECT salary FROM employee WHERE deptid = 3
);
```

### View

A view is a virtual table based on a query.

```sql
CREATE VIEW emp_view AS
SELECT name, email FROM employee;
```

Benefits of views:

- hide data
- reuse query logic
- simplify complex joins

---

## Key Concepts

### Candidate key

All possible minimal unique identifiers.

### Super key

Any set of columns that uniquely identifies rows.

### Composite key

Combination of multiple columns to uniquely identify a row.

### Primary key

Chosen candidate key; unique and not null.

### Foreign key

Refers to primary key in another table.

### Functional dependency

If A determines B, then A → B.

### Full dependency

Depends on the entire key.

### Partial dependency

Depends on only part of a composite key.

### Transitive dependency

Non-key attribute depends on another non-key attribute.

### Multivalued dependency

A single attribute determines multiple independent values.

---

## Interview Tips

### Important SQL questions to remember

- What is a database?
- What are DDL, DML, DQL, DCL, TCL?
- What is the difference between primary key and foreign key?
- What is normalization?
- What is a join and its types?
- What are constraints in SQL?
- Difference between 1NF, 2NF, 3NF?
- What is a subquery?
- What is a view?

### Final quick summary

- SQL is used to manage relational databases.
- DDL creates/changes structure, DML changes data, DQL retrieves data.
- Constraints help maintain data correctness.
- Joins connect related tables.
- Normalization reduces redundancy and improves integrity.
- Views and subqueries simplify query design.

This is the cleaned and structured SQL revision note.
