/* Mini Project Title :-  Company Management System
Project Objective :- 
Design and implement a Company Management System using Java OOP concepts up to Interface to manage employees, departments, salaries, and performance details without using collections.
OOP Concepts to be Used :- 
Class & Object
Constructor
Encapsulation
Inheritance
Method Overriding
Interface
this keyword
static members
Array of Objects

Project Description
A company wants a simple console-based system to manage:
Employee records
Department assignment
Salary calculations
Performance and promotions
Each employee belongs to one department and has performance details.

Interface: CompanyRules
interface CompanyRules {
    void addEmployee();
    void displayEmployee();
    void calculateSalary();
    void updatePerformance();
    void promoteEmployee();
}
Class Structure :- 

1.Employee Class
empId
empName
baseSalary
department
rating
totalSalary
2️.Department Class
deptId
deptName
3.Company Class
Implements CompanyRules
Manages all logical operations

Perform This Operations :- 

1.Add new employee
2.Display all employees
3.Search employee by ID
4.Update employee name
5.Update department
6.Delete employee
7.Count total employees
8.Calculate salary with bonus
9.Deduct salary for low performance
10.Display highest salary employee
11.Display lowest salary employee
12.Update employee rating
13.Promote employee based on rating
14.Display department-wise employee count
15.Display employees of a specific department */

import java.util.*;

interface Performance
{
    void calculateBonus();
    void promote();
}

class Department
{
    private int deptId;
    private String deptName;

    Department(int deptId, String deptName)
    {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public void showDepartment()
    {
        System.out.println("Department ID   : " + deptId);
        System.out.println("Department Name : " + deptName);
    }
}

class Employee
{
    protected int empId;
    protected String empName;
    protected double salary;
    protected Department department;

    static String companyName = "ABC Technologies";

    Employee(int empId, String empName, double salary, Department department)
    {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.department = department;
    }

    public void displayEmployee()
    {
        System.out.println("\nCompany Name : " + companyName);
        System.out.println("Employee ID  : " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary       : " + salary);
        department.showDepartment();
    }
}

class PermanentEmployee extends Employee implements Performance
{
    private int rating;

    PermanentEmployee(int empId, String empName, double salary,
                      Department department, int rating)
    {
        super(empId, empName, salary, department);
        this.rating = rating;
    }

    @Override
    public void calculateBonus()
    {
        if(rating >= 4)
        {
            System.out.println("Bonus : " + (salary * 0.20));
        }
        else if(rating == 3)
        {
            System.out.println("Bonus : " + (salary * 0.10));
        }
        else
        {
            System.out.println("Bonus : No Bonus");
        }
    }

    @Override
    public void promote()
    {
        if(rating >= 4)
        {
            salary += 5000;
            System.out.println("Promoted! New Salary : " + salary);
        }
        else
        {
            System.out.println("Not eligible for promotion");
        }
    }
}

public class CompanyManagementSystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Department d1 = new Department(101, "IT");
        Department d2 = new Department(102, "HR");

        PermanentEmployee[] emp = new PermanentEmployee[2];

        emp[0] = new PermanentEmployee(1, "Rahul", 30000, d1, 4);
        emp[1] = new PermanentEmployee(2, "Amit", 25000, d2, 3);

        for(int i = 0; i < emp.length; i++)
        {
            emp[i].displayEmployee();
            emp[i].calculateBonus();
            emp[i].promote();
            System.out.println("-----------------------------");
        }

        sc.close();
    }
}

/* 
C:\Users\harsh\Downloads\core-java-code\core-java-code\java\6.oop\inheritence>java CompanyManagementSystem.java

Company Name : ABC Technologies
Employee ID  : 1
Employee Name: Rahul
Salary       : 30000.0
Department ID   : 101
Department Name : IT
Bonus : 6000.0
Promoted! New Salary : 35000.0
-----------------------------

Company Name : ABC Technologies
Employee ID  : 2
Employee Name: Amit
Salary       : 25000.0
Department ID   : 102
Department Name : HR
Bonus : 2500.0
Not eligible for promotion */