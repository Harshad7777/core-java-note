# Servlet Notes

[Web Basics](#web-basics) | [Servlet Overview](#servlet-overview) | [Tomcat Setup](#tomcat-setup) | [Servlet Lifecycle](#servlet-lifecycle) | [Form Handling](#form-handling) | [MVC & Layers](#mvc-and-layered-architecture) | [Lombok](#lombok) | [URL Rewriting](#url-rewriting)

---

## Web Basics

### What is a servlet?

A servlet is Java server-side technology used to create dynamic web applications.

It is similar to PHP, ASP, etc., but built using Java.

### What is a dynamic web application?

A dynamic web page is executed on a server and may connect to a database.

It can change its output depending on the request or database data.

### What is a static web page?

A static web page does not change its content.

Usually created using HTML and CSS.

### Server-side technology

Server-side technologies need a server to run the application.

### Client-side technology

Client-side technologies run on the client/browser.

---

## Client and Server

### What is a server?

A server is software or an application that receives requests from clients, processes them, may interact with a database, and sends a response back.

In Java, Apache Tomcat is commonly used as a web server.

### What is a client?

A client is an application or software that sends requests to the server and receives responses.

In web applications, the browser acts as the client.

### How do client and server communicate?

They communicate using protocols.

### What is a protocol?

A protocol is a set of rules and regulations used for communication between parties.

### Common protocols

#### Communication protocols

- HTTP: HyperText Transfer Protocol
- HTTPS: Secure HTTP
- TCP: Transmission Control Protocol
- UDP: User Datagram Protocol
- IP: Internet Protocol

#### Security protocols

- SSL: Secure Socket Layer
- SFTP: Secure File Transfer Protocol
- SSH: Secure Shell

#### File transfer / email protocols

- FTP: File Transfer Protocol
- SMTP: Simple Mail Transfer Protocol
- POP3: Post Office Protocol v3
- IMAP: Internet Message Access Protocol

---

## Servlet Overview

A servlet is a Java class that handles HTTP requests and generates responses.

It runs inside a servlet container such as Tomcat.

### Basic servlet example

```java
package org.techhub;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/first")
public class FirstDemoServ extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Welcome in first example");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
```

### Code description

- `HttpServlet` is a class from `jakarta.servlet.http`
- It helps us create web pages using servlet technology
- `@WebServlet("/first")` defines the URL path used to call the servlet
- `doGet()` handles GET request
- `doPost()` handles POST request
- `HttpServletRequest` is used to read client data
- `HttpServletResponse` is used to send response to client
- `response.setContentType("text/html")` sets the response type
- `PrintWriter out = response.getWriter()` gives output stream
- `out.println()` prints data on the web page

> Note: `HttpServlet` is a child class of `GenericServlet`.

---

## Tomcat Setup

### Download Apache Tomcat

https://tomcat.apache.org/download-10.cgi

### Tomcat installation notes

When Tomcat is installed, we configure:

- Shutdown port
- Connector port

### What is a port number?

A port number is a unique identifier assigned to a running server.

It helps identify a specific server on the same machine.

Example:

```text
http://localhost:7000
```

If the Tomcat page loads, the server is running successfully.

---

## Servlet Project Setup

### Steps

1. Open Eclipse
2. Create Dynamic Web Project
3. Convert project into Maven project
4. Add Maven dependency for Servlet API

### Maven dependency for Tomcat 10

```xml
<dependencies>
    <dependency>
        <groupId>jakarta.servlet</groupId>
        <artifactId>jakarta.servlet-api</artifactId>
        <version>6.0.0</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```

### Project creation flow

- File → New → Other → Web → Dynamic Web Project
- Give project name
- Finish the setup
- Right click project → Configure → Convert to Maven Project

---

## Servlet Lifecycle

A servlet goes through lifecycle methods such as:

- initialization
- service handling
- destruction

In most practical work, we use:

- `doGet()`
- `doPost()`

These methods receive requests and send responses.

---

## Form Handling

### How to accept input in web applications?

Use HTML forms.

### HTML form syntax

```html
<form name="formname" action="url" method="GET/POST" enctype="application/x-www-urlencoded">
</form>
```

#### Attributes

- `action`: URL of the servlet to call
- `method`: GET or POST
- `enctype`: form encoding type

### GET vs POST

#### GET

- data is visible in the browser URL
- used for small data

#### POST

- data goes in the request body
- more secure and commonly used

### Reading form data in servlet

`HttpServletRequest` provides `getParameter()`.

```java
String name = request.getParameter("name");
```

### Example

```java
package org.techhub;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;

@WebServlet("/add")
public class AddServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("I am servlet");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
```

---

## Registration Example with JDBC

This example stores form data in database.

```java
package org.techhub;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/reg")
public class Register extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String n = request.getParameter("name");
        String e = request.getParameter("email");
        String c = request.getParameter("contact");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/aug2025", "root", "root"
            );

            if (conn != null) {
                PreparedStatement pstmt = conn.prepareStatement(
                    "insert into register values(?,?,?,?)"
                );

                pstmt.setString(1, n);
                pstmt.setString(2, e);
                pstmt.setString(3, c);

                int value = pstmt.executeUpdate();

                if (value > 0) {
                    out.println("<h1>Registration success....</h1>");
                } else {
                    out.println("<h1>Registration Failed.........</h1>");
                }
            } else {
                out.println("<h1>Database is not connected</h1>");
            }
        } catch (Exception ex) {
            out.println("<h1>Error is " + ex + "</h1>");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
```

### Important points

- form controls send data to servlet via request object
- `request.getParameter("name")` reads the submitted value
- JDBC is used to save data into database

---

## Redirecting to Another Page

If we want to redirect or forward from one servlet to another page, use `RequestDispatcher`.

### Steps

```java
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

@WebServlet("/validate")
public class TestServ extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        RequestDispatcher r = request.getRequestDispatcher("dashboard.html");
    }
}
```

### Methods

- `forward()` → forwards control to another page
- `include()` → includes content from another page

---

## MVC and Layered Architecture

### MVC

MVC stands for Model, View, and Controller.

#### Model

- stores data
- POJO class
- used for data transfer

#### View

- user interface
- HTML, CSS, JS, JSP, React etc.

#### Controller

- servlet acts as controller
- accepts request
- sends response
- calls business logic

### Why use MVC?

Without MVC:

- UI logic and business logic are mixed
- code becomes hard to maintain
- changes in one part may break others

With MVC:

- UI and logic are separated
- easier maintenance
- easier to update and scale

---

## Layered Architecture

A typical web application uses layers such as:

- Controller
- Model
- Service / Business layer
- Repository / DAO

### Service layer

A service class contains business logic.

### Repository layer

A repository contains database logic.

### Role of model class

A model is used as a data transfer object (DTO) to store and share data across layers.

---

## CRUD Application

A basic CRUD app may have:

- Add Employee Form
- View Department Form
- View Employee
- View Department-wise Employee

### Tech stack

- Front end: HTML, CSS, Bootstrap, JavaScript, AJAX
- Back end: Servlet, Core Java, JDBC
- Design pattern: MVC, Singleton

---

## System Design

System design is the process of defining:

- how the system works
- how components interact
- how data flows
- how the system handles failures
- how it scales

### Two levels of system design

#### High-level design

Focuses on:

- big picture
- components
- interaction
- architecture

Examples:

- microservices
- monolithic
- API gateway
- database
- cache
- load balancer

#### Low-level design

Focuses on:

- classes
- methods
- data structures
- code-level design

---

## Client-Server Architecture

### Two-tier architecture

- Client
- Server
- Database

### Three-tier architecture

- Client (UI)
- Server (business logic)
- Database

### N-tier architecture

Usually used in microservices architecture where multiple services interact through APIs.

---

## Lombok

Lombok is a library that reduces boilerplate code in Java classes.

It helps avoid writing repetitive getter/setter/constructor code.

### Maven dependency

```xml
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.24</version>
    <scope>compile</scope>
</dependency>
```

### Install Lombok in IDE

Install the Lombok plugin or setup for the IDE being used.

### Common annotations

#### @Getter and @Setter

```java
package org.techhub;

import lombok.*;

@Setter
@Getter
public class Employee {
    private int id;
    private String name;
    private int sal;
}
```

#### @EqualsAndHashCode

```java
package org.techhub;

import lombok.*;

@Setter
@Getter
@EqualsAndHashCode
public class Employee {
    private int id;
    private String name;
    private int sal;
}
```

#### @ToString

```java
package org.techhub;

import lombok.*;

@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Employee {
    private int id;
    private String name;
    private int sal;
}
```

#### @NoArgsConstructor and @AllArgsConstructor

```java
package org.techhub;

import lombok.*;

@Setter
@Getter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private int id;
    private String name;
    private int sal;
}
```

#### @RequiredArgsConstructor

Used when we want constructor with required fields only.

```java
package org.techhub;

import lombok.*;

@Setter
@Getter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Employee {
    @NonNull
    private int id;

    @NonNull
    private String name;

    private int sal;
}
```

#### @Data

`@Data` generates common methods like getter, setter, toString, required constructor, etc.

```java
package org.techhub;

import lombok.*;

@Data
public class Employee {
    @NonNull
    private int id;

    @NonNull
    private String name;

    private int sal;
}
```

---

## URL Rewriting / Query Parameters

URL rewriting is a technique used to pass parameters in the URL.

When a request is passed using query parameters, the destination must usually handle `doGet()`.

### Syntax

```text
http://localhost:port/projectname/urlname?name=value&name=value
```

Example:

```text
localhost:7000/FirstCURDAPPSERV/deldept?did=11
```

### Purpose

- pass data between pages
- send values in the URL
- maintain state in some cases

---

## Final Revision Points

- Servlet is Java server-side technology for dynamic web apps.
- Tomcat is the commonly used servlet container.
- `HttpServlet` is used to handle HTTP requests.
- `doGet()` handles GET requests.
- `doPost()` handles POST requests.
- HTML forms are used to submit user input to servlet.
- `request.getParameter()` reads form values.
- `PreparedStatement` is preferred for database work.
- MVC separates view, model, and controller for cleaner design.
- Lombok reduces boilerplate code.
- URL rewriting passes values through the query string.

This is the cleaned and structured Servlet revision note.
