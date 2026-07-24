
---

# Spring MVC

---

## Q. What is the meaning of MVC?

---

**MVC** stands for **Model, View, and Controller**. It is a **design pattern** used in web application development to separate the application's business logic, presentation logic, and request-handling logic.

### M - Model

* The **Model** is a Java POJO (Plain Old Java Object) class.
* It stores the data sent by the user through the View.
* It contains variables, constructors, getter and setter methods.
* It represents the application's data and business objects.

### V - View

* The **View** is the presentation layer.
* It is responsible for displaying data to the user and collecting user input.
* In Spring MVC, views are commonly created using **JSP**, **Thymeleaf**, **FreeMarker**, etc.

### C - Controller

* The **Controller** is a Spring class annotated with **@Controller**.
* It receives HTTP requests from the user.
* It processes the request, communicates with the service/business layer, stores data in the Model, and returns the appropriate View.

**Flow:**

```
Client Request
      ↓
 Controller
      ↓
Business Logic
      ↓
    Model
      ↓
     View
      ↓
Client Response
```

---

# Q. Why do we use Spring MVC?

---

Spring MVC provides many advantages:

### 1. Separation of Concerns

* Separates presentation logic, business logic, and data access logic.
* Makes the application easier to understand and maintain.

### 2. Easy Request Handling

* Maps URLs to controller methods using annotations such as:

  * `@RequestMapping`
  * `@GetMapping`
  * `@PostMapping`

### 3. Integration with Spring Framework

* Integrates easily with:

  * Spring Boot
  * Spring Data JPA
  * Spring Security
  * Spring JDBC
  * Spring REST

### 4. Flexible View Technologies

Supports multiple view technologies such as:

* JSP
* Thymeleaf
* FreeMarker
* Velocity

### 5. Form Handling and Validation

Supports form submission and validation using:

* `@ModelAttribute`
* `@Valid`
* `BindingResult`

### 6. Loose Coupling

Different layers remain independent, making the application easier to test and maintain.

---

# Spring MVC Architecture

---

```
Browser
   │
HTTP Request
   │
DispatcherServlet (Front Controller)
   │
Handler Mapping
   │
Controller
   │
Service Layer (Optional)
   │
DAO / Repository
   │
Database
   │
Model
   │
ViewResolver
   │
JSP / Thymeleaf
   │
HTTP Response
```

---

# HTTP Request

---

An **HTTP Request** is sent by the client whenever the user:

* Submits a form
* Clicks a hyperlink
* Refreshes the browser
* Types a URL in the browser

The request is received by the **DispatcherServlet**.

---

# DispatcherServlet

---

**DispatcherServlet** is the **Front Controller** of the Spring MVC framework.

Package:

```java
org.springframework.web.servlet.DispatcherServlet
```

Responsibilities:

* Receives every client request.
* Finds the appropriate controller.
* Calls the controller method.
* Receives the returned view name.
* Sends the view to the ViewResolver.
* Returns the final response to the client.

---

# Q. What is a Front Controller?

---

A **Front Controller** is a single controller that receives **all incoming client requests** and forwards them to the appropriate controller or handler.

In Spring MVC, the **DispatcherServlet** acts as the Front Controller.

---

# Why do we use a Front Controller?

---

It provides:

* Centralized request handling
* Authentication and authorization
* Exception handling
* Logging
* Validation
* Data binding
* URL mapping

---

# DispatcherServlet Configuration

### Traditional (web.xml)

```xml
<servlet>
    <servlet-name>dispatcher</servlet-name>
    <servlet-class>
        org.springframework.web.servlet.DispatcherServlet
    </servlet-class>
</servlet>

<servlet-mapping>
    <servlet-name>dispatcher</servlet-name>
    <url-pattern>/</url-pattern>
</servlet-mapping>
```

> **Note:** In modern Spring MVC applications, `web.xml` is usually replaced with **Java Configuration** using `WebApplicationInitializer`.

---

# @RequestMapping

---

`@RequestMapping` maps an HTTP URL to a controller or controller method.

It can be used:

* At class level
* At method level

Example:

```java
@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/home")
    public String home() {
        return "home";
    }
}
```

URL:

```
/student/home
```

---

# @Controller

---

`@Controller` is a **class-level annotation**.

It tells Spring that the class is a web controller capable of handling HTTP requests.

Example:

```java
@Controller
public class HomeController {

}
```

## ViewResolver

---

**ViewResolver** is a Spring MVC component that converts the **logical view name** returned by the controller into the **actual view page**.

### Example

When a controller returns:

```java
return "index";
```

The `ViewResolver` converts it into:

```
/WEB-INF/views/index.jsp
```

---

## Java Configuration

```java
@Bean
public InternalResourceViewResolver viewResolver() {

    InternalResourceViewResolver viewResolver =
            new InternalResourceViewResolver();

    viewResolver.setPrefix("/WEB-INF/views/");
    viewResolver.setSuffix(".jsp");

    return viewResolver;
}
```

---

## XML Configuration

```xml
<?xml version="1.0" encoding="UTF-8"?>

<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xmlns:mvc="http://www.springframework.org/schema/mvc"
       xsi:schemaLocation="
           http://www.springframework.org/schema/beans
           https://www.springframework.org/schema/beans/spring-beans.xsd
           http://www.springframework.org/schema/context
           https://www.springframework.org/schema/context/spring-context.xsd
           http://www.springframework.org/schema/mvc
           https://www.springframework.org/schema/mvc/spring-mvc.xsd">

    <!-- Enable Spring MVC -->
    <mvc:annotation-driven/>

    <!-- Scan Controller Package -->
    <context:component-scan base-package="org.techhub.controller"/>

    <!-- View Resolver -->
    <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
        <property name="prefix" value="/WEB-INF/views/"/>
        <property name="suffix" value=".jsp"/>
    </bean>

</beans>
```

---

## Controller Example

```java
package org.techhub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }
}
```

---

## Flow of ViewResolver

```
Browser Request
       │
       ▼
Controller
       │
       ▼
return "index";
       │
       ▼
ViewResolver
Prefix : /WEB-INF/views/
Suffix : .jsp
       │
       ▼
/WEB-INF/views/index.jsp
       │
       ▼
Response sent to Browser
```
---

# View

---

A **View** is the presentation page displayed to the user.

Examples:

* JSP
* Thymeleaf
* FreeMarker

The View:

* Accepts user input.
* Displays output received from the controller.

---

![alt text](image.png)

---
# Steps to Configure a Spring MVC Project Using Annotations

---

1. Create a Dynamic Web Project.
2. Convert it into a Maven project.
3. Add the required Maven dependencies.
4. Create the Spring MVC Configuration class.
5. Create the `WebApplicationInitializer`.
6. Create the Controller.
7. Create JSP pages under `/WEB-INF/views/`.
8. Run the project on Tomcat.

---

# Maven Dependencies

```xml
<dependencies>

    <!-- Spring MVC -->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-webmvc</artifactId>
        <version>6.1.5</version>
    </dependency>

    <!-- Servlet API -->
    <dependency>
        <groupId>jakarta.servlet</groupId>
        <artifactId>jakarta.servlet-api</artifactId>
        <version>5.0.0</version>
        <scope>provided</scope>
    </dependency>

    <!-- JSTL -->
    <dependency>
        <groupId>jakarta.servlet.jsp.jstl</groupId>
        <artifactId>jakarta.servlet.jsp.jstl-api</artifactId>
        <version>2.0.0</version>
    </dependency>

</dependencies>
```

---

# Spring MVC Configuration Class

```java
package org.techhub.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("org.techhub")
public class WebMvcConfig {

    @Bean
    public InternalResourceViewResolver viewResolver() {

        InternalResourceViewResolver resolver =
                new InternalResourceViewResolver();

        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");

        return resolver;
    }
}
```

---

# @EnableWebMvc

---

`@EnableWebMvc` enables Spring MVC configuration.

It activates:

* Request mapping
* ViewResolver support
* Data binding
* Validation
* Message converters
* MVC configuration

---

# WebApplicationInitializer

This class is responsible for Configure your DispatcherServlet and Create spring web application container 
So we implement interface in this class name as WebApplicationInitializer and override its method name as onStartUp() shown in following code. 


```java
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppInitializer
implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext)
            throws ServletException {

// 2. Initialise the Spring context
        AnnotationConfigWebApplicationContext context =
                new AnnotationConfigWebApplicationContext();

        context.register(WebMvcConfig.class);
// 3. Register the DispatcherServlet
        DispatcherServlet dispatcher =
                new DispatcherServlet(context);

        ServletRegistration.Dynamic servlet =
                servletContext.addServlet("dispatcher", dispatcher);
// 4. Configure startup behavior
        servlet.setLoadOnStartup(1);

        servlet.addMapping("/");
    }
}
```

---

# Create Controller and call view pages 

```java
package org.techhub.config;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {	
	@GetMapping("/")
	public String homePage() {
		return "index";
	}
	@RequestMapping("/welcome")
	public String welcomePage() {
		return "welcome";
	}
}

```

---

# JSP Pages

### index.jsp

```jsp
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home Page</title>
</head>
<body>
    <h1>I am home page</h1>
    <a href="${pageContext.request.contextPath}/welcome">Call Welcome page</a>
</body>
</html>

```

### welcome.jsp

```jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h1>This is the welcome page </h1>
</body>
</html>

```

---

# Request Flow in Spring MVC

---

```
Browser
   │
HTTP Request
   │
DispatcherServlet
   │
Handler Mapping
   │
Controller
   │
Business Logic / Service
   │
Model
   │
ViewResolver
   │
JSP Page
   │
Browser Response
```

---

# Interview Questions

### Q1. What is Spring MVC?

**Answer:** Spring MVC is a web framework based on the Model-View-Controller design pattern. It helps build scalable, maintainable web applications by separating business logic, presentation logic, and request handling.

### Q2. What is DispatcherServlet?

**Answer:** DispatcherServlet is the Front Controller in Spring MVC. It receives all client requests, forwards them to the appropriate controller, and returns the appropriate view.

### Q3. What is the use of ViewResolver?

**Answer:** ViewResolver maps the logical view name returned by the controller to the actual view file (for example, `index` → `/WEB-INF/views/index.jsp`).

### Q4. What is the difference between `@Controller` and `@RestController`?

| @Controller               | @RestController               |
| ------------------------- | ----------------------------- |
| Returns a View            | Returns JSON/XML response     |
| Used for MVC applications | Used for REST APIs            |
| Requires ViewResolver     | Does not require ViewResolver |




Your notes cover many topics. Here's a **structured roadmap** for the **Mini Project: Registration Form using Spring MVC + Spring JDBC + MySQL**, which is easier to understand and follow.

---





# Mini Project: User Registration System using Spring MVC + Spring JDBC

## Objective

Design a simple **User Registration System** where users can:

* Enter Name
* Enter Email
* Enter Contact Number
* Save data into MySQL database using Spring JDBC
* Display success message after registration

---

# Technologies Used

### Frontend

* HTML
* CSS
* JSP

### Backend

* Core Java
* Spring Core
* Spring MVC
* Spring JDBC

### Database

* MySQL

### Tools

* STS / Eclipse
* Maven
* MySQL Workbench
* Apache Tomcat
* Postman (for REST API)

---

# Project Structure

```text
RegistrationProject
│
├── src/main/java
│
│   └── org.techhub
│
│       ├── config
│       │      MVCConfig.java
│       │
│       ├── controller
│       │      RegisterController.java
│       │
│       ├── dao
│       │      RegisterDao.java
│       │      RegisterDaoImpl.java
│       │
│       ├── service
│       │      RegisterService.java
│       │      RegisterServiceImpl.java
│       │
│       ├── model
│       │      Register.java
│       │
│       └── exception
│              UserAlreadyExistsException.java
│
├── src/main/webapp
│
│   ├── WEB-INF
│   │      views
│   │          register.jsp
│   │          welcome.jsp
│   │
│   └── index.jsp
│
└── pom.xml
```

---

# Database

Create Database

```sql
CREATE DATABASE springmvcdb;
```

Use Database

```sql
USE springmvcdb;
```

Create Table

```sql
CREATE TABLE register
(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    email VARCHAR(100),
    contact VARCHAR(20)
);
```

---

# Project Flow

```text
Browser

↓

register.jsp

↓

RegisterController

↓

RegisterService

↓

RegisterDao

↓

JdbcTemplate

↓

MySQL Database

↓

Success

↓

welcome.jsp
```

---

# Step 1

Create Spring MVC Project

---

# Step 2

Add Maven Dependencies

* spring-webmvc
* spring-context
* spring-jdbc
* mysql-connector-j
* jakarta.servlet-api

---

# Step 3

Configure Spring MVC

* DispatcherServlet
* ViewResolver
* Component Scan

---

# Step 4

Configure Database

Use

* DriverManagerDataSource
* JdbcTemplate

---

# Step 5

Create Model

```java
Register

name

email

contact
```

---

# Step 6

Create DAO Layer

```text
RegisterDao

↓

RegisterDaoImpl
```

DAO is responsible for database operations.

Methods

```java
save(Register register);
```

---

# Step 7

Create Service Layer

```text
RegisterService

↓

RegisterServiceImpl
```

Business logic is written here.

---

# Step 8

Create Controller

```text
GET /

↓

Open register.jsp

↓

POST /save

↓

Receive Register Object

↓

Call Service

↓

Save Data

↓

Return welcome.jsp
```

---

# Step 9

Create JSP Pages

* register.jsp
* welcome.jsp

---

# Step 10

Test Project

Open

```
http://localhost:8080/RegistrationProject/
```

Fill

* Name
* Email
* Contact

Click

```
Register
```

Record should be inserted into MySQL.

---

# Expected Output

### Registration Page

```
-----------------------------
Name     [______________]

Email    [______________]

Contact  [______________]

[ Register ]
-----------------------------
```

After clicking Register

```
Form Submitted Successfully

Name : Harshad

Email : harsh@gmail.com

Contact : 9876543210
```

---

# Concepts Covered in this Project

* Spring MVC Architecture
* Controller
* Model
* ViewResolver
* JSP
* Form Submission
* Data Binding
* Spring JDBC
* JdbcTemplate
* DriverManagerDataSource
* MySQL Database
* DAO Layer
* Service Layer
* Dependency Injection
* Maven
* MVC Design Pattern

---

# Advanced Concepts to Add

After completing this project, you can enhance it by implementing:

* Logging using SLF4J and Logback
* User-defined Exceptions
* JUnit Testing
* File Upload using `MultipartFile`
* REST APIs (`@RequestBody`, `@ResponseBody`)
* JSON using Jackson (`jackson-databind`)
* API Testing using Postman
* CRUD Operations (Insert, Update, Delete, View)

This mini project provides a complete introduction to developing database-driven web applications using **Spring MVC + Spring JDBC**, and serves as a strong foundation before moving to **Spring Boot**.

