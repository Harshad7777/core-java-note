# Spring Core Interview Questions & Answers

## Basic Level

### 1. What is Spring Framework and why is it used?

Spring is an open-source Java framework used to develop enterprise applications. It provides features such as IoC (Inversion of Control), Dependency Injection, transaction management, MVC architecture, security, and data access support.

**Why used?**

* Reduces boilerplate code
* Promotes loose coupling
* Easy testing and maintenance
* Supports enterprise-level applications

---

### 2. What are the advantages of Spring over traditional Java development?

* Loose coupling through Dependency Injection
* Better code reusability
* Easier testing
* Simplified database operations
* Modular architecture
* Supports AOP, Security, MVC, REST APIs

---

### 3. What is Inversion of Control (IoC)?

IoC is a principle where the responsibility of creating and managing objects is transferred from the programmer to the Spring Container.

**Without Spring**

```java
EmployeeService service = new EmployeeService();
```

**With Spring**

```java
EmployeeService service = context.getBean(EmployeeService.class);
```

Spring creates and manages the object.

---

### 4. What is Dependency Injection (DI)?

Dependency Injection is a technique where Spring injects required objects into another object automatically.

Example:

```java
@Autowired
private EmployeeRepository repository;
```

Benefits:

* Loose coupling
* Easy maintenance
* Easy testing

---

### 5. What are the different types of Dependency Injection?

1. Constructor Injection
2. Setter Injection
3. Field Injection

**Constructor Injection Example**

```java
public EmployeeService(EmployeeRepository repo){
    this.repo = repo;
}
```

**Setter Injection Example**

```java
public void setRepository(EmployeeRepository repo){
    this.repo = repo;
}
```

---

### 6. What is the difference between BeanFactory and ApplicationContext?

| BeanFactory      | ApplicationContext          |
| ---------------- | --------------------------- |
| Basic container  | Advanced container          |
| Lazy loading     | Eager loading               |
| Limited features | Event handling, AOP support |
| Lightweight      | Feature-rich                |

ApplicationContext is preferred.

---

### 7. What is a Spring Bean?

A Spring Bean is an object created, managed, and maintained by the Spring IoC Container.

Example:

```java
@Component
public class EmployeeService {
}
```

---

### 8. What is bean scope in Spring?

Bean scope defines the lifecycle and visibility of a bean.

Types:

* singleton
* prototype
* request
* session
* application
* websocket

---

### 9. Explain Singleton and Prototype scope.

### Singleton (Default)

Only one object is created.

```java
@Scope("singleton")
```

### Prototype

New object created every time.

```java
@Scope("prototype")
```

---

### 10. What is the purpose of @Component annotation?

`@Component` tells Spring that the class is a bean and should be managed by the Spring Container.

Example:

```java
@Component
public class EmployeeRepository {
}
```

---

# Intermediate Level

### 11. Difference between @Component, @Service, @Repository, and @Controller?

| Annotation  | Purpose              |
| ----------- | -------------------- |
| @Component  | Generic Spring Bean  |
| @Service    | Business Logic Layer |
| @Repository | Database Layer       |
| @Controller | Web Controller Layer |

Example:

```java
@Repository
public class EmployeeRepository{}
```

```java
@Service
public class EmployeeService{}
```

---

### 12. What is @Autowired and how does it work?

`@Autowired` automatically injects a dependency by type.

Example:

```java
@Autowired
private EmployeeRepository repository;
```

Spring searches for a matching bean and injects it automatically.

---

### 13. Difference between Constructor Injection and Setter Injection?

| Constructor Injection | Setter Injection    |
| --------------------- | ------------------- |
| Dependency mandatory  | Dependency optional |
| Immutable objects     | Mutable objects     |
| Recommended           | Less preferred      |
| More secure           | Less secure         |

---

### 14. What is @Qualifier and why is it used?

When multiple beans of the same type exist, Spring gets confused.

`@Qualifier` specifies which bean should be injected.

Example:

```java
@Autowired
@Qualifier("mysqlRepo")
private EmployeeRepository repository;
```

---

### 15. What is @Primary annotation?

`@Primary` marks a bean as the default choice when multiple beans of the same type exist.

Example:

```java
@Component
@Primary
public class MySqlRepository implements EmployeeRepository {
}
```

---

# Assignment 1: Employee Information System

## Project Structure

```
src/main/java
|
|-- org.techhub
     |
     |-- config
     |     |
     |     |-- AppConfig.java
     |
     |-- model
     |     |
     |     |-- Employee.java
     |
     |-- repository
     |     |
     |     |-- EmployeeRepository.java
     |
     |-- service
     |     |
     |     |-- EmployeeService.java
     |
     |-- MainApp.java
```

---

## 1. Employee.java

```java
package org.techhub.model;

public class Employee {

    private int empId;
    private String empName;
    private String department;

    public Employee(int empId, String empName, String department) {
        this.empId = empId;
        this.empName = empName;
        this.department = department;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId +
                ", empName=" + empName +
                ", department=" + department + "]";
    }
}
```

---

## 2. EmployeeRepository.java

```java
package org.techhub.repository;

import org.springframework.stereotype.Component;
import org.techhub.model.Employee;

@Component
public class EmployeeRepository {

    public void saveEmployee(Employee employee) {

        System.out.println("Employee Saved Successfully");
        System.out.println(employee);
    }
}
```

---

## 3. EmployeeService.java

### Constructor Injection

```java
package org.techhub.service;

import org.springframework.stereotype.Service;
import org.techhub.model.Employee;
import org.techhub.repository.EmployeeRepository;

@Service
public class EmployeeService {

    private EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public void addEmployee(Employee employee) {

        System.out.println("Adding Employee...");
        repository.saveEmployee(employee);
    }
}
```

---

## 4. AppConfig.java

```java
package org.techhub.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.techhub")
public class AppConfig {
}
```

---

## 5. MainApp.java

```java
package org.techhub;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.techhub.config.AppConfig;
import org.techhub.model.Employee;
import org.techhub.service.EmployeeService;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        EmployeeService service =
                context.getBean(EmployeeService.class);

        Employee employee =
                new Employee(101, "Harshad", "IT");

        service.addEmployee(employee);
    }
}
```

---

# Expected Output

```text
Adding Employee...
Employee Saved Successfully
Employee [empId=101, empName=Harshad, department=IT]
```

# Flow Diagram

```text
ApplicationContext
        |
        v
EmployeeService
        |
        v
EmployeeRepository
        |
        v
Employee Saved
```

This assignment demonstrates Spring Core concepts: IoC Container, Dependency Injection, `@Component`, `@Service`, Constructor Injection, and `ApplicationContext`.
