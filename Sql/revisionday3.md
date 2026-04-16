✅ Stored Procedure (11–20)

11. What is a stored procedure?
A stored procedure is a precompiled set of SQL statements stored in the database and executed as a unit.
 

12. Why do we use stored procedures?
Improve performance (precompiled) 
Reduce code repetition
Increase security
Maintain centralized logic

13. Difference between procedure and function?
Procedure → may or may not return value
Function → always returns value

14. Can a stored procedure return values?
Yes, using OUT parameters or SELECT statements.

15. What are input and output parameters?

Input → pass values into procedure
Output → return values from procedure

16. How do you create a stored procedure?

CREATE PROCEDURE proc_name()
BEGIN
   SQL statements;
END;

17. How do you execute a stored procedure?

CALL proc_name();
-- or
EXEC proc_name;

18. Can a procedure call another procedure?
Yes, procedures can call other procedures.

19. Advantages of stored procedures?

Faster execution
Better security
Code reuse
Reduced network traffic

20. Disadvantages of stored procedures?

Hard to debug
Difficult to maintain
DB dependent
✅ Trigger (21–30)

21. What is a trigger?
A trigger is an automatic SQL block executed when an event occurs (INSERT, UPDATE, DELETE).

22. When are triggers executed?
Before or after database events.

23. Types of triggers in SQL?

BEFORE
AFTER
INSTEAD OF

24. Difference between BEFORE and AFTER trigger?

BEFORE → runs before operation
AFTER → runs after operation

25. What is an INSTEAD OF trigger?
Executes instead of the actual operation (commonly used on views).

26. Can a trigger call a procedure?
Yes.

27. Limitations of triggers?

Hard to debug
Hidden execution
Performance overhead

28. How do you create a trigger?

CREATE TRIGGER trg_name
BEFORE INSERT ON table_name
FOR EACH ROW
BEGIN
   SQL statements;
END;

29. How do you disable or drop a trigger?

DROP TRIGGER trg_name;

30. Real-time use cases of triggers?

Audit logs
Prevent invalid data
Auto-update timestamps
✅ Function (31–40)

31. What is a function in SQL?
A function is a routine that returns a value.

32. Difference between function and stored procedure?

Function → must return value
Procedure → optional return

33. Types of functions in SQL?

Scalar function
Table-valued function

34. What is a scalar function?
Returns a single value.

35. What is a table-valued function?
Returns a table.

36. Can a function return multiple values?
Yes, using table-valued functions.

37. Can we use DML statements inside a function?
Generally No (restricted in most DBs like MySQL).

38. How do you create a function?

CREATE FUNCTION func_name()
RETURNS datatype
BEGIN
   RETURN value;
END;

39. How do you call a function?

SELECT func_name();

40. Advantages of functions?

Reusable logic
Cleaner queries
Modular design
✅ Cursor (41–50)

41. What is a cursor?
A cursor is used to process rows one by one.

42. Why do we use cursors?
For row-by-row processing when set-based queries are not enough.

43. Types of cursors?

Static
Dynamic
Forward-only

44. Steps to use a cursor?

Declare
Open
Fetch
Close
Deallocate

45. Difference between cursor and loop?

Cursor → DB row processing
Loop → programming control structure

46. What are implicit and explicit cursors?

Implicit → automatic
Explicit → user-defined

47. Cursor attributes?

%FOUND
%NOTFOUND
%ROWCOUNT

48. What is a forward-only cursor?
Moves only in one direction (next row).

49. Disadvantages of cursors?

Slow
High memory usage
Complex

50. How to close and deallocate a cursor?

CLOSE cursor_name;
DEALLOCATE cursor_name;
✅ ACID Properties (51–60)

51. What are ACID properties?
Properties ensuring reliable transactions:

Atomicity
Consistency
Isolation
Durability

52. Atomicity?
All or nothing execution.

53. Consistency?
Maintains valid database state.

54. Isolation?
Transactions run independently.

55. Durability?
Changes are permanently saved.

56. What is a transaction?
A group of SQL operations executed together.

57. What is isolation level?
Defines how transactions interact.

58. Types of isolation levels?

Read Uncommitted
Read Committed
Repeatable Read
Serializable

59. Dirty, non-repeatable, phantom reads?

Dirty → read uncommitted data
Non-repeatable → data changes between reads
Phantom → new rows appear

60. How ACID ensures integrity?
Prevents data loss, inconsistency, and conflicts.

✅ Miscellaneous (61–70)

61. What is normalization?
Process of removing redundancy.

62. Different normal forms?
1NF, 2NF, 3NF, BCNF

63. What is denormalization?
Adding redundancy for performance.

64. Primary key & foreign key?

Primary → unique identifier
Foreign → reference to another table

65. Composite key?
Key made of multiple columns.

66. What is indexing?
Speeds up data retrieval.

67. What is a constraint?
Rule applied on table (NOT NULL, UNIQUE, etc.)

68. DELETE vs TRUNCATE vs DROP?

DELETE → removes rows
TRUNCATE → removes all quickly
DROP → deletes table

69. Transaction log?
Records all changes for recovery.

70. Database locking?
Controls access to data during transactions.

✅ Scenario-Based (71–75)

71. When use cursor?
When row-by-row processing is required.

72. When avoid triggers?
When logic is complex or performance critical.

73. Improve stored procedure performance?

Use indexes
Avoid unnecessary queries
Optimize joins

74. Handle errors in procedures?
Use TRY-CATCH or handlers.

75. Design ACID-compliant system?

Use transactions
Apply constraints
Set proper isolation levels