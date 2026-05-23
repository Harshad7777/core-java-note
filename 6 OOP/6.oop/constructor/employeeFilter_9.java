/* Q9. Create an Employee class with:
      empId, name, salary
      Use constructor to initialize values.

      Create an array of 10 employees.
      Write a method filterHighSalary() that prints only those
      employees whose salary > 30000.

      Concepts Used:
      ✔ Array of objects
      ✔ Constructor for object initialization
      ✔ Logical operator (salary > 30000)
*/

import java.util.*;

class Employee
{
    private int empId;
    private String name;
    private double salary;

    // Constructor
    public Employee(int empId, String name, double salary)
    {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Method to check if salary is high
    public boolean isHighSalary()
    {
        return salary > 30000;
    }

    // Method to display employee details
    public void show()
    {
        System.out.println(empId + "  " + name + "  " + salary);
    }
}

public class employeeFilter_9
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Employee emp[] = new Employee[10];  // array of 10 employees

        // Input employee details
        for(int i = 0; i < 10; i++)
        {
            System.out.println("\nEnter details for Employee " + (i+1));

            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter Salary: ");
            double sal = sc.nextDouble();

            emp[i] = new Employee(id, name, sal);
        }

        // Display employees with salary > 30000
        System.out.println("\nEmployees with Salary > 30000:");
        for(int i = 0; i < 10; i++)
        {
            if(emp[i].isHighSalary())   // logical check
            {
                emp[i].show();         // print employee details
            }
        }
    }
}
/* 
Enter details for Employee 1
Enter Employee ID: 101
Enter Name: Ram
Enter Salary: 25000

Enter details for Employee 2
Enter Employee ID: 102
Enter Name: Shyam
Enter Salary: 35000

Enter details for Employee 3
Enter Employee ID: 103
Enter Name: Riya
Enter Salary: 45000

Enter details for Employee 4
Enter Employee ID: 104
Enter Name: Amit
Enter Salary: 20000

Enter details for Employee 5
Enter Employee ID: 105
Enter Name: Neha
Enter Salary: 60000

Enter details for Employee 6
Enter Employee ID: 106
Enter Name: John
Enter Salary: 15000

Enter details for Employee 7
Enter Employee ID: 107
Enter Name: Pooja
Enter Salary: 32000

Enter details for Employee 8
Enter Employee ID: 108
Enter Name: Ravi
Enter Salary: 28000

Enter details for Employee 9
Enter Employee ID: 109
Enter Name: Kiran
Enter Salary: 50000

Enter details for Employee 10
Enter Employee ID: 110
Enter Name: Meena
Enter Salary: 18000


Employees with Salary > 30000:
102  Shyam  35000.0
103  Riya   45000.0
105  Neha   60000.0
107  Pooja  32000.0
109  Kiran  50000.0

 */