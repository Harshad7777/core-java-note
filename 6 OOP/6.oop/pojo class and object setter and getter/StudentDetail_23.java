/* Q23. WAP to create POJO class name as Student with field name, id and per and we have class
name as Dept with two methods
void setStudent(Student student): this method is used for accept student as parameter
void showStudent(): this method is used for show the student details.
 */
 
import java.util.*;

public class Student
{
	private String name;
	private int id ;
	private double per;
	
	//setter
	public void setName(String name)
	{
		this.name =name;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setPer(double per)
	{
		this.per = per;
	}
	
	//getter
	public String getName()
	{
		return name;
	}
	public int getId()
	{
		return id;
	}
	public double getPer()
	{
		return per;
	}
}

class Dep
{
	private Student Std;
	
	public void setStudent(Student Std)
	{
		this.Std = Std;
	}
	
	public void showStudent()
	{
		if(Std == null)
		{
			System.out.println("no student available!");
		}
		else
		{
			System.out.println("Student detail");
			System.out.println("Name :"+Std.getName());
			System.out.println("ID :"+Std.getId());
			System.out.println("percentage :"+Std.getPer());
			
		}
	}
}
public class StudentDetail_23
{
	public static void main(String x[])
	{
		Student s = new Student();

		s.setName("Harshad");
		s.setId(107);
		s.setPer(80.05);
		
		Dep d = new Dep();
		
		d.setStudent(s);
		d.showStudent();
		
	}
}

/* >java StudentDetail_23.java
Student detail
Name :Harshad
ID :107
percentage :80.05
 */
