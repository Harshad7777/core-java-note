🔷 NORMALIZATION
1. What is Normalization?

Normalization is the process of organizing data in a database by dividing large tables into smaller related tables to reduce redundancy and improve data integrity.

2. Why is normalization important?
Eliminates data redundancy
Ensures data consistency
Prevents anomalies (Insert, Update, Delete)
Improves database structure
3. What are the different normal forms?

1NF, 2NF, 3NF, BCNF, 4NF, 5NF

4. First Normal Form (1NF)
A table is in 1NF if:
All attributes contain atomic values
No repeating groups or multi-valued attributes

5. Second Normal Form (2NF)
A table is in 2NF if:
It is in 1NF
No partial dependency (non-key attributes depend on full primary key)

6. Third Normal Form (3NF)
A table is in 3NF if:
It is in 2NF
No transitive dependency (non-key depends only on primary key)

7. Boyce-Codd Normal Form (BCNF)
A table is in BCNF if:
For every functional dependency X → Y, X must be a candidate key

8. Difference between 3NF and BCNF
| 3NF                           | BCNF                  |
| ----------------------------- | --------------------- |
| Allows some exceptions        | No exceptions         |
| Less strict                   | More strict           |
| Removes transitive dependency | Removes all anomalies |

9. What is Denormalization?

Denormalization is the process of combining tables to improve query performance, even though it increases redundancy.

10. Advantages & Disadvantages
Advantages:
Reduces redundancy
Improves consistency
Better data integrity

Disadvantages:
Complex queries (more joins)
Slower read performance

-----------------------------------------------------------
🔷 FUNCTIONAL DEPENDENCY

11. What is Functional Dependency?
A relationship where one attribute determines another.
If X → Y, then Y depends on X.

12. Trivial Functional Dependency
If Y is a subset of X
Example: A → A

13. Non-Trivial Functional Dependency
If Y is not a subset of X
Example: A → B

14. Full Functional Dependency
When a non-key attribute depends on the entire primary key, not a part of it.

15. Partial Dependency
When a non-key attribute depends on part of a composite key.

16. Transitive Dependency

If A → B and B → C, then A → C (indirect dependency).

17. How to identify functional dependencies?
Analyze relationships between attributes
Use business rules
Observe unique identifiers

18. Role of FD in normalization
Helps identify redundancy
Used to convert tables into normal forms

19. Example
StudentID → Name

20. Problems due to improper dependencies
Data redundancy
Update anomalies
Inconsistent data

-------------------------------------------------------------------
🔷 TYPES OF DEPENDENCIES

21. Partial Dependency
Dependency on part of composite key

22. Full Functional Dependency
Dependency on full primary key

23. Transitive Dependency
Indirect dependency

24. Multi-Valued Dependency
When one attribute determines multiple values
Example: A →→ B

25. Join Dependency
A table can be reconstructed by joining multiple tables without loss

26. Difference between FD and MVD
| FD                   | MVD                        |
| -------------------- | -------------------------- |
| One value dependency | Multiple values dependency |

27. Impact of Transitive Dependency
Causes redundancy
Violates 3NF

28. Remove Partial Dependency
Split the table into smaller tables so each non-key depends on full key

29. Remove Transitive Dependency
Create separate table for dependent attributes

30. Fourth Normal Form (4NF)
A table is in 4NF if:
It is in BCNF
No multi-valued dependency

---------------------------------------------------------------
🔷 KEYS IN DBMS
31. Key
Attribute used to uniquely identify a record

32. Primary Key
Unique
Cannot be NULL

33. Candidate Key
Set of attributes that can uniquely identify a record

34. Super Key
Any set of attributes that uniquely identifies a record

35. Composite Key
Primary key consisting of multiple attributes

36. Candidate vs Super Key
| Candidate Key | Super Key                    |
| ------------- | ---------------------------- |
| Minimal       | May contain extra attributes |

37. Can a table have multiple candidate keys?
Yes

38. Can a primary key be composite?
Yes

39. Foreign Key
Attribute used to link two tables

40. Alternate Key
Candidate key not selected as primary key

----------------------------------------------------
🔷 ASSOCIATION (RELATIONSHIP)
41. Association
Relationship between two tables

42. Types
One-to-One (1:1)
One-to-Many (1:M)
Many-to-Many (M:N)

43. Cardinality
Number of relationships between entities

44. Participation Constraint
Total participation
Partial participation

45. Association vs Aggregation
| Association         | Aggregation                        |
| ------------------- | ---------------------------------- |
| Simple relationship | Relationship between relationships |


🔷 VIEW
What is a View?
A view is a virtual table based on a SQL query.

Why are views used?
Security
Simplify queries
Data abstraction

View vs Table
| View           | Table       |
| -------------- | ----------- |
| Virtual        | Physical    |
| No data stored | Data stored |

Can we update a view?
Yes, but only under certain conditions

Materialized View
Stores data physically

Create View
CREATE VIEW view_name AS
SELECT column1, column2 FROM table;

Drop View
DROP VIEW view_name;

Can a view be based on another view?
Yes

Advantages
Security
Reusability

Limitations
Limited updates
Performance issues

--------------------------------------------
🔷 INDEX
What is an Index?
A database object used to improve query performance.

Why is indexing used?
Faster data retrieval

Types of Index
Clustered
Non-clustered
Unique
Composite

Clustered vs Non-clustered
| Clustered      | Non-clustered |
| -------------- | ------------- |
| Physical order | Logical order |
| One per table  | Multiple      |

Multiple indexes?
Yes

Disadvantages
Extra storage
Slower insert/update

Create Index
CREATE INDEX idx_name 
ON table(column);

Drop Index
DROP INDEX idx_name;

Composite Index
Index on multiple columns
--------------------------------------------
🔷 SUBQUERY
1. What is a Subquery?
A query inside another SQL query.

2. Types
Scalar
Multi-row
Correlated
Non-correlated

3. Correlated vs Non-correlated
| Correlated       | Non-correlated |
| ---------------- | -------------- |
| Executes per row | Executes once  |

4. Can subquery return multiple columns?
Generally no (depends on DBMS)

5. Where can subqueries be used?
SELECT
WHERE
FROM

6. Subquery vs Join
| Subquery | Join            |
| -------- | --------------- |
| Nested   | Combined tables |

7. Multiple rows with '='
Causes error

8. Subquery in FROM clause?
Yes

9. Scalar Subquery
Returns a single value

10. Second Highest Salary
SELECT MAX(salary)
FROM employee
WHERE salary < (SELECT MAX(salary) FROM employee);

----------------------------------------------------------------

MCQ 
____________________________________________________________________________________ 
1. Which normal form ensures atomic values in a table? 
A. 1NF 
B. 2NF 
C. 3NF 
D. BCNF 
Answer: A 

2. Which normal form removes partial dependency? 
A. 1NF 
B. 2NF 
C. 3NF 
D. BCNF 
Answer: B 

3. A table in 2NF but not in 3NF contains: 
A. Partial dependency 
B. Transitive dependency 
C. Multivalued dependency 
D. No dependency 
Answer: B 

4. BCNF is stronger than: 
A. 1NF 
B. 2NF 
C. 3NF 
D. 4NF 
Answer: C 

5. Functional dependency X → Y means: 
A. Y determines X 
B. X determines Y 
C. X and Y independent 
D. No relation 
Answer: B 

6. Which is a trivial functional dependency? 
A. A → B 
B. A → A 
C. B → C 
D. A → C 
Answer: B 

7. Partial dependency occurs when: 
A. Non-key depends on full key 
B. Non-key depends on part of composite key 
C. Key depends on non-key 
D. No dependency 
Answer: B 

8. Transitive dependency means: 
A. A → B and B → C 
B. A → C directly 
C. A → B only 
D. B → A 
Answer: A 

9. Which normal form removes transitive dependency? 
A. 2NF 
B. 3NF 
C. BCNF 
D. 4NF 
Answer: B 

10. Which normal form removes multivalued dependency? 
A. 2NF 
B. 3NF 
C. BCNF 
D. 4NF 
Answer: D 

11. What is a primary key? 
A. Duplicate key 
B. Unique identifier 
C. Foreign key 
D. Optional key 
Answer: B 

12. A table can have how many candidate keys? 
A. One 
B. Two 
C. Multiple 
D. None 
Answer: C 

13. Super key is: 
A. Minimal key 
B. Unique identifier set 
C. Foreign key 
D. Composite key 
Answer: B 

14. Composite key consists of: 
A. Single attribute 
B. Multiple attributes 
C. Only primary key 
D. Only foreign key 
Answer: B 

15. Foreign key is used to: 
A. Identify rows 
B. Link tables 
C. Delete data 
D. Sort data 
Answer: B 

16. Which SQL statement creates a view? 
A. CREATE TABLE 
B. CREATE VIEW 
C. MAKE VIEW 
D. ADD VIEW 
Answer: B 

17. A view is: 
A. Physical table 
B. Virtual table 
C. Index 
D. Key 
Answer: B 

18. Can a view be updated? 
A. Always 
B. Never 
C. Sometimes 
D. Only with index 
Answer: C 

19. Materialized view: 
A. Is virtual 
B. Stores data physically 
C. Cannot be queried 
D. Is temporary 
Answer: B 

20. Which command removes a view? 
A. DELETE VIEW 
B. REMOVE VIEW 
C. DROP VIEW 
D. ERASE VIEW 
Answer: C 

21. Index is used to: 
A. Slow down queries 
B. Improve performance 
C. Delete records 
D. Normalize table 
Answer: B 

22. Clustered index: 
A. Logical order 
B. Physical order 
C. No order 
D. Temporary 
Answer: B 

23. Can a table have multiple indexes? 
A. No 
B. Yes 
C. Only one 
D. Only primary key 
Answer: B 

24. Disadvantage of indexing: 
A. Faster SELECT 
B. Slower INSERT 
C. Less storage 
D. No effect 
Answer: B 

25. Create index syntax: 
A. CREATE INDEX idx ON table(col) 
B. MAKE INDEX 
C. ADD INDEX 
D. NEW INDEX 
Answer: A 

26. Subquery is: 
A. Nested query 
B. Table 
C. Index 
D. Constraint 
Answer: A 

27. Correlated subquery: 
A. Executes once 
B. Executes per row 
C. No relation 
D. Only join 
Answer: B 

28. If subquery returns multiple rows with '=': 
A. Works 
B. Error 
C. Ignores 
D. Converts 
Answer: B 

29. Scalar subquery returns: 
A. Table 
B. Multiple rows 
C. Single value 
D. Column 
Answer: C 

30. Query to find second highest salary uses: 
A. Join 
B. Subquery 
C. Index 
D. View 
Answer: B 

________________________________________________________________________
Aptitude MCQ  
________________________________________________________________________
Q1. 
A shopkeeper buys an item for ₹100 and sells it for ₹120. Find profit %. 
Options: 
A. 10% | B. 15% | C. 20% | D. 25% 
Answer: C 
Solution (Step by Step): 
1. Profit = SP − CP = 120 − 100 = 20  
2. Profit % = (Profit ÷ CP) × 100 = (20 ÷ 100) × 100 = 20%  

Q2. 
CP = ₹200, Loss = ₹50. Find Loss %. 
Options: 
A. 20% | B. 25% | C. 30% | D. 35% 
Answer: B 
Solution: 
1. Loss % = (Loss ÷ CP) × 100 = (50 ÷ 200) × 100 = 25%  


Q3. 
If SP = ₹150 and profit = 50%, find CP. 
Options: 
A. ₹100 | B. ₹120 | C. ₹90 | D. ₹110 
Answer: A 
Solution: 
1. Profit % = 50% → SP = 150% of CP  
2. CP = SP ÷ 1.5 = 150 ÷ 1.5 = ₹100  

Q4. 
An item is sold at ₹80 with 20% loss. Find CP. 
Options: 
A. ₹90 | B. ₹95 | C. ₹100 | D. ₹110 
Answer: C 
Solution: 
1. Loss = 20% → SP = 80% of CP  
2. CP = SP ÷ 0.8 = 80 ÷ 0.8 = ₹100  

Q5. 
Profit = ₹40, CP = ₹160. Find SP. 
Options: 
A. ₹180 | B. ₹200 | C. ₹210 | D. ₹190 
Answer: B 
Solution: 
1. SP = CP + Profit = 160 + 40 = ₹200 

Q6. 
If profit % = 25% and CP = ₹400, find SP. 
Options: 
A. ₹450 | B. ₹500 | C. ₹480 | D. ₹520 
Answer: B 
Solution: 
1. Profit = 25% of 400 = 100  
2. SP = CP + Profit = 400 + 100 = 500  
 
Q7. 
A trader marks 20% above CP and gives 10% discount. Find profit %. 
Options: 
A. 8% | B. 10% | C. 12% | D. 15% 
Answer: A 
Solution: 
1. Marked Price = 120% of CP  
2. After 10% discount → SP = 90% of 120 = 108% of CP  
3. Profit % = 108 − 100 = 8%  
 
Q8. 
CP = ₹250, SP = ₹300. Find profit. 
Options: 
A. ₹40 | B. ₹50 | C. ₹60 | D. ₹70 
Answer: B 
Solution: 
1. Profit = SP − CP = 300 − 250 = ₹50  
 
Q9. 
Loss % = 10%, SP = ₹180. Find CP. 
Options: 
A. ₹190 | B. ₹200 | C. ₹210 | D. ₹220 
Answer: B 
Solution: 
1. SP = 90% of CP → CP = SP ÷ 0.9 = 180 ÷ 0.9 = ₹200  
 
Q10. 
Profit % = 50%, CP = ₹300. Find SP. 
Options: 
A. ₹400 | B. ₹450 | C. ₹500 | D. ₹550 
Answer: B 
Solution: 
1. Profit = 50% of 300 = 150  
2. SP = CP + Profit = 300 + 150 = 450  
 
Q11. 
SI on ₹1000 at 10% for 2 years. 
Options: 
A. ₹100 | B. ₹200 | C. ₹300 | D. ₹400 
Answer: B 
Solution: 
1. SI = (P × R × T)/100 = (1000 × 10 × 2)/100 = 200  

Q12. 
Find total amount (SI) for above. 
Options: 
A. ₹1100 | B. ₹1200 | C. ₹1300 | D. ₹1400 
Answer: B 
Solution: 
1. Amount = P + SI = 1000 + 200 = 1200  
 
Q13. 
CI on ₹1000 at 10% for 2 years. 
Options: 
A. ₹200 | B. ₹210 | C. ₹220 | D. ₹230 
Answer: B 
Solution: 
1. Year 1 → 1000 × 1.1 = 1100  
2. Year 2 → 1100 × 1.1 = 1210  
3. CI = 1210 − 1000 = 210  
 
Q14. 
Difference between CI & SI (above case). 
Options: 
A. ₹5 | B. ₹10 | C. ₹15 | D. ₹20 
Answer: B 
Solution: 
1. CI − SI = 210 − 200 = 10  
 
Q15. 
SI formula. 
Options: 
A. P+R+T | B. (P×R×T)/100 | C. P×T | D. R×T 
Answer: B 
Solution: 
1. SI = (P × R × T)/100  
 
Q16. 
Rate = 5%, P = 2000, T = 3. Find SI. 
Options: 
A. ₹200 | B. ₹250 | C. ₹300 | D. ₹350 
Answer: C 
Solution: 
1. SI = (2000 × 5 × 3)/100 = 300  
 
Q17. 
Amount after 1 year (CI) on ₹1000 at 10%. 
Options: 
A. ₹1100 | B. ₹1200 | C. ₹1050 | D. ₹1000 
Answer: A 
Solution: 
1. CI = 1000 × 10/100 = 100  
2. Amount = 1000 + 100 = 1100  
 
Q18. 
If CI = SI, then time is 
Options: 
A. 1 year | B. 2 years | C. 3 years | D. 4 years 
Answer: A 
Solution: 
1. CI = SI only in the first year (no compounding effect yet)  

Q19. 
Principal = ₹500, SI = ₹50, Rate = 10%. Find time. 
Options: 
A. 1 year | B. 2 years | C. 3 years | D. 4 years 
Answer: A 
Solution: 
1. SI = (P × R × T)/100 → 50 = (500 × 10 × T)/100  
2. 50 = 50 × T → T = 1 year  

Q20. 
CI grows faster than SI because 
Options: 
A. Higher rate | B. Compounding | C. Less time | D. Fixed rate 
Answer: B 
Solution: 
1. CI adds interest on interest; SI only on principal 

Q21. 
Speed formula. 
Options: 
A. D × T | B. D ÷ T | C. T ÷ D | D. D + T 
Answer: B 
Solution: 
1. Speed = Distance ÷ Time 

Q22. 
Distance = 100 km, Time = 2 hr. Speed? 
Options: 
A. 40 | B. 50 | C. 60 | D. 70 
Answer: B 
Solution: 
1. Speed = 100 ÷ 2 = 50 km/hr  

Q23. 
Time = Distance ÷ Speed? 
Options: 
A. True | B. False | C. Depends | D. None 
Answer: A 
Solution: 
1. Time = Distance ÷ Speed  

Q24. 
If speed doubles, time becomes? 
Options: 
A. Double | B. Half | C. Same | D. Zero 
Answer: B 
Solution: 
1. Time ∝ 1/Speed → If speed doubles, time halves

Q25. 
60 km/hr = ? m/s 
Options: 
A. 16.67 | B. 20 | C. 25 | D. 15 
Answer: A 
Solution: 
1. Multiply by 5/18 → 60 × 5 ÷ 18 = 16.67 m/s  

Q26. 
10 m/s = ? km/hr 
Options: 
A. 18 | B. 36 | C. 20 | D. 25 
Answer: B 
Solution: 
1. Multiply by 18/5 → 10 × 18 ÷ 5 = 36 km/hr  

Q27. 
Distance covered in 3 hrs at 40 km/hr? 
Options: 
A. 100 | B. 120 | C. 140 | D. 150 
Answer: B 
Solution: 
1. Distance = Speed × Time = 40 × 3 = 120 km 

Q28. 
A train travels 300 km in 5 hrs. Speed? 
Options: 
A. 50 | B. 60 | C. 70 | D. 80 
Answer: B 
Solution: 
1. Speed = 300 ÷ 5 = 60 km/hr  

Q29. 
If distance fixed, speed ↑ then time ↓ 
Options: 
A. True | B. False | C. Depends | D. None 
Answer: A 
Solution: 
1. Time ∝ 1/Speed → Increasing speed reduces time  

Q30. 
Formula for distance 
Options: 
A. S ÷ T | B. S × T | C. T ÷ S | D. S + T 
Answer: B 
Solution: 
1. Distance = Speed × Time


-----------------------------------------------------------------------

CREATE DATABASE company_db;

USE company_db;

CREATE TABLE Employee (
    EmpID INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(100),
    Salary DECIMAL(10,2),
    DeptID INT,
    HireDate DATE,
    Email VARCHAR(100), 
    Commission DECIMAL(10,2)
);

CREATE TABLE Department(
    DeptID INT PRIMARY KEY,
    DeptName VARCHAR(100),
    LocationID INT
);

CREATE TABLE Location (
    LocationID INT PRIMARY KEY,
    LocationName VARCHAR(100)
);

CREATE TABLE Project (
    ProjectID INT PRIMARY KEY AUTO_INCREMENT,
    EmpID INT,
    ProjectName VARCHAR(100),
    FOREIGN KEY (EmpID) REFERENCES Employee(EmpID)
);

INSERT INTO Employee (Name, Salary, DeptID, HireDate, Email, Commission) VALUES
('John', 60000, 10, '2021-05-10', 'john@gmail.com', NULL),
('Alice', 75000, 20, '2019-03-15', 'alice@gmail.com', 5000),
('Bob', 40000, 10, '2022-07-20', 'bob@gmail.com', NULL),
('David', 90000, 20, '2018-01-11', 'david@gmail.com', 7000),
('Eva', 30000, 30, '2023-02-01', 'eva@gmail.com', NULL);

INSERT INTO Department VALUES
(10, 'HR', 1),
(20, 'IT', 2),
(30, 'Finance', 3);

INSERT INTO Location VALUES
(1, 'Pune'),
(2, 'Mumbai'),
(3, 'Delhi');

INSERT INTO Project (EmpID, ProjectName) VALUES
(1, 'Project A'),
(2, 'Project B'),
(4, 'Project C');



� VIEW (20 Problems) 
1. Create a view emp_view to display all columns from Employee table. 

CREATE VIEW emp_view AS
SELECT * FROM Employee;

2. Create a view high_salary_emp for employees with salary > 50000. 

CREATE VIEW high_salary_emp as
SELECT * FROM Employee WHERE Salary > 50000;

3. Create a view dept10_emp for employees in department 10. 

CREATE 
4. 
Create a view emp_name_salary showing only name and salary. 
5. 
Create a view emp_bonus adding 10% bonus column. 
6. 
Create a view emp_dept_view using join between Employee and Department. 
7. 
Create a view avg_salary_view showing department-wise average salary. 
8. 
Create a view top_earners for employees with salary above average. 
9. 
Create a view emp_count_dept showing employee count per department. 
10. 
Create a view emp_sorted sorted by salary descending. 
11. 
Create a view recent_emp for employees hired after 2020. 
12. 
Create a view unique_dept showing distinct departments. 
13. 
Create a view emp_alias_view using column aliases. 
14. 
Create a view emp_view2 based on another view. 
15. 
Create a view emp_null_salary where salary is NULL. 
16. 
Create a view emp_range_salary for salary between 30000 and 70000. 
17. 
Create a view emp_group_view using GROUP BY department. 
18. 
Create a view emp_max_salary showing max salary per department. 
19. 
Create a view emp_min_salary showing minimum salary per department. 
20. 
Create a view emp_join_three joining Employee, Department, and Location tables. 
�
� INDEX (20 Problems) 
21. 
Create an index idx_emp_name on Employee(Name). 
22. 
Create an index idx_salary on Employee(Salary). 
23. 
Create a composite index idx_dept_salary on (DeptID, Salary). 
24. 
Create a unique index on Email column. 
25. 
Create an index on multiple columns (Name, DeptID). 
26. 
Drop index idx_emp_name. 
27. 
Create an index on Order table for faster search by OrderDate. 
28. 
Create index on Product table for ProductName. 
29. 
Create index on foreign key column DeptID. 
30. 
Create index for optimizing join between Employee and Department. 
31. 
Create index on salary in descending order (if supported). 
32. 
Create index on Customer table for PhoneNumber. 
33. 
Drop index on Salary column. 
34. 
Create index on multiple columns (City, State). 
35. 
Create index on table with large dataset for performance testing. 
36. 
Create index on column frequently used in WHERE clause. 
37. 
Create index on column used in ORDER BY. 
38. 
Create index on column used in GROUP BY. 
39. 
Create index on nullable column. 
40. 
Create index on table to optimize LIKE 'A%' queries. 
�
� SUBQUERY (20 Problems) 
41. 
Find employees whose salary is greater than average salary. 
42. 
Find employees with maximum salary using subquery. 
43. 
Find employees working in the same department as 'John'. 
44. 
Find employees not in department 10 using subquery. 
45. 
Find second highest salary using subquery. 
46. 
Find employees whose salary is less than minimum salary in another department. 
47. 
Find departments with more employees than average. 
48. 
Find employees whose salary equals max salary in their department. 
49. 
Use subquery in SELECT to display average salary. 
50. 
Use subquery in FROM clause to create derived table. 
51. 
Use correlated subquery to find employees earning above department average. 
52. 
Find employees who do not exist in another table. 
53. 
Use EXISTS to find employees in departments. 
54. 
Use NOT EXISTS to find employees without projects. 
55. 
Find employees whose salary is in top 3 salaries. 
56. 
Find employees with salary greater than all employees in department 10. 
57. 
Use subquery to delete employees with lowest salary. 
58. 
Use subquery in UPDATE to increase salary based on average. 
59. 
Use subquery with IN operator to filter records. 
60. 
Use scalar subquery to display department name along with employee.