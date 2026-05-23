/*
Q44. Write a java program to input basic salary of an employee and calculate its Gross salary according to following.
Basic Salary <= 10000 : HRA = 20%, DA = 80% Basic Salary <= 20000 : HRA = 25%, DA = 90% Basic Salary > 20000 : HRA = 30%, DA = 95%
*/
import java.util.*;

public class employeesalary_44
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter basic salary of employee:");
        double salary = sc.nextDouble();
        
        double hra, da, gross;
        
        if(salary <= 10000)
        {
            hra = salary * 0.20;
            da = salary * 0.80;
        }
        else if(salary <= 20000)
        {
            hra = salary * 0.25;
            da = salary * 0.90;
        }
        else
        {
            hra = salary * 0.30;
            da = salary * 0.95;
        }
        
        gross = salary + hra + da;
        
        System.out.println("Basic Salary = " + salary);
        System.out.println("HRA = " + hra);
        System.out.println("DA = " + da);
        System.out.println("Gross Salary = " + gross);
    }
}

/* 
> javac employeesalary.java
> java employeesalary
enter basic Salary of employee
10000
 basic salary is10000.0
 hra is2000.0
da is8000.0
gross salary is20000.0

> java employeesalary
enter basic Salary of employee
20000
 basic salary is20000.0
 hra is5000.0
da is18000.0
gross salary is43000.0

> java employeesalary
enter basic Salary of employee
30000
 basic salary is30000.0
 hra is9000.0
da is28500.0
gross salary is67500.0

>
 */