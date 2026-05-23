/* Q2. Problem:
Create a POJO class Employee with fields: empId, name, basicSalary, hra, and da. Store details of 5 employees using an array of objects. Perform the following operations:
Calculate the gross salary for each employee (gross = basic + hra + da).
Find and display the employee with the maximum salary.
Print the details of employees whose salary is greater than the average salary of all employees. */


import java.util.*;

class Employee
{
    private int empId;
    private String name;
    private float basicSalary;
    private float hra;
    private float da;

    public Employee(int empId, String name, float basicSalary, float hra, float da)
    {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
        this.hra = hra;
        this.da = da;
    }

    public float getGrossSalary()
    {
        return basicSalary + hra + da;
    }

    public void show()
    {
        System.out.println("EmpId: " + empId + ", Name: " + name +
                           ", Basic: " + basicSalary +
                           ", HRA: " + hra +
                           ", DA: " + da +
                           ", Gross Salary: " + getGrossSalary());
    }
}

public class EmployeeApp_2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Employee emp[] = new Employee[5];

        // Accept 5 employees
        for(int i = 0; i < 5; i++)
        {
            System.out.println("\nEnter details for Employee " + (i+1) + ":");

            System.out.print("Emp ID: ");
            int id = sc.nextInt();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Basic Salary: ");
            float basic = sc.nextFloat();

            System.out.print("HRA: ");
            float hra = sc.nextFloat();

            System.out.print("DA: ");
            float da = sc.nextFloat();

            emp[i] = new Employee(id, name, basic, hra, da);
        }

        // 1️⃣ Display gross salary of each employee
        System.out.println("\n--- Gross Salary of Each Employee ---");
        for(int i = 0; i < emp.length; i++)
        {
            emp[i].show();
        }

        // 2️⃣ Find employee with maximum salary
        Employee maxEmp = emp[0];
        for(int i = 1; i < emp.length; i++)
        {
            if(emp[i].getGrossSalary() > maxEmp.getGrossSalary())
            {
                maxEmp = emp[i];
            }
        }

        System.out.println("\n--- Employee with Maximum Gross Salary ---");
        maxEmp.show();

        // 3️⃣ Find average salary
        float total = 0;
        for(int i = 0; i < emp.length; i++)
        {
            total += emp[i].getGrossSalary();
        }
        float avg = total / emp.length;

        System.out.println("\nAverage Salary: " + avg);

        // 4️⃣ Employees having salary > average
        System.out.println("\n--- Employees with Salary Greater Than Average ---");
        boolean found = false;

        for(int i = 0; i < emp.length; i++)
        {
            if(emp[i].getGrossSalary() > avg)
            {
                emp[i].show();
                found = true;
            }
        }

        if(!found)
            System.out.println("No employees have salary above average.");
    }
}
/* 
>java EmployeeApp_2.java

Enter details for Employee 1:
Emp ID: 1
Name: harshad
Basic Salary: 10000
HRA: 2000
DA: 1500

Enter details for Employee 2:
Emp ID: 2
Name: sahil
Basic Salary: 20000
HRA: 2000
DA: 1500

Enter details for Employee 3:
Emp ID: 3
Name: rakshe
Basic Salary: 30000
HRA: 2000
DA: 1500

Enter details for Employee 4:
Emp ID: 4
Name: soham
Basic Salary: 40000
HRA: 1000
DA: 2000

Enter details for Employee 5:
Emp ID: 5
Name: omkar
Basic Salary: 50000
HRA: 5000
DA: 2000

--- Gross Salary of Each Employee ---
EmpId: 1, Name: harshad, Basic: 10000.0, HRA: 2000.0, DA: 1500.0, Gross Salary: 13500.0
EmpId: 2, Name: sahil, Basic: 20000.0, HRA: 2000.0, DA: 1500.0, Gross Salary: 23500.0
EmpId: 3, Name: rakshe, Basic: 30000.0, HRA: 2000.0, DA: 1500.0, Gross Salary: 33500.0
EmpId: 4, Name: soham, Basic: 40000.0, HRA: 1000.0, DA: 2000.0, Gross Salary: 43000.0
EmpId: 5, Name: omkar, Basic: 50000.0, HRA: 5000.0, DA: 2000.0, Gross Salary: 57000.0

--- Employee with Maximum Gross Salary ---
EmpId: 5, Name: omkar, Basic: 50000.0, HRA: 5000.0, DA: 2000.0, Gross Salary: 57000.0

Average Salary: 34100.0

--- Employees with Salary Greater Than Average ---
EmpId: 4, Name: soham, Basic: 40000.0, HRA: 1000.0, DA: 2000.0, Gross Salary: 43000.0
EmpId: 5, Name: omkar, Basic: 50000.0, HRA: 5000.0, DA: 2000.0, Gross Salary: 57000.0 */