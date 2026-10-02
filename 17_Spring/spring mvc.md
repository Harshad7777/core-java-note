# Spring MVC Notes

[Overview](#overview) | [MVC Architecture](#mvc-architecture) | [DispatcherServlet](#dispatcherservlet) | [Controller and Mapping](#controller-and-mapping) | [ViewResolver](#viewresolver) | [Registration Project](#registration-project) | [REST API](#rest-api) | [Interview Questions](#interview-questions)

---

## Overview

Spring MVC is a web framework based on the Model-View-Controller pattern.

It helps build web applications by separating:

- request handling
- business logic
- data model
- presentation layer

Spring MVC is widely used for web apps, forms, and REST APIs.

---

## MVC Meaning

MVC stands for:

- Model
- View
- Controller

### Model

- Represents application data.
- Usually a Java POJO class.
- Stores fields and getter/setter methods.

### View

- Displays output to the user.
- Accepts user input.
- Commonly used technologies: JSP, Thymeleaf, FreeMarker.

### Controller

- Receives HTTP request.
- Calls business logic.
- Stores data in the model.
- Returns a view name.

### Flow

```text
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

## Why Use Spring MVC?

### Advantages

- Separation of concerns
- Easy URL mapping
- Integration with Spring ecosystem
- Flexible view support
- Form handling and validation
- Loose coupling
- Easy testing and maintenance

---

## MVC Architecture

```text
Browser
   │
   ▼
HTTP Request
   │
   ▼
DispatcherServlet (Front Controller)
   │
   ▼
Handler Mapping
   │
   ▼
Controller
   │
   ▼
Service / Business Layer
   │
   ▼
DAO / Repository
   │
   ▼
Database
   │
   ▼
Model
   │
   ▼
ViewResolver
   │
   ▼
JSP / Thymeleaf
   │
   ▼
HTTP Response
```

---

## HTTP Request

An HTTP request is sent when a user:

- submits a form
- clicks a link
- refreshes the page
- types a URL

The request reaches the `DispatcherServlet`.

---

## DispatcherServlet

`DispatcherServlet` is the front controller of Spring MVC.

### Package

```java
org.springframework.web.servlet.DispatcherServlet
```

### Responsibilities

- receives all incoming requests
- finds the matching controller
- invokes controller method
- gets the view name
- sends it to `ViewResolver`
- sends response back to the client

### Front Controller Meaning

A front controller is a single central component that receives all requests and forwards them to the proper handler.

In Spring MVC, `DispatcherServlet` is the front controller.

### Why use it?

- centralized request handling
- logging
- validation
- authentication
- exception handling
- URL mapping

### Traditional configuration (`web.xml`)

```xml
<servlet>
    <servlet-name>dispatcher</servlet-name>
    <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
</servlet>

<servlet-mapping>
    <servlet-name>dispatcher</servlet-name>
    <url-pattern>/</url-pattern>
</servlet-mapping>
```

> In modern Spring MVC, `web.xml` is usually replaced by Java configuration.

---

## Controller and Mapping

### @Controller

`@Controller` marks a class as a web controller.

```java
@Controller
public class HomeController {
}
```

### @RequestMapping

`@RequestMapping` maps an HTTP URL to a controller or method.

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

```text
/student/home
```

### Common mapping annotations

- `@GetMapping`
- `@PostMapping`
- `@PutMapping`
- `@DeleteMapping`

---

## ViewResolver

`ViewResolver` converts the logical view name returned by the controller into the actual page.

Example:

```java
return "index";
```

may resolve to:

```text
/WEB-INF/views/index.jsp
```

### Java configuration

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

### XML configuration

```xml
<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
    <property name="prefix" value="/WEB-INF/views/"/>
    <property name="suffix" value=".jsp"/>
</bean>
```

### Flow

```text
Browser Request
       ↓
Controller
       ↓
return "index";
       ↓
ViewResolver
       ↓
/WEB-INF/views/index.jsp
       ↓
Response to Browser
```

---

## View

A View is the presentation page shown to the user.

Examples:

- JSP
- Thymeleaf
- FreeMarker

The View:

- displays data
- accepts user input
- shows response from controller

---

## Spring MVC Project Setup Using Annotations

1. Create a Dynamic Web Project
2. Convert it into a Maven project
3. Add Maven dependencies
4. Create Spring MVC configuration class
5. Create `WebApplicationInitializer`
6. Create controller
7. Create JSP files in `/WEB-INF/views/`
8. Run on Tomcat

### Maven dependencies

```xml
<dependencies>

    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-webmvc</artifactId>
        <version>6.1.5</version>
    </dependency>

    <dependency>
        <groupId>jakarta.servlet</groupId>
        <artifactId>jakarta.servlet-api</artifactId>
        <version>5.0.0</version>
        <scope>provided</scope>
    </dependency>

    <dependency>
        <groupId>jakarta.servlet.jsp.jstl</groupId>
        <artifactId>jakarta.servlet.jsp.jstl-api</artifactId>
        <version>2.0.0</version>
    </dependency>

</dependencies>
```

---

## Spring MVC Configuration Class

```java
package org.techhub.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
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

### @EnableWebMvc

`@EnableWebMvc` enables MVC configuration.

It activates:

- request mapping
- validation
- data binding
- message converters
- view support

---

## WebAppInitializer.java

This replaces `web.xml` in modern Spring MVC applications.

```java
package org.techhub.config;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext)
            throws ServletException {

        AnnotationConfigWebApplicationContext context =
                new AnnotationConfigWebApplicationContext();

        context.register(WebMvcConfig.class);

        DispatcherServlet dispatcher = new DispatcherServlet(context);

        ServletRegistration.Dynamic servlet =
                servletContext.addServlet("dispatcher", dispatcher);

        servlet.setLoadOnStartup(1);
        servlet.addMapping("/");
    }
}
```

### Explanation

#### Step 1: implement `WebApplicationInitializer`

```java
public class WebAppInitializer implements WebApplicationInitializer
```

- This interface is detected by the servlet container.
- It replaces `web.xml`.

#### Step 2: `onStartup()`

```java
public void onStartup(ServletContext servletContext)
```

- Called automatically when the app starts.
- Used to configure the application programmatically.

#### Step 3: create Spring container

```java
AnnotationConfigWebApplicationContext context =
        new AnnotationConfigWebApplicationContext();
```

#### Step 4: register config class

```java
context.register(WebMvcConfig.class);
```

#### Step 5: create `DispatcherServlet`

```java
DispatcherServlet dispatcher = new DispatcherServlet(context);
```

#### Step 6: register the servlet

```java
ServletRegistration.Dynamic servlet =
        servletContext.addServlet("dispatcher", dispatcher);
```

#### Step 7: load on startup

```java
servlet.setLoadOnStartup(1);
```

#### Step 8: map the URL

```java
servlet.addMapping("/");
```

---

## Controller Example

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

## JSP Pages

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
<title>Welcome Page</title>
</head>
<body>
  <h1>This is the welcome page</h1>
</body>
</html>
```

---

## Request Flow in Spring MVC

```text
Browser
   │
   ▼
HTTP Request
   │
   ▼
DispatcherServlet
   │
   ▼
Handler Mapping
   │
   ▼
Controller
   │
   ▼
Business Logic / Service
   │
   ▼
Model
   │
   ▼
ViewResolver
   │
   ▼
JSP Page
   │
   ▼
Browser Response
```

---

## Registration Project

### Objective

Create a registration form with:

- Name
- Email
- Contact

On submit, the data is stored in the model and displayed on a result page.

### Project Structure

```text
RegistrationProject
│
├── src/main/java
│   └── org.techhub
│       ├── config
│       │   ├── MVCConfig.java
│       │   └── WebAppInitializer.java
│       ├── controller
│       │   └── RegisterController.java
│       └── model
│           └── Register.java
│
└── src/main/webapp
    └── WEB-INF
        └── views
            ├── register.jsp
            └── welcome.jsp
```

### Step 1: register.jsp

```jsp
<form action="${pageContext.request.contextPath}/save" method="POST">

    <input type="text" name="name" placeholder="Enter Name"/><br><br>
    <input type="text" name="email" placeholder="Enter Email"/><br><br>
    <input type="text" name="contact" placeholder="Enter Contact"/><br><br>
    <input type="submit" value="Register"/>

</form>
```

### Explanation

- `action="/save"` sends the form to `/save`
- `method="POST"` sends the data in request body
- input names must match the model properties

### Step 2: Model class `Register.java`

```java
package org.techhub.model;

public class Register {

    private String name;
    private String email;
    private String contact;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
```

### Step 3: Controller `RegisterController.java`

```java
package org.techhub.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.techhub.model.Register;

@Controller
public class RegisterController {

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String regPage() {
        return "register";
    }

    @RequestMapping(value="/save", method=RequestMethod.POST)
    public String saveReg(Register reg, Map<String, Register> map) {

        map.put("r", reg);
        return "welcome";
    }
}
```

### Data Binding

Spring automatically matches form field names with object properties.

```text
name    -> reg.setName()
email   -> reg.setEmail()
contact -> reg.setContact()
```

### Step 4: welcome.jsp

```jsp
<h1>Form Submitted Successfully</h1>

<h2>Name : ${r.name}</h2>
<h2>Email : ${r.email}</h2>
<h2>Contact : ${r.contact}</h2>
```

### Complete flow

```text
User
  ↓
register.jsp
  ↓
Submit form
  ↓
POST /save
  ↓
RegisterController
  ↓
Spring binds form data into Register object
  ↓
map.put("r", reg)
  ↓
welcome.jsp
  ↓
Show values
```

---

## @RequestParam

`@RequestParam` is used to read request parameters from the URL or form data.

```java
@GetMapping("/search")
public String search(@RequestParam("name") String name) {
    return "Welcome " + name;
}
```

Request:

```text
http://localhost:8080/search?name=Harshad
```

Output:

```text
Welcome Harshad
```

---

## File Upload in Spring MVC

### HTML form

```html
<form action="upload" method="POST" enctype="multipart/form-data">
    <input type="file" name="file">
    <input type="submit" value="Upload">
</form>
```

### Why POST?

- GET sends data in URL
- URL has length limits
- file data is large
- GET is not suitable for upload

### `multipart/form-data`

This encoding type is required for file upload because it sends the file along with metadata.

### `MultipartFile`

```java
@PostMapping("/upload")
public String uploadFile(@RequestParam("file") MultipartFile file) {

    System.out.println(file.getOriginalFilename());
    System.out.println(file.getSize());

    return "success";
}
```

Useful methods:

```java
file.getOriginalFilename();
file.getSize();
file.getContentType();
file.isEmpty();
file.transferTo(destinationFile);
```

---

## REST API in Spring MVC

### What is API?

API stands for Application Programming Interface.

It allows two software systems to communicate over a network.

### What is Web Service?

A web service is a component that allows communication using HTTP/HTTPS.

### Types of web services

- REST API
- SOAP
- GraphQL
- gRPC

### What is REST?

REST stands for Representational State Transfer.

- architectural style
- works over HTTP
- commonly uses JSON
- platform independent

---

## JSON

JSON stands for JavaScript Object Notation.

Example:

```json
{
  "id": 1,
  "name": "Mobile",
  "price": 25000
}
```

### Key features

- lightweight
- easy to read
- language independent
- key-value structure

---

## Jackson Databind

Jackson is used to convert:

- Java object to JSON
- JSON to Java object

### Dependency

```xml
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>2.18.2</version>
</dependency>
```

---

## @RequestBody

`@RequestBody` converts incoming JSON into a Java object.

```java
@PostMapping("/save")
@ResponseBody
public String save(@RequestBody Product product) {
    System.out.println(product.getName());
    return "Saved";
}
```

---

## @ResponseBody

`@ResponseBody` converts a Java object to JSON and sends it in the response.

```java
@GetMapping("/product")
@ResponseBody
public Product getProduct() {
    return new Product(1, "Mobile", 20000);
}
```

Output:

```json
{
   "id":1,
   "name":"Mobile",
   "price":20000
}
```

---

## Example REST Controller

```java
@Controller
@ResponseBody
public class ProductController {

    @GetMapping("/product")
    public Product getProduct() {
        return new Product(1, "Mobile", 25000);
    }

    @GetMapping("/products")
    public List<Product> getProducts() {

        List<Product> list = new ArrayList<>();
        list.add(new Product(1, "TV", 40000));
        list.add(new Product(2, "Laptop", 65000));
        list.add(new Product(3, "Mobile", 25000));

        return list;
    }
}
```

---

## @RestController

Instead of writing:

```java
@Controller
@ResponseBody
```

we can write:

```java
@RestController
public class ProductController {
}
```

`@RestController = @Controller + @ResponseBody`

---

## Postman

Postman is used to test APIs.

### Features

- test GET, POST, PUT, DELETE requests
- send JSON payloads
- view responses
- manage API collections
- document APIs

### Typical process

1. Start Spring app
2. Open Postman
3. Select request type
4. Enter URL
5. Send JSON data for POST requests
6. Click Send
7. Check response

---

## Interview Questions

### Q1. What is Spring MVC?

Spring MVC is a web framework based on the Model-View-Controller pattern. It helps build scalable and maintainable web applications.

### Q2. What is `DispatcherServlet`?

It is the front controller in Spring MVC. It receives all incoming requests and forwards them to the appropriate controller.

### Q3. What is `ViewResolver`?

It maps logical view names like `index` to actual files such as `/WEB-INF/views/index.jsp`.

### Q4. What is the difference between `@Controller` and `@RestController`?

| Annotation | Purpose |
| ---------- | ------- |
| `@Controller` | Returns a view for MVC apps |
| `@RestController` | Returns JSON/XML data for REST APIs |

### Q5. What is data binding?

Data binding is the automatic mapping of request parameters to Java object properties using setter methods.

### Q6. Why is POST used for file upload?

Because file data is large and should be sent in the request body instead of the URL.

### Q7. What is `@RequestBody`?

It converts JSON from the request body into a Java object.

### Q8. What is `@ResponseBody`?

It converts a Java object into JSON and sends it as the response body.

### Q9. What is REST?

REST is an architectural style for building web services over HTTP.

### Q10. What is JSON?

JSON is a lightweight, platform-independent format used to exchange data between apps.

---

## Final Revision Points

- Spring MVC follows the Model-View-Controller pattern.
- `DispatcherServlet` is the front controller.
- `@Controller` handles web requests.
- `@RequestMapping` maps URLs to controller methods.
- `ViewResolver` resolves logical view names into actual JSP pages.
- `@RequestParam` binds request data to method parameters.
- `MultipartFile` is used for file uploads.
- `@RequestBody` and `@ResponseBody` are important for REST APIs.
- JSON is the standard format for API communication.
- Postman is used to test REST APIs.

This is the cleaned and structured Spring MVC revision note.
