
---

# Spring JDBC

## What is Spring JDBC?

Spring JDBC is a module of the Spring Framework that simplifies database access using the JDBC API. It reduces the amount of code required to interact with relational databases by handling repetitive tasks such as opening and closing database connections, managing exceptions, and executing SQL queries.
  
---   

# Why did Spring develop Spring JDBC if Plain JDBC already exists?

Although Plain JDBC allows Java applications to communicate with databases, it requires developers to write a lot of repetitive (boilerplate) code.

### Problems with Plain JDBC

* Manually loading the JDBC driver.
* Opening database connections manually.
* Creating `Statement` or `PreparedStatement` objects.
* Executing SQL queries manually.
* Processing `ResultSet`.
* Closing `Connection`, `Statement`, and `ResultSet` objects manually.
* Handling checked exceptions (`SQLException`) everywhere.
* More code, making applications harder to maintain.

Spring JDBC solves all these problems by providing reusable classes and automatic resource management.

---

# Benefits of Spring JDBC

### 1. Reduces Boilerplate Code

Spring JDBC removes repetitive JDBC code, allowing developers to focus on business logic.

---

### 2. Converts Checked Exceptions into Unchecked Exceptions

Instead of throwing `SQLException` (checked exception), Spring converts database exceptions into **DataAccessException**, which is an unchecked exception.

**Benefit:**

* Cleaner code
* No need to write multiple `try-catch` blocks

---

### 3. Automatic Resource Management

Spring automatically manages JDBC resources.

It automatically:

* Opens database connections
* Closes database connections
* Closes `Statement` objects
* Closes `PreparedStatement` objects
* Closes `ResultSet` objects

This helps prevent resource leaks.

---

### 4. Provides `JdbcTemplate`

`JdbcTemplate` is the core class of Spring JDBC.

It simplifies executing all types of SQL operations.

Using `JdbcTemplate`, we can execute:

* **DDL (Data Definition Language)**

  * `CREATE`
  * `ALTER`
  * `DROP`

* **DML (Data Manipulation Language)**

  * `INSERT`
  * `UPDATE`
  * `DELETE`

* **DQL (Data Query Language)**

  * `SELECT`

---

### 5. Object Mapping Support

Spring JDBC can automatically map database rows to Java objects using classes like:

* `BeanPropertyRowMapper`
* Custom `RowMapper`

This eliminates the need to manually extract values from the `ResultSet`.

---

### 6. Transaction Management Support

Spring provides declarative transaction management using the `@Transactional` annotation.

This ensures:

* Data consistency
* Automatic commit
* Automatic rollback when an exception occurs

---

### 7. Better Maintainability
 
Since Spring JDBC reduces code complexity, applications become:

* Easier to read
* Easier to debug
* Easier to maintain

---

# Interview Definition

> **Spring JDBC is a Spring Framework module that simplifies database operations using JDBC. It reduces boilerplate code, provides automatic resource management, converts checked exceptions into unchecked exceptions, offers the `JdbcTemplate` class for executing SQL queries, supports object mapping, and provides transaction management, making database programming easier and more efficient.**

---

## Plain JDBC vs Spring JDBC

| Plain JDBC                          | Spring JDBC                                  |
| ----------------------------------- | -------------------------------------------- |
| More boilerplate code               | Less boilerplate code                        |
| Manual connection management        | Automatic connection management              |
| Manual resource closing             | Automatic resource closing                   |
| Checked exceptions (`SQLException`) | Unchecked exceptions (`DataAccessException`) |
| Manual `ResultSet` mapping          | Automatic object mapping                     |
| No built-in transaction support     | Built-in transaction management              |
| More coding effort                  | Less coding effort                           |
| Harder to maintain                  | Easier to maintain                           |

**Key Interview Question:**
**Q. What is the main class in Spring JDBC?**
**Answer:** The main class is **`JdbcTemplate`**, which simplifies executing SQL statements and managing database resources.


---

# How to Connect a Spring Application with a Database using Spring JDBC

Spring JDBC provides a simple way to connect a Spring application with a relational database. It reduces the boilerplate code required in plain JDBC, such as opening/closing connections and handling exceptions.

--- 

# Steps to Connect a Spring Application with a Database

1. Create a Maven Project.
2. Add the required Maven dependencies.
3. Configure the DataSource.
4. Connect to the database.
5. Verify the connection.

---

# Required Maven Dependencies

```xml
<dependencies>

    <!-- Spring Core -->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-core</artifactId>
        <version>5.2.3.RELEASE</version>
    </dependency>

    <!-- Spring Context -->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>5.2.3.RELEASE</version>
    </dependency>

    <!-- Spring JDBC -->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-jdbc</artifactId>
        <version>5.2.3.RELEASE</version>
    </dependency>

    <!-- MySQL JDBC Driver -->
    <dependency>
        <groupId>com.mysql</groupId>
        <artifactId>mysql-connector-j</artifactId>
        <version>9.2.0</version>
    </dependency>

</dependencies>
```

---

# Ways to Connect a Spring Application with a Database

Spring provides three ways to configure a database connection.

1. By creating an object of `DriverManagerDataSource`
2. By configuring `DriverManagerDataSource` using XML
3. By configuring `DriverManagerDataSource` using Java Annotations

---

# 1. Using DriverManagerDataSource Class

`DriverManagerDataSource` is an inbuilt class provided by the package:

```java
org.springframework.jdbc.datasource
```

It is used to connect a Spring application with a database.

The following properties must be configured:

* Driver Class Name
* Database URL
* Username
* Password

---

## Example

```java
package org.techhub;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class TestConnection {

    public static void main(String[] args) {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/aug2025");
        dataSource.setUsername("root");
        dataSource.setPassword("root");

        if (dataSource != null) {
            System.out.println("Database is connected.");
        } else {
            System.out.println("Database is not connected.");
        }
    }
}
```

---

# 2. Configure Database Connection using XML

## conn.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>

<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN"
"https://www.springframework.org/dtd/spring-beans-2.0.dtd">

<beans>

    <bean id="conn"
          class="org.springframework.jdbc.datasource.DriverManagerDataSource">

        <property name="driverClassName"
                  value="com.mysql.cj.jdbc.Driver"/>

        <property name="url"
                  value="jdbc:mysql://localhost:3306/aug2025"/>

        <property name="username"
                  value="root"/>

        <property name="password"
                  value="root"/>

    </bean>

</beans>
```

---

## TestConnection.java

```java
package org.techhub;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class TestConnection {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("conn.xml");

        DriverManagerDataSource dataSource =
                (DriverManagerDataSource) context.getBean("conn");

        if (dataSource != null) {
            System.out.println("Database is connected.");
        } else {
            System.out.println("Database is not connected.");
        }

        context.close();
    }
}
```

---

# 3. Configure Database Connection using Java Annotations


---

## DBConfig.java


```java
package org.techhub;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "org.techhub") 
public class DBConfig {

    @Bean(name = "dataSource")
    public DriverManagerDataSource getDataSource() {

        DriverManagerDataSource dataSource =
                new DriverManagerDataSource();

        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/aug2025");
        dataSource.setUsername("root");
        dataSource.setPassword("root");

        return dataSource;
    }
}
```

---

## TestConnection.java

```java
package org.techhub;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class TestConnection {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DBConfig.class);

        DriverManagerDataSource dataSource =(DriverManagerDataSource)
                context.getBean("dataSource");

        if (dataSource != null) {
            System.out.println("Database is connected.");
        } else {
            System.out.println("Database is not connected.");
        }

        context.close();
    }
}
```

---

# Interview Questions

### Q1. What is DriverManagerDataSource?

**Answer:**
`DriverManagerDataSource` is a Spring class from the `org.springframework.jdbc.datasource` package that provides a simple implementation of the `DataSource` interface. It is mainly used for testing and small applications because it creates a new database connection for every request.

---

### Q2. What information is required to configure DriverManagerDataSource?

* Driver Class Name
* Database URL
* Username
* Password

---

### Q3. How many ways can we configure a DataSource in Spring?

There are three common ways:

1. Programmatically using `DriverManagerDataSource`
2. Using XML configuration
3. Using Java-based Annotation configuration

---

### Q4. Why is `DriverManagerDataSource` not recommended for production?

Because it **does not provide connection pooling**. It creates a new database connection every time it is requested, which reduces application performance. For production applications, connection pools such as **HikariCP**, **Apache DBCP**, or **C3P0** are preferred.


---

# Working with a Database using Spring JDBC (`JdbcTemplate`)

`JdbcTemplate` is one of the most important classes in Spring JDBC. It simplifies database programming by handling the repetitive tasks of JDBC such as:

* Opening database connections
* Creating and executing SQL statements
* Handling exceptions
* Closing resources

It belongs to the package:

```java
org.springframework.jdbc.core
```

---

# Steps to Work with JdbcTemplate

1. Configure the `DataSource`.
2. Create a `JdbcTemplate` object.
3. Write SQL queries. 
4. Execute SQL using `JdbcTemplate` methods.
5. Process the result (if it is a SELECT query).


---

# Configure `JdbcTemplate`

---

# 1. Traditional Configuration (Setter Injection)

### DBConfig.java

```java
package org.techhub;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"org.techhub"})
public class DBConfig {

    @Bean(name = "dataSource")
    public DriverManagerDataSource getDataSource() {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/aug2025");
        dataSource.setUsername("root");
        dataSource.setPassword("root");

        return dataSource;
    }

    @Bean(name = "jdbcTemplate")
    public JdbcTemplate getTemplate() {

        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(getDataSource());

        return jdbcTemplate;
    }
}
```

### Features

* Uses the default constructor.
* Injects `DataSource` using the `setDataSource()` method.
* Demonstrates **setter injection**.
* Commonly found in older Spring examples.

---

# 2. Modern Configuration (Constructor Injection)


### DBConfig.java

```java
package org.techhub;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("org.techhub")
public class DBConfig {

    @Bean
    public DriverManagerDataSource dataSource() {

        DriverManagerDataSource ds = new DriverManagerDataSource();

        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/aug2025");
        ds.setUsername("root");
        ds.setPassword("root");

        return ds;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }
}
```

### Features

* Uses constructor injection.
* Less code and easier to read.
* Recommended for modern Spring applications.
* Preferred in real-world projects.

---

# TestConnection.java

```java
package org.techhub;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestConnection {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DBConfig.class);

        JdbcTemplate template = (JdbcTemplate)context.getBean("jdbcTemplate");
        //JdbcTemplate template = context.getBean(JdbcTemplate.class);

        int result = template.update(
                "INSERT INTO course VALUES (?, ?, ?)",
                3,
                "PYTHON",
                30000
        );

        if (result > 0) {
            System.out.println("Record inserted successfully.");
        } else {
            System.out.println("Record insertion failed.");
        }

        context.close();
    }
}
```

---

# JdbcTemplate Constructors

```java
JdbcTemplate()
```

Creates an empty `JdbcTemplate`.

```java
JdbcTemplate(DataSource dataSource)
```

Creates a `JdbcTemplate` using the specified `DataSource`.

---

# Important JdbcTemplate Methods

| Method                               | Purpose                                                      |
| ------------------------------------ | ------------------------------------------------------------ |
| `execute(String sql)`                | Executes DDL and simple DML statements.                      |
| `update(String sql)`                 | Executes INSERT, UPDATE and DELETE statements.               |
| `update(String sql, Object... args)` | Executes parameterized INSERT, UPDATE and DELETE statements. |
| `query(String sql, RowMapper<T>)`    | Executes a SELECT query and returns multiple records.        |
| `queryForObject()`                   | Returns a single object.                                     |
| `queryForList()`                     | Returns a list of rows.                                      |
| `queryForMap()`                      | Returns a single row as a Map.                               |

---

# execute() Method

## Syntax

```java
template.execute(sql);
```

### Example

```java
JdbcTemplate template = context.getBean(JdbcTemplate.class);

template.execute(
    "CREATE TABLE employee(" +
    "id INT PRIMARY KEY AUTO_INCREMENT," +
    "name VARCHAR(50)," +
    "salary DOUBLE)"
);
```
### DBConfig.java
```java
package org.techhub.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "org.techhub")
public class DBConfig {

    @Bean
    public DriverManagerDataSource dataSource() {

        DriverManagerDataSource ds = new DriverManagerDataSource();

        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/aug2025");
        ds.setUsername("root");
        ds.setPassword("root");

        return ds;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }
}
```

### ClientApplication.java
```java

package org.techhub;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.techhub.config.DBConfig;

public class ClientApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DBConfig.class);

        JdbcTemplate template = context.getBean(JdbcTemplate.class);

        template.execute(
                "CREATE TABLE employee(" +
                "id INT PRIMARY KEY AUTO_INCREMENT," +
                "name VARCHAR(50)," +
                "salary DOUBLE)"
        );

        System.out.println("Employee table created successfully...");

        context.close();
    }
}
```

> **Note:** `execute()` is generally used for DDL statements. For INSERT, UPDATE, and DELETE operations, `update()` is preferred.

---

# Insert Record using execute()

```java
template.execute(
"INSERT INTO employee VALUES(0,'Rahul',25000)"
);
```

This works, but it is **not recommended** because it concatenates values directly into the SQL statement.

Example:

```java
template.execute(
"insert into employee values(0,'"+name+"',"+salary+")"
);
```

This approach is vulnerable to **SQL Injection**.

---

# What is SQL Injection?

SQL Injection is a security vulnerability where an attacker inserts malicious SQL code into an application's SQL query.

For example,

```sql
' OR 1=1 --
```

can manipulate the SQL query.

To avoid SQL Injection, always use:

* PreparedStatement
* `JdbcTemplate.update()`
* Parameterized queries (`?` placeholders)

---

# update() Method

The `update()` method is used to execute

* INSERT
* UPDATE
* DELETE

queries safely.

It returns

* **1** → Success
* **0** → No record affected

---

## Method Signatures

```java
update(String sql, PreparedStatementSetter setter)
```

or

```java
update(String sql, Object... args)
```

The second form is simpler and is the one most commonly used in real projects.

---

# Example using PreparedStatementSetter

```java
int result = template.update(
"insert into employee values(0,?,?)",
ps -> {

    ps.setString(1, name);
    ps.setInt(2, salary);

});
```

---

# Example using Object Array

This is the preferred approach.

```java
int result = template.update(

"insert into employee values(0,?,?)",

name,
salary

);
```

No custom class is required.

---

# Delete Example

```java
int result = template.update(

"delete from employee where id=?",

id

);
```

---

# Update Example

```java
int result = template.update(

"update employee set salary=? where id=?",

salary,
id

);
```

---

# PreparedStatementSetter in Spring JDBC

`PreparedStatementSetter` is an interface provided by Spring JDBC. It is used to set values for the `?` placeholders in a prepared SQL statement.

```java
public interface PreparedStatementSetter {
    void setValues(PreparedStatement ps) throws SQLException;
}
```

---

# Database Table

```sql
CREATE TABLE employee(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    salary INT
);
```

---

# DBConfig.java

```java
package org.techhub.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "org.techhub")
public class DBConfig {

    @Bean(name = "dataSource")
    public DriverManagerDataSource getDataSource() {

        DriverManagerDataSource ds = new DriverManagerDataSource();

        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/aug2025");
        ds.setUsername("root");
        ds.setPassword("root");

        return ds;
    }

    @Bean(name = "template")
    public JdbcTemplate getTemplate() 
    {
        return new JdbcTemplate(getDataSource());
    }
}
```

---

# Method 1: User Defined Class

## ParamToSQLStatement.java

```java
package org.techhub;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementSetter;

public class ParamToSQLStatement implements PreparedStatementSetter {

    private String name;
    private int sal;

    public void setName(String name) {
        this.name = name;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    @Override
    public void setValues(PreparedStatement ps) throws SQLException {

        ps.setString(1, name);
        ps.setInt(2, sal);
    }
}
```

### ClientApplication.java

```java
package org.techhub;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.techhub.config.DBConfig;

public class ClientApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DBConfig.class);

        JdbcTemplate template = context.getBean("template", JdbcTemplate.class);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Name");
        String name = sc.nextLine();

        System.out.println("Enter Salary");
        int sal = sc.nextInt();

        ParamToSQLStatement pstmt = new ParamToSQLStatement();
        pstmt.setName(name);
        pstmt.setSal(sal);

        int result = template.update(
                "INSERT INTO employee VALUES(0,?,?)",
                pstmt);

        if(result>0)
            System.out.println("Record Saved Successfully");
        else
            System.out.println("Record Not Saved");

        sc.close();
        context.close();
    }
}
```

---

# Method 2: Anonymous Inner Class

```java
PreparedStatementSetter stmt = new PreparedStatementSetter() {

    @Override
    public void setValues(PreparedStatement ps) throws SQLException {

        ps.setString(1, name);
        ps.setInt(2, sal);
    }
};

int result = template.update(
        "INSERT INTO employee VALUES(0,?,?)",
        stmt);
```

---

# Method 3: Lambda Expression

```java
PreparedStatementSetter stmt = (PreparedStatement ps) -> {

    ps.setString(1, name);
    ps.setInt(2, sal);
};

int result = template.update(
        "INSERT INTO employee VALUES(0,?,?)",
        stmt);
```

---

# Method 4: Direct Lambda Expression

```java
int result = template.update(
        "INSERT INTO employee VALUES(0,?,?)",
        (PreparedStatement ps) -> {

            ps.setString(1, name);
            ps.setInt(2, sal);
        });
```

---

# Delete Record Using Lambda

```java
Scanner sc = new Scanner(System.in);

System.out.println("Enter Employee Id");
int id = sc.nextInt();

int result = template.update(
        "DELETE FROM employee WHERE id=?",
        (PreparedStatement ps) -> {

            ps.setInt(1, id);
        });

if(result>0)
    System.out.println("Record Deleted Successfully");
else
    System.out.println("Record Not Found");
```

---

# Comparison

| Method                | Description                                              | Recommended             |
| --------------------- | -------------------------------------------------------- | ----------------------- |
| User Defined Class    | Implements `PreparedStatementSetter` in a separate class | Good for reusable logic |
| Anonymous Inner Class | Creates implementation inside the method                 | Good                    |
| Lambda Expression     | Short implementation using lambda                        | **Best (Java 8+)**      |
| Direct Lambda         | Passes lambda directly to `update()`                     | **Most commonly used**  |

---

## Interview Question

**Q. How many ways can we implement `PreparedStatementSetter` in Spring JDBC?**

**Answer:** There are **four ways**:

1. Using a user-defined class implementing `PreparedStatementSetter`.
2. Using an anonymous inner class.
3. Using a lambda expression.
4. Passing the lambda expression directly to the `JdbcTemplate.update()` method.

For modern Spring JDBC applications, **Method 4 (direct lambda)** is the most concise and widely used approach.











---

# Fetch Data using query()

The `query()` method executes a SELECT statement and returns a list of objects.

## Syntax

```java
List<T> query(

String sql,

RowMapper<T> mapper

);
```

---

# What is RowMapper?

`RowMapper` is a functional interface.

Package:

```java
org.springframework.jdbc.core
```

It contains one method:

```java
mapRow(ResultSet rs, int rowNum)
```

This method converts one database row into one Java object.

---

# Employee Class

```java
public class Employee {

    private int id;
    private String name;
    private int salary;

    // Getters and Setters

}
```

---

# Fetch All Employees

```java
List<Employee> list = template.query(

"select * from employee",

(rs,rowNum)->{

    Employee emp = new Employee();

    emp.setId(rs.getInt("id"));
    emp.setName(rs.getString("name"));
    emp.setSalary(rs.getInt("salary"));

    return emp;

}

);

list.forEach(System.out::println);
```

---

# Fetch Employee by ID

```java
List<Employee> list = template.query(

"select * from employee where id=?",

ps->ps.setInt(1,id),

(rs,rowNum)->{

    Employee emp = new Employee();

    emp.setId(rs.getInt("id"));
    emp.setName(rs.getString("name"));
    emp.setSalary(rs.getInt("salary"));

    return emp;

}

);
```

---

# Alternative (Recommended)

Instead of `PreparedStatementSetter`, use method parameters directly.

```java
List<Employee> list = template.query(

"select * from employee where id=?",

new Object[]{id},

(rs,rowNum)->{

    Employee emp = new Employee();

    emp.setId(rs.getInt("id"));
    emp.setName(rs.getString("name"));
    emp.setSalary(rs.getInt("salary"));

    return emp;

}

);
```

Or even simpler:

```java
List<Employee> list = template.query(

"select * from employee where id=?",

(rs,rowNum)->new Employee(

rs.getInt("id"),
rs.getString("name"),
rs.getInt("salary")

),

id

);
```

---

# Interview Questions

### 1. What is `JdbcTemplate`?

`JdbcTemplate` is the core class of Spring JDBC. It simplifies database programming by managing JDBC operations such as connection creation, statement execution, exception handling, and resource cleanup.

---

### 2. Why is `JdbcTemplate` better than plain JDBC?

* Eliminates boilerplate code
* Handles exceptions automatically
* Closes resources automatically
* Supports parameterized queries
* Reduces code complexity

---

### 3. Which methods are commonly used in `JdbcTemplate`?

* `execute()`
* `update()`
* `query()`
* `queryForObject()`
* `queryForList()`
* `queryForMap()`

---

### 4. What is `RowMapper`?

`RowMapper` is a functional interface that converts each row of a `ResultSet` into a Java object.

---

### 5. What is `PreparedStatementSetter`?

`PreparedStatementSetter` is a functional interface used to set parameter values in a prepared statement, helping prevent SQL injection.

---

### 6. Which method is preferred for INSERT, UPDATE, and DELETE?

`update()` is preferred because it uses prepared statements and protects against SQL injection.

---

## Best Practices

* Use `update()` instead of `execute()` for DML operations.
* Avoid string concatenation when building SQL queries.
* Use parameterized queries (`?`) to prevent SQL injection.
* Use `RowMapper` to map database rows to Java objects.
* For production applications, use a connection pool (such as **HikariCP**) instead of `DriverManagerDataSource`.
* Always close the `ApplicationContext` after use to release resources.
