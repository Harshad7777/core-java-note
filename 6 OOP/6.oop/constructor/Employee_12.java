/* Q12. Create a class Employee with:
Fields: id, name, basicSalary, isPermanent

Parameterized constructor to initialize fields.

Write methods:

calculateNetSalary() →
if permanent → HRA = 20%, DA = 10%, PF = 12%
if temporary → HRA = 10%, DA = 5%, PF = 0
compareSalary(Employee e) → return higher salary employee name.

Task Logic:
 Create 3 Employee objects.
 Compare each pair using logic (nested comparison).
Expected Learning: Complex if-else + constructor initialization + inter-object comparison. */

import java.util.*;

class Employee
{
	private int id ;
	private String name;
	private double basicSalary;
	private boolean isPermanent;
	
	
	//paremetrized constructor
	public Employee(int id,  String name, double basicSalary, boolean isPermanent )
	{
		this.id = id;
		this.name = name;
		this.basicSalary= basicSalary;
		this.isPermanent = isPermanent;
	}
	
	//method calculate net salary
	public double calculateNetSalary()
	{
			double hra, da , pf;
			
			if(isPermanent)
			{
				hra = 0.20 * basicSalary ; //20%
				da = 0.10 * basicSalary;	//10%
				pf = 0.12 * basicSalary; //12%
			}
			else
			{
				hra = 0.10*basicSalary;  //10%
				da = 0.05*basicSalary;  //5%
				pf = 0;                 //no pf
			}
			
			return basicSalary + hra + da - pf;
	}
	//Compare salaries of two employees
	
	public String compareSalary(Employee e)
	{
		double currentSalary = this.calculateNetSalary();
		double otherSalary = e.calculateNetSalary();
		
		if(currentSalary > otherSalary)
		{
			return this.name;
		}
		else if (currentSalary < otherSalary)
		{
			return e.name;
			
		}
		else
		{
			return"both have equal salary";
		}
	}
	public String getName()
	{
		return name;
	}
}

public class Employee_12
{
	public static void main(String x[])
	{
		//creating 3 employee object
		Employee e1 = new Employee(1,"harshad",100000,true);
		Employee e2 = new Employee(2,"amit",100060,false);
		Employee e3 = new Employee(3,"sahil",123000,true);
		
		//compare each pair
		System.out.println("Between harshad & amit: "+e1.compareSalary(e2));
		System.out.println("Between  amit & sahil: "+e2.compareSalary(e3));
		System.out.println("Between harshad & sahil: "+e1.compareSalary(e3));
		
	}
}


/* >java Employee_12.java
Between harshad & amit: harshad
Between  amit & sahil: sahil
Between harshad & sahil: sahil */