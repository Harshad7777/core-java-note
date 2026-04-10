🔷 NORMALIZATION
1. What is Normalization?

Normalization is the process of organizing data into smaller tables to reduce redundancy and improve data integrity.

2. Why is normalization important?
Removes data duplication
Improves consistency
Avoids anomalies (Insert, Update, Delete)
Saves storage
3. Different normal forms

1NF → 2NF → 3NF → BCNF → 4NF → 5NF

4. First Normal Form (1NF)
No repeating groups
All values are atomic (single value)

👉 Example:
❌ {Phone1, Phone2}
✅ Separate rows

5. Second Normal Form (2NF)
Must be in 1NF
No partial dependency

👉 Non-key depends on full primary key

6. Third Normal Form (3NF)
Must be in 2NF
No transitive dependency

👉 Non-key should not depend on another non-key

7. BCNF (Boyce-Codd Normal Form)
Stronger than 3NF
Every determinant must be a candidate key
8. Difference: 3NF vs BCNF
3NF	BCNF
Allows some dependency	Strict
Non-key → key allowed	Not allowed
Less strict	More strict
9. Denormalization

Combining tables to improve performance (but increases redundancy).

10. Advantages & Disadvantages

✅ Advantages:

No redundancy
Better integrity
Easy maintenance

❌ Disadvantages:

More joins
Slower queries
Complex design
🔷 FUNCTIONAL DEPENDENCY
11. Functional Dependency

If X → Y, then X determines Y.

12. Trivial FD

Y is part of X
👉 A → A

13. Non-Trivial FD

Y is not part of X
👉 A → B

14. Full Functional Dependency

Depends on entire key

15. Partial Dependency

Depends on part of composite key

16. Transitive Dependency

A → B and B → C ⇒ A → C

17. Identify FD
Check relationships between columns
Use business rules
18. Role in Normalization

Used to:

Detect redundancy
Decide decomposition
19. Example

StudentID → Name

20. Problems due to improper dependencies
Data redundancy
Update anomalies
Inconsistent data
🔷 TYPES OF DEPENDENCIES
21–23 (Repeat)
Partial → part of key
Full → entire key
Transitive → indirect
24. Multivalued Dependency

One attribute determines multiple values
👉 A →→ B

25. Join Dependency

Table can be split and joined without loss

26. FD vs MVD
FD	MVD
One value	Multiple values
A → B	A →→ B
27. Impact of Transitive Dependency
Causes redundancy
Violates 3NF
28. Remove Partial Dependency

👉 Split table into smaller tables

29. Remove Transitive Dependency

👉 Move dependent columns to new table

30. Fourth Normal Form (4NF)
No multivalued dependency
🔷 KEYS IN DBMS
31. Key

Attribute used to uniquely identify rows

32. Primary Key
Unique + NOT NULL
33. Candidate Key

Possible keys for primary key

34. Super Key

Set of attributes that uniquely identify rows

35. Composite Key

Key with multiple columns

36. Candidate vs Super Key
Candidate	Super
Minimal	May contain extra columns
37. Multiple Candidate Keys?

✅ Yes

38. Can primary key be composite?

✅ Yes

39. Foreign Key

Links tables

40. Alternate Key

Candidate key not chosen as primary key

🔷 ASSOCIATION (RELATIONSHIPS)
41. Association

Relationship between tables

42. Types
1:1
1:M
M:N
43. Cardinality

Number of relationships

44. Participation Constraint
Total
Partial
45. Association vs Aggregation
Association	Aggregation
Simple relation	Relation of relations
🔷 VIEW
What is a View?

Virtual table based on query

Why used?
Security
Simplification
Reusability
View vs Table
View	Table
Virtual	Physical
No data stored	Data stored
Can update view?

✅ Sometimes (with conditions)

Materialized View

Stores data physically

Create View
CREATE VIEW view_name AS
SELECT * FROM table;
Drop View
DROP VIEW view_name;
View on View?

✅ Yes

Advantages
Security
Simplifies queries
Limitations
Performance issue
Limited updates
🔷 INDEX
What is Index?

Structure to speed up queries

Why used?
Faster search
Types
Clustered
Non-clustered
Composite
Unique
Clustered vs Non-clustered
Clustered	Non-clustered
Physical order	Logical
One per table	Many
Multiple indexes?

✅ Yes

Disadvantages
Slower INSERT/UPDATE
Extra storage
Create Index
CREATE INDEX idx_name
ON table(column);
Drop Index
DROP INDEX idx_name;
Composite Index

Index on multiple columns

🔷 SUBQUERY
1. Subquery

Query inside another query

2. Types
Scalar
Multi-row
Correlated
Non-correlated
3. Correlated vs Non-correlated
Correlated	Non-correlated
Runs per row	Runs once
4. Multiple columns?

❌ Usually no (depends on DB)

5. Where used?
SELECT
WHERE
FROM
6. Subquery vs Join
Subquery	Join
Nested	Combined
7. Multiple rows with '='

❌ Error

8. Subquery in FROM?

✅ Yes

9. Scalar Subquery

Returns single value

10. Second Highest Salary
SELECT MAX(salary)
FROM employee
WHERE salary < (SELECT MAX(salary) FROM employee);
🔥 FINAL TIP FOR YOU

Since you're preparing seriously:

👉 Focus on:

Normalization steps
Functional dependencies
SQL queries (views, index, subquery)