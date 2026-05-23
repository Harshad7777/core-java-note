/*
Q28. Write a Java program to calculate the net salary of an employee.
Input: basic salary, HRA %, DA %, and tax %.
*/

import java.util.Scanner;
public class netsalaryofemployee_28
{
 public static void main(String x[])
 {
	Scanner sc = new Scanner(System.in);
 
	double salary,hra,da,tax;
	System.out.println("enter basic Salarey: ");
	salary = sc.nextInt();
	
	System.out.println("enter the hra :");
	hra = sc.nextInt();
	
	System.out.println("enter basic da: ");
	da = sc.nextInt();
	
	System.out.println("enter basic tax: ");
	tax = sc.nextInt();
	
	double totalsalary = salary + salary*da/100 + salary*hra/100;
	
	double Amttax = totalsalary*tax/100;
	
	double netsalaryofemployee = totalsalary - Amttax;
	
	System.out.println("totalsalary"+totalsalary);
	System.out.println("Amttax"+Amttax);
	System.out.println("netsalaryofemployee"+netsalaryofemployee);
 }
}

/* >java netsalaryofemployee
enter basic Salarey:
100000
enter the hra :
10
enter basic da:
10
enter basic tax:
10
totalsalary120000.0
Amttax12000.0
netsalaryofemployee108000.0 */

