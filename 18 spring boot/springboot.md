# Spring Boot Notes

[Overview](#overview) | [Why Spring Boot](#why-spring-boot) | [API and Architecture Basics](#api-and-architecture-basics) | [Monolithic vs Microservices](#monolithic-vs-microservices) | [Spring Boot Features](#spring-boot-features) | [Interview Answers](#interview-answers)

---

## Overview

Spring Boot is a Java framework built on top of Spring.

It is used to create standalone, production-ready applications with minimal configuration.

It is especially popular for:

- REST APIs
- microservices
- backend applications
- enterprise Java projects

Spring Boot reduces boilerplate code and speeds up development.

---

## Why Spring Boot?

### 1. Auto Configuration

Spring Boot automatically configures the application based on the dependencies you add.

Example:

If you add `spring-boot-starter-web`, Spring Boot automatically configures:

- Spring MVC
- `DispatcherServlet`
- Jackson for JSON
- embedded Tomcat

### 2. Embedded Server

Spring Boot includes an embedded server, so you do not need to manually install and configure Tomcat.

Supported servers:

- Tomcat (default)
- Jetty
- Undertow

### 3. Starter Dependencies

Starter dependencies bundle commonly used libraries together.

Examples:

- `spring-boot-starter-web`
- `spring-boot-starter-data-jpa`
- `spring-boot-starter-security`
- `spring-boot-starter-test`

Benefits:

- fewer dependency issues
- compatible versions are managed automatically
- faster setup

### 4. Production-Ready Features

Spring Boot includes tools such as Actuator for:

- health checks
- metrics
- monitoring
- environment information

### 5. Minimal Configuration

Spring Boot follows the convention-over-configuration approach.

This means developers can focus more on business logic and less on setup.

---

## API and Architecture Basics

### What is an API?

API stands for Application Programming Interface.

It is a set of rules that allows two software systems to communicate.

Example:

- mobile app requests data from a server
- server returns JSON response

### Types of APIs

- Open API
- Internal API
- Partner API
- Composite API
- REST API
- SOAP API
- GraphQL API

### What is a REST API?

REST stands for Representational State Transfer.

It is an architectural style used to build web services over HTTP.

Common HTTP methods:

- `GET` → read data
- `POST` → create data
- `PUT` → update full resource
- `PATCH` → update partial resource
- `DELETE` → delete data

REST APIs usually use JSON for data exchange.

### Benefits of REST API

- lightweight
- platform independent
- easy to develop
- stateless
- scalable
- supports JSON/XML

---

## Monolithic vs Microservices

### Monolithic Architecture

A monolithic application is built as one single unit.

It contains:

- frontend
- backend logic
- database access
- all modules in one codebase

### Benefits of Monolithic Architecture

- simple to build
- easy to test initially
- simple deployment
- low infrastructure cost
- easier debugging in small projects

### Limitations of Monolithic Architecture

- hard to scale
- slow deployment
- tight coupling
- risk of full-system failure
- difficult to use different technologies per module

### Microservices Architecture

Microservices divides an application into small independent services.

Each service handles one business function.

Example:

- User Service
- Product Service
- Cart Service
- Order Service
- Payment Service
- Notification Service

### Features of Microservices

- independent services
- single responsibility
- independent deployment
- independent database possible
- API-based communication

### Advantages of Microservices

- independent scaling
- faster development by multiple teams
- fault isolation
- technology flexibility
- easier maintenance of smaller services

### Disadvantages of Microservices

- complex management
- network latency
- data consistency challenges
- higher infrastructure cost
- distributed debugging is harder

---

## Spring Boot Features

### 1. Auto Configuration

Spring Boot automatically configures beans and components based on the dependencies in the project.

### 2. Embedded Server

You do not need an external server such as Tomcat installed separately.

### 3. Starter Dependencies

Starter packages manage dependency versions and reduce setup time.

Examples:

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```

This includes common web-related libraries and server support.

### 4. Actuator

Spring Boot Actuator provides useful production features such as:

- health
- metrics
- info endpoint
- environment data

### 5. Minimal Configuration

Most setup happens automatically, so developers can focus on application logic.

---

## Spring Boot Interview Answers

### Q1. What is Spring Boot?

Spring Boot is a Java-based framework built on top of Spring. It helps developers create standalone, production-ready applications with minimal configuration. It is widely used for building REST APIs and microservices.

### Q2. Why do we use Spring Boot?

We use Spring Boot because it reduces configuration effort, provides auto-configuration, includes embedded servers, uses starter dependencies, and supports production-ready features.

### Q3. What is an API?

An API is a set of rules that allows two software systems to communicate with each other.

### Q4. What is a REST API?

A REST API is a web service that communicates using HTTP methods like GET, POST, PUT, PATCH, and DELETE, usually with JSON data.

### Q5. What is Monolithic Architecture?

Monolithic architecture is a single, unified application where all modules are combined into one codebase.

### Q6. What is Microservices Architecture?

Microservices architecture breaks an application into small, independent services, each responsible for one business function.

### Q7. What are the benefits of Spring Boot?

Benefits include auto-configuration, embedded servers, starter dependencies, faster project setup, and production-ready monitoring tools.

---

## Final Revision Points

- Spring Boot is built on top of Spring Framework.
- It is used to create standalone, production-ready applications.
- It provides auto-configuration to reduce manual setup.
- It includes embedded servers like Tomcat.
- Starter dependencies simplify dependency management.
- Spring Boot Actuator helps with monitoring and health checks.
- REST APIs are used for communication between client and server.
- Monolithic apps are built as one unit; microservices split them into independent services.
- Spring Boot is widely used for backend development and microservices.

This is the cleaned and structured Spring Boot revision note.
