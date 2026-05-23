/* Assignment using Constructor :-

Q1. Create a Student class with fields: name, marks.
 Use a parameterized constructor to initialize both fields.
 Write a method checkResult() that prints "Pass" if marks ≥ 35, otherwise "Fail".
 Create 3 student objects and print their results.
Concepts Used:
 ✔ Parameterized constructor
 ✔ If–else logic
Explanation:
The constructor sets the student’s name and marks.
Then you apply simple logical condition (≥ 35). */


class Student 
{
    private String name;
    private int marks;

    // Parameterized Constructor
    public Student(String name, int marks) 
	{
        this.name = name;
        this.marks = marks;
    }

    // Method to check result
    public void checkResult() 
	{
        if (marks >= 35)
            System.out.println(name + " : Pass");
        else
            System.out.println(name + " : Fail");
    }
}

public class StudentTest_1 
{
    public static void main(String[] args) 
	{

        // Creating 3 students (using constructor)
        Student s1 = new Student("Amit", 45);
        Student s2 = new Student("Riya", 30);
        Student s3 = new Student("Karan", 75);

        // Displaying results
        s1.checkResult();
        s2.checkResult();
        s3.checkResult();
		
    }
}
/* 
java StudentTest_1.java
Amit : Pass
Riya : Fail
Karan : Pass */

