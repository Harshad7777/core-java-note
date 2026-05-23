/* Q4. Create an Employee class with fields name and salary, initialized with constructor.
 Write a method validateSalary() that checks:
Salary must be between 10,000 and 1,00,000 (inclusive).
 If valid → Print “Valid salary”
 Else → Print “Invalid salary”


Concepts Used:
 ✔ Constructor
 ✔ Logical AND operator (&&) */

/* Q4. Create an Employee class with fields name and salary, initialized with constructor.
      Write a method validateSalary() that checks:
      Salary must be between 10,000 and 1,00,000 (inclusive).
      If valid → Print “Valid salary”
      Else → Print “Invalid salary”

      Concepts Used:
      ✔ Constructor
      ✔ Logical AND operator (&&)
*/

import java.util.*;

class Employee
{
    private String name;
    private double salary;

    // Parameterized Constructor
    public Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    // Method to validate salary
    public void validateSalary()
    {
        if(salary >= 10000 && salary <= 100000)
        {
            System.out.println("Valid salary");
        }
        else
        {
            System.out.println("Invalid salary");
        }
    }
}

public class chacksalary_4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = sc.next();

        System.out.print("Enter salary: ");
        double sal = sc.nextDouble();

        Employee emp = new Employee(name, sal);
        emp.validateSalary();
    }
}


/* java chacksalary_4.java
Enter employee name: harshad
Enter salary: 90000
Valid salary */