---
# Spring JDBC

## What is Spring JDBC?

Spring JDBC is a module of the Spring Framework that simplifies database access using the JDBC API. It reduces the amount of code required to interact with relational databases by handling repetitive tasks such as opening and closing database connections, managing exceptions, and executing SQL queries.
---

# Why did Spring develop Spring JDBC if Plain JDBC already exists?

Although Plain JDBC allows Java applications to communicate with databases, it requires developers to write a lot of repetitive (boilerplate) code.

### Problems with Plain JDBC

- Manually loading the JDBC driver.
- Opening database connections manually.
- Creating `Statement` or `PreparedStatement` objects.
- Executing SQL queries manually.
- Processing `ResultSet`.
- Closing `Connection`, `Statement`, and `ResultSet` objects manually.
- Handling checked exceptions (`SQLException`) everywhere.
- More code, making applications harder to maintain.

Spring JDBC solves all these problems by providing reusable classes and automatic resource management.

---

# Benefits of Spring JDBC

### 1. Reduces Boilerplate Code

Spring JDBC removes repetitive JDBC code, allowing developers to focus on business logic.

---

### 2. Converts Checked Exceptions into Unchecked Exceptions

Instead of throwing `SQLException` (checked exception), Spring converts database exceptions into **DataAccessException**, which is an unchecked exception.

**Benefit:**

- Cleaner code
- No need to write multiple `try-catch` blocks

---

### 3. Automatic Resource Management

Spring automatically manages JDBC resources.

It automatically:

- Opens database connections
- Closes database connections
- Closes `Statement` objects
- Closes `PreparedStatement` objects
- Closes `ResultSet` objects

This helps prevent resource leaks.

---

### 4. Provides `JdbcTemplate`

`JdbcTemplate` is the core class of Spring JDBC.

It simplifies executing all types of SQL operations.

Using `JdbcTemplate`, we can execute:

- **DDL (Data Definition Language)**
  - `CREATE`
  - `ALTER`
  - `DROP`

- **DML (Data Manipulation Language)**
  - `INSERT`
  - `UPDATE`
  - `DELETE`

- **DQL (Data Query Language)**
  - `SELECT`

---

### 5. Object Mapping Support

Spring JDBC can automatically map database rows to Java objects using classes like:

- `BeanPropertyRowMapper`
- Custom `RowMapper`

This eliminates the need to manually extract values from the `ResultSet`.

---

### 6. Transaction Management Support

Spring provides declarative transaction management using the `@Transactional` annotation.

This ensures:

- Data consistency
- Automatic commit
- Automatic rollback when an exception occurs

---

### 7. Better Maintainability

Since Spring JDBC reduces code complexity, applications become:

- Easier to read
- Easier to debug
- Easier to maintain

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

- Driver Class Name
- Database URL
- Username
- Password

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

- Driver Class Name
- Database URL
- Username
- Password

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

- Opening database connections
- Creating and executing SQL statements
- Handling exceptions
- Closing resources

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

- Uses the default constructor.
- Injects `DataSource` using the `setDataSource()` method.
- Demonstrates **setter injection**.
- Commonly found in older Spring examples.

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

- Uses constructor injection.
- Less code and easier to read.
- Recommended for modern Spring applications.
- Preferred in real-world projects.

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

- PreparedStatement
- `JdbcTemplate.update()`
- Parameterized queries (`?` placeholders)

---

# update() Method

The `update()` method is used to execute

- INSERT
- UPDATE
- DELETE

queries safely.

It returns

- **1** → Success
- **0** → No record affected

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

        JdbcTemplate template =
                context.getBean("template", JdbcTemplate.class);

        Scanner sc = new Scanner(System.in);

        if (template != null) {

            System.out.println("Enter Employee Name:");
            String name = sc.nextLine();

            System.out.println("Enter Employee Salary:");
            int sal = sc.nextInt();

            ParamToSQLStatement pstmt = new ParamToSQLStatement();

            pstmt.setName(name);
            pstmt.setSal(sal);

            int result = template.update(
                    "INSERT INTO employee VALUES(0,?,?)",
                    pstmt);

            if (result > 0) {

                System.out.println("Record Saved Successfully...");
            } else {

                System.out.println("Record Not Saved...");
            }

        } else {

            System.out.println("Database is not connected...");
        }

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

```java
package org.techhub;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.techhub.config.DBConfig;

public class ClientApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DBConfig.class);

        JdbcTemplate template =
                context.getBean("template", JdbcTemplate.class);

        Scanner sc = new Scanner(System.in);

        if (template != null) {

            System.out.println("Enter Employee Name:");
            String name = sc.nextLine();

            System.out.println("Enter Employee Salary:");
            int sal = sc.nextInt();

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

            if (result > 0) {
                System.out.println("Record Saved Successfully...");
            } else {
                System.out.println("Record Not Saved...");
            }

        } else {
            System.out.println("Database is not connected...");
        }

        sc.close();
        context.close();
    }
}
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

```java
package org.techhub;

import java.sql.PreparedStatement;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.techhub.config.DBConfig;

public class ClientApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DBConfig.class);

        JdbcTemplate template =
                context.getBean("template", JdbcTemplate.class);

        Scanner sc = new Scanner(System.in);

        if (template != null) {

            System.out.println("Enter Employee Name:");
            String name = sc.nextLine();

            System.out.println("Enter Employee Salary:");
            int sal = sc.nextInt();

            // Lambda Expression
            PreparedStatementSetter stmt = (PreparedStatement ps) -> {

                ps.setString(1, name);
                ps.setInt(2, sal);
            };

            int result = template.update(
                    "INSERT INTO employee VALUES(0,?,?)",
                    stmt);

            if (result > 0) {

                System.out.println("Record Saved Successfully...");
            } else {

                System.out.println("Record Not Saved...");
            }

        } else {

            System.out.println("Database is not connected...");
        }

        sc.close();
        context.close();
    }
}
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

````java
package org.techhub;

import java.sql.PreparedStatement;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.techhub.config.DBConfig;

public class ClientApplication {

    public static void main(String[] args) {

        // Load Spring Container
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DBConfig.class);

        // Get JdbcTemplate Bean
        JdbcTemplate template =
                context.getBean("template", JdbcTemplate.class);

        // Create Scanner Object
        Scanner sc = new Scanner(System.in);

        if (template != null) {

            // Read Employee Name
            System.out.println("Enter Employee Name:");
            String name = sc.nextLine();

            // Read Employee Salary
            System.out.println("Enter Employee Salary:");
            int sal = sc.nextInt();

            // Execute Insert Query using Lambda Expression
            int result = template.update(
                    "INSERT INTO employee VALUES(0,?,?)",
                    (PreparedStatement ps) -> {

                        ps.setString(1, name);
                        ps.setInt(2, sal);
                    });

            if (result > 0) {

                System.out.println("Record Saved Successfully...");
            } else {

                System.out.println("Record Not Saved...");
            }

        } else {

            System.out.println("Database is not connected...");
        }

        sc.close();
        context.close();
    }
}

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
````

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

Here is a **rewritten, well-structured version** of your notes while keeping the same concepts and examples.

# Fetch Data from Database using `JdbcTemplate.query()`

The `query()` method of the `JdbcTemplate` class is used to execute a **SELECT** statement and retrieve records from a database table. It returns the fetched records as a collection of Java objects.

---

# Syntax

```java
List<T> query(String sql, RowMapper<T> rowMapper);
```

### Parameters

- **sql** – The SQL `SELECT` query to execute.
- **RowMapper** – Maps each row of the `ResultSet` to a Java object.

### Return Type

- Returns a `List<T>` containing all the mapped objects.

---

# What is `RowMapper`?

`RowMapper` is a **functional interface** available in the following package:

```java
org.springframework.jdbc.core
```

It contains one abstract method:

```java
T mapRow(ResultSet rs, int rowNum) throws SQLException;
```

### Parameters

- **ResultSet rs** – Represents the current row fetched from the database.
- **rowNum** – Indicates the current row number.

### Return Value

Returns a Java object (for example, an `Employee` object).

### Purpose

The `mapRow()` method converts **one row of the database table into one Java object**. Spring automatically calls this method for every row returned by the `SELECT` query.

---

# Example: Fetch All Employee Records using Spring JDBC

## Step 1: Create Database and Table

```sql
CREATE DATABASE aug2025;

USE aug2025;

CREATE TABLE employee
(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    salary INT
);

INSERT INTO employee(name,salary)
VALUES
('Rahul',35000),
('Amit',42000),
('Karan',30000);
```

---

# Project Structure

```
SpringJDBCProject
│
├── src
│
├── org.techhub
│
│   ├── DBConfig.java
│   ├── Employee.java
│   └── FetchDataApplication.java
│
└── pom.xml
```

---

# DBConfig.java

```java
package org.techhub;

// Import Spring annotations and JDBC classes
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

// Marks this class as Spring Configuration class
@Configuration

// Scan the org.techhub package for Spring components
@ComponentScan(basePackages = {"org.techhub"})
public class DBConfig {

    // Create DataSource bean
    @Bean(name = "dataSource")
    public DriverManagerDataSource getDataSource() {

        // Create DataSource object
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        // MySQL Driver Class
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");

        // Database URL
        dataSource.setUrl("jdbc:mysql://localhost:3306/aug2025");

        // Database Username
        dataSource.setUsername("root");

        // Database Password
        dataSource.setPassword("root");

        // Return DataSource object
        return dataSource;
    }

    // Create JdbcTemplate bean
    @Bean(name = "template")
    public JdbcTemplate getTemplate() {

        // Pass DataSource to JdbcTemplate
        return new JdbcTemplate(getDataSource());
    }
}
```

---

# Employee.java

```java
package org.techhub;

package org.techhub;

// POJO class
public class Employee {

    // Instance variables
    private int id;
    private String name;
    private int sal;

    // Default Constructor
    public Employee() {

    }

    // Parameterized Constructor
    public Employee(String name, int id, int sal) {

        this.name = name;
        this.id = id;
        this.sal = sal;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for salary
    public int getSal() {
        return sal;
    }

    // Setter for salary
    public void setSal(int sal) {
        this.sal = sal;
    }
}
```

### Explanation

`Employee` is a **POJO (Plain Old Java Object)** that represents one row of the `employee` table.

---

# Method 1: Using Anonymous Inner Class

```java
package org.techhub;

// Import required classes
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class FetchDataApplication {

    public static void main(String[] args) 
    {

        // Load Spring Configuration Class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DBConfig.class);

        // Get JdbcTemplate bean from Spring Container
        JdbcTemplate template =
                context.getBean("template", JdbcTemplate.class);

        // Check whether JdbcTemplate bean is created or not
        if (template != null) {

            // Create RowMapper using Anonymous Inner Class
            RowMapper<Employee> mapper = new RowMapper<Employee>() {

                // Override mapRow() method
                @Override
                public Employee mapRow(ResultSet rs, int rowNum)
                        throws SQLException {

                    // Create Employee object
                    Employee emp = new Employee();

                    // Read first column (id)
                    emp.setId(rs.getInt(1));

                    // Read second column (name)
                    emp.setName(rs.getString(2));

                    // Read third column (salary)
                    emp.setSal(rs.getInt(3));

                    // Return Employee object
                    return emp;
                }
            };

            // Execute SELECT query
            List<Employee> list =
                    template.query("SELECT * FROM employee", mapper);

            // Display all employee records
            for (Employee emp : list) {

                System.out.println(
                        emp.getId() + "\t" +
                        emp.getName() + "\t" +
                        emp.getSal());
            }

        } else {

            // Display message if connection fails
            System.out.println("Database is not connected.");
        }

        // Close Spring Container
        context.close();
    }
}
```

---

# Method 2: Using Lambda Expression

```java
package org.techhub;

// Import required classes
import java.sql.ResultSet;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class FetchDataApplication {

    public static void main(String[] args) {

        // Load Spring Configuration
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DBConfig.class);

        // Get JdbcTemplate bean
        JdbcTemplate template =
                context.getBean("template", JdbcTemplate.class);

        // Execute SELECT query
        List<Employee> list =
                template.query(

                        "SELECT * FROM employee",

                        // Lambda Expression for RowMapper
                        (ResultSet rs, int rowNum) -> {

                            // Create Employee object
                            Employee emp = new Employee();

                            // Read employee id
                            emp.setId(rs.getInt(1));

                            // Read employee name
                            emp.setName(rs.getString(2));

                            // Read employee salary
                            emp.setSal(rs.getInt(3));

                            // Return object
                            return emp;
                        });

        // Print employee details
        for (Employee emp : list) {

            System.out.println(
                    emp.getId() + "\t" +
                    emp.getName() + "\t" +
                    emp.getSal());
        }

        // Close Spring Container
        context.close();
    }
}
```

---

# Method 3: Constructor-Based Lambda Expression

```java
package org.techhub;

// Import required classes
import java.sql.ResultSet;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class FetchDataApplication {

    public static void main(String[] args) {

        // Load Spring Container
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DBConfig.class);

        // Get JdbcTemplate bean
        JdbcTemplate template =
                context.getBean("template", JdbcTemplate.class);

        // Execute SELECT query and map each row directly
        List<Employee> list =
                template.query(

                        "SELECT * FROM employee",

                        // Constructor-based RowMapper
                        (ResultSet rs, int rowNum) ->
                                new Employee(
                                        rs.getString(2),
                                        rs.getInt(1),
                                        rs.getInt(3)));

        // Display records using forEach()
        list.forEach(emp ->
                System.out.println(
                        emp.getId() + "\t" +
                        emp.getName() + "\t" +
                        emp.getSal()));

        // Close Spring Container
        context.close();
    }
}
```

---

# Output

```
1    Rahul    35000
2    Amit     42000
3    Karan    30000
```

---

# Program Flow

```
Start
   │
   ▼
Load Spring Container
   │
   ▼
Create DataSource Bean
   │
   ▼
Create JdbcTemplate Bean
   │
   ▼
Get JdbcTemplate Bean
   │
   ▼
Execute SELECT Query using query()
   │
   ▼
Spring calls mapRow() for each row
   │
   ▼
Convert each row into an Employee object
   │
   ▼
Store all Employee objects in List<Employee>
   │
   ▼
Display the employee details
   │
   ▼
End

```

This is the complete Spring JDBC example for **fetching all records using `JdbcTemplate.query()`**, including:

1. Anonymous Inner Class implementation of `RowMapper`.
2. Lambda Expression implementation of `RowMapper`.
3. Constructor-based lambda implementation with `forEach()`.

---

# Interview Questions

### 1. What is `JdbcTemplate`?

`JdbcTemplate` is the core class of Spring JDBC. It simplifies database programming by managing JDBC operations such as connection creation, statement execution, exception handling, and resource cleanup.

---

### 2. Why is `JdbcTemplate` better than plain JDBC?

- Eliminates boilerplate code
- Handles exceptions automatically
- Closes resources automatically
- Supports parameterized queries
- Reduces code complexity

---

### 3. Which methods are commonly used in `JdbcTemplate`?

- `execute()`
- `update()`
- `query()`
- `queryForObject()`
- `queryForList()`
- `queryForMap()`

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

- Use `update()` instead of `execute()` for DML operations.
- Avoid string concatenation when building SQL queries.
- Use parameterized queries (`?`) to prevent SQL injection.
- Use `RowMapper` to map database rows to Java objects.
- For production applications, use a connection pool (such as **HikariCP**) instead of `DriverManagerDataSource`.
- Always close the `ApplicationContext` after use to release resources.




# Applying `WHERE` Clause with `JdbcTemplate.query()`

If you want to fetch specific records from a database using a **WHERE** clause, `JdbcTemplate` provides overloaded `query()` methods.

---

# Syntax 1: Using `PreparedStatementSetter`

```java
List<T> query(String sql,
              PreparedStatementSetter pss,
              RowMapper<T> rowMapper);
```

### Parameters

* **sql** – The SQL `SELECT` query.
* **PreparedStatementSetter** – Used to set values for the `?` placeholders in the query.
* **RowMapper** – Converts each row of the `ResultSet` into a Java object.

### Return Type

* Returns a `List<T>` containing the matching records.

---

# Syntax 2: Using `Object[]`

```java
List<T> query(String sql,
              Object[] args,
              RowMapper<T> rowMapper);
```

### Parameters

* **sql** – The SQL `SELECT` query.
* **Object[] args** – Values for the `?` placeholders.
* **RowMapper** – Converts each row into a Java object.

---

# Example

**Write a program to fetch employee details using employee id.**

---

# Database Table

```sql
CREATE TABLE employee
(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    salary INT
);
```

Sample Data

| id | name  | salary |
| -- | ----- | ------ |
| 1  | Rahul | 35000  |
| 2  | Amit  | 42000  |
| 3  | Karan | 30000  |

---

# Method 1: Using `PreparedStatementSetter`

## FetchDataApplication.java

```java
package org.techhub;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;

public class FetchDataApplication {

    public static void main(String[] args) {

        // Load Spring Container
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DBConfig.class);

        // Get JdbcTemplate Bean
        JdbcTemplate template =
                (JdbcTemplate)context.getBean("template");

        // Read Employee Id
        Scanner xyz = new Scanner(System.in);

        System.out.println("Enter Employee Id:");
        int empId = xyz.nextInt();

        // Create PreparedStatementSetter
        PreparedStatementSetter stmt =
                new PreparedStatementSetter() {

            @Override
            public void setValues(PreparedStatement ps)
                    throws SQLException {

                // Set value for ?
                ps.setInt(1, empId);
            }
        };

        // Create RowMapper
        RowMapper<Employee> mapper =
                new RowMapper<Employee>() {

            @Override
            public Employee mapRow(ResultSet rs,
                                   int rowNum)
                    throws SQLException {

                Employee emp = new Employee();

                emp.setId(rs.getInt("id"));
                emp.setName(rs.getString("name"));
                emp.setSal(rs.getInt("salary"));

                return emp;
            }
        };

        // Execute Query
        List<Employee> list =
                template.query(
                        "SELECT * FROM employee WHERE id=?",
                        stmt,
                        mapper);

        // Display Result
        list.forEach(emp ->
                System.out.println(
                        emp.getId() + "\t" +
                        emp.getName() + "\t" +
                        emp.getSal()));

        xyz.close();
        context.close();
    }
}
```

---

# Method 2: Using Lambda Expression

```java
package org.techhub;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;r
import org.springframework.jdbc.core.JdbcTemplate;

public class FetchDataApplication {

    public static void main(String[] args) {

        // Load Spring Container
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DBConfig.class);

        // Get JdbcTemplate Bean
        JdbcTemplate template =
                context.getBean("template", JdbcTemplate.class);

        // Read Employee Id
        Scanner xyz = new Scanner(System.in);

        System.out.println("Enter Employee Id:");
        int empId = xyz.nextInt();

        // Execute Query
        List<Employee> list =
                template.query(

                        "SELECT * FROM employee WHERE id=?",

                        // Set value for ?
                        (PreparedStatement ps) ->
                                ps.setInt(1, empId),

                        // Map ResultSet to Employee Object
                        (ResultSet rs, int rowNum) -> {

                            Employee emp = new Employee();

                            emp.setId(rs.getInt("id"));
                            emp.setName(rs.getString("name"));
                            emp.setSal(rs.getInt("salary"));

                            return emp;
                        });

        // Display Result
        list.forEach(emp ->
                System.out.println(
                        emp.getId() + "\t" +
                        emp.getName() + "\t" +
                        emp.getSal()));

        xyz.close();
        context.close();
    }
}
```

---

# Method 3: Using `Object[]`

```java
package org.techhub;

import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class FetchDataApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DBConfig.class);

        JdbcTemplate template =
                context.getBean("template", JdbcTemplate.class);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Id:");
        int empId = sc.nextInt();

        List<Employee> list =
                template.query(

                        "SELECT * FROM employee WHERE id=?",

                        new Object[]{empId},

                        (ResultSet rs, int rowNum) -> {

                            Employee emp = new Employee();

                            emp.setId(rs.getInt("id"));
                            emp.setName(rs.getString("name"));
                            emp.setSal(rs.getInt("salary"));

                            return emp;
                        });

        list.forEach(emp ->
                System.out.println(
                        emp.getId() + "\t" +
                        emp.getName() + "\t" +
                        emp.getSal()));

        sc.close();
        context.close();
    }
}
```

---

# Output

```
Enter Employee Id:
2

2    Amit    42000
```

---

# Program Flow

```
Start
   │
   ▼
Load Spring Container
   │
   ▼
Get JdbcTemplate Bean
   │
   ▼
Read Employee Id
   │
   ▼
Set Id in PreparedStatement
   │
   ▼
Execute SELECT Query
   │
   ▼
Database Returns Matching Record
   │
   ▼
RowMapper Converts Row into Employee Object
   │
   ▼
Store Object in List<Employee>
   │
   ▼
Display Employee Details
   │
   ▼
End
```

