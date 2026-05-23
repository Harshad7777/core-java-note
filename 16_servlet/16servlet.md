Servlet  
________________________________________________________________________
Q. What is a servlet?
____________________________________________________________________
Servlet is java server side technology which is used for create dynamic web application like as PHP , ASP etc

Q. What is a dynamic web application or dynamic web pages?
________________________________________________________________________
Those pages are executed on a server and may be connected with a database called dynamic web pages.

Q. What are static web pages?
Static pages means those page not change its content called as static pages 
Normally design static web pages using  HTML and CSS

Q. What is server side technology?
___________________________________________________________________
Those technology need a server for execute its application called as server side technologies 
Q. What is client side technology?
Those technologies required client for execute its application called as client side technologies 

Q. What is a server?
________________________________________________________________________
Server is application or software which is used for maintain application at centralize place accept the request from client and process on request and communicate database if required and generate  response and send to client called as server 
If we think about java we can use apache tomcat as web server 

Q. What is a client?
Client is application or software which is used for send request to server and get response according to request called as client 
In the case of web technologies browser act as client 

Q. How client and server communicate with each other?
_______________________________________________________________
Client and server can communicate with each other with the help of protocols 

Q. What is protocol?
___________________________________________________________________
Protocol means set of rules and regulation set for provide communication between parties called  as protocol




Types of protocol 
________________________________________________
Communication protocol
Http protocol : hypertext transfer protocol - this protocol normally used in web technologies to send request using html/text format and get response using html page format 
Https : A Secure encrypted version of HTTP ,crucial for online banking and ecommerce 
TCP : Transmission control protocol : ensure reliable order delivery of data packages between application

UDP:User data protocol - focuses on speed over reliability frequently used for streaming and gaming 
IP - Internet protocol handle the addressing and routing packets across interconnected networks 

Security protocol
SSL - Secure socket layer - encrypts internet connections to prevent data
SFTP: Secure File Transfer protocol - safely transfer files ,encrypting both data and commands 
SSH- Secure shell - provide a secure channel over unsecured networks for remote login 

File Transfer and Email protocols 
FTP: File transfer protocol used for transfer file between client and server
SMTP: simple mail transfer protocol : used for sending email between server 
POP3: post office protocol v3 : retrieve emails typically download them and remove them from the server 
IMAP: Internet messaging access protocol : access and manages emails directly on the server allowing synchronization across multiple devices 


If we want to work with a servlet we have to use the following steps.

Download and installed apache tomcat  as web server 
________________________________________________________________
https://tomcat.apache.org/download-10.cgi

Note: if we want to download apache tomcat as a web server you can visit the link above.

Note: when we install apache tomcat then we have to give two port numbers 
Shutdown port 
Connector port 




           Q. What is port number & Why need to give port number?
          __________________________________________________________________
Port number is unique identity number provided to server at the time of installation called as port number 
Because server is application or software means single machine can have more than one software there is possibility single machine can have more than one server 
So identify particular server we have to give unique identification number to server called as port number & Using that port number we can access a server 
Once we install server successfully open the browser and type following url in browser address bar 

http://localhost:7000 - as per our example

If we found this screen consider server is running in a services 


Open the eclipse 

Create dynamic web project 
__________________________________________________________
File - new - other  - web - select dynamic web project  - click on next button  – give project name  — click on next  – click on next and finish

Convert web project in maven project 
Right click on project  —- configure  — convert to maven project  —-click on finish 


Add following maven dependency 
If we work with tomcat 10 we have to add jakarta maven dependencies 
<dependencies>
  <dependency>
    <groupId>jakarta.servlet</groupId>
    <artifactId>jakarta.servlet-api</artifactId>
    <version>6.0.0</version>
    <scope>provided</scope>
</dependency>
  </dependencies>

Write  a servlet code and run program 
Steps to writing  a servlet 
Create package under src/main folder 
Create servlet 
Right click on created package  — new —- other  —- web  — servlet  — click on next button  —- give servlet class name  —- click on next button 
So we get following things 

Click on next and finish button so we get following type of auto generated code

Example with source code
____________________________________________________________________
package org.techhub;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.*;//FirstDemoServ - java class but act as web page 
@WebServlet("/first")
public class FirstDemoServ extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	            response.setContentType("text/html");	 
	            PrintWriter out=response.getWriter();
	            out.println("Welcome in first example");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		doGet(request, response);
	}
}
 
Code description 



public class FirstDemoServ extends HttpServlet
________________________________________________________________________
Here HttpServlet is a class from jakarta.servlet.http  package and basically it is an abstract class and helps us to develop the web pages using a servlet.
FirstDemoServ is a class which contain all feature of HttpServlet 

@WebServlet("/first"): this is the annotation which is used to set the url for call servlet from the browser.

protected void doGet(HttpServletRequest request, HttpServletResponse response)  or 
protected void doPost(HttpServletRequest request, HttpServletResponse response)
________________________________________________________________________
doGet() and doPost() are the methods which help us accept request from client and send response back to client using HttpServletRequest and HttpServletResponse interfaces 
HttpServletRequest:  this interface is used for accept request from client 
HttpServletResponse: this interface is used for generating responses to clients.

 response.setContentType("text/html"): this method decide the response type and by default it is text/html

  PrintWriter out=response.getWriter(): this method is used for return reference of PrintWriter and PrintWriter class from java.io package and this class is used for displaying the output on a web page.


out.println(): this method is used for displaying the output on a web page.

Note: HttpServlet is child class of GenericServlet



Example: WAP to create a servlet and calculate  addition of two values.

If we think about the above code we calculate the addition of two values but values are fixed.
We want to accept input from keyboard and after that calculate its addition 

How to accept the input in web technologies 
_________________________________________________
If we want to accept input from a keyboard in web technologies we have to use form in html.

How to submit html form to servlet 
________________________________________________________________________
Create dynamic web project 
Convert to maven project 
Add jakarta maven dependencies 
Create .html page under webapp folder (client side)

Create server side  web page i.e servlet 
package org.techhub;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.*;
@WebServlet("/add")
public class AddServlet extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   response.setContentType("text/html");
		   PrintWriter out=response.getWriter();
		   out.println("I am servlet");	   
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
Provide communication between html page and servlet page i.e client side page and server side page 
If we want to provide the communication between client page and server page  we have form tag in html 

<form name=’formname’ action=’url’  method=’GET/POST’  enctype=’application/x-www-urlencoded or multipart/form-data’>
</form>

Form tag: form tag is used for send request from html page to server page 
action: action indicate the url or servlet url mention in @WebServlet annotation and this action decide which servlet page should call on html form submission 
Method : method indicate form submission technique it may be GET or POST 
When we use get method then we send data in browser address bar in the form name and value pair 
When we use the post method then we send data via page body 

enctype=’application/x-www-urlencoded or multipart/form-data
Note: we will discuss this concept in spring MVC at the time file uploading example 


Note: if we think about screenshot we submit html page to servlet and call servlet on form submission and once submit form to servlet or server then we can send data to server side page as request using form control
If we want to accept form data at server side using a servlet we have one interface name as 
HttpServletRequest it is parameter of doGet() and doPost() methods 

HttpServletRequest interface provide getParameter() method to us for accept form data using its name and return its value 

Syntax: String getParameter(String formcontrolname): this method accepts form data using its name and returns html control value if name not found return null value.


Example : Create Web Application for design registration page with field name,email and contact and store in database table.

Create dynamic web project 
Convert in maven project 
Add two dependencies 
Jakarta 
Mysql connector maven dependency 
     D.   write servlet and JDBC code for save data in table 

Example with source code 
________________________________________________________________
package org.techhub;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
/**
 * Servlet implementation class Register
 */
@WebServlet("/reg")
public class Register extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
		 PrintWriter out=response.getWriter();
		 String n=request.getParameter("name"); //accept form data   $_GET['name']
		 String e=request.getParameter("email");
		 String c=request.getParameter("contact");
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/aug2025","root","root");
			 if(conn!=null) {
 PreparedStatement pstmt=conn.prepareStatement("insert into register values('0',?,?,?)");
				 pstmt.setString(1, n);
				 pstmt.setString(2, e);
				 pstmt.setString(3, c);
				 int value=pstmt.executeUpdate();
				 if(value>0) {
					 out.println("<h1>Registration success....</h1>");
				 }
				 else {
					 out.println("<h1>Registration Failed.........</h1>");
				 }
				 
			 }
			 else {
				 out.println("<h1>Database is not connected</h1>");
			 }
		 }
		 catch(Exception ex) {
			 out.println("<h1>Error is "+ex+"</h1>");
		 }
		 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}




Example: we want to design the application for sign in and signup 
Tech stack 
___________________________________________________
Front end  - 
Html , CSS , bootstrap , JS

Backend- Servlet,JDBC , Core JAVA 

When we user click on register link 

When user login then submit username and password in database and check it 






How to redirect user from one page to another page using a servlet
________________________________________________________________________
If we want to redirect page from a one servlet to another servlet or from one page to another page we have to use RequestDispatcher interface

Steps to work with a RequestDispatcher interface 
________________________________________________________________________
Add jakarta package 
import jakarta.servlet.*;
import jakarta.servlet.http.*;
Create reference of RequestDispatcher interface 
____________________________________________________________
If we want to create reference of RequestDispatcher interface we have getRequestDispatcher() method of HttpServletRequest 
Syntax: RequestDispatcher ref=requestref.getRequestDispatcher(String url);

Example with source code 
__________________________________________________________________
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

@WebServlet("/validate")
public class TestServ extends HttpServletRequest
{
	  public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException 
	  {
		    response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			RequestDispatcher r=request.getRequestDispatcher("dashboard.html");
			
	  }
}

Call its forward() and include() method 
void forward(HttpServletRequest,HttpServletResponse):  this method is used for forward control servlet to destination page 
void include(HttpServletRequest,HttpServletResponse): this method is used for add another page content in a servlet

 





First CRUD Application 
_________________________________________________________________


Add Employee Form 
___________________________________________________________________

View Dept form 

View employee

View Dept wise employee
___________________________________________________________________


TechStack
_______________________________________________________
Front end:  html /css/bootstrap/javascript/ajax
Backend :  Servlet  + core java + JDBC 
Design pattern: MVC, singleton 

Architecture layer 
Client server architecture 
MVC 
Layered architecture 
Monolithic Architecture 

Q. What is system design?
________________________________________________________________
System design is the process of defining:
How a software system will work 
How components will interact with each other 
How data will flow 
How system scale and handle the failures 
It is blue print of the software system 

System design has two levels 

 There are two levels in system design
__________________________________________________
High level design 
 In high level design focus on 
Big picture 
Components 
Interaction 

Example: 
    Microservice or monolithic 
    API Gateway 
    Database 
    Caching 
    Load balances 

Low level design 
Focus 
 Classes 
 Methods 
 Data structure 
 Code level design 
	 
Architecture layer 
Client server architecture 
MVC 
Layered architecture 
Monolithic Architecture 

Client server architecture : 
Client : the system or app that user interact with 
Server : the system that provide data , logics and services 

Types of client and server architecture  
_________________________________________________________
Two-tier architecture 
Client - server  - database 
Example: simple webapps
Three  tier architecture 
Client (UI)
Server business (logics )
Database 
N-Tier architecture (normally used in microservices)
API Gateway 
Multiple services 
Database 


MVC :MVC Stands for model view and controller basically it is a design pattern in web application development where we separate the designing logics , server side processing logics and business logics called as MVC

V - View means a user interface or designing part of application from user can provide input and get results called as view 
View can create by using html,css,js,.jsp,react,asp etc

M - M stands for Model here model object which is used for store data send by view to controller and pass data to service layer and from service repository means it work as data transfer object as well as model hold business and rules and processing 
If we think about java model is POJO class 

C - Controller is basically class or here servlet  is a controller and the goal of controller is accept requested data send by view and store in model class object and  process request and send response to client on view page 
Controller also used for send client request to service layer means controller can communicate with a service layer and service layer can communicate with repository



How to implement MVC practically using a servlet 
_________________________________________________________________________
Steps.
Design view page : here we use html for design view page 
Example:we want to design registration as view with three field name,email and contact


Create model  : here model class is POJO class which contain setter and getter methods if we think about model we have to maintain some rules 

View page control name and model class setter getter names must be same 


Design controller : Controller is a servlet here which is used for accept request send by view and store data in model class as well as perform processing according request and send response to client 



Q.Why use MVC?
Note: Without MVC UI code contains business logics and database logics are scattered 
When we change UI there is changes logic breaks and if we try to chagne logics UI may be break

When we write MVC we can separate UI and business logics means you change UI logic without touching business logics 
You can update logic without breaking UI  and help to maintain code easily 

Layered architecture 
___________________________________________________________
Layered architecture help us to maintain the code layers 

Controller 
Model 
Service / Business layer 
Repository /DAO 
Note: when we work with web application using MVC + code layer your project code  architecture look like as 


Q. What is a service layer?
________________________________________________________________________
Service is a class which is used for write business logics of application and business logics can vary requirement to requirement of application and service class object normally created in controller means every method of service should call in controller and controller can pass data to service via model and model can stored data view page 

Q. What is the Repository layer?
________________________________________________________________
Repository is class where we write all database logics and repository object should created in service and every method of repository should call from a service and service pass data to repository via model which accepted by controller 

Q. What role of model class in the whole application?
Model work as data transfer object which is used for store data and share with service,repository etc layers 


Lombok
______________________________________________________________
Lombok is a very handy tool which helps us to avoid the boilerplate code and provides a number of features to us.
Means if we think about the model classes in application where the we write a setter and getter methods with parameterized constructor or no argumented constructor so this type of code is not play important role in business logics so lombok provide facility to us avoid writing this type of code 

Steps to work with lombok
________________________________________________________________________
Create maven  project 
Add the lombok maven dependency or following dependency 
<dependencies>
 <!-- Source: https://mvnrepository.com/artifact/org.projectlombok/lombok -->
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.24</version>
    <scope>compile</scope>
</dependency> 
  </dependencies>

Execute maven dependency and allocate to tool like as eclipse,springtoolsuite etc 

Note: if steps mention in above screenshot for select tool and install lombok with tool 

Once we install lombok we can use lombok library in application 
Lombok  provide some annotation to us for avoid boiler plate like as generate setter and getter methods, constructors etc 

How to generate setter and getter method using a lombok
_____________________________________________________________
If we want to generate the setter and getter method using a lombok we have two annotations 
@Getter and @Setter  

package org.techhub;
import lombok.*;
@Setter
@Getter
public class Employee {
   private int id;
   private String name;
   private int sal;
}

How to generate equals and hashcode method using lombok
________________________________________________________________________
If we want to generate equals and hascode method using lombok we have @EqualsAndHashCode annotation provided by lombok library to us

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

How to generate toString() method using a lombok 
_____________________________________________________________
To generate the toString() method we have to use @ToString() annotation of lombok.

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

If we want to skip any field of object  in toString() method we have one  option name as exclude in @ToString annotations 

How to generate constructor using a lombok
________________________________________________________________________
@NoArgsConstructor:this annotation help us to create default constructor in model clas 

@AllArgsConstructor: this annotation help us to generate constructor with all parameters. 

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
   //public Employee(int id,String name,int sal)
}

Note: if we use the @NoArgsConstructor annotation with class and if we have any field as final in class then we get compile time errors so avoid writing @NoArgsConstructor when the model class contains the final value or we can use force parameter with true value in @NoArgsConstructor annotation  

package org.techhub;

import lombok.*;

@Setter
@Getter
@EqualsAndHashCode
@ToString 
@NoArgsConstructor(force=true)
@AllArgsConstructor
public class Employee {
   private final int id;
   private String name;
   private int sal;
   //public Employee(int id,String name,int sal)
}

Note: if we think about @NoArgsConsturctor create default constructor without parameter, @AllArgsConstructors create constructor with parameter and pass all variable declared within class as parameter  but if we want to create constructor with a specified number of parameters according to user choice then we have one more annotation name as @RequiredArgsConstructor and when we use the Required augmented constructor and pass field as parameter according to use choice then field or variable must  mark with @NonNull annotations

Example with source code
_________________________________________________________________________
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

@Data annotation : this annotation can generate all feature mention above like as @Setter,@Getter method ,@toString(),@NoArgsConstructor,@RequiredArgsConstructor etc 



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


URL Rewriting concept or query parameter concept 
________________________________________________________________________
URL Rewriting is a concept where we can pass parameter to destination as request called as url rewriting 
And when pass request using url rewriting or query parameter technique then your destination must be doGet

Syntax: 
http://localhost:port/projectname/urlname?name=value&name=value
localhost:7000/FirstCURDAPPSERV/deldept?did=11



































 





