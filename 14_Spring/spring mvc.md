
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

---

# ViewResolver

---

The **ViewResolver** converts the logical view name returned by the controller into the actual view page.

Example:

```java
return "index";
```

ViewResolver converts it into:

```
/WEB-INF/views/index.jsp
```

Configuration:

```java
viewResolver.setPrefix("/WEB-INF/views/");
viewResolver.setSuffix(".jsp");
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

```java
public class WebAppInitializer
implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext)
            throws ServletException {

        AnnotationConfigWebApplicationContext context =
                new AnnotationConfigWebApplicationContext();

        context.register(WebMvcConfig.class);

        DispatcherServlet dispatcher =
                new DispatcherServlet(context);

        ServletRegistration.Dynamic servlet =
                servletContext.addServlet("dispatcher", dispatcher);

        servlet.setLoadOnStartup(1);

        servlet.addMapping("/");
    }
}
```

---

# Controller Example

```java
@Controller
public class TestController {

    @GetMapping("/")
    public String homePage() {
        return "index";
    }

    @GetMapping("/welcome")
    public String welcomePage() {
        return "welcome";
    }
}
```

---

# JSP Pages

### index.jsp

```jsp
<h1>I am Home Page</h1>

<a href="${pageContext.request.contextPath}/welcome">
    Welcome Page
</a>
```

### welcome.jsp

```jsp
<h1>Welcome to Spring MVC</h1>
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

This version is technically accurate, uses modern Spring MVC practices (Spring 6 with Jakarta EE), and is suitable for interviews as well as learning.
