/* Q1. Problem Statement :
Write a Java program to design a College Management System using the concept of inheritance.
The system should maintain and process details of both Students and Faculty members.
Use one parent class and two child classes, and perform ten sequential operations related to student and faculty management.
Class Structure:
Parent Class – Person
Data Members:
 int id, String name, String address, String contactNo
Member Methods:
addDetails() – Accept and store basic person details.
displayDetails() – Display details of a person.
updateAddress() – Update the address of a person.
deleteContact() – Update contact number.
showBasicInfo() – Display ID, name, and contact number.
Child Class 1 – Student extends Person
Additional Data Members:
String courseName, int marks[3], double percentage
Additional Methods:
    6. enterMarks() – Accept marks of three subjects.
    7. calculatePercentage() – Calculate and store percentage based on marks.
Child Class 2 – Faculty extends Person
Additional Data Members:
String subject, double salary, int experience
Additional Methods:
   8. assignSubject() – Assign subject to faculty.
   9. calculateIncrement() – Increase salary by 10% if experience is greater than 5 years.
  10. displayFacultyInfo() – Display faculty’s subject, salary, and experience.
Operations to Perform (Sequentially):
Add student details using addDetails() method.
Enter marks for three subjects using enterMarks().
Calculate and store the student’s percentage using calculatePercentage().
Update the student’s contact number using updateContact().
Display all details of the student using displayDetails().
Add faculty details using the addDetails() method.
Assign subject to faculty using assignSubject().
Calculate salary increment for the faculty using calculateIncrement().
Delete the faculty’s address using deleteAddress().
Display complete faculty information using displayFacultyInfo().
Instructions:
Use constructors in all classes for initialization.
Use the super keyword to call parent constructors in child classes.
Apply method overriding for displayDetails() to show specific outputs for each child class.
Perform all 10 operations sequentially in the main() method.
Do not use collections; use arrays or primitive variables only.
 */
import java.util.Scanner;

class Person {
    int id;
    String name;
    String address;
    String contactNo;

    Person() {}

    Person(int id, String name, String address, String contactNo) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contactNo = contactNo;
    }

    void addDetails() 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        id = sc.nextInt(); sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Address: ");
        address = sc.nextLine();

        System.out.print("Enter Contact Number: ");
        contactNo = sc.nextLine();
    }

    void updateAddress() 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter new Address: ");
        address = sc.nextLine();
    }

    void deleteContact() 
	{
        contactNo = "Not Available";
    }

    void updateContact() 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter new Contact Number: ");
        contactNo = sc.nextLine();
    }

    void showBasicInfo() 
	{
        System.out.println("ID: " + id + "  Name: " + name + "  Contact: " + contactNo);
    }

    void displayDetails() 
	{
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Contact: " + contactNo);
    }
}

// ------------------- STUDENT -----------------------

class Student extends Person 
{
    String courseName;
    int marks[] = new int[3];
    double percentage;

    Student() {}

    Student(int id, String name, String address, String contactNo, String courseName) {
        super(id, name, address, contactNo);
        this.courseName = courseName;
    }

    void enterMarks() 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for 3 subjects:");
        for (int i = 0; i < 3; i++) 
		{
            marks[i] = sc.nextInt();
        }
    }

    void calculatePercentage() 
	{
        int total = marks[0] + marks[1] + marks[2];
        percentage = (total / 3.0);
    }

    @Override
    void displayDetails() 
	{
        super.displayDetails();
        System.out.println("Course: " + courseName);
        System.out.println("Percentage: " + percentage);
    }
}

// ------------------- FACULTY -----------------------

class Faculty extends Person 
{
    String subject;
    double salary;
    int experience;

    Faculty() {}

    Faculty(int id, String name, String address, String contactNo, double salary, int experience) {
        super(id, name, address, contactNo);
        this.salary = salary;
        this.experience = experience;
    }

    void assignSubject() 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Subject: ");
        subject = sc.nextLine();
    }

    void calculateIncrement() 
	{
        if (experience > 5) 
		{
            salary = salary + salary * 0.10;
        }
    }

    void displayFacultyInfo() 
	{
        displayDetails();
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
        System.out.println("Experience: " + experience + " years");
    }
}

// ------------------- MAIN CLASS -----------------------

public class CollegeManagement_1 
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("------ STUDENT OPERATIONS ------");

        // 1. Add student details
        Student s = new Student();
        s.addDetails();

        // Enter course
        System.out.print("Enter Course Name: ");
        s.courseName = sc.nextLine();

        // 2. Enter marks
        s.enterMarks();

        // 3. Calculate percentage
        s.calculatePercentage();

        // 4. Update student contact
        s.updateContact();

        // 5. Display student details
        System.out.println("\nStudent Details:");
        s.displayDetails();


        System.out.println("\n------ FACULTY OPERATIONS ------");

        // 6. Add faculty details
        Faculty f = new Faculty();
        f.addDetails();

        // enter salary and experience
        System.out.print("Enter Salary: ");
        f.salary = sc.nextDouble();
        System.out.print("Enter Experience: ");
        f.experience = sc.nextInt();
        sc.nextLine();

        // 7. Assign subject
        f.assignSubject();

        // 8. Calculate increment
        f.calculateIncrement();

        // 9. Delete address
        f.address = "Not Available";

        // 10. Display Faculty Info
        System.out.println("\nFaculty Details:");
        f.displayFacultyInfo();
    }
}


/* 
java CollegeManagement_1.java
------ STUDENT OPERATIONS ------
Enter ID: 1
Enter Name: harshad
Enter Address: rakshewadi
Enter Contact Number: 8459997443
Enter Course Name: javacore
Enter marks for 3 subjects:
70 80 90
Enter new Contact Number: 9970395369

Student Details:
ID: 1
Name: harshad
Address: rakshewadi
Contact: 9970395369
Course: javacore
Percentage: 80.0

------ FACULTY OPERATIONS ------
Enter ID: 1
Enter Name: sahilsir
Enter Address: rakshewadi,pune
Enter Contact Number: 8459997443
Enter Salary: 100000
Enter Experience: 7
Enter Subject: corejava

Faculty Details:
ID: 1
Name: sahilsir
Address: Not Available
Contact: 8459997443
Subject: corejava
Salary: 110000.0
Experience: 7 years */