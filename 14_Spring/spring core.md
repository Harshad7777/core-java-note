# Spring Framework Notes

## Topics Covered

1. Spring Core
2. Spring JDBC  
3. Spring MVC 
4. Spring Security
5. Spring AOP (Aspect-Oriented Programming)

---

# Q. What is Spring?

Spring is an open-source Java framework used to develop the any kind of application .
It is called a **framework of frameworks** because it provides many modules like Spring Core, Spring MVC, Spring JDBC, Spring Security, etc.

Using Spring Framework we can develop:

* Desktop Applications
* Database Applications
* Web Applications
* Enterprise Applications
* Distributed Applications
* Microservices-based Applications

Spring is a very flexible and lightweight framework.

---

# Q. Why use Spring Framework / Benefits of Spring Framework?
 
## 1. Able to Develop Any Kind of Application

Using Spring Framework we can develop:

* Web applications
* Enterprise applications
* Distributed applications
* REST APIs
* Microservices

---

## 2. Lightweight Framework

Spring is lightweight because it uses:

* POJO (Plain Old Java Object)
* Modular Architecture 

---

## 3. Dependency Injection (DI)

Spring provides Dependency Injection which reduces tight coupling between classes.

### Without Spring Framework

We create objects manually using `new` keyword.

```java
Employee emp = new Employee();
emp.setId(1);
emp.setName("ABC");
```

---

### With Spring Framework

Spring automatically creates and manages objects called **Beans**.

### Benefits
 
* Easier Maintenance  
* Better Code Reusability
* Easier Testing 

---

## 4. Inversion of Control (IOC)

Spring Container (IOC Container) manages the lifecycle of objects.

Developer focuses only on business logic while Spring handles: 

* Object creation
* Dependency management 
* Configuration

---

## 5. Easy Database Integration

Spring simplifies database connectivity using:

* JDBC Template
* JPA
* Hibernate 

### Benefits 

* Less Boilerplate Code
* Better Exception Handling
* Easier Transaction Management

---

## 6. Spring Boot Support

Spring Boot is an advanced version of Spring Framework.

Features:

* Auto Configuration
* Embedded Server (Tomcat)
* Starter Dependencies

---
 
## 7. Microservices Supporty

Spring Boot + Spring Cloud help to develop Microservices easily.

---

## 8. REST API Development

Using Spring and Spring Boot we can develop REST APIs easily.

---

## 9. Security Support

Spring Security provides:

* Authentication
* Authorization
* JWT Token Support
* OAuth2 Support
* Role-based Access

---

# Q. What is Dependency Injection & Its Types?

Dependency Injection means one object depends on another object.

Example:
If one class requires another class object to work, it is called dependency injection. 

# Types of Dependency Injection

## 1. Setter Injection

Dependency is injected through setter methods.

```java
Employee emp = new Employee();
emp.setId(1);
emp.setName("ABC");
```

Spring internally calls the setter methods.

---

## 2. Constructor Injection

Dependency is injected through constructor arguments.

```java
public class Employee {

    public Employee(String name, int id) {
    }
}
```

```java
Employee emp = new Employee("ABC", 1);
```

Spring internally invokes the constructor and passes the required values.

---

## 3. Collection Dependency

When a collection object such as List, Set, or Queue is injected into a bean, it is called Collection Dependency.

```java 
private List<String> employees;
```

---

## 4. Map Dependency

When a Map object is injected into a bean, it is called Map Dependency.

```java
private Map<Integer, String> employees;
```

---

## 5. Object Dependency

When one bean depends on another bean object, it is called Object Dependency.

```java
class Employee {
}

class Company {

    private Employee employee;

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
```

---

## 6. Properties Dependency

When a `java.util.Properties` object is injected into a bean, it is called Properties Dependency.

Correct Example:

```java
private Properties properties;
```

# Modules in Spring Framework and Their Work
 
---

## 1. Spring Core

Spring Core is the fundamental module of the Spring Framework. It provides the basic features required for Spring applications.
 
Features: 

* Inversion of Control (IoC) 
* Dependency Injection (DI) 
* Bean Creation and Management
* Bean Lifecycle Management
* Configuration Management

Using Spring Core, we can develop standalone and console-based applications.

---

## 2. Spring JDBC

Spring JDBC is built on top of the JDBC API and simplifies database programming.

Features:

* JdbcTemplate
* NamedParameterJdbcTemplate
* Automatic Resource Management
* Exception Translation
* Transaction Support

Benefits:

* Less Boilerplate Code
* Better Exception Handling
* Easier Database Operations

---

## 3. Spring MVC

Spring MVC is a web framework used to develop web applications following the MVC (Model-View-Controller) architecture.

MVC Components:

* Model – Contains business data.
* View – Displays data to the user.
* Controller – Handles requests and responses.

Features:

* Request Mapping
* Form Handling
* Validation
* REST API Development

---

## 4. Spring Security

Spring Security provides authentication and authorization for applications.

Features:

* User Authentication
* User Authorization
* Password Encryption
* Role-Based Access Control
* JWT Authentication
* OAuth2 Integration
* Session Management

---

## 5. Spring AOP

AOP stands for Aspect-Oriented Programming.

It is used to separate cross-cutting concerns from business logic.

Examples:

* Logging
* Security
* Transaction Management
* Auditing
* Exception Handling 

---

## 6. Spring Boot

Spring Boot is built on top of the Spring Framework and reduces configuration effort.

Features:

* Auto Configurationl
* Embedded Servers (Tomcat, Jetty)
* Starter Dependencies
* Production-Ready Features
* Rapid Application Development

Benefits:

* Faster Development
* Minimal Configuration
* Easy Deployment

---

## 7. Spring Data JPA

Spring Data JPA simplifies database operations using JPA and ORM concepts.

Features:

* CRUD Operations
* Repository Interfaces
* Query Methods
* Pagination and Sorting
* Integration with Hibernate

Benefits:

* Less Database Code
* Faster Development
* Better Maintainability

---

# How to Create a Spring Framework Project

## Step 1: Create a Maven Project

Create a Maven project in your IDE (Eclipse, IntelliJ IDEA, or Spring Tool Suite).

---

## Step 2: Add Required Dependencies

Add the following dependencies in `pom.xml`.

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

</dependencies>
```

---

## Step 3: Create a POJO (Bean) Class

A POJO (Plain Old Java Object) is a simple Java class that contains properties, constructors, getter methods, and setter methods.

### Employee.java

```java
package org.techhub;

public class Employee {

    private int id;
    private String name;
    private int sal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public void show() {
        System.out.println(id + "\t" + name + "\t" + sal);
    }
}
```

---

# Bean Configuration

Spring Beans can be configured using:

1. XML Configuration
2. Annotation Configuration
3. Java Configuration

For learning Spring Core, XML configuration is commonly used.

---

# Configuring Bean Using XML

## Step 1: Create XML File

Create a file named `test.xml` inside:

```text
src/main/resources
```

---

## Step 2: Add Spring Configuration

```xml
<?xml version="1.0" encoding="UTF-8"?>

<!DOCTYPE beans PUBLIC
"-//SPRING//DTD BEAN 2.0//EN"
"https://www.springframework.org/dtd/spring-beans-2.0.dtd">

<beans>

</beans>
```

---

## What is the `<beans>` Tag?

 
The `<beans>` tag is the root element of a Spring configuration file. It contains one or more bean definitions.

```xml
<beans>

</beans>
```

---

## What is the `<bean>` Tag?

The `<bean>` tag is used to configure a Java class as a Spring Bean.

### Syntax

```xml
<bean id="e" class="org.techhub.Employee">

</bean>
```

### Description

| Attribute | Description                   |
| --------- | ----------------------------- |
| id        | Unique identifier of the bean |
| class     | Fully qualified class name    |

---

## What is the `<property>` Tag?

The `<property>` tag is used for Setter Injection.

### Syntax

```xml
<property name="name" value="RAM"/>
```

Spring internally calls:

```java
employee.setName("RAM");
```

### Attributes

| Attribute | Description                   |
| --------- | ----------------------------- |
| name      | Property name (setter method) |
| value     | Value to be assigned          |

---

## Complete XML Configuration

### test.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>

<!DOCTYPE beans PUBLIC
"-//SPRING//DTD BEAN 2.0//EN"
"https://www.springframework.org/dtd/spring-beans-2.0.dtd">

<beans>

    <bean id="e"
          class="org.techhub.Employee">

        <property name="id" value="1"/>
        <property name="name" value="RAM"/>
        <property name="sal" value="10000"/>

    </bean>

</beans>
```

---

# Spring Container

A Spring Container is responsible for:

* Creating Beans
* Managing Beans
* Injecting Dependencies
* Managing Bean Lifecycle
* Managing Bean Scope

Types of Spring Containers:

### 1. BeanFactory

* Basic Container
* Lazy Initialization
* Lightweight 

### 2. ApplicationContext

* Advanced Container
* Supports Events   
* Supports Internationalization
* Supports Annotation-Based Configuration

ApplicationContext is commonly used in modern Spring applications.

---

# Creating Client Application

The Client Application contains the `main()` method and starts the Spring Container.

### ClientApplication.java

```java
package org.techhub;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApplication {

    public static void main(String[] args) {

        // Create Spring IoC Container and load test.xml
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("test.xml");

        // Retrieve Employee bean from the container
        Employee e = (Employee) context.getBean("e");

        // Call business method
        e.show();

        // Close the container
        context.close();
    }
}
```

---
 
# How `getBean()` Works

```java
Employee e = (Employee) context.getBean("e");
```

Explanation:

1. Spring searches for Bean ID `"e"`.
2. If the bean does not exist, Spring throws an exception.
3. If the bean exists, Spring returns the object.
4. The object is type-cast to `Employee`.

<?xml version="1.0" encoding="UTF-8"?>

<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN"
"http://www.springframework.org/dtd/spring-beans-2.0.dtd">

<beans>

    <bean id="e" class="org.techhub.Employee">

        <property name="id" value="1"/>
        <property name="name" value="RAM"/>
        <property name="sal" value="10000"/>

    </bean>

</beans>

Internally Spring performs:

```java
Employee e = new Employee();
e.setId(1);
e.setName("RAM");
e.setSal(10000);
```
and returns the fully initialized object from the IoC Container.



# Setter Injection (Setter Dependency Injection)

## Definition

**Setter Injection** is a type of **Dependency Injection (DI)** in which the Spring IoC Container injects values or dependent objects into a bean by calling its **setter methods**.

In Setter Injection, the bean must provide **public setter methods** for all the properties that need to be injected.

--- 

# Steps to Develop the Application

### Step 1: Create a Maven Project

Create a Maven project in your IDE (STS/Eclipse/IntelliJ).

---

### Step 2: Add Required Dependencies

Add the following Spring dependencies in `pom.xml`.

```xml
<dependencies>

    <!-- Spring Core -->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-core</artifactId>
        <version>6.2.8</version>
    </dependency>

    <!-- Spring Context -->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>6.2.8</version>
    </dependency>

</dependencies>
```

---

## Step 3: Create POJO (Bean Class)

**Player.java**

```java
package org.techhub;

public class Player {

    private int id;
    private String name;
    private int run;

    public Player() {
        System.out.println("Player Object Created");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }
}
```

---

## Step 4: Configure Bean in XML

Create **player.xml** inside the `src/main/resources` folder.

```xml
<?xml version="1.0" encoding="UTF-8"?>

<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN"
"https://www.springframework.org/dtd/spring-beans-2.0.dtd">

<beans>

    <bean id="p" class="org.techhub.Player">

        <property name="id" value="1"/>

        <property name="name" value="Virat"/>

        <property name="run" value="12000"/>

    </bean>

</beans>
```

### Explanation

* `id` → Bean ID
* `class` → Fully Qualified Class Name
* `<property>` → Used for Setter Injection.
* `name` → Setter method property name.
* `value` → Value injected by Spring Container.

---

## Step 5: Create Client Application

**PlayerClientApplication.java**

```java
package org.techhub;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlayerClientApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("player.xml");

        Player player = (Player) context.getBean("p");

        System.out.println(player.getId() + "\t"
                + player.getName() + "\t"
                + player.getRun());

        context.close();
    }
}
```

---

# Output

```
Player Object Created
1    Virat    12000
```

---

# How Setter Injection Works

When the Spring Container starts:

1. Reads the XML configuration.
2. Creates the `Player` object using the default constructor.
3. Calls `setId(1)`.
4. Calls `setName("Virat")`.
5. Calls `setRun(12000)`.
6. Stores the bean in the IoC Container.
7. Returns the bean when `getBean("p")` is called.
---

# Advantages of Setter Injection

* Easy to understand and implement.
* Supports optional properties.
* Values can be modified after object creation.
* Improves loose coupling.
* Easy to test.

---

# Disadvantages of Setter Injection

* Object may remain partially initialized if some setters are not called.
* Dependencies are mutable (can be changed after object creation).
* Not suitable when all dependencies are mandatory.

---

# Interview Questions

### 1. What is Setter Injection?

Setter Injection is a Dependency Injection technique in which Spring injects values or dependent objects into a bean using setter methods.

---

### 2. Which XML tag is used for Setter Injection?

```xml
<property>
```

---

### 3. Which method is called during Setter Injection?

Spring calls the setter methods such as:

```java
setId()
setName()
setRun()
```

---

### 4. Is the default constructor required?

**Yes.** Spring first creates the object using the default (no-argument) constructor and then injects values through the setter methods.

---

### 5. Which is better: Constructor Injection or Setter Injection?

* **Constructor Injection:** Best for mandatory dependencies because it ensures the object is fully initialized.
* **Setter Injection:** Best for optional dependencies because properties can be set or changed after object creation.

---

---

# Constructor Dependency Injection (Constructor Injection)

## Definition

> **When Spring creates an object using a constructor and passes the required parameters automatically, it is called Constructor Dependency Injection.**

---

## Important Note

### Case 1: Default Constructor

If a bean class contains **only a default (no-argument) constructor**, the Spring container automatically calls it while creating the object.

In this case, the developer **does not need to configure `<constructor-arg>`**.

---

# Example 1 : Constructor Injection using Default Constructor

## Test.java

```java
package org.techhub;

public class Test 
{
    public Test() 
    {
        System.out.println("I am Default Constructor");
    }
}
```

---

## player.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>

<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN"
"https://www.springframework.org/dtd/spring-beans-2.0.dtd">

<beans>

    <bean id="t" class="org.techhub.Test"/>

</beans>
```

---

## ConstructorInjectApplication.java

```java
package org.techhub;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("player.xml");

        Test t = (Test) context.getBean("t");

        context.close();
    }
}
```

---

## Internal Working

When

```java
context.getBean("t");
```

is executed, Spring internally creates the object as

```java
new Test();
```

Therefore the output is

```
I am Default Constructor
```

---

# Important Point

Suppose the class contains **only a parameterized constructor**.

Example

```java
public class Test {

    public Test(int x) {
        System.out.println(x);
    }
}
```

and XML configuration is

```xml
<bean id="t" class="org.techhub.Test"/>
```

Now when Spring tries to create the object,

```java
context.getBean("t");
```

it searches for a default constructor.

Since **no default constructor exists**, Spring **cannot create the object** and throws a **BeanCreationException** at runtime.

Therefore, whenever a class has only parameterized constructors, we must configure constructor arguments using **`<constructor-arg>`**.

---

# How to Pass Parameters to Constructor using XML

Spring provides the **`<constructor-arg>`** tag.

Syntax

```xml
<constructor-arg
        value="..."
        type="..."
        index="..."/>
```

### Attributes

| Attribute | Description                                       |
| --------- | ------------------------------------------------- |
| value     | Value to be passed to constructor                 |
| type      | Data type of constructor parameter                |
| index     | Position of constructor parameter (starts from 0) |
| ref       | Used to pass another bean object                  |

---

# Example 2 : Constructor Injection using Parameterized Constructor

## Test.java

```java
package org.techhub;

public class Test {

    public Test(int x) {

        System.out.println("I am Parameterized Constructor : " + x);
    }
}
```

---

## player.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>

<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN"
"https://www.springframework.org/dtd/spring-beans-2.0.dtd">

<beans>

    <bean id="t" class="org.techhub.Test">

        <constructor-arg type ="int" value="100"/>

    </bean>

</beans>
```

> Since there is only one `int` parameter, specifying `type` or `index` is optional.

---

## ConstructorInjectApplication.java

```java
package org.techhub;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("player.xml");

        Test t = (Test) context.getBean("t");

        context.close();
    }
}
```

---

## Internal Working

Spring internally creates the object as

```java
new Test(100);
```

Output

```
I am Parameterized Constructor : 100
```

---

# Interview Questions

### Q2. When is `<constructor-arg>` required?

**Answer:**

`<constructor-arg>` is required when a bean class has a parameterized constructor and Spring needs values or object references to create the object.

---

### Q3. What happens if a class has only a parameterized constructor but no `<constructor-arg>` is configured?

**Answer:**

Spring cannot find a matching constructor, so it throws a **BeanCreationException** at runtime.

---

# 3. Field Dependency Injection

## Definition 

Field Dependency Injection means the Spring IoC Container injects the dependency **directly into the field (instance variable)** using annotations such as `@Autowired`.

The developer does **not** need to create a constructor or setter method.

---

## Example

### Department.java

```java
package org.techhub;

import org.springframework.stereotype.Component;

@Component
public class Department {

    public void display() {
        System.out.println("Department Object Created");
    }
}
```

---

### Employee.java

```java
package org.techhub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    @Autowired
    private Department department;

    public void show() {
        department.display();
    }
}
```

---

### Main Class

```java
package org.techhub;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Employee emp = context.getBean(Employee.class);
        emp.show();
    }
}
```

---

### AppConfig.java

```java
package org.techhub;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.techhub")
public class AppConfig {

}
```

---

## How It Works

1. Spring creates the `Department` bean.
2. Spring creates the `Employee` bean.
3. Spring finds the `@Autowired` annotation.
4. Spring injects the `Department` object directly into the `department` field.
5. The `show()` method uses the injected object.

---

## Advantages

* Very little code.
* No need to write setter methods or constructors.
* Easy and quick to implement.

---

## Disadvantages

* Creates tight coupling with the Spring Framework.
* Dependencies are hidden, making the class harder to understand.
* Difficult to write unit tests without Spring.
* Does not support immutable objects.

---

# Comparison of All Three Types

| Feature          | Setter Injection                       | Constructor Injection                              | Field Injection                     |
| ---------------- | -------------------------------------- | -------------------------------------------------- | ----------------------------------- |
| Injection Method | Setter method                          | Constructor                                        | Directly into field                 |
| Annotation/XML   | `<property>` or `@Autowired` on setter | `<constructor-arg>` or `@Autowired` on constructor | `@Autowired` on field               |
| Dependency Type  | Optional                               | Mandatory                                          | Usually mandatory                   |
| Testability      | Good                                   | Excellent                                          | Poor                                |
| Immutability     | No                                     | Yes                                                | No                                  |
| Recommended      | For optional dependencies              | ✅ Best practice                                   | Not recommended for production code |

### Interview Note

There are **three commonly used dependency injection types** in Spring:

1. **Setter Dependency Injection**
2. **Constructor Dependency Injection** ✅ (Most recommended)
3. **Field Dependency Injection** (`@Autowired` on fields)

---


# Collection Dependencies in Spring

---

## What is Collection Dependency?

Collection Dependency means injecting a **collection object** such as **List, Set, Map, or Properties** into a Spring bean through the Spring IoC Container.

A collection can be injected either:

* Using **Setter Injection**
* Using **Constructor Injection**

**Definition**

> Collection Dependency Injection is the process of injecting collection objects (List, Set, Map, or Properties) into a Spring bean using Setter Injection or Constructor Injection.

---

# Collection Injection using Setter Injection

---

## Syntax

```xml
<bean id="ref" class="classname">

    <property name="propertyName">

        <collection>

            <value>value1</value>
            <value>value2</value>
            <value>value3</value>

        </collection>

    </property>

</bean>
```

**Note:**

* `<collection>` is not an actual XML tag.
* Replace it with one of the following:

  * `<list>`
  * `<set>`
  * `<map>`
  * `<props>`

depending on the collection type.

---

# Example 1 : List Dependency Injection

---

## Employee.java

```java
package org.techhub;

import java.util.List;

public class Employee {

    private List<String> names;

    public void setNames(List<String> names) {
        this.names = names;
    }

    public void showList() {

        System.out.println("Employee Names");

        for(String n : names) {
            System.out.println(n);
        }
    }
}
```

---

## test.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>

<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN"
"https://www.springframework.org/dtd/spring-beans-2.0.dtd">

<beans>

    <bean id="e" class="org.techhub.Employee">

        <property name="names">

            <list>

                <value>ABC</value>
                <value>MNO</value>
                <value>PQR</value>
                <value>ABC</value>

            </list>

        </property>

    </bean>

</beans>
```

---

## ClientApplication.java

```java
package org.techhub;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("test.xml");

        Employee emp = (Employee)context.getBean("e");

        emp.showList();

        context.close();
    }
}
```

---

## Output

```
Employee Names

ABC
MNO
PQR
ABC
```

### Explanation

The Spring IoC Container creates the Employee object.
It creates a List and stores all the values defined inside the <list> tag.
The List is injected into the Employee bean by calling the setNames() setter method.
Finally, when the showList() method is called, all the values stored in the List are displayed.
Since a List allows duplicate elements, the value ABC is printed twice.

---

# Example 2 : Set Dependency Injection

---

## Dept.java

```java
package org.techhub;

import java.util.Set;

public class Dept {

    private Set<String> deptNames;

    public void setDeptNames(Set<String> deptNames) {
        this.deptNames = deptNames;
    }

    public void showDeptList() {

        System.out.println("Department Names");

        for(String dept : deptNames) {
            System.out.println(dept);
        }
    }
}
```

---

## test.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>

<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN"
"https://www.springframework.org/dtd/spring-beans-2.0.dtd">

<beans>

    <bean id="d" class="org.techhub.Dept">

        <property name="deptNames">

            <set>

                <value>HR</value>
                <value>DEV</value>
                <value>PROD</value>
                <value>HR</value>

            </set>

        </property>

    </bean>

</beans>
```

---

## ClientApplication.java

```java
package org.techhub;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("test.xml");

        Dept dept = (Dept)context.getBean("d");

        dept.showDeptList();

        context.close();
    }
}
```

---

## Output

```
Department Names

HR
DEV
PROD
```

### Explanation

* Spring creates a Set object.
* Values are inserted into the Set.
* Duplicate values are automatically removed.
* Therefore **HR** is printed only once.

---

# Map Dependency Injection

---

## What is Map Dependency?

Map Dependency means injecting a **Map** object into a Spring bean using either Setter Injection or Constructor Injection.

Each element of the map consists of a **key-value pair**.

---

## Syntax

```xml
<bean id="ref" class="classname">

    <property name="propertyName">

        <map>

            <entry key="key1" value="value1"/>
            <entry key="key2" value="value2"/>

        </map>

    </property>

</bean>
```

---

# Example : Map Injection using Setter Injection

---

## Dept.java

```java
package org.techhub;

import java.util.Map;
import java.util.Set;

public class Dept {

    private Map<Integer,String> dept;

    public void setDept(Map<Integer,String> dept) {
        this.dept = dept;
    }

    public void showList() {

        Set<Map.Entry<Integer,String>> set = dept.entrySet();

        for(Map.Entry<Integer,String> entry : set) {

            System.out.println(entry.getKey() + "\t" + entry.getValue());

        }
    }
}
```

---

## test.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>

<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN"
"https://www.springframework.org/dtd/spring-beans-2.0.dtd">

<beans>

    <bean id="d" class="org.techhub.Dept">

        <property name="dept">

            <map>

                <entry key="1" value="HR"/>
                <entry key="2" value="DEV"/>
                <entry key="3" value="PROD"/>

            </map>

        </property>

    </bean>

</beans>
```

---

## ClientApplication.java

```java
package org.techhub;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("test.xml");

        Dept dept = (Dept)context.getBean("d");

        dept.showList();

        context.close();
    }
}
```

---

## Output

```
1    HR
2    DEV
3    PROD
```

### Explanation

* Spring creates a Map object.
* Each `<entry>` represents one key-value pair.
* The Map is injected into the bean using the `setDept()` method.
* The `entrySet()` method is used to iterate through the map entries.

---

# Difference Between List, Set and Map Injection

---

| List                      | Set                                | Map                              |
| ------------------------- | ---------------------------------- | -------------------------------- |
| Uses `<list>`             | Uses `<set>`                       | Uses `<map>`                     |
| Stores only values        | Stores only values                 | Stores key-value pairs           |
| Allows duplicate values   | Does not allow duplicate values    | Keys must be unique              |
| Maintains insertion order | Does not guarantee insertion order | Stores data as key-value mapping |

---

# Interview Questions

---

**1. What is Collection Dependency Injection?**

Collection Dependency Injection is the process of injecting collection objects such as **List, Set, Map, or Properties** into a Spring bean using Setter Injection or Constructor Injection.

**2. Which collection types can Spring inject?**

* List
* Set
* Map
* Properties

**3. Which XML tags are used for collection injection?**

* `<list>`
* `<set>`
* `<map>`
* `<props>`

**4. What is the difference between List and Set injection?**

* **List** allows duplicate values and maintains insertion order.
* **Set** does not allow duplicate values.

**5. What is Map Dependency Injection?**

Map Dependency Injection is the process of injecting a `Map<K, V>` object into a Spring bean, where data is stored as **key-value pairs**.

**6. Which XML tag is used to add entries into a Map?**

The `<entry>` tag is used inside the `<map>` tag.

**7. Can Collection Dependency Injection be performed using Constructor Injection?**

Yes. Spring supports both **Setter Injection** and **Constructor Injection** for injecting collections.


Your notes are mostly correct, but there are a few grammatical mistakes and one important conceptual mistake. Here's a cleaner and technically accurate version that is suitable for exams and interviews.

---

# Object Dependency in Spring

---

## Definition

**Object Dependency** means when **one class depends on another class object** to perform its work.

In other words, if one class requires an object of another class, it is called **Object Dependency**.

For example:

```java
public class Courier {

    private Parcel parcel;

    public void setParcel(Parcel parcel) {
        this.parcel = parcel;
    }
}
```

Here, the `Courier` class depends on the `Parcel` object.

---

# Definition (Simple)

Object Dependency means **passing one class object as a parameter to another class through a constructor or setter method**.

For example:

```java
public void setParcel(Parcel parcel)
```

or

```java
public Courier(Parcel parcel)
```

Both represent **object dependency**.

---

# Important Terms

## 1. Target Class

The **Target Class** is the class **that uses another class object**.

It is the class into which the dependency is injected.

### Example

```java
public class Courier {

    private Parcel parcel;
}
```

Here,

* **Courier** → Target Class
* Because it uses the `Parcel` object.

---

## 2. Dependent Class

The **Dependent Class** is the class **whose object is injected into the target class**.

### Example

```java
public class Parcel {
}
```

Here,

* **Parcel** → Dependent Class


---

# Example

```java
public class Parcel {

}
```

```java
public class Courier {

    private Parcel parcel;

    public void setParcel(Parcel parcel) {
        this.parcel = parcel;
    }
}
```

Relationship

```
Parcel  --------->  Courier
(object injected)     (uses Parcel)

Dependent Class       Target Class
```

---

# Managing Object Dependency Using Spring XML

Spring manages object dependency using the **`ref` attribute**.

```xml
<bean id="p" class="org.techhub.objdep.Parcel"/>

<bean id="c" class="org.techhub.objdep.Courier">
    <property name="parcel" ref="p"/>
</bean>
```

### Explanation

1. Spring creates the `Parcel` bean.
2. Spring creates the `Courier` bean.
3. Spring injects the `Parcel` bean into the `parcel` property using the setter method.
4. The `Courier` object can now use the `Parcel` object.

---

# Example 2
---

## Company.java

```java
package org.techhub.objdep;

public class Company {

    private String name;
    private String TAN;
    private String PAN;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTAN() {
        return TAN;
    }

    public void setTAN(String TAN) {
        this.TAN = TAN;
    }

    public String getPAN() {
        return PAN;
    }

    public void setPAN(String PAN) {
        this.PAN = PAN;
    }
}
```

---

## MSME.java (Constructor Injection)

```java
package org.techhub.objdep;

public class MSME {

    private Company company; //O D

    // Parameterized Constructor
    public MSME(Company company) {
        this.company = company;
    }

    public void showCompanyDetails() {
        System.out.println(
            company.getName() + "\t" +
            company.getTAN() + "\t" +
            company.getPAN()
        );
    }
}
```

Here, the constructor parameter

```java
public MSME(Company company)
```

is the **dependency** that Spring will inject.

---

## test.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN"
    "https://www.springframework.org/dtd/spring-beans-2.0.dtd">

<beans>

    <bean id="comp" class="org.techhub.objdep.Company">
        <property name="name" value="XYZ"/>
        <property name="TAN" value="ABC123MNOP"/>
        <property name="PAN" value="11223344"/>
    </bean>

    <bean id="m" class="org.techhub.objdep.MSME">
        <constructor-arg ref="comp"/>
    </bean>

</beans>
```

The important line is:

```xml
<constructor-arg ref="comp"/>
```

Spring passes the `Company` bean (`comp`) as the constructor parameter.

---

## ClientApplication.java

```java
package org.techhub;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.techhub.objdep.MSME;

public class ClientApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("test.xml");

        MSME m = (MSME)context.getBean("m");

        m.showCompanyDetails();
    }
}
```

---

### Output

```
XYZ    ABC123MNOP    11223344
```

### Flow

1. Spring creates the `Company` bean (`comp`).
2. Spring creates the `MSME` bean.
3. Spring calls:

```java
new MSME(companyObject);
```

4. The `Company` object is injected through the constructor.
5. `showCompanyDetails()` prints the company information.

This is **constructor dependency injection with object dependency**.


---

# Autowiring in Spring

## Definition

**Autowiring** is a feature of the Spring IoC Container that **automatically injects dependent objects into the target class**, so the developer does not need to specify the dependency manually using `ref`.

Without autowiring:

```xml
<bean id="company" class="org.techhub.objdep.Company"/>

<bean id="m" class="org.techhub.objdep.MSME">
    <property name="company" ref="company"/>
</bean>
```

With autowiring:

```xml
<bean id="company" class="org.techhub.objdep.Company"/>

<bean id="m" class="org.techhub.objdep.MSME" autowire="byType"/>
```

Spring automatically injects the `Company` object.

---

# Why do we need Autowiring?

Suppose we write

```java
public class MSME {

    private Company company;

    public void showCompanyDetails() {
        System.out.println(company.getName());
    }
}
```

and XML

```xml
<bean id="company" class="org.techhub.objdep.Company"/>

<bean id="m" class="org.techhub.objdep.MSME"/>
```

Since no dependency is injected,

```java
company == null
```

Calling

```java
company.getName();
```

throws

```
java.lang.NullPointerException
```

Autowiring solves this problem by automatically injecting the dependency.

---

# Types of XML Autowiring

## 1. byType

Spring matches the **property name** with the **bean class**.

Spring IoC Container searches for a bean whose type (class) matches the type of the property in the target class. If exactly one matching bean is found, Spring automatically injects it.
Example

```java
private Company company;
```

XML

```xml
<bean id="comp" class="org.techhub.objdep.Company"/>

<bean id="m"
      class="org.techhub.objdep.MSME"
      autowire="byType"/>
```

Spring sees

```
Company company;
```

and injects the bean whose class is `Company`.

**Condition**

There must be **only one bean of that type**.


### **Company.java**

```java
package org.techhub.objdep;

public class Company {

    private String name;
    private String TAN;
    private String PAN;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTAN() {
        return TAN;
    }

    public void setTAN(String TAN) {
        this.TAN = TAN;
    }

    public String getPAN() {
        return PAN;
    }

    public void setPAN(String PAN) {
        this.PAN = PAN;
    }
}
```

---

### **MSME.java**

```java
package org.techhub.objdep;

public class MSME {

    private Company company;

    public void setCompany(Company company) {
        this.company = company;
    }

    public Company getCompany() {
        return company;
    }

    public void showCompanyDetails() {
        System.out.println(System.identityHashCode(company));
        System.out.println(company.getName() + "\t"
                + company.getTAN() + "\t"
                + company.getPAN());
    }
}
```

---

### **test.xml**

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN"
        "https://www.springframework.org/dtd/spring-beans-2.0.dtd">

<beans>

    <bean id="comp" class="org.techhub.objdep.Company">
        <property name="name" value="XYZ"/>
        <property name="TAN" value="ABC123MNOP"/>
        <property name="PAN" value="11223344"/>
    </bean>

    <bean id="m"
          class="org.techhub.objdep.MSME"
          autowire="byType"/>

</beans>
```

---

### **ClientApplication.java**

```java
package org.techhub;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.techhub.objdep.MSME;

public class ClientApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("test.xml");

        MSME m = (MSME) context.getBean("m");

        m.showCompanyDetails();

        context.close();
    }
}
```

### **Output**

```text
989110044
XYZ    ABC123MNOP    11223344
```

> **Note:** The value printed by `System.identityHashCode(company)` is the memory identity hash code and will be different each time you run the program.


---

## 2. byName

Spring matches the **property name** with the **bean id**.

Example

```java
private Company company;
```

Bean id must also be

```xml
<bean id="company"
      class="org.techhub.objdep.Company"/>
```

Then

```xml
<bean id="m"
      class="org.techhub.objdep.MSME"
      autowire="byName"/>
```

works correctly.

If the bean id is

```xml
id="comp"
```

then autowiring byName fails because

```
company != comp
```

For **Autowiring byName**, the **reference variable name** in the target class and the **bean id** in XML **must be the same**.

---

## Company.java

```java
package org.techhub.objdep;

public class Company {

    private String name;
    private String TAN;
    private String PAN;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTAN() {
        return TAN;
    }

    public void setTAN(String TAN) {
        this.TAN = TAN;
    }

    public String getPAN() {
        return PAN;
    }

    public void setPAN(String PAN) {
        this.PAN = PAN;
    }
}
```

---

## MSME.java

```java
package org.techhub.objdep;

public class MSME {

    private Company company;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void showCompanyDetails() {
        System.out.println(System.identityHashCode(company));
        System.out.println(company.getName() + "\t"
                + company.getTAN() + "\t"
                + company.getPAN());
    }
}
```

---

## test.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN"
        "https://www.springframework.org/dtd/spring-beans-2.0.dtd">

<beans>

    <!-- Bean id must be same as the property name -->
    <bean id="company" class="org.techhub.objdep.Company">
        <property name="name" value="XYZ"/>
        <property name="TAN" value="ABC123MNOP"/>
        <property name="PAN" value="11223344"/>
    </bean>

    <bean id="m"
          class="org.techhub.objdep.MSME"
          autowire="byName"/>

</beans>
```

---

## ClientApplication.java

```java
package org.techhub;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.techhub.objdep.MSME;

public class ClientApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("test.xml");

        MSME m = (MSME) context.getBean("m");

        m.showCompanyDetails();

        context.close();
    }
}
```

---

## Output

```text
12345678
XYZ    ABC123MNOP    11223344
```

---

## 3. constructor

Spring injects dependencies using the constructor.

```java
public class MSME {

    private Company company;

    public MSME(Company company) {
        this.company = company;
    }
}
```

XML

```xml
<bean id="company"
      class="org.techhub.objdep.Company"/>

<bean id="m"
      class="org.techhub.objdep.MSME"
      autowire="constructor"/>
```

Spring internally performs

```java
new MSME(companyObject);
```

## Constructor Autowiring Example

### Company.java

```java
package org.techhub.objdep;

public class Company {

    private String name;
    private String TAN;
    private String PAN;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTAN() {
        return TAN;
    }

    public void setTAN(String TAN) {
        this.TAN = TAN;
    }

    public String getPAN() {
        return PAN;
    }

    public void setPAN(String PAN) {
        this.PAN = PAN;
    }
}
```

---

### MSME.java

```java
package org.techhub.objdep;

public class MSME {

    private Company company;

    // Constructor Injection
    public MSME(Company company) {
        System.out.println("I am Constructor");
        this.company = company;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void showCompanyDetails() {
        System.out.println(System.identityHashCode(company));
        System.out.println(company.getName() + "\t"
                + company.getTAN() + "\t"
                + company.getPAN());
    }
}
```

---

### test.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN"
        "https://www.springframework.org/dtd/spring-beans-2.0.dtd">

<beans>

    <bean id="company" class="org.techhub.objdep.Company">
        <property name="name" value="XYZ"/>
        <property name="TAN" value="ABC123MNOP"/>
        <property name="PAN" value="11223344"/>
    </bean>

    <bean id="m"
          class="org.techhub.objdep.MSME"
          autowire="constructor"/>

</beans>
```

---

### ClientApplication.java

```java
package org.techhub;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.techhub.objdep.MSME;

public class ClientApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("test.xml");

        MSME m = (MSME) context.getBean("m");

        m.showCompanyDetails();

        context.close();
    }
}
```

---

## Output

```text
I am Constructor
12345678
XYZ    ABC123MNOP    11223344
```

> **Note:** `12345678` is the output of `System.identityHashCode(company)` and will be different on every execution.

---

## How `autowire="constructor"` Works

1. Spring creates the `Company` bean.
2. Spring creates the `MSME` bean.
3. Spring finds the constructor:

```java
public MSME(Company company)
```

4. Spring searches for a bean of type `Company`.
5. It finds:

```xml
<bean id="company" class="org.techhub.objdep.Company"/>
```

6. Spring internally executes:

```java
Company comp = new Company();
comp.setName("XYZ");
comp.setTAN("ABC123MNOP");
comp.setPAN("11223344");

MSME m = new MSME(comp);
```

7. The constructor receives the `Company` object automatically, so the `company` field is initialized and `showCompanyDetails()` prints the details successfully.

---

# 4. no (default)
 
If you want **`autowire="default"`**, then your `MSME` class **must have a default constructor** and you must **inject the dependency manually** using `<property ref="..."/>`. Otherwise, Spring cannot inject the `Company` object.

---

## Company.java

```java
package org.techhub.objdep;

public class Company {

    private String name;
    private String TAN;
    private String PAN;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTAN() {
        return TAN;
    }

    public void setTAN(String TAN) {
        this.TAN = TAN;
    }

    public String getPAN() {
        return PAN;
    }

    public void setPAN(String PAN) {
        this.PAN = PAN;
    }
}
```

---

## MSME.java

```java
package org.techhub.objdep;

public class MSME {

    private Company company;

    // Default Constructor
    public MSME() {
        System.out.println("Default Constructor Called");
    }

    public Company getCompany() {
        return company;
    }

    // Setter Injection
    public void setCompany(Company company) {
        this.company = company;
    }

    public void showCompanyDetails() {
        System.out.println(System.identityHashCode(company));
        System.out.println(company.getName() + "\t"
                + company.getTAN() + "\t"
                + company.getPAN());
    }
}
```

---

## test.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN"
        "https://www.springframework.org/dtd/spring-beans-2.0.dtd">

<beans>

    <bean id="company" class="org.techhub.objdep.Company">
        <property name="name" value="XYZ"/>
        <property name="TAN" value="ABC123MNOP"/>
        <property name="PAN" value="11223344"/>
    </bean>

    <bean id="m" class="org.techhub.objdep.MSME" autowire="default">
        <property name="company" ref="company"/>
    </bean>

</beans>
```

---

## ClientApplication.java

```java
package org.techhub;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.techhub.objdep.MSME;

public class ClientApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("test.xml");

        MSME m = (MSME) context.getBean("m");

        m.showCompanyDetails();

        context.close();
    }
}
```

---

## Output

```text
Default Constructor Called
989110044
XYZ    ABC123MNOP    11223344
```
---

### Important Note

`autowire="default"` **does not automatically inject dependencies**. It behaves like **no autowiring** unless a default autowire mode is configured for the `<beans>` element. Therefore, you **must** use:

```xml
<property name="company" ref="company"/>
```

or

```xml
<constructor-arg ref="company"/>
```

to inject the dependency manually.

---
# 5. autodetect

Your example is from **old Spring (Spring 2.x/3.x)**. **`autowire="autodetect"` has been deprecated and removed** in modern Spring versions. It is **not supported** in Spring 4 and later.

If you are studying from old notes, then the following code is correct.

---

## Company.java

```java
package org.techhub.objdep;

public class Company {

    private String name;
    private String TAN;
    private String PAN;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTAN() {
        return TAN;
    }

    public void setTAN(String TAN) {
        this.TAN = TAN;
    }

    public String getPAN() {
        return PAN;
    }

    public void setPAN(String PAN) {
        this.PAN = PAN;
    }
}
```

---

## MSME.java

```java
package org.techhub.objdep;

public class MSME {

    private Company company;

    public MSME(Company company) {
        System.out.println("I am Constructor");
        this.company = company;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void showCompanyDetails() {
        System.out.println(System.identityHashCode(company));
        System.out.println(company.getName() + "\t"
                + company.getTAN() + "\t"
                + company.getPAN());
    }
}
```

---

## test.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN"
        "https://www.springframework.org/dtd/spring-beans-2.0.dtd">

<beans>

    <bean id="company" class="org.techhub.objdep.Company">
        <property name="name" value="XYZ"/>
        <property name="TAN" value="ABC123MNOP"/>
        <property name="PAN" value="11223344"/>
    </bean>

    <bean id="m"
          class="org.techhub.objdep.MSME"
          autowire="autodetect"/>

</beans>
```

---

## ClientApplication.java

```java
package org.techhub;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.techhub.objdep.MSME;

public class ClientApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("test.xml");

        MSME m = (MSME) context.getBean("m");

        m.showCompanyDetails();

        context.close();
    }
}
```

---

## Output

```text
I am Constructor
12345678
XYZ    ABC123MNOP    11223344
```

*(The hash code will be different on every run.)*

---

## How `autowire="autodetect"` Works (Old Spring)

1. Spring creates the `Company` bean.
2. Spring creates the `MSME` bean.
3. It checks whether `MSME` has a **parameterized constructor**.
4. Since it finds:

```java
public MSME(Company company)
```

it performs **constructor autowiring** and internally executes:

```java
Company company = new Company();

company.setName("XYZ");
company.setTAN("ABC123MNOP");
company.setPAN("11223344");

MSME m = new MSME(company);
```

5. If no suitable constructor were found, Spring would fall back to **byType** autowiring.

> **Note:** `autowire="autodetect"` is **deprecated and removed** in modern Spring. For new applications, use `autowire="constructor"` in XML or, preferably, annotation-based constructor injection with `@Autowired` (or a single constructor without `@Autowired`).

---

# Bean Scope in Spring

## Definition

**Bean Scope** defines **how many objects of a bean Spring IoC Container creates and how long those objects live**.

In other words, bean scope determines:

* **How many bean objects are created**
* **The lifecycle of the bean**

> **Note:** By default, every Spring bean has **singleton** scope.

---

# Syntax

```xml
<bean id="beanId"
      class="packageName.ClassName"
      scope="scopeType"/>
```

---

# Types of Bean Scope

## 1. Singleton Scope (Default)
   
### Definition
   
**Singleton** is the default scope in Spring.
 
In singleton scope, **Spring creates only one object** of the bean for the entire IoC Container.

Whenever `getBean()` is called, Spring returns **the same object**.

---

### MSME.java

```java
package org.techhub.objdep;

public class MSME {

    public MSME() {
        System.out.println("Constructor Called");
    }
}
```

---

### test.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN"
        "https://www.springframework.org/dtd/spring-beans-2.0.dtd">

<beans>

    <bean id="m"
          class="org.techhub.objdep.MSME"
          scope="singleton"/>

</beans>
```

---

### ClientApplication.java

```java
package org.techhub;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.techhub.objdep.MSME;

public class ClientApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("test.xml");

        MSME m1 = (MSME)context.getBean("m");
        MSME m2 = (MSME)context.getBean("m");
        MSME m3 = (MSME)context.getBean("m");
        MSME m4 = (MSME)context.getBean("m");

        System.out.println("m1 : " + System.identityHashCode(m1));
        System.out.println("m2 : " + System.identityHashCode(m2));
        System.out.println("m3 : " + System.identityHashCode(m3));
        System.out.println("m4 : " + System.identityHashCode(m4));

        context.close();
    }
}
```

---

### Output

```
Constructor Called

m1 : 12345678
m2 : 12345678
m3 : 12345678
m4 : 12345678
```

**Constructor executes only once** because only **one object** is created.

---

# Internal Flow

```
Spring Container
      │
      ▼
Creates MSME Object
      │
      ▼
Stores Object
      │
      ▼
getBean() → Same Object
getBean() → Same Object
getBean() → Same Object
```

---

# 2. Prototype Scope

### Definition

If the bean scope is **prototype**, Spring creates **a new object every time `getBean()` is called**.

---

### MSME.java

```java
package org.techhub.objdep;

public class MSME {

    public MSME() {
        System.out.println("Constructor Called");
    }
}
```

---

### test.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN"
        "https://www.springframework.org/dtd/spring-beans-2.0.dtd">

<beans>

    <bean id="m"
          class="org.techhub.objdep.MSME"
          scope="prototype"/>

</beans>
```

---

### ClientApplication.java

```java
package org.techhub;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.techhub.objdep.MSME;

public class ClientApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("test.xml");

        MSME m1 = (MSME)context.getBean("m");
        MSME m2 = (MSME)context.getBean("m");
        MSME m3 = (MSME)context.getBean("m");
        MSME m4 = (MSME)context.getBean("m");

        System.out.println("m1 : " + System.identityHashCode(m1));
        System.out.println("m2 : " + System.identityHashCode(m2));
        System.out.println("m3 : " + System.identityHashCode(m3));
        System.out.println("m4 : " + System.identityHashCode(m4));

        context.close();
    }
}
```

---

### Output

```
Constructor Called
Constructor Called
Constructor Called
Constructor Called

m1 : 12345678
m2 : 23456789
m3 : 34567890
m4 : 45678901
```

Each `getBean()` call creates a **new object**, so the constructor runs **four times**.

---

# Internal Flow

```
getBean()
    │
    ▼
New MSME Object

getBean()
    │
    ▼
New MSME Object

getBean()
    │
    ▼
New MSME Object
```

---

# Other Bean Scopes (Spring Web)

| Scope           | Description                             |
| --------------- | --------------------------------------- |
| **request**     | One bean per HTTP request               |
| **session**     | One bean per HTTP session               |
| **application** | One bean for the entire web application |
| **websocket**   | One bean per WebSocket session          |

These scopes are available in **Spring Web MVC**.

---

# Singleton vs Prototype

| Singleton                       | Prototype                             |
| ------------------------------- | ------------------------------------- |
| Default scope                   | Must be specified explicitly          |
| One object per Spring container | New object for every `getBean()` call |
| Constructor called once         | Constructor called every time         |
| Same memory address             | Different memory addresses            |
| Shared by all callers           | Separate object for each caller       |

---

Your notes are generally correct, but there are a few grammar mistakes, outdated practices, and annotation name typos. Below is a **corrected, interview-ready version**.

---


# How to Configure a Spring Application Using Annotations
*# Q. What is an Annotation?

**Definition:**

An **Annotation** in Java is a special type of **metadata** that provides information about the program to:

* Compiler
* JVM
* Frameworks (Spring, Hibernate, JUnit)
* Tools and Libraries

**Note:** Annotations **do not change the program logic directly**, but they instruct the compiler, framework, or tools on how the code should behave.

---

## Example

```java
class A {
    void show() {
    }
}

class B extends A {

    @Override
    void show() {
    }
}
```

Here,

```java
@Override
```

tells the compiler that `show()` overrides the parent class method.

---

# Q. Why Use Annotations?

## Advantages

* Reduces XML configuration.
* Spring automatically detects components.
* Compile-time checking.
* Better dependency injection.
* Easy bean management.
* Improves code readability.
* Reduces boilerplate code.

---

# Important Spring Annotations

### Core Spring

* `@Component`
* `@Service`
* `@Repository`
* `@Controller`
* `@Configuration`
* `@ComponentScan`
* `@Autowired`
* `@Qualifier`
* `@Primary`
* `@Bean`
* `@Scope`
* `@Lazy`
* `@Value`
* `@PropertySource`
* `@DependsOn`
* `@PostConstruct`
* `@PreDestroy`
* `@Lookup`
* `@Profile`
* `@Import`
* `@Description`
* `@Conditional`
* `@Role`

### JSR-330

* `@Inject`
* `@Named`

### Spring MVC / REST

* `@RestController`
* `@RequestMapping`
* `@GetMapping`
* `@PostMapping`
* `@PutMapping`
* `@DeleteMapping`
* `@RequestBody`
* `@ResponseBody`

---

# Steps to Configure Spring Using Annotations
Project Structure

SpringAnnotationDemo
│
├── src/main/java
│   ├── org/techhub
│   │      ├── Employee.java
│   │      └── ClientApplication.java
│   │
│   └── org/techhub/config
│          └── ConfigApp.java
│
└── pom.xml

### Step 1

Create a Maven Project.

---

### Step 2

Add Dependencies

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

</dependencies>
```

---

### Step 3

Create a POJO and mark it as a Spring Bean.

## Employee.java

```java
package org.techhub;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("e")
public class Employee {

    private int id;
    private String name;
    private int sal;

    public int getId() {
        return id;
    }

    @Value("1")
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Value("ABC")
    public void setName(String name) 
    {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    @Value("10000")
    public void setSal(int sal) {
        this.sal = sal;
    }
}
```

---

# Annotation Explanation

## @Component

```java
@Component("e")
```

Marks the class as a **Spring Bean**.

Spring automatically creates its object.

Bean id = **e**

---

## @Value

```java
@Value("10000")
```

Injects a value into a field or setter method.

Can be used on

* Variables
* Setter methods
* Constructor parameters

---

# Step 4

Create Configuration Class

## ConfigApp.java

```java
package org.techhub.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.techhub")
public class ConfigApp {

}
```

---

# Annotation Explanation

## @Configuration

Marks the class as a Spring **Configuration Class**.

It replaces the XML configuration file.

---

## @ComponentScan

```java
@ComponentScan(basePackages = "org.techhub")
```

Spring scans the specified package and automatically creates beans for classes annotated with:

* `@Component`
* `@Service`
* `@Repository`
* `@Controller`

---

# Step 5

Create Client Application

## ClientApplication.java

```java
package org.techhub;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.techhub.config.ConfigApp;

public class ClientApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigApp.class);

        Employee emp = (Employee)context.getBean("e");

        System.out.println(emp.getId());
        System.out.println(emp.getName());
        System.out.println(emp.getSal());

        context.close();
    }
}
```

---

# Output

```text
1
ABC
10000
```

---

# Flow Diagram

```
Employee.java
     │
     │
@Component
     │
     ▼
Component Scan
     │
     ▼
Spring IoC Container
     │
     ▼
Creates Employee Bean
     │
     ▼
@Value injects values
     │
     ▼
getBean("e")
     │
     ▼
Employee Object
```

---

# Interview Definitions

### What is `@Component`?

`@Component` is a stereotype annotation that marks a user-defined class as a Spring bean. During component scanning, Spring automatically detects the class, creates its object, and manages it in the IoC Container.

---

### What is `@Configuration`?

`@Configuration` marks a Java class as a configuration class. It replaces the XML configuration file and contains bean definitions or component scanning instructions.

---

### What is `@ComponentScan`?

`@ComponentScan` tells Spring which packages to scan for classes annotated with `@Component`, `@Service`, `@Repository`, and `@Controller`, allowing Spring to automatically register them as beans.

---

### What is `@Value`? 

`@Value` is used to inject constant values or property values into fields, setter methods, or constructor parameters.

---

# `@Autowired` and `@Qualifier` Annotation in Spring

## What is `@Autowired`?

`@Autowired` is an annotation used by the Spring Framework to **automatically inject the dependency (object) of one class into another class**.

Instead of creating objects using the `new` keyword, Spring creates the object and injects it automatically.

### Syntax

```java
@Autowired
private ClassName objectReference;
```
Below is a **complete Spring Annotation Example** using **`@Component`, `@Autowired`, `@Value`, `@Configuration`, and `@ComponentScan`**.

---

# Project Structure

```
SpringAnnotationDemo
│
├── src/main/java
│   │
│   ├── org.techhub
│   │      Employee.java
│   │      Company.java
│   │      ConfigApp.java
│   │      ClientApplication.java
│
└── pom.xml
```

---

# Step 1: pom.xml

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
         https://maven.apache.org/xsd/maven-4.0.0.xsd">

    <modelVersion>4.0.0</modelVersion>

    <groupId>org.techhub</groupId>
    <artifactId>SpringAnnotationDemo</artifactId>
    <version>1.0</version>

    <dependencies>

        <!-- Spring Core -->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
            <version>5.3.30</version>
        </dependency>

    </dependencies>

</project>
```

---

# Step 2: Employee.java

```java
package org.techhub;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {

    @Value("700")
    private int id;

    @Value("ABC")
    private String name;

    @Value("10000")
    private int sal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }
}
```

---

# Step 3: Company.java

```java
package org.techhub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("comp")
public class Company {

    @Autowired
    private Employee emp;

    public Employee getEmployee() {
        return emp;
    }

    public void setEmployee(Employee emp) {
        this.emp = emp;
    }
}
```

---

# Step 4: ConfigApp.java

```java
package org.techhub;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.techhub")
public class ConfigApp {

}
```

---

# Step 5: ClientApplication.java

```java
package org.techhub;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigApp.class);

        Company c = context.getBean("comp", Company.class);

        Employee e = c.getEmployee();

        System.out.println("Employee Details");
        System.out.println("-------------------------");
        System.out.println("ID      : " + e.getId());
        System.out.println("Name    : " + e.getName());
        System.out.println("Salary  : " + e.getSal());
    }
}
```

---

# Interview Explanation

**Q. Explain this annotation example.**

**Answer:**

> In this example, `Employee` and `Company` classes are declared as Spring beans using `@Component`. The `Employee` bean receives values using the `@Value` annotation. The `Company` bean contains an `Employee` object marked with `@Autowired`, so Spring automatically injects the `Employee` bean into the `Company` bean. The configuration class uses `@Configuration` and `@ComponentScan` to scan the package and register all components. Finally, the `Company` bean is retrieved from the Spring container, and the injected `Employee` object's details are printed.


---

## Why do we use `@Qualifier`?

`@Qualifier` is used together with `@Autowired` when **multiple beans of the same type** are available.

It tells Spring **which bean should be injected**.

Without `@Qualifier`, Spring gets confused if there are multiple implementations of the same interface and throws an exception.

---

# 1) SetVal.java

```java
package org.techhub;

public interface SetVal {

    void setA(int a);

    void setB(int b);

    int getResult();
}
```

---

# 2) Add.java

```java
package org.techhub;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("add")
public class Add implements SetVal {

    @Value("100")
    private int a;

    @Value("200")
    private int b;

    @Override
    public void setA(int a) {
        this.a = a;
    }

    @Override
    public void setB(int b) {
        this.b = b;
    }

    @Override
    public int getResult() {
        return a + b;
    }
}
```

---

# 3) Mul.java

```java
package org.techhub;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mul")
public class Mul implements SetVal {

    @Value("10")
    private int a;

    @Value("20")
    private int b;

    @Override
    public void setA(int a) {
        this.a = a;
    }

    @Override
    public void setB(int b) {
        this.b = b;
    }

    @Override
    public int getResult() {
        return a * b;
    }
}
```

---

# 4) Calculator.java

```java
package org.techhub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("calc")
public class Calculator {

    @Autowired
    @Qualifier("mul")     // Change to "add" for addition
    private SetVal setVal;

    public void setOperation(SetVal setVal) {
        this.setVal = setVal;
    }

    public void show() {
        System.out.println("Result is : " + setVal.getResult());
    }
}
```

---

# 5) ConfigApp.java

```java
package org.techhub.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.techhub")
public class ConfigApp {

}
```

---

# 6) ClientApplication.java

```java
package org.techhub;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.techhub.config.ConfigApp;

public class ClientApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigApp.class);

        Calculator calc = context.getBean("calc", Calculator.class);

        calc.show();

        context.close();
    }
}
```

---

# Output

Using

```java
@Qualifier("mul")
```

Output:

```
Result is : 200
```

---


```java
public interface SetVal {
    int getResult();
}
```

and two implementation classes:

```java
@Component("add")
public class Add implements SetVal { ... }
```

```java
@Component("mul")
public class Mul implements SetVal { ... }
```

Now Spring creates **two beans**:

* Bean id = **add**
* Bean id = **mul**

If you write

```java
@Autowired
private SetVal setVal;
```

Spring asks:

> "There are two objects of type `SetVal`. Which one should I inject?"

Since it cannot decide, it throws:

```
NoUniqueBeanDefinitionException
```

---

## Solution: Use `@Qualifier`

```java
@Autowired
@Qualifier("mul")
private SetVal setVal;
```

Now Spring understands:

> "Inject the bean whose id is **mul**."

So the `Mul` object is injected.

---

# Internal Working Diagram

```
                Spring IoC Container
                       │
      ┌────────────────┼────────────────┐
      │                │                │
      ▼                ▼                ▼
   Add Bean         Mul Bean      Calculator Bean
   id="add"         id="mul"         id="calc"
      │                │                │
      └───────────────►│                │
          @Qualifier("mul")            │
                       │                │
                       ▼                │
            private SetVal setVal ◄────┘
```

---

# Dynamic Polymorphism

```java
private SetVal setVal;
```

The reference is of the **interface** type.

At runtime, Spring decides which implementation object to inject.

```java
@Qualifier("add")  → Add object
```

or

```java
@Qualifier("mul")  → Mul object
```

This is **runtime (dynamic) polymorphism**, and it also supports **loose coupling** because the `Calculator` class depends only on the `SetVal` interface, not on a specific implementation.

---

# Interview Questions

### 1. What is `@Autowired`?

`@Autowired` is used to automatically inject a dependent bean into another bean. Spring searches the IoC container for a matching bean and injects it.

---

### 2. Why do we use `@Qualifier`?

`@Qualifier` is used when multiple beans of the same type exist. It specifies exactly which bean should be injected.

---

### 3. What happens if we use only `@Autowired` with multiple implementations?

Spring finds more than one matching bean and throws a `NoUniqueBeanDefinitionException` because it cannot determine which implementation to inject.

---

### 4. What is the advantage of using an interface with `@Autowired`?

Using an interface promotes **loose coupling**. The implementation can be changed (for example, from `Add` to `Mul`) simply by changing the qualifier, without modifying the `Calculator` class.

---

### 5. Can `@Autowired` work without `@Qualifier`?

Yes. It works without `@Qualifier` if there is **only one bean** of the required type in the Spring container. When multiple beans of the same type exist, `@Qualifier` (or another mechanism such as `@Primary`) is needed.

Your notes are mostly correct. Below is an **interview-ready** version with explanation, flow, and output.

---

# @Scope Annotation in Spring

---

## Definition

`@Scope` annotation is used to define the **scope (lifecycle)** of a Spring bean. It tells the Spring IoC Container **how many objects (bean instances) should be created**.

It is a **class-level annotation** and is generally used with `@Component`.

**Syntax**

```java
@Scope("scope_name")
```

Example:

```java
@Component
@Scope("prototype")
public class Test {

}
```

---

## Why do we use @Scope?

By default, Spring creates only **one object** of every bean (**Singleton Scope**).

If we want:

* One object for the entire application → **singleton**
* A new object every time `getBean()` is called → **prototype**

then we use `@Scope`.

---

## Types of Bean Scope

| Scope       | Description                                               |
| ----------- | --------------------------------------------------------- |
| singleton   | Only one object is created (Default Scope).               |
| prototype   | A new object is created every time `getBean()` is called. |
| request     | One object per HTTP request (Web Application).            |
| session     | One object per HTTP session (Web Application).            |
| application | One object per ServletContext.                            |
| websocket   | One object per WebSocket session.                         |

---

# Example: Prototype Scope

## Test.java

```java
package org.techhub;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("t")
@Scope("prototype")
public class Test {

    public Test() {
        System.out.println("I am Test class constructor");
    }
}
```

---

## ConfigApp.java

```java
package org.techhub.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.techhub")
public class ConfigApp {

}
```

---

## ClientApplication.java

```java
package org.techhub;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.techhub.config.ConfigApp;

public class ClientApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigApp.class);

                Test t1=(Test)context.getBean("t");
                Test t2=(Test)context.getBean("t");
                Test t3=(Test)context.getBean("t");
                Test t4=(Test)context.getBean("t");

        context.close();
    }
}
```

---

# Output

```
I am Test class constructor
I am Test class constructor
I am Test class constructor
I am Test class constructor
```

---

# Why is the constructor called four times?

Because the bean scope is:

```java
@Scope("prototype")
```

Every call to

```java
context.getBean("t");
```

creates a **new object**.

Execution:

```
getBean() → Object 1 → Constructor executes

getBean() → Object 2 → Constructor executes

getBean() → Object 3 → Constructor executes

getBean() → Object 4 → Constructor executes
```

So, the constructor is executed **4 times**.

---

# If @Scope is removed

```java
@Component("t")
public class Test {

}
```

or

```java
@Scope("singleton")
```

Output:

```
I am Test class constructor
```

Even though:

```java
Test t1 = context.getBean("t");
Test t2 = context.getBean("t");
Test t3 = context.getBean("t");
Test t4 = context.getBean("t");
```

only **one object** is created, because **singleton** is the default scope.

---

# Interview Questions

### Q1. What is `@Scope`?

**Answer:**
`@Scope` is a class-level annotation used to define the lifecycle or scope of a Spring bean. It tells the Spring container whether to create a single object or multiple objects.

---

### Q2. What is the default scope of a Spring bean?

**Answer:**
The default scope is **singleton**, meaning Spring creates only one object of the bean for the entire IoC container.

---

## Project Usage

* **Singleton Scope:** Used for service classes, DAO classes, repositories, configuration classes, and utility classes where a single shared instance is sufficient.
* **Prototype Scope:** Used when each operation requires a fresh object, such as temporary data holders, report generators, or user-specific processing objects.


---

# Spring Bean Life Cycle

---

## Definition

The **Spring Bean Life Cycle** describes the complete journey of a bean from its **creation** until its **destruction** inside the Spring IoC Container.
  
The Spring IoC Container is responsible for:     

* Creating bean objects.
* Injecting dependencies.
* Calling initialization methods.
* Managing the bean during its lifetime.
* Destroying the bean when the container is closed.

---

# Workflow of Spring Bean Life Cycle

```
            Spring IoC Container
                       │
                       ▼
               Bean Instantiation
          (Object is created using constructor)
                       │
                       ▼
              Dependency Injection
      (Constructor Injection / Setter Injection)
                       │
                       ▼
             Custom Init Method
      (Automatically called by Spring)
                       │
                       ▼
           Bean is Ready for Use
                       │
                       ▼
           Utility / Business Methods
        (Called manually by the developer)
                       │
                       ▼
          Container Close (context.close())
                       │
                       ▼
           Custom Destroy Method
      (Automatically called by Spring)
```

---

# Explanation of Each Phase

## 1. Spring IoC Container

The **Spring IoC Container** is an internal Spring component responsible for:

* Creating bean objects.
* Managing the complete lifecycle of beans.
* Injecting dependencies.
* Calling initialization and destroy methods automatically.

---

## 2. Bean Instantiation

The Spring container creates the bean object by calling its constructor.

Example:

```java
public Employee() {
    System.out.println("Bean Instantiation");
}
```

---

## 3. Dependency Injection

After object creation, Spring injects dependencies using:

* Constructor Injection
* Setter Injection

Example:

```java
public void setId(int id) {
    this.id = id;
}
```

---

## 4. Custom Init Method

A **Custom Init Method** is a user-defined method that Spring calls automatically after dependency injection.

Example:

```java
public void myInit() {
    System.out.println("Init Method");
}
```

Purpose:

* Open database connection
* Load configuration
* Initialize resources

---

## 5. Utility (Business) Method

This is a normal user-defined method.

It is **not called automatically**.

The developer calls it whenever required.

Example:

```java
public void display() {
    System.out.println("Employee Details");
}
```

---

## 6. Custom Destroy Method

When the Spring container is closed, Spring automatically calls the destroy method.

Example:

```java
public void myDestroy() {
    System.out.println("Destroy Method");
}
```

Purpose:

* Close database connection
* Release resources
* Close files
* Clean up memory

---

# Ways to Implement Spring Bean Life Cycle

Spring provides three ways:

1. XML Configuration
2. Annotation Configuration
3. Java Configuration (Programming Approach)

---

# Bean Life Cycle using XML Configuration

## Step 1: Create Employee Class

```java
package org.techhub;

public class Employee {

    private int id;
    private String name;
    private int sal;

    public Employee() {
        System.out.println("Bean Instantiation");
    }

    public void myInit() {
        System.out.println("Init Method");
    }

    public void display() {
        System.out.println("Utility Method");
    }

    public void myDestroy() {
        System.out.println("Destroy Method");
    }

    public void setId(int id) {
        System.out.println("Dependency Injection");
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }
}
```

---

## Step 2: Configure XML

```xml
<?xml version="1.0" encoding="UTF-8"?>

<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN"
"https://www.springframework.org/dtd/spring-beans-2.0.dtd">

<beans>

    <bean id="e"
          class="org.techhub.Employee"
          init-method="myInit"
          destroy-method="myDestroy">

        <property name="id" value="1"/>
        <property name="name" value="ABC"/>
        <property name="sal" value="10000"/>

    </bean>

</beans>
```

---

## Step 3: Client Application

```java
package org.techhub;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApplication {

    public static void main(String[] args) 
    {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("test.xml");

        Employee employee = (Employee)context.getBean("e");

        employee.display();

        context.close();
    }
}
```

---

# Execution Flow

When the program runs, Spring performs the following steps:

### Step 1

Constructor executes.

```
Bean Instantiation
```

↓

### Step 2

Setter methods are called.

```
Dependency Injection
```

↓

### Step 3

Spring automatically calls:

```
myInit()
```

↓

### Step 4

Developer manually calls:

```
display()
```

↓

### Step 5

Container is closed.

```
context.close();
```

↓

### Step 6

Spring automatically calls:

```
myDestroy()
```

---

# Output

```
Bean Instantiation
Dependency Injection
Init Method
Utility Method
Destroy Method
```

---

# XML Attributes Used

### init-method

```xml
init-method="myInit"
```

Spring automatically calls the specified method after dependency injection.

---

### destroy-method

```xml
destroy-method="myDestroy"
```

Spring automatically calls the specified method when the container is closed.

---

# Interview Questions

### Q1. What is the Spring Bean Life Cycle?

**Answer:**
The Spring Bean Life Cycle is the sequence of steps that a bean goes through inside the Spring IoC Container, starting from object creation (instantiation), dependency injection, initialization, business method execution, and finally destruction when the container is closed.

---

### Q2. What is the order of the Spring Bean Life Cycle?

**Answer:**

1. Bean Instantiation
2. Dependency Injection
3. Init Method
4. Utility/Business Method
5. Destroy Method

---

### Q3. Which methods are called automatically by Spring?

**Answer:**

* Constructor (Bean Instantiation)
* Dependency Injection (Setter/Constructor)
* Init Method
* Destroy Method

---

### Q4. Which method is called manually?

**Answer:**
The Utility or Business Method (for example, `display()`) is called manually by the developer.

---

### Q5. When is the destroy method executed?

**Answer:**
The destroy method is executed automatically when the Spring container is closed using `context.close()` (for configurable application contexts).


# Bean Life Cycle Using Annotations in Spring

---

# Step 1: Create a Maven Project

Create a Maven project and add the required Spring dependencies.

---

# Step 2: Add Dependencies (`pom.xml`)

```xml
<dependencies>

    <!-- Spring Context -->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>6.2.8</version>
    </dependency>

    <!-- Jakarta Annotation -->
    <dependency>
        <groupId>jakarta.annotation</groupId>
        <artifactId>jakarta.annotation-api</artifactId>
        <version>3.0.0</version>
    </dependency>

</dependencies>
```

---

# Step 3: Create POJO Class

## Employee.java

```java
package org.techhub;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("e")
public class Employee {

    private int id;
    private String name;
    private int sal;

    // Bean Instantiation
    public Employee() {
        System.out.println("Bean Instantiation");
    }

    public int getId() {
        return id;
    }

    @Value("1")
    public void setId(int id) {
        System.out.println("Dependency Injection");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Value("ABC")
    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    @Value("10000")
    public void setSal(int sal) {
        this.sal = sal;
    }

    // Initialization Method
    @PostConstruct
    public void myInit() {
        System.out.println("This is Init Method");
    }

    // Utility Method
    public void display() {
        System.out.println("Employee Details");
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Salary : " + sal);
    }

    // Destroy Method
    @PreDestroy
    public void myDestroy() {
        System.out.println("This is Destroy Method");
    }
}
```

---

# Step 4: Configuration Class

## ConfigTest.java

```java
package org.techhub;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.techhub")
public class ConfigTest {

}
```

---

# Step 5: Client Application

## ClientApplication.java

```java
package org.techhub;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigTest.class);

        Employee employee = (Employee)context.getBean("e");

        employee.display();

        context.close();
    }
}
```

---

# Output

```
Bean Instantiation
Dependency Injection
This is Init Method

Employee Details
Id : 1
Name : ABC
Salary : 10000

This is Destroy Method
```

---

# Execution Flow

```
Spring Container Starts
        │
        ▼
Bean Instantiation
(Constructor Executes)
        │
        ▼
Dependency Injection
(@Value Executes)
        │
        ▼
@PostConstruct
(Initialization Method)
        │
        ▼
Bean Ready to Use
(display() Method)
        │
        ▼
context.close()
        │
        ▼
@PreDestroy
(Destroy Method)
```

---

# Explanation of Annotations

### `@Component`

* Marks the class as a Spring Bean.
* Spring automatically creates the object.

```java
@Component("e")
```

---

### `@Value`

* Injects values into bean properties.

```java
@Value("1")
public void setId(int id)
```

---

### `@PostConstruct`

* Marks the method as the **Initialization Method**.
* Executes **after dependency injection** and **before the bean is ready to use**.
* It runs **only once**.

```java
@PostConstruct
public void myInit() {
    System.out.println("This is Init Method");
}
```

---

### `@PreDestroy`

* Marks the method as the **Destroy Method**.
* Executes **before the bean is removed from the Spring container**.
* Called when the container is closed using `context.close()`.

```java
@PreDestroy
public void myDestroy() {
    System.out.println("This is Destroy Method");
}
```

---

# Important Interview Points

**Q1. What is Bean Life Cycle?**
The Bean Life Cycle is the sequence of phases a Spring bean passes through: **Instantiation → Dependency Injection → Initialization → Ready for Use → Destruction**.

---

**Q2. Which annotation is used for the initialization method?**

**Answer:** `@PostConstruct`

---

**Q3. Which annotation is used for the destroy method?**

**Answer:** `@PreDestroy`

---

**Q4. When is `@PostConstruct` executed?**

After dependency injection is completed and before the bean is used.

---

**Q5. When is `@PreDestroy` executed?**

Just before the Spring container destroys the bean, typically when `context.close()` is called.

---

**Q6. Is `context.close()` necessary?**

Yes. For singleton beans, `@PreDestroy` methods are invoked only when the application context is closed.

---

# Bean Life Cycle Summary

| Stage | Action               | Annotation               |
| ----- | -------------------- | ------------------------ |
| 1     | Bean Instantiation   | Constructor              |
| 2     | Dependency Injection | `@Value`, `@Autowired`   |
| 3     | Initialization       | `@PostConstruct`         |
| 4     | Bean Ready for Use   | Business/Utility Methods |
| 5     | Bean Destruction     | `@PreDestroy`            |

This example demonstrates the complete Spring bean life cycle using annotation-based configuration.


# Bean Life Cycle Using Programming Approach in Spring

## What is the Programming Approach?

Instead of using annotations like `@PostConstruct` and `@PreDestroy`, Spring provides two interfaces to implement the bean life cycle programmatically.

1. **InitializingBean**

   * Contains the `afterPropertiesSet()` method.
   * This method works as the **Initialization Method**.

2. **DisposableBean**

   * Contains the `destroy()` method.
   * This method works as the **Destroy Method**.

> In this approach, the bean class implements these interfaces, and Spring automatically invokes their methods at the appropriate stages of the bean life cycle.

---

# Bean Life Cycle Steps

```
Bean Instantiation
        ↓
Dependency Injection
        ↓
afterPropertiesSet()  (Init Method)
        ↓
Bean Ready to Use
        ↓
destroy() (Destroy Method)
```

---

# Step 1: Create a Maven Project

Create a Maven project and add the Spring Context dependency.

---

# Step 2: Add Dependencies (`pom.xml`)

```xml
<dependencies>

    <!-- Spring Context -->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>6.2.8</version>
    </dependency>

    <!-- Jakarta Annotation (Optional if using @Component/@Value) -->
    <dependency>
        <groupId>jakarta.annotation</groupId>
        <artifactId>jakarta.annotation-api</artifactId>
        <version>3.0.0</version>
    </dependency>

</dependencies>
```

---

# Step 3: Create POJO Class

## Employee.java

```java
package org.techhub;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("e")
public class Employee implements InitializingBean, DisposableBean {

    private int id;
    private String name;
    private int sal;

    // Bean Instantiation
    public Employee() {
        System.out.println("Bean Instantiation");
    }

    public int getId() {
        return id;
    }

    @Value("1")
    public void setId(int id) {
        System.out.println("Dependency Injection");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Value("ABC")
    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    @Value("10000")
    public void setSal(int sal) {
        this.sal = sal;
    }

    // Utility Method
    public void display() {
        System.out.println("Employee Details");
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Salary : " + sal);
    }

    // Initialization Method
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("I am Init Method");
    }

    // Destroy Method
    @Override
    public void destroy() throws Exception {
        System.out.println("I am Destroy Method");
    }
}
```

---

# Step 4: Configuration Class

## ConfigTest.java

```java
package org.techhub;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.techhub")
public class ConfigTest {

}
```

---

# Step 5: Client Application

## ClientApplication.java

```java
package org.techhub;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigTest.class);

        Employee employee = (Employee)context.getBean("e");

        employee.display();

        context.close();
    }
}
```

---

# Output

```
Bean Instantiation
Dependency Injection
I am Init Method

Employee Details
Id : 1
Name : ABC
Salary : 10000

I am Destroy Method
```

---

# Execution Flow

```
Spring Container Starts
        │
        ▼
Bean Instantiation
(Constructor Executes)
        │
        ▼
Dependency Injection
(@Value Executes)
        │
        ▼
afterPropertiesSet()
(Initialization Method)
        │
        ▼
Bean Ready to Use
(display() Method)
        │
        ▼
context.close()
        │
        ▼
destroy()
(Destroy Method)
```

---

# Explanation of Interfaces

## 1. `InitializingBean`

* Used to perform initialization after all bean properties have been injected.
* Contains one method:

```java
public void afterPropertiesSet() throws Exception
```

* Spring automatically calls this method after dependency injection.

Example:

```java
@Override
public void afterPropertiesSet() throws Exception {
    System.out.println("I am Init Method");
}
```

---

## 2. `DisposableBean`

* Used to perform cleanup before the bean is destroyed.
* Contains one method:

```java
public void destroy() throws Exception
```

* Spring calls this method when the application context is closed.

Example:

```java
@Override
public void destroy() throws Exception {
    System.out.println("I am Destroy Method");
}
```

---

# Difference Between Annotation and Programming Approach

| Annotation Approach                  | Programming Approach                             |
| ------------------------------------ | ------------------------------------------------ |
| Uses `@PostConstruct`                | Implements `InitializingBean`                    |
| Uses `@PreDestroy`                   | Implements `DisposableBean`                      |
| Less coupling with Spring interfaces | Directly depends on Spring interfaces            |
| More commonly recommended            | Useful in some legacy or framework-specific code |

---

# Interview Questions

### Q1. Which interfaces are used to implement the bean life cycle programmatically?

**Answer:**

* `InitializingBean`
* `DisposableBean`

---

### Q2. Which method acts as the initialization method?

**Answer:**
`afterPropertiesSet()`

---

### Q3. Which method acts as the destroy method?

**Answer:**
`destroy()`

---

### Q4. When is `afterPropertiesSet()` called?

**Answer:**
After Spring completes dependency injection and before the bean is ready for use.

---

### Q5. When is `destroy()` called?

**Answer:**
When the Spring container is closed using `context.close()`.

---

# Summary

| Stage | Action               | Programming Approach                        |
| ----- | -------------------- | ------------------------------------------- |
| 1     | Bean Instantiation   | Constructor                                 |
| 2     | Dependency Injection | `@Value`, `@Autowired`                      |
| 3     | Initialization       | `afterPropertiesSet()` (`InitializingBean`) |
| 4     | Bean Ready for Use   | Business/Utility Methods                    |
| 5     | Bean Destruction     | `destroy()` (`DisposableBean`)              |



---

# Eager Loading and Lazy Loading in Spring Framework

---

In **Spring Core (IoC Container)**, **Eager Loading** and **Lazy Loading** define **when Spring creates bean objects**.

---

# Eager Loading

---

**Definition**

Eager Loading means **Spring creates singleton bean objects when the Spring container starts**.

In other words, even if the developer **does not call the `getBean()` method**, Spring automatically creates the bean during container initialization.

Since **Singleton** is the default scope in Spring, all singleton beans are eagerly initialized unless they are marked as lazy.

---

## Example with Source Code

### Demo.java

```java
package org.techhub;

import org.springframework.stereotype.Component;

@Component
public class Demo 
{
    public Demo() 
    {
        System.out.println("Demo bean object created by Spring container");
    }
}
```

---

### Employee.java

```java
package org.techhub;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("e")
public class Employee implements InitializingBean, DisposableBean {

    private int id;
    private String name;
    private int sal;

    public Employee() {
        System.out.println("Employee bean object created by Spring container");
    }

    @Value("1")
    public void setId(int id) {
        this.id = id;
    }

    @Value("ABC")
    public void setName(String name) {
        this.name = name;
    }

    @Value("10000")
    public void setSal(int sal) {
        this.sal = sal;
    }

    public void display() {
        System.out.println("I am utility method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("I am destroy method");
    }
}
```
---

## ConfigTest.java

```java
package org.techhub;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.techhub")
public class ConfigTest {

}
```

---

### ClientApplication.java

```java
package org.techhub;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigTest.class);

        context.close();
    }
}
```

---

### Output

```
Demo bean object created by Spring container
Employee bean object created by Spring container
I am destroy method
```

---

### Note

In the above example, we **did not call the `getBean()` method**, but Spring still created both bean objects automatically when the container started.

This behavior is called **Eager Loading**.

---

# Characteristics of Eager Loading

---

* It is the **default behavior for Singleton beans**. 
* Bean objects are created during **Spring container initialization**.
* Application startup takes **more time** if many singleton beans are present.
* More memory is consumed at startup because all singleton beans are created immediately. 
* Errors in bean configuration are detected during application startup.
* Improves runtime performance because beans are already available.

---

# Lazy Loading

---

**Definition** 

The bean object is created only when the developer calls the **`getBean()`** method or when another bean requires it.

To make a bean lazy, Spring provides the **`@Lazy`** annotation.

---

## Example with Source Code

### Demo.java

```java
package org.techhub;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("d")
@Lazy
public class Demo {

    public Demo() {
        System.out.println("Demo bean object created by Spring container");
    }
}
```

---

### Employee.java

```java
package org.techhub;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("e")
@Lazy
public class Employee implements InitializingBean, DisposableBean {

    private int id;
    private String name;
    private int sal;

    public Employee() {
        System.out.println("Employee bean object created by Spring container");
    }

    @Value("1")
    public void setId(int id) {
        this.id = id;
    }

    @Value("ABC")
    public void setName(String name) {
        this.name = name;
    }

    @Value("10000")
    public void setSal(int sal) {
        this.sal = sal;
    }

    public void display() {
        System.out.println("I am utility method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("I am destroy method");
    }
}
```

---

### ClientApplication.java

```java
package org.techhub;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigTest.class);

        System.out.println("Container Started");

        Demo demo = context.getBean("d", Demo.class);

        context.close();
    }
}
```

---

### Output

```
Container Started
Demo bean object created by Spring container
I am destroy method
```

---

### Note

When the Spring container starts, it **does not create the `Demo` bean** because it is marked with **`@Lazy`**.

The bean is created **only after calling the `getBean()` method**.

This behavior is called **Lazy Loading**.

---

# Characteristics of Lazy Loading

---

* Bean is created only when it is requested.
* Reduces application startup time.
* Consumes less memory during startup.
* Errors related to the bean are detected only when the bean is created.
* Useful for large applications where some beans are rarely used.
* Enabled by using the **`@Lazy`** annotation.

---

# Difference Between Eager Loading and Lazy Loading

---

| Feature                 | Eager Loading                                     | Lazy Loading                                             |
| ----------------------- | ------------------------------------------------- | -------------------------------------------------------- |
| **Bean Creation**       | Bean is created when the Spring container starts. | Bean is created when it is requested for the first time. |
| **Startup Time**        | Higher (slower startup)                           | Lower (faster startup)                                   |
| **Memory Usage**        | More memory is used initially.                    | Less memory is used initially.                           |
| **Error Detection**     | Errors are detected during startup.               | Errors are detected at runtime when the bean is created. |
| **Default in Spring**   | Yes (for Singleton beans)                         | No (must use `@Lazy`)                                    |
| **Performance**         | Faster bean access after startup                  | Slight delay when bean is accessed for the first time    |
| **Annotation Required** | No                                                | Yes (`@Lazy`)                                            |

---

Your notes are correct in concept, but they contain several grammar issues and a few technical inaccuracies. Below is a cleaner interview-ready explanation.

---
 
# @Lookup Annotation in Spring Framework
 
## What is `@Lookup` Annotation?

`@Lookup` is a Spring annotation used to inject a **prototype-scoped bean** into a **singleton-scoped bean** dynamically.

Normally, when a prototype bean is injected into a singleton bean using `@Autowired`, the prototype object is created **only once** at the time the singleton bean is created. After that, the singleton bean keeps using the same prototype object.

If we want a **new prototype object every time** the singleton bean requests it, we use the **`@Lookup` annotation**.

---

## Why do we need `@Lookup`?

Spring creates:

* **Singleton Bean** → Only one object is created for the entire application.
* **Prototype Bean** → A new object is created every time it is requested from the Spring container.

### Problem

When a prototype bean is injected into a singleton bean using `@Autowired`, only one prototype object is injected.

```
Singleton Bean
      |
      |----> Prototype Bean (Only one object)
```

Even though the bean scope is **prototype**, it behaves like a singleton inside that singleton bean because the dependency is resolved only once. 

---

## Solution

Use the `@Lookup` annotation.

Spring overrides the `@Lookup` method at runtime and returns a **new prototype bean** every time the method is called.

```
Singleton Bean
      |
      |---- display()
      |         |
      |         ---> New Prototype Object
      |
      |---- display()
      |         |
      |         ---> New Prototype Object
```

---

# Steps to use `@Lookup`

1. Create a Prototype bean.
2. Create a Singleton bean.
3. Define a method in the Singleton bean.
4. Annotate the method with `@Lookup`.
5. The method should return the Prototype bean type.
6. Return `null`; Spring overrides this method at runtime.

---

# Example

## Demo.java (Prototype Bean)

```java
package org.techhub.lookup;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Demo {

    public Demo() {
        System.out.println("Demo Bean Object Created");
    }
}
```

---

## Test.java (Singleton Bean)

```java
package org.techhub.lookup;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class Test {

    public Test() {
        System.out.println("Test Bean Object Created");
    }

    @Lookup
    public Demo display() {
        return null; // Spring overrides this method
    }
}
```

---

## ConfigApp.java

```java
package org.techhub.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.techhub")
public class ConfigApp {

}
```

---

## ClientApplication.java

```java
package org.techhub.lookup;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.techhub.config.ConfigApp;

public class ClientApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigApp.class);

        Test test = context.getBean(Test.class);

        Demo d1 = test.display();
        Demo d2 = test.display();
        Demo d3 = test.display();
        Demo d4 = test.display();

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);

        context.close();
    }
}
```

---

# Output

```
Test Bean Object Created

Demo Bean Object Created
Demo Bean Object Created
Demo Bean Object Created
Demo Bean Object Created

org.techhub.lookup.Demo@4e25154f
org.techhub.lookup.Demo@70dea4e
org.techhub.lookup.Demo@5c647e05
org.techhub.lookup.Demo@33909752
```

Notice that **four different `Demo` objects** are created because `display()` returns a new prototype bean every time.

---

# Important Points

* `@Lookup` is used to inject a **prototype bean into a singleton bean**.
* Spring overrides the annotated method using **CGLIB** at runtime.
* The method annotated with `@Lookup` should return the required bean type.
* The method body usually returns `null`; Spring replaces its implementation automatically.
* Every call to the `@Lookup` method returns a **new instance** of the prototype bean.

---

# Interview Question

### Q. Why do we use `@Lookup` Annotation?

**Answer:**

`@Lookup` is used to obtain a new instance of a prototype-scoped bean from a singleton-scoped bean. Without `@Lookup`, a prototype bean injected using `@Autowired` is created only once and reused. With `@Lookup`, Spring fetches a fresh prototype bean from the container every time the annotated method is called.

---

### Note about your example

In your `Test` class, the field

```java
@Autowired
Demo demo;
```

is **not actually used** after introducing `@Lookup`. It can be removed to better demonstrate the purpose of `@Lookup`:

```java
@Component
public class Test {

    @Lookup
    public Demo display() {
        return null;
    }
}
```

This is the recommended way to demonstrate `@Lookup` in Spring.





