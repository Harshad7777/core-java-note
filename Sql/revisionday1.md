# Preparation File

## Section List

### a. Theory Question

### b. MCQ Question

### c. Coding Practice Query

---

# a. Theory Question

**Preparation Time:** 8:00 AM to 11:00 AM

---

---

# Theory Answers

## 🔸 DDL (Data Definition Language)

1. **What is DDL in SQL?**
   DDL stands for Data Definition Language. It is used to define and manage database structure like tables, schemas, indexes.

2. **Difference between CREATE, ALTER, and DROP?**

* CREATE: Creates new database objects.
* ALTER: Modifies existing objects.
* DROP: Deletes objects permanently.

3. **Create table with primary key and NOT NULL constraint:**

```sql
CREATE TABLE Student (
   sid INT PRIMARY KEY,
   sname VARCHAR(100) NOT NULL
);
```

4. **Add a new column to existing table:**

```sql
ALTER TABLE Student ADD age INT;
```

5. **Rename a table:**

```sql
ALTER TABLE Student RENAME TO Students;
```

6. **Difference between TRUNCATE and DELETE?**

* DELETE removes rows one by one and can use WHERE.
* TRUNCATE removes all rows quickly and cannot use WHERE.

7. **Can TRUNCATE be rolled back?**
   Depends on DBMS. In many systems it cannot easily rollback after commit.

8. **What is a constraint? Types?**
   Rules applied on table columns.
   Types: PRIMARY KEY, FOREIGN KEY, UNIQUE, NOT NULL, CHECK, DEFAULT.

9. **PRIMARY KEY vs UNIQUE KEY**

* PRIMARY KEY: Unique + Not Null.
* UNIQUE KEY: Unique values but can allow one NULL depending on DBMS.

10. **Remove a column from table:**

```sql
ALTER TABLE Student DROP COLUMN age;
```

## 🔸 DML (Data Manipulation Language)

11. **What is DML?**
    DML stands for Data Manipulation Language. Used to manage data inside tables.

12. **INSERT, UPDATE, DELETE difference**

* INSERT adds new data.
* UPDATE modifies data.
* DELETE removes data.

13. **Insert multiple records:**

```sql
INSERT INTO Student VALUES
(1,'Amit'),
(2,'Rahul');
```

14. **Update multiple columns:**

```sql
UPDATE Student
SET sname='Harshad', age=25
WHERE sid=1;
```

15. **Update without WHERE clause?**
    All rows will be updated.

16. **Delete specific records:**

```sql
DELETE FROM Student WHERE sid=1;
```

17. **DELETE vs TRUNCATE**
    DELETE removes selected/all rows. TRUNCATE clears complete table data.

18. **Copy data one table to another:**

```sql
INSERT INTO NewTable
SELECT * FROM OldTable;
```

19. **Insert data from one table into another:**

```sql
INSERT INTO BackupStudent
SELECT * FROM Student;
```

20. **MERGE statement?**
    Used to INSERT, UPDATE, DELETE in one statement based on condition.

## 🔸 TCL (Transaction Control Language)

21. **What is TCL?**
    Used to manage transactions in database.

22. **What is transaction?**
    A group of SQL statements executed as one logical unit.

23. **What is COMMIT?**
    Saves changes permanently.

24. **What is ROLLBACK?**
    Undo changes before commit.

25. **What is SAVEPOINT?**
    Creates checkpoint inside transaction.

26. **If transaction not committed?**
    Changes may be lost.

27. **Rollback after commit?**
    No.

28. **Auto-commit mode?**
    Every statement saves automatically.

29. **COMMIT vs ROLLBACK**

* COMMIT saves changes.
* ROLLBACK cancels changes.

30. **Transaction consistency?**
    Database remains valid before and after transaction.

## 🔸 DCL (Data Control Language)

31. **What is DCL?**
    Controls user permissions.

32. **What is GRANT?**
    Gives privileges.

33. **What is REVOKE?**
    Removes privileges.

34. **Give SELECT permission:**

```sql
GRANT SELECT ON Student TO user1;
```

35. **Remove access:**

```sql
REVOKE SELECT ON Student FROM user1;
```

## 🔸 SELECT Statement

36. **What is SELECT?**
    Used to fetch data.

37. **SELECT * vs specific columns**

* SELECT * gets all columns.
* Specific columns fetch selected data only.

38. **What is alias?**
    Temporary name for column/table.

39. **Remove duplicates using SELECT:**

```sql
SELECT DISTINCT sname FROM Student;
```

40. **DISTINCT keyword?**
    Returns unique values.

## 🔸 WHERE Clause

41. **What is WHERE clause?**
    Filters records based on condition.

42. **WHERE vs HAVING**

* WHERE filters rows before grouping.
* HAVING filters groups after grouping.

43. **Operators in WHERE**
    =, >, <, >=, <=, <>, IN, BETWEEN, LIKE.

44. **BETWEEN operator?**
    Checks range.

45. **IN operator?**
    Checks multiple values.

## 🔸 GROUP BY

46. **What is GROUP BY?**
    Groups similar rows.

47. **Why used?**
    For aggregate calculations.

48. **GROUP BY without aggregate?**
    Displays grouped distinct rows.

49. **Use WHERE with GROUP BY?**
    Yes, before grouping.

50. **Aggregate functions?**
    SUM, AVG, COUNT, MAX, MIN.

## 🔸 HAVING Clause

51. **What is HAVING?**
    Filters grouped data.

52. **WHERE vs HAVING**
    WHERE before grouping, HAVING after grouping.

53. **HAVING without GROUP BY?**
    Possible in some DBMS.

54. **Executes first WHERE or HAVING?**
    WHERE first.

55. **Why HAVING needed?**
    To filter grouped results.

## 🔸 ORDER BY

56. **What is ORDER BY?**
    Sorts results.

57. **Default sorting order?**
    Ascending.

58. **ASC vs DESC**
    ASC = low to high, DESC = high to low.

59. **Sort by multiple columns?**
    Yes.

60. **Use alias in ORDER BY?**
    Yes.

## 🔸 LIKE Operator

61. **What is LIKE?**
    Pattern matching.

62. **Wildcards?**
    Special symbols in LIKE.

63. **% vs _**

* % = many characters
* _ = single character

64. **Names starting with A:**

```sql
SELECT * FROM Student WHERE sname LIKE 'A%';
```

65. **Names ending with n:**

```sql
SELECT * FROM Student WHERE sname LIKE '%n';
```

## 🔸 Scenario Based

66. **Second highest salary:**

```sql
SELECT MAX(salary)
FROM Employee
WHERE salary < (SELECT MAX(salary) FROM Employee);
```

67. **Find duplicate records:**

```sql
SELECT sname, COUNT(*)
FROM Student
GROUP BY sname
HAVING COUNT(*) > 1;
```

68. **Delete duplicates keep one:**
    Advanced query using ROW_NUMBER().

69. **Salary greater than average:**

```sql
SELECT * FROM Employee
WHERE salary > (SELECT AVG(salary) FROM Employee);
```

70. **Count employees per department:**

```sql
SELECT dept_id, COUNT(*)
FROM Employee
GROUP BY dept_id;
```

---

## 🔸 Additional Theory Answers

## 🔸 IN Operator

1. **What is the IN operator in SQL?**
   IN operator is used to check whether a value matches any value in a given list.

2. **How is IN different from multiple OR conditions?**
   IN is a shorter and cleaner way to write multiple OR conditions.
   Example:

```sql
WHERE dept_id IN (1,2,3)
```

Same as:

```sql
WHERE dept_id=1 OR dept_id=2 OR dept_id=3
```

3. **Can IN be used with subqueries?**
   Yes, IN can compare values returned by a subquery.

4. **What happens if the IN list contains NULL?**
   NULL is ignored in comparison unless specifically handled.

5. **Query using IN with multiple values:**

```sql
SELECT * FROM Employee
WHERE dept_id IN (1,2,3);
```

## 🔸 BETWEEN Operator

6. **What is the BETWEEN operator?**
   BETWEEN checks whether a value lies within a range.

7. **Is BETWEEN inclusive or exclusive?**
   Inclusive. It includes both start and end values.

8. **Can BETWEEN be used with dates?**
   Yes.

9. **Difference between BETWEEN and >= <= ?**
   Both work similarly. BETWEEN is shorter and easier to read.

10. **Query using BETWEEN for salary range:**

```sql
SELECT * FROM Employee
WHERE salary BETWEEN 30000 AND 50000;
```

## 🔸 ANY Operator

11. **What is the ANY operator?**
    ANY compares a value with values returned by a subquery.

12. **Difference between ANY and ALL?**

* ANY: condition true if matches at least one value.
* ALL: condition true only if matches all values.

13. **How does ANY work with comparison operators?**
    Checks comparison against each returned value.

14. **Can ANY be used without subquery?**
    Usually used with subqueries.

15. **Query using ANY:**

```sql
SELECT * FROM Employee
WHERE salary > ANY (
   SELECT salary FROM Employee WHERE dept_id=2
);
```

## 🔸 EXISTS Operator

16. **What is the EXISTS operator?**
    Checks whether subquery returns rows.

17. **Difference between EXISTS and IN?**

* EXISTS checks row existence.
* IN checks matching values.

18. **When should you use EXISTS instead of IN?**
    Use EXISTS for faster checking in large subqueries.

19. **What does EXISTS return?**
    TRUE if rows exist, FALSE otherwise.

20. **Query using EXISTS:**

```sql
SELECT * FROM Department d
WHERE EXISTS (
   SELECT * FROM Employee e
   WHERE e.dept_id = d.dept_id
);
```

## 🔸 JOINS

21. **What are joins in SQL?**
    Joins combine data from multiple tables using related columns.

22. **Types of joins in SQL?**
    INNER JOIN, LEFT JOIN, RIGHT JOIN, FULL OUTER JOIN, CROSS JOIN, SELF JOIN.

23. **INNER JOIN vs LEFT JOIN**

* INNER JOIN returns matching rows only.
* LEFT JOIN returns all left table rows + matching right rows.

24. **What is RIGHT JOIN?**
    Returns all rows from right table and matching rows from left table.

25. **What is FULL OUTER JOIN?**
    Returns all rows from both tables.

26. **What is CROSS JOIN?**
    Returns cartesian product of both tables.

27. **What is SELF JOIN?**
    A table joined with itself.

28. **What happens if no join condition is specified?**
    Produces cartesian product.

29. **Difference between JOIN and UNION?**

* JOIN combines columns.
* UNION combines rows.

30. **Query to join two tables:**

```sql
SELECT e.emp_name, d.dept_name
FROM Employee e
INNER JOIN Department d
ON e.dept_id = d.dept_id;
```


---

# b. MCQ Question

## MCQ Question on SQL

### Answer Key (Q1–Q50)
Q1.Which SQL command is used to create a new table? 
A. CREATE TABLE 
B. ALTER TABLE 
C. INSERT INTO 
D. DROP TABLE 

1. A

Q2.How do you remove a column from an existing table? 
A. DROP COLUMN 
B. REMOVE COLUMN 
C. DELETE COLUMN 
D. ALTER TABLE 

a

Q3.Which command deletes a table completely? 
A. DROP TABLE 
B. DELETE TABLE 
C. TRUNCATE TABLE 
D. REMOVE TABLE 

a

Q4.Which DDL command is used to change the data type of a column? 
  A. UPDATE COLUMN 
  B. ALTER TABLE 
  C. MODIFY TABLE 
  D. CHANGE COLUMN 

  b
 
Q5.Adding a new column to a table is done with: 
  A. ADD COLUMN 
  B. UPDATE TABLE 
  C. INSERT COLUMN 
  D. CREATE COLUMN 

  a
 
Q6.Which command renames a table? 
  A. ALTER TABLE … RENAME TO 
  B. RENAME TABLE 
  C. CHANGE TABLE NAME
  D. MODIFY TABLE 
 
 a

Q7.Which DDL command is not reversible? 
  A. CREATE TABLE 
  B. DROP TABLE 
  C. ALTER TABLE 
  D. SELECT 
 
 b

Q8.Creating a table with a primary key column: 
  A. CREATE TABLE Students(ID INT PRIMARY KEY, Name VARCHAR(50)) 
  B. ALTER TABLE Students ADD ID PRIMARY KEY 
  C. UPDATE Students SET ID PRIMARY KEY
  D. INSERT INTO Students(ID) PRIMARY KEY 

  a
 
Q9.Which DDL statement removes all rows but keeps the structure? 
  A. TRUNCATE TABLE 
  B. DELETE 
  C. DROP TABLE 
  D. REMOVE 

  9
 
Q10.Which of the following is not DDL? 
  A. CREATE 
  B. ALTER 
  C. INSERT 
  D. DROP 
 
 c

Q11.Which SQL command is used to insert a new row into a table? 
  A. INSERT INTO 
  B. UPDATE 
  C. DELETE 
  D. CREATE 

  a
 
Q12.Updating a column value in a table uses which command? 
  A. INSERT 
  B. UPDATE 
  C. ALTER 
  D. DROP 
 
 b 

Q13.To remove rows matching a condition: 
  A. DELETE FROM TableName WHERE condition 
  B. DROP TableName 
  C. TRUNCATE TABLE TableName 
  D. REMOVE ROW 

  a
 
Q14.Selecting all columns from a table: 
  A. SELECT * FROM TableName 
  B. SHOW * FROM TableName 
  C. DISPLAY * FROM TableName 
  D. GET * FROM TableName 
 
 a

Q14.Which DML command modifies table data only but not structure? 
  A. INSERT 
  B. UPDATE 
  C. DELETE 
  D. All of the above 
 
 d

Q15.Insert multiple rows in a single statement: 
  A. INSERT INTO TableName VALUES (…), (…) 
  B. INSERT MULTIPLE TableName 
  C. UPDATE TableName 
  D. ADD ROWS 
 
 a

Q16. Which command updates multiple columns at once? 
 
 A. UPDATE TableName SET Col1 = val1, Col2 = val2 WHERE … 
 B. ALTER TABLE 
 C. INSERT INTO 
 D. DELETE 

 a
 
Q17.DML statements can be rolled back using which command? 
 
 A. COMMIT 
 B. ROLLBACK 
 C. SAVEPOINT 
 D. All of the above 
 
 b

Q18. Omitting WHERE in UPDATE: 
 
 A. Updates first row 
 B. Updates all rows 
 C. Error occurs 
 D. Modifies table structure 

 b

Q19.Which DML command removes all records but keeps table? 
A. DELETE 
B. TRUNCATE 
C. DROP 
D. ALTER 

b

Q20.Give SELECT privilege to user Alice: 
A. GRANT SELECT ON TableName TO Alice 
B. REVOKE SELECT ON TableName FROM Alice 
C. COMMIT 
D. ROLLBACK 

a

Q21.Revoke INSERT privilege from user Bob: 
A. REVOKE INSERT ON TableName FROM Bob 
B. GRANT INSERT ON TableName TO Bob 
C. DELETE FROM TableName 
D. ALTER TABLE 

a

Q23.Which DCL statement is used to give privileges? 
A. GRANT 
B. REVOKE 
C. COMMIT 
D. ROLLBACK 

a

Q24. Which command removes all privileges previously granted? 
A. REVOKE 
B. GRANT 
C. DELETE 
D. TRUNCATE 

a

Q25. Grant all privileges on a database to a user: 
A. GRANT ALL PRIVILEGES ON DatabaseName TO UserName 
B. REVOKE ALL PRIVILEGES 
C. ALTER DATABASE 
D. UPDATE DATABASE 

a

Q26. DCL commands are: 
A. COMMIT / ROLLBACK 
B. GRANT / REVOKE 
C. INSERT / UPDATE 
D. CREATE / DROP 

b

Q27. Grant privileges on specific columns only: 
A. GRANT SELECT (Col1, Col2) ON TableName TO UserName 
B. REVOKE 
C. COMMIT 
D. ALTER TABLE 

a

Q28. Which is not part of DCL? 
A. GRANT 
B. REVOKE 
C. INSERT 
D. Both C & D 

c

Q29. DCL mainly controls: 
A. Who can access data 
B. Table structure 
C. Data values 
D. Transactions 

a

Q30. To give execute permission on a procedure: 
A. GRANT EXECUTE ON ProcedureName TO UserName 
B. REVOKE EXECUTE 
C. COMMIT 
D. ROLLBACK 

a

Q31. Commit current transaction: 
A. COMMIT 
B. ROLLBACK 
C. SAVEPOINT 
D. GRANT 

a

Q32. Undo changes made in a transaction: 
A. COMMIT 
B. ROLLBACK 
C. SAVEPOINT 
D. GRANT 

b

Q33. Create a savepoint in a transaction: 
A. SAVEPOINT Save1 
B. COMMIT 
C. ROLLBACK 
D. GRANT 

a

Q34. Rollback to a savepoint: 
A. ROLLBACK TO Save1 
B. COMMIT 
C. ALTER TABLE 
D. DELETE 

a

Q35. Which TCL command makes changes permanent? 
A. COMMIT 
B. ROLLBACK 
C. SAVEPOINT 
D. GRANT 

a

Q36. Which TCL command undoes changes? 
A. COMMIT 
B. ROLLBACK 
C. ALTER TABLE 
D. GRANT 

b

Q37. Partial rollback uses: 
A. SAVEPOINT 
B. COMMIT 
C. DELETE 
D. DROP 

a

Q38. Auto-commit ON means: 
A. Each DML statement is automatically committed 
B. Changes need manual COMMIT 
C. Table structure modified 
D. None 

38

Q39. Which TCL command can rollback partially? 
A. ROLLBACK TO Savepoint 
B. COMMIT 
C. DROP 
D. GRANT

a

Q40. Which TCL command is optional if auto-commit is OFF? 
A. COMMIT 
B. ROLLBACK 
C. Both 
D. None 

c

Q41. Select rows where Salary = 30000: 
A. WHERE Salary = 30000 
B. WHERE Salary > 30000 
C. WHERE Salary >= 30000 
D. WHERE Salary <> 30000 

a

Q42. Select employees in departments 1, 2, 3: 
A. WHERE DeptID IN (1,2,3) 
B. WHERE DeptID = 1 AND 2 AND 3 
C. WHERE DeptID BETWEEN 1 AND 3 
D. WHERE DeptID LIKE '1,2,3' 

a

Q43. Select salaries between 20000 and 50000: 
A. WHERE Salary BETWEEN 20000 AND 50000 
B. WHERE Salary IN (20000,50000) 
C. WHERE Salary >= 20000 AND <= 50000 
D. WHERE Salary LIKE '20000-50000' 

a

Q44. Names starting with 'J': 
A. LIKE 'J%' 
B. LIKE '%J' 
C. LIKE '%J%' 
D. LIKE '_J%' 

a

Q45. Names ending with 'n': 
A. LIKE '%n' 
B. LIKE 'n%' 
C. LIKE '_n%' 
D. LIKE '%_n' 

a

Q46. Names containing 'ar': 
A. LIKE '%ar%' 
B. LIKE 'ar%' 
C. LIKE '%ar' 
D. LIKE 'ar' 

a

Q47. Exclude departments 4,5: 
A. WHERE DeptID NOT IN (4,5) 
B. WHERE DeptID NOT BETWEEN 4 AND 5 
C. WHERE DeptID != 4 AND !=5 
D. WHERE DeptID <> 4,5 

a

Q48. BETWEEN is: 
A. Inclusive 
B. Exclusive 
C. Only lower inclusive 
D. Only upper inclusive 

a

Q49. _ in LIKE matches: 
A. Any character 
B. Exactly one character 
C. No character 
D. Only digits 

b

Q50. Combine multiple conditions: 
A. WHERE DeptID = 1 AND Salary > 30000 
B. WHERE DeptID = 1 OR Salary > 30000 
C. WHERE DeptID IN (1,2) AND Salary BETWEEN 20000 AND 50000 
D. All of the above 

d

## MCQ Question on Aptitude

### Aptitude Topics:

* Percentage
* Average
* Ratio and Proportion
Aptitude Question (percentage, average, ratio and proportion) 
__________________________________________________________________________________  
PART 1: Percentage (10 Questions) 
Q1. What is 20% of 250? 
A. 40 
B. 50 
C. 60 
D. 70 
Answer: B 
Solution: 
20% means 20/100. So, 20/100 × 250 = 50. 
You can also think of 10% of 250 = 25, so 20% = 25 × 2 = 50. 
Hence, the correct answer is 50. 
Q2. A number increases from 100 to 120. What is the percentage increase? 
A. 10% 
B. 15% 
C. 20% 
D. 25% 
Answer: C 
Solution: 
Increase = 120 − 100 = 20. 
Percentage increase = (20/100) × 100 = 20%. 
Always divide increase by original value. 
Q3. Find 15% of 80. 
A. 10 
B. 12 
C. 14 
D. 16 
Answer: B 
Solution: 
15% = 15/100. 
So, 15/100 × 80 = 12. 
Alternatively, 10% of 80 = 8 and 5% = 4 → total = 12. 
Q4. A number is decreased by 25% and becomes 75. What was the original number? 
A. 80 
B. 90 
C. 100 
D. 120 
Answer: C 
Solution: 
After 25% decrease, value becomes 75% of original. 
So, 75% = 75 → original = 75 / 0.75 = 100. 
Thus original number is 100. 
Q5. What is 50% of 300? 
A. 100 
B. 120 
C. 150 
D. 200 
Answer: C 
Solution: 
50% means half. 
Half of 300 = 150. 
So, directly answer is 150. 
Q6. A student scored 45 out of 60. Find percentage. 
A. 70% 
B. 75% 
C. 80% 
D. 85% 
Answer: B 
Solution: 
Percentage = (45/60) × 100. 
= 75%. 
Divide first → 45 ÷ 60 = 0.75. 
Q7. What is 10% of 450? 
A. 40 
B. 45 
C. 50 
D. 55 
Answer: B 
Solution: 
10% means divide by 10. 
450 ÷ 10 = 45. 
So answer is 45. 
Q8. Price increased from 200 to 260. % increase? 
A. 20% 
B. 25% 
C. 30% 
D. 35% 
Answer: C 
Solution: 
Increase = 260 − 200 = 60. 
% increase = (60/200) × 100 = 30%. 
Always compare with original. 
Q9. 40% of a number is 200. Find number. 
A. 400 
B. 450 
C. 500 
D. 600 
Answer: C 
Solution: 
40% = 200. 
Number = 200 / 0.4 = 500. 
So original number is 500. 
Q10. What is 5% of 600? 
A. 20 
B. 25 
C. 30 
D. 35 
Answer: C 
Solution: 
5% = 5/100. 
600 × 5/100 = 30. 
Also 10% is 60, so half = 30. 
Q11. Average of 2, 4, 6, 8? 
A. 4 
B. 5 
C. 6 
D. 7 
Answer: B 
Solution: 
Sum = 2+4+6+8 = 20. 
Average = 20/4 = 5. 
Average = total / number of values. 
Q12. Average of 5 numbers is 20. Total sum? 
A. 80 
B. 90 
C. 100 
D. 110 
Answer: C 
Solution: 
Average × number = total. 
20 × 5 = 100. 
So total sum is 100. 
Q13. Average of 10 numbers is 15. Find sum. 
A. 120 
B. 130 
C. 150 
D. 160 
Answer: C 
Solution: 
Sum = 15 × 10 = 150. 
Direct formula: total = average × count. 
Q14. Average of 3 numbers is 30. Find total. 
A. 60 
B. 70 
C. 80 
D. 90 
Answer: D 
Solution: 
Total = 30 × 3 = 90. 
Always multiply average by count. 
Q15. Average of 20 and 40? 
A. 20 
B. 25 
C. 30 
D. 35 
Answer: C 
Solution: 
(20 + 40)/2 = 60/2 = 30. 
Average of two numbers is midpoint. 
Q16. If average is 50 for 4 numbers, sum? 
A. 150 
B. 200 
C. 250 
D. 300 
Answer: B 
Solution: 
Sum = 50 × 4 = 200. 
Formula: sum = average × count. 
Q17. Average of 6 numbers is 10. Add 1 number (20). New average? 
A. 11 
B. 12 
C. 13 
D. 14 
Answer: B 
Solution: 
Old sum = 6 × 10 = 60. 
New sum = 60 + 20 = 80. 
New average = 80/7 ≈ 11.43 ≈ 12 (closest). 
Q18. Average of 3, 6, 9? 
A. 5 
B. 6 
C. 7 
D. 8 
Answer: B 
Solution: 
Sum = 18. 
Average = 18/3 = 6. 
Simple arithmetic mean. 
Q19. Average of 4 numbers is 25. One number is 10. Remaining sum? 
A. 70 
B. 80 
C. 90 
D. 100 
Answer: C 
Solution: 
Total sum = 25 × 4 = 100. 
Remaining = 100 − 10 = 90. 
Q20. Average of 1 to 9? 
A. 4 
B. 5 
C. 6 
D. 7 
Answer: B 
Solution: 
For consecutive numbers: average = (first + last)/2. 
(1 + 9)/2 = 5. 
Shortcut formula. 
Q21. Ratio of 10:20 simplifies to? 
A. 1:2 
B. 2:3 
C. 3:4 
D. 1:3 
Answer: A 
Solution: 
Divide both by 10 → 10:20 = 1:2. 
Simplify ratios like fractions. 
Q22. If a:b = 2:3 and b:c = 4:5, find a:c. 
A. 2:5 
B. 4:5 
C. 8:15 
D. 10:15 
Answer: C 
Solution: 
Make b same: 
2:3 and 4:5 → multiply first by 4 → 8:12 
Second by 3 → 12:15 
So a:c = 8:15. 
Q23. Divide 100 in ratio 2:3. 
A. 40, 60 
B. 50, 50 
C. 30, 70 
D. 20, 80 
Answer: A 
Solution: 
Total parts = 5. 
First = (2/5)×100 = 40 
Second = (3/5)×100 = 60. 
Q24. Ratio 3:4, if first is 30, second? 
A. 35 
B. 40 
C. 45 
D. 50 
Answer: B 
Solution: 
3 → 30 means multiply by 10. 
So 4 × 10 = 40. 
Q25. If x:y = 5:2 and x=50, find y. 
A. 10 
B. 20 
C. 25 
D. 30 
Answer: B 
Solution: 
5 → 50 means multiply by 10. 
So 2 × 10 = 20. 
Q26. Ratio of 15 and 45? 
A. 1:2 
B. 1:3 
C. 2:3 
D. 3:5 
Answer: B 
Solution: 
Divide both by 15 → 1:3. 
Q27. If a:b = 4:5, total = 90. Find a. 
A. 30 
B. 40 
C. 50 
D. 60 
Answer: B 
Solution: 
Total parts = 9. 
a = (4/9)×90 = 40. 
Q28. If ratio is 7:3, difference = 40. Find numbers. 
A. 70, 30 
B. 60, 20 
C. 80, 40 
D. 90, 50 
Answer: A 
Solution: 
Difference parts = 4. 
4 parts = 40 → 1 part = 10. 
Numbers = 70 and 30. 
Q29. If a:b = 1:2, and b:c = 3:4, find a:c. 
A. 1:4 
B. 3:4 
C. 3:8 
D. 1:8 
Answer: C 
Solution: 
Match b: 
1:2 and 3:4 → multiply first by 3 → 3:6 
Second by 2 → 6:8 
So a:c = 3:8. 
Q30. Divide 60 in ratio 1:2:3. 
A. 10, 20, 30 
B. 15, 20, 25 
C. 5, 10, 15 
D. 20, 20, 20 
Answer: A 
Solution: 
Total parts = 6. 
Values: (1/6)×60=10, (2/6)=20, (3/6)=30. 
Hence result is 10, 20, 30.

---

# c. Coding Practice Query

## 🔸 SELECT Statement

1. Retrieve the top 3 highest-paid employees from a table without using LIMIT or TOP.
2. Write a query to display employee names concatenated with their department name, with the alias EmployeeDept.
3. Select all records where the concatenation of first and last name contains more than 12 characters.
4. Retrieve only unique combinations of department and job title from a table.
5. Write a query to show the total length of all employee names in the table.

## 🔸 WHERE Clause

6. Find employees whose names contain 'a' but do not start or end with 'a'.
7. Retrieve records where the salary is above the average for employees in the same department.
8. Write a query to find employees who joined in the last 6 months and earn more than 50,000.
9. Find employees whose ID is not in a given set of values but exists in another table.
10. Write a query to find employees with salaries between the second and third quartile of the salary range.

## 🔸 GROUP BY & Aggregate Functions

11. Show the department with the second highest total salary.
12. Count the number of employees in each department who earn above the overall average salary.
13. Retrieve departments with more than 5 employees, but show only those with average salary below 70,000.
14. List each department and the maximum, minimum, and average salary in a single row.
15. Group employees by their hire year and month, and show the count per month.

## 🔸 HAVING Clause

16. Retrieve departments where the total salary exceeds 1,000,000 but exclude departments with only one employee.
17. Write a query to find job titles where the average salary is higher than the overall company average.
18. Find departments where all employees earn more than 40,000.
19. Retrieve the number of employees in departments that have more than 10 employees earning above 70,000.
20. Show the departments with exactly 3 employees having the same job title.

## 🔸 ORDER BY

21. Sort employees first by department ascending, then by salary descending, then by hire date ascending.
22. Write a query to show the top 5 salaries per department.
23. Order employees by the length of their full name.
24. Sort employees by the number of vowels in their names, descending.
25. Display records where salaries are sorted in descending order but with NULL salaries at the top.

## 🔸 LIKE Operator

26. Find all employees whose name has two consecutive vowels.
27. Retrieve names where the second character is 'a' and ends with 'n'.
28. Find names that contain either 's' or 't' but not both.
29. Write a query to find names that start and end with the same letter.
30. Retrieve names where the third character is a number.

## 🔸  IN Operator 

31. Find employees who work in departments that have fewer than 10 employees using IN.  
32. Write a query to find salaries that exist in a predefined set and are above the median salary.  
33. Retrieve employees whose manager ID is in a subquery selecting all managers who have more 
than 3 direct reports.  
34. Find records where the department ID is in a dynamic list returned by another table.  
35. Write a query to exclude employees whose salaries appear in the top 5 salaries using NOT IN.


## 🔸 ANY / ALL Operator 

41. Find employees whose salary is greater than any employee in the 'IT' department.  
42. Retrieve employees whose salary is less than all salaries in a subquery selecting executives.  
43. Find employees whose salary is greater than any salary in a list of high performers but less than 
the maximum salary overall.  
44. Write a query to compare salaries across departments using ALL.  
45. Retrieve employees whose salary matches at least one of the top 3 salaries across all 
departments. 

## 🔸 EXISTS Operator 
46. Retrieve employees who exist in departments that have more than 10 employees.  
47. Find employees who exist in a table of projects assigned to at least one active project.  
48. Write a query to select employees only if their manager exists in the same table.  
49. Find records in one table where there is no corresponding record in another table using 
EXISTS.  
50. Retrieve departments that have employees with salaries above a certain threshold using 
EXISTS.  


## 🔸  JOINS

51. Write a query to list all employees along with their manager’s name using self-join.  
52. Retrieve employees and departments including departments that have no employees.  
53. Find employees working in multiple departments using a join.  
54. Perform a cross join between employees and projects and filter by salary > 50,000.  
55. List employees along with projects, but only for employees who have no projects (use join 
cleverly).  
56. Write a query to combine two tables of transactions and invoices without using UNION.  
57. Find duplicate records across two tables using a join.  
58. Perform a full outer join between two tables and highlight missing values from each side.  
59. Retrieve employees whose department name starts with 'S' using a join with a department 
table.  
60. Write a query that ranks employees by salary in each department using joins and aggregate 
functions.
---

---

# Practice Query Answers with Sample Database

## Sample Database

```sql
CREATE TABLE Department (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(50)
);

CREATE TABLE Employee (
    emp_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    salary DECIMAL(10,2),
    hire_date DATE,
    dept_id INT,
    manager_id INT,
    job_title VARCHAR(50)
);

INSERT INTO Department VALUES
(1,'Sales'),
(2,'IT'),
(3,'HR');

INSERT INTO Employee VALUES
(101,'Amit','Sharma',60000,'2025-01-10',1,NULL,'Manager'),
(102,'Rahul','Patil',45000,'2025-03-15',2,101,'Developer'),
(103,'Sneha','Joshi',75000,'2024-11-20',2,101,'Senior Developer'),
(104,'Karan','Mehta',52000,'2025-02-01',1,101,'Sales Exec'),
(105,'Pooja','Kulkarni',39000,'2025-04-01',3,101,'HR Exec');
```

## SELECT Statement

1.

```sql
SELECT *
FROM (
   SELECT emp_id, first_name, salary,
          DENSE_RANK() OVER (ORDER BY salary DESC) rnk
   FROM Employee
) x
WHERE rnk <= 3;
```

2.

```sql
SELECT CONCAT(first_name,' - ',dept_name) AS EmployeeDept
FROM Employee e
JOIN Department d ON e.dept_id=d.dept_id;
```

3.

```sql
SELECT *
FROM Employee
WHERE LENGTH(CONCAT(first_name,last_name)) > 12;
```

4.

```sql
SELECT DISTINCT dept_id, job_title
FROM Employee;
```

5.

```sql
SELECT SUM(LENGTH(first_name)) AS total_name_length
FROM Employee;
```

## WHERE Clause

6.

```sql
SELECT *
FROM Employee
WHERE first_name LIKE '%a%'
AND first_name NOT LIKE 'a%'
AND first_name NOT LIKE '%a';
```

7.

```sql
SELECT *
FROM Employee e1
WHERE salary > (
   SELECT AVG(salary)
   FROM Employee e2
   WHERE e1.dept_id = e2.dept_id
);
```

8.

```sql
SELECT *
FROM Employee
WHERE hire_date >= CURRENT_DATE - INTERVAL 6 MONTH
AND salary > 50000;
```

9.

```sql
SELECT *
FROM Employee
WHERE emp_id NOT IN (101,102)
AND emp_id IN (SELECT emp_id FROM Employee);
```

10.

```sql
SELECT *
FROM Employee
WHERE salary BETWEEN 45000 AND 70000;
```

## GROUP BY

11.

```sql
SELECT dept_id, SUM(salary) total_salary
FROM Employee
GROUP BY dept_id
ORDER BY total_salary DESC
LIMIT 1 OFFSET 1;
```

12.

```sql
SELECT dept_id, COUNT(*)
FROM Employee
WHERE salary > (SELECT AVG(salary) FROM Employee)
GROUP BY dept_id;
```

13.

```sql
SELECT dept_id
FROM Employee
GROUP BY dept_id
HAVING COUNT(*) > 5
AND AVG(salary) < 70000;
```

14.

```sql
SELECT dept_id,
       MAX(salary),
       MIN(salary),
       AVG(salary)
FROM Employee
GROUP BY dept_id;
```

15.

```sql
SELECT YEAR(hire_date), MONTH(hire_date), COUNT(*)
FROM Employee
GROUP BY YEAR(hire_date), MONTH(hire_date);
```

## HAVING Clause

16.

```sql
SELECT dept_id
FROM Employee
GROUP BY dept_id
HAVING SUM(salary) > 1000000
AND COUNT(*) > 1;
```

17.

```sql
SELECT job_title
FROM Employee
GROUP BY job_title
HAVING AVG(salary) > (SELECT AVG(salary) FROM Employee);
```

18.

```sql
SELECT dept_id
FROM Employee
GROUP BY dept_id
HAVING MIN(salary) > 40000;
```

19.

```sql
SELECT dept_id, COUNT(*)
FROM Employee
WHERE salary > 70000
GROUP BY dept_id
HAVING COUNT(*) > 10;
```

20.

```sql
SELECT dept_id, job_title
FROM Employee
GROUP BY dept_id, job_title
HAVING COUNT(*) = 3;
```

## JOINS

51.

```sql
SELECT e.first_name AS employee,
       m.first_name AS manager
FROM Employee e
LEFT JOIN Employee m
ON e.manager_id = m.emp_id;
```

52.

```sql
SELECT e.first_name, d.dept_name
FROM Department d
LEFT JOIN Employee e
ON d.dept_id = e.dept_id;
```

53.

```sql
SELECT emp_id, COUNT(dept_id)
FROM Employee
GROUP BY emp_id
HAVING COUNT(dept_id) > 1;
```

54.

```sql
SELECT *
FROM Employee
CROSS JOIN Department
WHERE salary > 50000;
```

55.

```sql
SELECT e.first_name
FROM Employee e
LEFT JOIN Projects p
ON e.emp_id = p.emp_id
WHERE p.emp_id IS NULL;
```

59.

```sql
SELECT e.first_name, d.dept_name
FROM Employee e
JOIN Department d
ON e.dept_id = d.dept_id
WHERE d.dept_name LIKE 'S%';
```

60.

```sql
SELECT emp_id, dept_id, salary,
       RANK() OVER (PARTITION BY dept_id ORDER BY salary DESC) rnk
FROM Employee;
```


