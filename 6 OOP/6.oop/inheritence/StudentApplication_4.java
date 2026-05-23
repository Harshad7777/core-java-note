/* 4. Question:
 Create a class Student with fields name and marks. Create subclass EngineeringStudent and MedicalStudent.
If marks >= 50, student passes. Otherwise fails.
 Display results for both types of students using an overridden method.
Explanation:
 This tests inheritance for common fields and customized result display logic. */

import java.util.*;
class Student
{
    String name;
    int marks;

    Student(String name, int marks)
    {
        this.name = name;
        this.marks = marks;
    }

    void displayResult()
    {
        System.out.println("Base result");
    }
}

class EngineeringStudent extends Student
{
    EngineeringStudent(String name, int marks)
    {
        super(name, marks);
    }

    void displayResult()
    {
        System.out.println(name + " (Engineering) : " +
            (marks >= 50 ? "Pass" : "Fail"));
    }
}

class MedicalStudent extends Student
{
    MedicalStudent(String name, int marks)
    {
        super(name, marks);
    }

    void displayResult()
    {
       System.out.println (name + " (Medical) : " +
            (marks >= 50 ? "Pass" : "Fail"));
    }
}

public class StudentApplication_4
{
    public static void main(String x[])
    {
		Scanner sc = new Scanner(System.in);
		
		Student s ;
		
		System.out.println("enter the EngineeringStudent name and marks : ");
		String ename = sc.next();
		int emarks = sc.nextInt();
		
		s = new EngineeringStudent(ename,emarks);
		s.displayResult();
		 
		 
		System.out.println("------------------------------------");
		 
		System.out.println("enter the MedicalStudent name and marks : ");
		String mname = sc.next();
		int mmarks = sc.nextInt();
		
		s = new EngineeringStudent(mname, mmarks);
		s.displayResult();
		
		
		
		
       /*  EngineeringStudent e = new EngineeringStudent("Ravi", 60);
        MedicalStudent m = new MedicalStudent("Asha", 45);

        e.displayResult();
        m.displayResult(); */
    }
}

/* java StudentApplication_4.java
Ravi (Engineering) : Pass
Asha (Medical) : Fail */