/* 5. Question:
 Create a base class Staff with a method incrementSalary().
For TeachingStaff, salary increases by 15%.
For NonTeachingStaff, salary increases by 10%.
 Print new salaries using method overriding.
Explanation:
 This tests inheritance with percentage-based calculations in subclasses. */
 
import java.util.*;
class Staff
{
    double salary;

    Staff(double salary)
    {
        this.salary = salary;
    }

    double incrementSalary()
    {
        return salary;
    }
}

class TeachingStaff extends Staff
{
    TeachingStaff(double salary)
    {
        super(salary);
    }

    double incrementSalary()
    {
        return salary + (salary * 0.15);   // 15%
    }
}

class NonTeachingStaff extends Staff
{
    NonTeachingStaff(double salary)
    {
        super(salary);
    }

    double incrementSalary()
    {
        return salary + (salary * 0.10);   // 10%
    }
}

public class StaffApplication_5
{
    public static void main(String x[])
    {
		Scanner sc = new Scanner(System.in);
		
		Staff s ;
		
		System.out.println("enter Teaching Staff Salary : ");
		int ssalarie = sc.nextInt();
		
		s = new incrementSalary(ssalarie);
		s.incrementSalary();
		 
		 
		System.out.println("------------------------------------");
		 
		System.out.println("enter non Teaching Staff Salary : ");
		int nsalarie = sc.nextInt();
		
		s = new incrementSalary(nsalarie);
		s.incrementSalary();
		
        /* TeachingStaff t = new TeachingStaff(30000);
        NonTeachingStaff n = new NonTeachingStaff(30000);

        System.out.println("Teaching Staff New Salary: " + t.incrementSalary());
        System.out.println("Non-Teaching Staff New Salary: " + n.incrementSalary()); */
    }
}

/* 
java StaffApplication_5.java
Teaching Staff New Salary: 34500.0
Non-Teaching Staff New Salary: 33000.0 */