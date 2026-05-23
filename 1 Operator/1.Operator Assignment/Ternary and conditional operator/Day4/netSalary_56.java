/*
Q56. Write a Java expression using arithmetic and assignment operators to calculate net salary if:
basicSalary = 35000
taxRate = 12%
find netSalary.
 */
 
import java.util.*;

public class netSalary_56
{
    public static void main (String x[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter basic salary:");
        int salary = sc.nextInt();
        
        int tax = 12;                          // 12%
        int taxamt = salary * tax / 100;       // Calculate tax amount
        int netSalary = salary - taxamt;       // Net salary after tax
        
        System.out.println("Tax Amount: " + taxamt);
        System.out.println("Net Salary after tax: " + netSalary);
    }
}

/*  
java netSalary_56.java
Enter basic salary:
35000
Tax Amount: 4200
Net Salary after tax: 30800*/
 