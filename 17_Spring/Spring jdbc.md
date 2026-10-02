# Spring JDBC Notes

[Overview](#overview) | [Why Spring JDBC](#why-spring-jdbc) | [Database Setup](#database-setup) | [JdbcTemplate](#jdbctemplate) | [CRUD Operations](#crud-operations) | [PreparedStatementSetter](#preparedstatementsetter) | [Interview Questions](#interview-questions)

---

## Overview

Spring JDBC is a Spring Framework module used to simplify database access using JDBC.

It removes repetitive code such as:

- opening and closing connections
- creating statements
- handling `SQLException`
- manually cleaning resources

Spring JDBC makes database programming easier and more maintainable.

---

## Why Spring JDBC

Plain JDBC requires a lot of boilerplate code.

### Problems in plain JDBC

- manually loading the driver
- opening and closing connections
- creating `Statement` / `PreparedStatement`
- executing queries manually
- processing `ResultSet`
- closing resources manually
- writing repeated exception handling

### Spring JDBC advantages

- less boilerplate code
- automatic resource management
- conversion of checked exceptions to `DataAccessException`
- support for `JdbcTemplate`
- transaction support
- easier maintenance

---

## Database Setup

### Required dependencies

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-core</artifactId>
        <version>5.2.3.RELEASE</version>
    </dependency>

    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>5.2.3.RELEASE</version>
    </dependency>

    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-jdbc</artifactId>
        <version>5.2.3.RELEASE</version>
    </dependency>

    <dependency>
        <groupId>com.mysql</groupId>
        <artifactId>mysql-connector-j</artifactId>
        <version>9.2.0</version>
    </dependency>
</dependencies>
```

### Connection properties

To connect to a database we need:

- driver class name
- database URL
- username
- password

### Example using `DriverManagerDataSource`

```java
DriverManagerDataSource dataSource = new DriverManagerDataSource();

dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
dataSource.setUrl("jdbc:mysql://localhost:3306/aug2025");
dataSource.setUsername("root");
dataSource.setPassword("root");
```

### XML configuration

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN"
"https://www.springframework.org/dtd/spring-beans-2.0.dtd">

<beans>
    <bean id="conn" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
        <property name="driverClassName" value="com.mysql.cj.jdbc.Driver"/>
        <property name="url" value="jdbc:mysql://localhost:3306/aug2025"/>
        <property name="username" value="root"/>
        <property name="password" value="root"/>
    </bean>
</beans>
```

### Annotation configuration

```java
@Configuration
@ComponentScan(basePackages = "org.techhub")
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
}
```

---

## JdbcTemplate

`JdbcTemplate` is the key class in Spring JDBC.

It has methods such as:

- `execute()`
- `update()`
- `query()`
- `queryForObject()`
- `queryForList()`
- `queryForMap()`

### Package

```java
org.springframework.jdbc.core
```

### Configure `JdbcTemplate`

#### Traditional setter-based config

```java
@Bean(name = "jdbcTemplate")
public JdbcTemplate getTemplate() {
    JdbcTemplate jdbcTemplate = new JdbcTemplate();
    jdbcTemplate.setDataSource(getDataSource());
    return jdbcTemplate;
}
```

#### Modern constructor-based config

```java
@Bean
public JdbcTemplate jdbcTemplate() {
    return new JdbcTemplate(dataSource());
}
```

### Important methods

| Method | Purpose |
| ----- | ------- |
| `execute(String sql)` | executes DDL statements |
| `update(String sql, Object... args)` | inserts, updates, deletes |
| `query(String sql, RowMapper<T>)` | returns multiple records |
| `queryForObject()` | returns a single record |
| `queryForList()` | returns list of rows |
| `queryForMap()` | returns one row as a map |

---

## CRUD Operations

### Insert using `update()`

```java
int result = template.update(
    "insert into employee values(0,?,?)",
    name,
    salary
);
```

### Update using `update()`

```java
int result = template.update(
    "update employee set salary=? where id=?",
    salary,
    id
);
```

### Delete using `update()`

```java
int result = template.update(
    "delete from employee where id=?",
    id
);
```

### Create table using `execute()`

```java
template.execute(
    "CREATE TABLE employee(" +
    "id INT PRIMARY KEY AUTO_INCREMENT," +
    "name VARCHAR(50)," +
    "salary DOUBLE)"
);
```

### Example

```java
JdbcTemplate template = context.getBean(JdbcTemplate.class);

int result = template.update(
    "INSERT INTO course VALUES (?, ?, ?)",
    3,
    "PYTHON",
    30000
);
```

---

## PreparedStatementSetter

`PreparedStatementSetter` is used to set values for the `?` placeholders in SQL queries.

```java
public interface PreparedStatementSetter {
    void setValues(PreparedStatement ps) throws SQLException;
}
```

### Example: user-defined class

```java
public class ParamToSQLStatement implements PreparedStatementSetter {
    private String name;
    private int sal;

    public void setName(String name) { this.name = name; }
    public void setSal(int sal) { this.sal = sal; }

    @Override
    public void setValues(PreparedStatement ps) throws SQLException {
        ps.setString(1, name);
        ps.setInt(2, sal);
    }
}
```

### Usage

```java
int result = template.update(
    "INSERT INTO employee VALUES(0,?,?)",
    pstmt
);
```

### Anonymous class example

```java
PreparedStatementSetter stmt = new PreparedStatementSetter() {
    @Override
    public void setValues(PreparedStatement ps) throws SQLException {
        ps.setString(1, name);
        ps.setInt(2, sal);
    }
};
```

### Lambda expression example

```java
PreparedStatementSetter stmt = (PreparedStatement ps) -> {
    ps.setString(1, name);
    ps.setInt(2, sal);
};

int result = template.update(
    "INSERT INTO employee VALUES(0,?,?)",
    stmt
);
```

---

## SQL Injection

SQL Injection is a vulnerability where attackers inject malicious SQL into a query.

Example:

```sql
' OR 1=1 --
```

### Safe practice

Always use:

- parameterized queries
- `JdbcTemplate.update()` with `?` placeholders
- `PreparedStatement`

---

## Interview Questions

### Q1. What is Spring JDBC?

Spring JDBC is a module that simplifies database programming using JDBC by reducing boilerplate and providing utilities like `JdbcTemplate`.

### Q2. What is the main class in Spring JDBC?

`JdbcTemplate` is the main class.

### Q3. Why is Spring JDBC better than plain JDBC?

Because it reduces repeated code, manages resources automatically, and handles exceptions more cleanly.

### Q4. Why is `DriverManagerDataSource` not preferred in production?

Because it does not support connection pooling and creates a new connection each time.

### Q5. Which method is best for INSERT/UPDATE/DELETE?

Use `JdbcTemplate.update()` with parameterized SQL.

### Q6. How do we prevent SQL injection?

Use prepared statements and parameterized queries.

---

## Final Revision Points

- Spring JDBC simplifies database access with JDBC.
- `JdbcTemplate` is the main class used for SQL execution.
- It reduces boilerplate and handles resources automatically.
- `DriverManagerDataSource` is used to configure database connection details.
- `execute()` is used for DDL.
- `update()` is used for DML.
- Use prepared statements to avoid SQL injection.
- Spring JDBC supports cleaner and more maintainable database logic.

This is the cleaned and structured Spring JDBC revision note.
