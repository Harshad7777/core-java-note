/* 1. Question:
 Create a base class Employee with fields name and salary. Create subclasses Manager and Developer.
The manager gets a 20% bonus on salary.


The developer gets a 10% bonus.
 Write a program to calculate and display the total salary (base + bonus) for each employee.
 */
/* import java.util.*;

class Employee
{
    String name;
    double salary;

    Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    // base class bonus = 0%
    double getBonus()
    {
        return 0;
    }

    double getTotalSalary()
    {
        return salary + getBonus();
    }

    void display()
    {
        System.out.println("Name : " + name);
        System.out.println("Total Salary : " + getTotalSalary());
        System.out.println("----------------------------");
    }
}

// Manager → 20% bonus
class Manager extends Employee
{
    Manager(String name, double salary)
    {
        super(name, salary);
    }

    double getBonus()
    {
        return salary * 0.20;
    }
}

// Developer → 10% bonus
class Developer extends Employee
{
    Developer(String name, double salary)
    {
        super(name, salary);
    }

    double getBonus()
    {
        return salary * 0.10;
    }
}

public class EmployeeApplication_1
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
		
		/* Manager m = new Manager("Rohit", 50000);
        Developer d = new Developer("Amit", 40000); */

        // Manager Input
       /*  System.out.println("Enter Manager Name:");
        String mname = sc.next();

        System.out.println("Enter Manager Salary:");
        double msal = sc.nextDouble();

        Employee e = new Manager(mname, msal);
        e.display();

        // Developer Input
        System.out.println("Enter Developer Name:");
        String dname = sc.next();

        System.out.println("Enter Developer Salary:");
        double dsal = sc.nextDouble();

        e = new Developer(dname, dsal);
        e.display();
    }
} */ 

/* 
>java EmployeeApplication_1.java
Name :Rohit
Total Salary :50000.0
-------------------
Name :Amit
Total Salary :40000.0
------------------- */

import java.util.*;

class Employee
{
    String name;
    double salary;

    Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    // Base class bonus → 0%
    double getBonus()
    {
        return 0;
    }

    double getTotalSalary()
    {
        return salary + getBonus();
    }
}

// Manager → 20% bonus
class Manager extends Employee
{
    Manager(String name, double salary)
    {
        super(name, salary);
    }

    double getBonus()
    {
        return salary * 0.20;
    }
}

// Developer → 10% bonus
class Developer extends Employee
{
    Developer(String name, double salary)
    {
        super(name, salary);
    }

    double getBonus()
    {
        return salary * 0.10;
    }
}

public class EmployeeApplication_1
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        Employee e;

        // Manager
        System.out.println("Enter Manager Name:");
        String mname = sc.next();

        System.out.println("Enter Manager Salary:");
        double msal = sc.nextDouble();

        e = new Manager(mname, msal);
        System.out.println("Manager salary with 20% bonus : " + e.getTotalSalary());

        // Developer
        System.out.println("Enter Developer Name:");
        String dname = sc.next();

        System.out.println("Enter Developer Salary:");
        double dsal = sc.nextDouble();

        e = new Developer(dname, dsal);
        System.out.println("Developer salary with 10% bonus : " + e.getTotalSalary());
    }
}


/* java EmployeeApplication_1.java
Enter Manager Name:
harshad
Enter Manager Salary:
100000
Manager salary with 20% bonus : 120000.0
Enter Developer Name:
sahil
Enter Developer Salary:
50000 */