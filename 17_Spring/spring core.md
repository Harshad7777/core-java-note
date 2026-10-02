# Spring Core Notes

[Spring Basics](#spring-basics) | [Dependency Injection](#dependency-injection) | [Bean & IoC](#bean-and-ioc-container) | [Setter Injection](#setter-injection) | [Constructor Injection](#constructor-injection) | [Autowiring](#autowiring) | [Collections](#collection-dependency-injection) | [Bean Scope](#bean-scope) | [Annotations](#annotations)

---

## Spring Basics

### What is Spring?

Spring is an open-source Java framework used to build different kinds of applications such as:

- web applications
- enterprise applications
- REST APIs
- microservices
- database applications

It is called a framework of frameworks because it contains many modules such as:

- Spring Core
- Spring MVC
- Spring JDBC
- Spring Security
- Spring AOP
- Spring Boot
- Spring Data JPA

### Why use Spring?

#### 1. Lightweight

Spring uses POJO-based design and modular architecture.

#### 2. Easy testing

Objects are loosely coupled, so unit testing is easier.

#### 3. Dependency Injection

Spring manages object creation and dependencies automatically.

#### 4. Reduced boilerplate

It reduces manual coding in database and service layers.

#### 5. Better maintainability

Applications become easier to update and scale.

### Core Spring modules

#### Spring Core

- IoC
- DI
- Bean lifecycle
- Configuration management

#### Spring MVC

- Request handling
- Form validation
- Model-View-Controller design

#### Spring JDBC

- JdbcTemplate
- Transaction support
- Exception handling

#### Spring Security

- Authentication
- Authorization
- JWT / OAuth2

#### Spring AOP

- Logging
- Security
- Transaction management
- Auditing

#### Spring Boot

- auto configuration
- embedded server
- starter dependencies

---

## Dependency Injection

### What is Dependency Injection?

Dependency Injection is a design pattern where one class depends on another class object and Spring injects that object automatically.

Example:

```java
public class Employee {
    private int id;
    private String name;

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
}
```

### Types of DI

#### 1. Setter Injection

Dependency is injected through setter methods.

```java
Employee emp = new Employee();
emp.setId(1);
emp.setName("ABC");
```

#### 2. Constructor Injection

Dependency is injected through constructor parameters.

```java
public class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
```

#### 3. Field Injection

Dependency is injected directly into a field using `@Autowired`.

```java
@Autowired
private Department department;
```

#### 4. Collection Dependency

A bean may depend on `List`, `Set`, `Map`, or `Properties`.

```java
private List<String> names;
private Set<String> departments;
private Map<Integer, String> details;
private Properties props;
```

#### 5. Object Dependency

One bean depends on another bean object.

```java
class Parcel {
}

class Courier {
    private Parcel parcel;

    public void setParcel(Parcel parcel) {
        this.parcel = parcel;
    }
}
```

---

## Bean and IoC Container

### What is IoC?

IoC stands for Inversion of Control.

In Spring, instead of creating objects manually, the Spring container creates and manages them.

### What is a Bean?

A bean is an object managed by the Spring IoC container.

### Bean container types

#### BeanFactory

- basic container
- lazy initialization
- lightweight

#### ApplicationContext

- advanced container
- supports event handling
- supports internationalization
- supports annotation-based configuration

### Example bean class

```java
package org.techhub;

public class Employee {
    private int id;
    private String name;
    private int sal;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getSal() { return sal; }
    public void setSal(int sal) { this.sal = sal; }

    public void show() {
        System.out.println(id + "\t" + name + "\t" + sal);
    }
}
```

### XML configuration

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE beans PUBLIC
"-//SPRING//DTD BEAN 2.0//EN"
"https://www.springframework.org/dtd/spring-beans-2.0.dtd">

<beans>
    <bean id="e" class="org.techhub.Employee">
        <property name="id" value="1"/>
        <property name="name" value="RAM"/>
        <property name="sal" value="10000"/>
    </bean>
</beans>
```

### Client code

```java
ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("test.xml");

Employee e = (Employee) context.getBean("e");
e.show();
context.close();
```

### How `getBean()` works

```java
Employee e = (Employee) context.getBean("e");
```

Spring searches for the bean named `e` and returns the fully initialized object.

---

## Setter Injection

### Definition

Setter Injection means Spring injects values by calling setter methods.

### XML example

```xml
<bean id="p" class="org.techhub.Player">
    <property name="id" value="1"/>
    <property name="name" value="Virat"/>
    <property name="run" value="12000"/>
</bean>
```

### Java class

```java
public class Player {
    private int id;
    private String name;
    private int run;

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setRun(int run) { this.run = run; }
}
```

### Output

```text
Player Object Created
1    Virat    12000
```

### Advantages

- simple to understand
- good for optional values
- easy to test

### Disadvantages

- object may be partially initialized
- mutable dependencies
- not best for mandatory values

---

## Constructor Injection

### Definition

In Constructor Injection, Spring creates the object using the constructor and passes required values automatically.

### XML example

```xml
<bean id="t" class="org.techhub.Test">
    <constructor-arg value="100"/>
</bean>
```

### Java example

```java
public class Test {
    private int x;

    public Test(int x) {
        this.x = x;
        System.out.println("I am Parameterized Constructor : " + x);
    }
}
```

### Important note

If a class has only a parameterized constructor and no default constructor, then Spring needs `<constructor-arg>` in XML.

Otherwise, it throws `BeanCreationException`.

### Best practice

Constructor Injection is preferred for mandatory dependencies because it ensures object validity from the beginning.

---

## Autowiring

### What is autowiring?

Autowiring means Spring automatically injects the dependency without manually writing `ref` in XML.

### Types of autowiring

#### 1. byType

Spring injects dependency based on the bean type.

```xml
<bean id="comp" class="org.techhub.objdep.Company"/>
<bean id="m" class="org.techhub.objdep.MSME" autowire="byType"/>
```

#### 2. byName

Spring matches the property name with the bean id.

```java
private Company company;
```

```xml
<bean id="company" class="org.techhub.objdep.Company"/>
<bean id="m" class="org.techhub.objdep.MSME" autowire="byName"/>
```

#### 3. constructor

Spring injects the dependency through the constructor.

```java
public MSME(Company company) {
    this.company = company;
}
```

```xml
<bean id="company" class="org.techhub.objdep.Company"/>
<bean id="m" class="org.techhub.objdep.MSME" autowire="constructor"/>
```

### Notes

- `autowire="autodetect"` is old and deprecated
- use `constructor` or annotation-based injection in modern apps

---

## Collection Dependency Injection

### What is collection injection?

A bean can be injected with collection values such as `List`, `Set`, `Map`, and `Properties`.

### List example

```xml
<bean id="e" class="org.techhub.Employee">
    <property name="names">
        <list>
            <value>ABC</value>
            <value>MNO</value>
            <value>PQR</value>
        </list>
    </property>
</bean>
```

### Set example

```xml
<property name="departments">
    <set>
        <value>HR</value>
        <value>DEV</value>
        <value>HR</value>
    </set>
</property>
```

### Map example

```xml
<property name="deptMap">
    <map>
        <entry key="1" value="HR"/>
        <entry key="2" value="DEV"/>
        <entry key="3" value="PROD"/>
    </map>
</property>
```

### Difference

| Type | Features |
| ----- | ------- |
| List | allows duplicates, preserves order |
| Set | no duplicates |
| Map | stores key-value pairs |

---

## Bean Scope

### Definition

Bean scope determines how many instances of a bean are created and how long they live.

### Default scope

```text
singleton
```

### Types

#### Singleton

- only one instance per Spring container
- same object returned every time

```xml
<bean id="m" class="org.techhub.MSME" scope="singleton"/>
```

#### Prototype

- new object every time `getBean()` is called

```xml
<bean id="m" class="org.techhub.MSME" scope="prototype"/>
```

### Web scopes

- request
- session
- application
- websocket

---

## Annotations

### What is an annotation?

An annotation gives metadata to Java code. It tells the compiler or framework how to treat that class or method.

### Common Spring annotations

#### @Component

Marks a class as a Spring bean.

```java
@Component
public class Employee {
}
```

#### @Service

Used for service layer classes.

```java
@Service
public class EmployeeService {
}
```

#### @Repository

Used for DAO/repository classes.

```java
@Repository
public class EmployeeRepository {
}
```

#### @Controller

Used in Spring MVC controllers.

```java
@Controller
public class EmployeeController {
}
```

#### @Configuration

Marks a configuration class.

```java
@Configuration
@ComponentScan(basePackages = "org.techhub")
public class ConfigApp {
}
```

#### @ComponentScan

Tells Spring where to search for beans.

```java
@ComponentScan(basePackages = "org.techhub")
```

#### @Value

Injects a constant or property value.

```java
@Value("10000")
private int sal;
```

#### @Autowired

Used to inject dependencies automatically.

```java
@Autowired
private Employee employee;
```

#### @Qualifier

Used when multiple beans of the same type exist.

```java
@Autowired
@Qualifier("mul")
private SetVal setVal;
```

#### @Scope

Defines bean scope.

```java
@Component
@Scope("prototype")
public class Test {
}
```

---

## Annotation Example

```java
package org.techhub;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("e")
public class Employee {
    @Value("1")
    private int id;

    @Value("ABC")
    private String name;

    @Value("10000")
    private int sal;
}
```

```java
package org.techhub.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.techhub")
public class ConfigApp {
}
```

```java
AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(ConfigApp.class);

Employee e = context.getBean("e", Employee.class);
```

---

## Final Revision Points

- Spring is a Java framework for enterprise and web application development.
- IoC means the container manages object creation.
- DI is the process of injecting dependencies into objects.
- Spring has core modules such as Core, MVC, JDBC, Security, AOP, Boot, and JPA.
- Bean is an object created and managed by Spring.
- Setter injection uses setter methods.
- Constructor injection uses constructor parameters.
- Autowiring reduces manual wiring work.
- Bean scope controls object lifecycle.
- Annotations like `@Component`, `@Autowired`, `@Qualifier`, and `@Value` are widely used in modern Spring.

This is the cleaned and structured Spring Core revision note.
