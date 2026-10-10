# Sankalp RMS – Interview Questions and Answers

This document contains **interview-ready answers** for the Sankalp Restaurant Management System project based on **Spring Boot + JDBC + MySQL + JSP/HTML/CSS/JavaScript + JWT**.

The answers are written in **simple spoken English** so they feel natural during interviews.

## Table of Contents
- [Day 1 – Project & Backend Basics](#day-1--project--backend-basics)
- [Day 2 – Database, Testing, Git & Deployment](#day-2--database-testing-git--deployment)
- [Very Important Interview Flow](#-very-important-interview-flow)

---

# Day 1 – Project & Backend Basics

### 1. Can you explain your project and its main objective?

**Answer:**

My project is **Sankalp Restaurant Management System**, which is a web-based restaurant management application.

The main objective of the project is to digitize and simplify restaurant operations. It manages different modules such as **user authentication, categories, menu items, customers, orders, kitchen operations, billing, dashboard, and reports**.

The system helps restaurant staff manage orders efficiently, allows chefs to track kitchen orders, and helps administrators manage the overall restaurant operations from a single application.

---

### 2. What was your role and responsibility in the project?

**Answer:**

My role was mainly focused on **backend development and integration with the frontend**.

My responsibilities included:

* Developing REST APIs using Spring Boot.
* Implementing authentication and authorization using **Spring Security and JWT**.
* Working with **MySQL database** using JDBC and `JdbcTemplate`.
* Developing modules such as **Category, Menu, Customer, Order, Billing, Dashboard, and Reports**.
* Implementing validation and exception handling.
* Integrating frontend pages with backend APIs.
* Testing APIs using **Swagger** and debugging issues.

I was also involved in database design and deployment-related activities.

---

### 3. Can you explain the overall architecture of your application?

**Answer:**

My application follows a **layered architecture**.

The basic flow is:

```text
Frontend
   ↓
REST Controller
   ↓
Service Layer
   ↓
Repository / DAO
   ↓
MySQL Database
```

The frontend is developed using **JSP, HTML, CSS, and JavaScript**.

The backend is developed using **Spring Boot**. Controllers handle HTTP requests, services contain business logic, and repositories communicate with the database using `JdbcTemplate`.

For security, requests pass through **Spring Security and JWT authentication**.

---

### 4. Which technologies and frameworks did you use, and why?

**Answer:**

I used the following technologies:

* **Java** – main programming language.
* **Spring Boot** – for developing the backend and REST APIs.
* **Spring Security** – for authentication and authorization.
* **JWT** – for stateless authentication.
* **JDBC / JdbcTemplate** – for database communication.
* **MySQL** – relational database.
* **JSP, HTML, CSS, JavaScript** – frontend development.
* **Chart.js** – for dashboard charts.
* **Swagger/OpenAPI** – for API documentation and testing.
* **Maven** – for dependency management and build.
* **Git/GitHub** – for source code management.

I selected Spring Boot because it simplifies backend development and provides good support for REST APIs, security, validation, and database integration.

---

### 5. How does the frontend communicate with the backend?

**Answer:**

The frontend communicates with the backend through **REST APIs using HTTP requests**.

For example, when I want to get menu items, the JavaScript sends a GET request to an API such as:

```text
/api/menu
```

For creating a new order, the frontend sends a POST request:

```text
POST /api/order
```

The backend processes the request and returns the response, usually in **JSON format**.

JavaScript receives the JSON response and updates the webpage dynamically.

---

### 6. How did you design and develop REST APIs in your project?

**Answer:**

I designed REST APIs based on different business modules.

For example:

```text
/api/category
/api/menu
/api/customer
/api/order
/api/bill
/api/dashboard
/api/kitchen
```

I used HTTP methods according to the operation:

```text
GET     → Retrieve data
POST    → Create data
PUT     → Update data
DELETE  → Delete data
```

For example:

```text
GET    /api/menu
POST   /api/menu
PUT    /api/menu/{id}
DELETE /api/menu/{id}
```

I also used proper HTTP status codes and centralized exception handling to provide meaningful responses to the frontend.

---

### 7. Can you explain the request flow from the UI to the database?

**Answer:**

Suppose a staff member creates an order.

The flow is:

```text
User
 ↓
Frontend JSP / JavaScript
 ↓
HTTP POST Request
 ↓
JWT Filter / Spring Security
 ↓
Order Controller
 ↓
Order Service
 ↓
Order Repository
 ↓
JdbcTemplate
 ↓
MySQL Database
```

First, the frontend sends the order details to the REST API.

Spring Security validates the JWT token.

Then the controller receives the request and passes it to the service layer.

The service performs the business logic and calls the repository.

The repository executes the SQL query using `JdbcTemplate`.

Finally, the database result is returned back through the same layers to the frontend.

---

### 8. How did you implement authentication and authorization?

**Answer:**

I implemented authentication using **Spring Security and JWT**.

When the user logs in, the backend verifies the username and password.

If the credentials are valid, the server generates a **JWT token** and sends it to the frontend.

The frontend stores the token and sends it with subsequent requests.

For example:

```text
Authorization: Bearer <JWT_TOKEN>
```

I also implemented **role-based authorization**.

My application has roles such as:

```text
ADMIN
STAFF
CHEF
```

For example, administrators can manage menu and categories, while chefs can access kitchen-related functionality.

So authentication verifies **who the user is**, while authorization verifies **what the user is allowed to do**.

---

### 9. How did you handle exceptions and errors in your Spring Boot application?

**Answer:**

I implemented centralized exception handling using Spring Boot's exception-handling mechanism.

Instead of handling every exception separately in every controller, I created global exception handling.

For example, I handled cases such as:

* Invalid input.
* Resource not found.
* Database errors.
* Invalid login.
* Unauthorized access.
* Duplicate records.

The backend returns an appropriate HTTP status and meaningful error message to the frontend.

This makes the application easier to maintain and provides consistent error responses.

---

### 10. How did you validate user input on both frontend and backend?

**Answer:**

I used validation at both levels.

On the **frontend**, JavaScript validates fields before sending the request.

For example:

* Required fields.
* Valid email format.
* Mobile number.
* Price.
* Empty values.

On the **backend**, I also validate the incoming request because frontend validation alone is not secure.

Backend validation ensures that invalid or malicious data cannot directly enter the database.

So I follow the principle:

```text
Frontend Validation → Better User Experience
Backend Validation  → Security and Data Integrity
```

---

# Day 2 – Database, Testing, Git & Deployment

### 11. How did you connect your Spring Boot application with the database?

**Answer:**

I connected my Spring Boot application with **MySQL**.

I configured the database connection in the application's configuration file with details such as:

```text
Database URL
Username
Password
Driver
```

For database operations, I used **Spring JDBC and JdbcTemplate**.

The repository layer uses `JdbcTemplate` to execute SQL queries such as:

```sql
SELECT
INSERT
UPDATE
DELETE
```

This allowed me to directly control the SQL queries and database operations.

---

### 12. Which database did you use, and how did you design your tables/entities?

**Answer:**

I used **MySQL** as the database.

I divided the database into different tables based on the application's modules.

Some important tables are:

```text
users
category
menu
customer
orders
order_details
bill
```

For example, the `category` table stores category information, while the `menu` table stores menu items.

The menu table has a relationship with the category table using:

```text
category_id
```

Similarly, orders and order details are separated so that one order can contain multiple food items.

This follows a structured relational database design and avoids unnecessary data duplication.

---

### 13. Did you use JPA/Hibernate? If yes, can you explain the entity relationships?

**Answer:**

No, in my project I did **not use JPA/Hibernate**.

I used **Spring JDBC with JdbcTemplate** for database operations.

Because of this, I worked directly with SQL queries and relational tables instead of JPA entities.

For example, I designed relationships using primary keys and foreign keys.

A simple example is:

```text
Category
   |
   | 1
   |
   | many
   ↓
Menu
```

One category can contain multiple menu items.

For orders, I used a parent-child structure:

```text
Order
  ↓
Order Details
```

One order can contain multiple order-detail records.

---

### 14. How did you implement pagination, sorting, and searching?

**Answer:**

I implemented pagination at the API level.

For example, the frontend sends information such as:

```text
page
pageSize
```

The backend uses these values to retrieve only the required records instead of loading the entire table.

For example:

```text
page = 0
pageSize = 7
```

The SQL query can use:

```sql
LIMIT
OFFSET
```

For searching, I use SQL conditions such as `LIKE`.

For example:

```sql
WHERE item_name LIKE ?
```

This improves performance when the database contains a large number of records.

---

### 15. How did you handle logging and debugging issues in your project?

**Answer:**

I used application logs and debugging tools to identify problems.

During development, I checked:

* Spring Boot console logs.
* SQL/database errors.
* HTTP status codes.
* Browser developer console.
* Network requests.
* Swagger API responses.
* Debugger breakpoints.

For example, when an API returned a **400 Bad Request**, I checked the frontend request payload, controller parameters, service logic, and database query to identify the actual problem.

I also used proper exception messages to make debugging easier.

---

### 16. How did you write unit and integration tests for your application?

**Answer:**

For testing, I focused on testing individual backend functionalities and API flows.

For unit testing, I can test service-level business logic independently.

For integration testing, I test the complete flow such as:

```text
API Request
   ↓
Controller
   ↓
Service
   ↓
Repository
   ↓
Database
```

I also used **Swagger** extensively to manually test REST APIs during development.

For example, I tested:

```text
Login
Category CRUD
Menu CRUD
Customer
Order
Billing
Kitchen
```

This helped me identify issues before integrating the modules with the frontend.

> **Interview tip:** If you did not actually write JUnit/Mockito test classes, don't say that you did. Say you performed API/integration testing with Swagger and explain that you would add automated JUnit/Mockito coverage as an improvement.

---

### 17. How did you manage source code and collaborate with your team using Git?

**Answer:**

I used **Git and GitHub** for source-code management.

My basic workflow was:

```text
Create / Clone Repository
        ↓
Create Branch
        ↓
Write Code
        ↓
git add
        ↓
git commit
        ↓
git push
```

For example:

```bash
git checkout -b feature-branch

git add .

git commit -m "Add menu management"

git push -u origin feature-branch
```

Using branches helps keep features separate and makes collaboration easier.

---

### 18. How did you deploy your application, and what tools did you use?

**Answer:**

I prepared my Spring Boot application as a deployable application using **Maven**.

During development, I ran the application using Spring Boot and embedded Tomcat.

I also worked with Tomcat while integrating the web application.

The general deployment flow is:

```text
Source Code
    ↓
Maven Build
    ↓
JAR/WAR
    ↓
Server / Tomcat
    ↓
Database Configuration
    ↓
Application Running
```

Before deployment, I verify database configuration, API endpoints, uploaded-file paths, security configuration, and frontend-backend integration.

---

### 19. What was the most challenging issue you faced, and how did you solve it?

**Answer:**

One of the challenging parts was integrating the **Order and Kitchen modules** because an order contains multiple items and its status changes throughout the restaurant workflow.

The order goes through stages such as:

```text
NEW
 ↓
ACCEPTED
 ↓
PREPARING
 ↓
READY
 ↓
SERVED
```

I had to maintain the relationship between the order and its order details and make sure the kitchen status was updated correctly.

I solved the issue by separating the order information and order-detail information and implementing APIs for the kitchen workflow.

I also used debugging, SQL queries, console logs, and Swagger testing to identify and fix API and database issues.

---

### 20. If you had to improve your project now, what changes would you make?

**Answer:**

If I improve the project now, I would make several improvements.

First, I would implement a stronger **multi-restaurant architecture**, where each administrator can manage a separate restaurant with its own:

```text
Staff
Customers
Menu
Orders
Billing
Reports
```

I would add a `restaurant_id` to the relevant tables and ensure that users can access only their restaurant's data.

I would also improve:

* Automated JUnit and Mockito test coverage.
* Better API documentation.
* Centralized logging.
* Better dashboard analytics.
* Role-based permissions with finer access control.
* Database indexing for better performance.
* Docker-based deployment.
* CI/CD using GitHub Actions.
* Better UI/UX and responsive design.
* Secure file-upload validation.
* Audit logs for important administrative operations.

This would make the application more scalable, secure, and production-ready.

---

# ⭐ Very Important Interview Flow

For your project, remember this simple flow:

```text
                    SANKALP RMS
                         |
        +----------------+----------------+
        |                                 |
    FRONTEND                           BACKEND
        |                                 |
 JSP / HTML / CSS / JS             Spring Boot
        |                                 |
        |                         REST Controllers
        |                                 |
        |                            Services
        |                                 |
        |                         JDBC / Repository
        |                                 |
        +------------ API ----------------+
                                          |
                                       MySQL
```

### Security flow

```text
Login
  ↓
Username + Password
  ↓
Spring Security
  ↓
JWT Token
  ↓
Frontend stores Token
  ↓
Bearer Token
  ↓
JWT Filter
  ↓
Role Check
  ↓
API Access
```

### Restaurant order flow

```text
Customer
   ↓
Staff creates Order
   ↓
Order + Order Details
   ↓
Kitchen
   ↓
ACCEPTED
   ↓
PREPARING
   ↓
READY
   ↓
SERVED
   ↓
Billing
   ↓
Payment
```

### Your strongest technologies to mention

```text
Java
Spring Boot
Spring Security
JWT
REST API
JDBC / JdbcTemplate
MySQL
JSP
HTML
CSS
JavaScript
Chart.js
Swagger
Maven
Git / GitHub
```

**Interview tip:** Don't memorize these answers word-for-word. Remember the **flow + keywords** and explain them naturally. For your project, especially be ready for follow-up questions on **JWT, Spring Security, JdbcTemplate, Order/OrderDetails relationship, REST APIs, MySQL joins, and your multi-restaurant design**.
