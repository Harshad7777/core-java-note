/* Practical Assignment Using Pojo Class 
====================================================================

Q1. Problem
Create a POJO class Student with fields rollNo, name, marks[] (array of 3 subjects). Store data for 5 students using an array of objects. Perform the following operations
Calculate the total marks of each student.
Find the student with the highest average marks.
Display the list of students who have failed in any subject (marks  35).
Explanation
This problem tests array of objects, iteration inside objects, and conditional checks. You practice object encapsulation (POJO) and multiple computations. */

/* Practical Assignment Using Pojo Class 
====================================================================

Q1. Problem
Create a POJO class Student with fields rollNo, name, marks[] (array of 3 subjects). Store data for 5 students using an array of objects. Perform the following operations:
1. Calculate the total marks of each student.
2. Find the student with the highest average marks.
3. Display the list of students who have failed in any subject (marks < 35).
*/
/* import java.util.*;

class Student
{
    private int rollNo;
    private String name;
    private int marks[]; // marks of 3 subjects

    public Student(int rollNo, String name, int marks[])
    {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public int getTotalMarks()
    {
        int sum = 0;
        for(int i = 0; i < marks.length; i++)
        {
            sum += marks[i];
        }
        return sum;
    }

    public float getAverage()
    {
        return getTotalMarks() / 3.0f;
    }

    public boolean isFail()
    {
        for(int i = 0; i < marks.length; i++)
        {
            if(marks[i] < 35)
                return true;
        }
        return false;
    }

    public void show()
    {
        System.out.print("RollNo: " + rollNo + ", Name: " + name + ", Marks: ");
        for(int i = 0; i < marks.length; i++)
        {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}

public class StudentApp_1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Student students[] = new Student[5];

        // Accept 5 students
        for(int i = 0; i < 5; i++)
        {
            System.out.println("\nEnter details for Student " + (i+1) + ":");

            System.out.print("Roll No: ");
            int r = sc.nextInt();

            System.out.print("Name: ");
            String n = sc.next();

            int m[] = new int[3];
            System.out.println("Enter 3 subject marks:");
            for(int j = 0; j < 3; j++)
            {
                m[j] = sc.nextInt();
            }
			//Create a new Student object and store it in the array.
            students[i] = new Student(r, n, m);
        }

        // 1️⃣ Total marks of each student
        System.out.println("\n--- Total Marks of Each Student ---");
        for(int i = 0; i < students.length; i++)
        {
            students[i].show();
            System.out.println("Total Marks: " + students[i].getTotalMarks());
            System.out.println();
        }

        // 2️⃣ Student with highest average
        Student top = students[0];
        for(int i = 1; i < students.length; i++)
        {
            if(students[i].getAverage() > top.getAverage())
                top = students[i];
        }

        System.out.println("\n--- Student with Highest Average ---");
        top.show();
        System.out.println("Average Marks: " + top.getAverage());

        // 3️⃣ Students who failed in any subject
        System.out.println("\n--- Students Who Failed in Any Subject (<35) ---");

        boolean foundFail = false;
        for(int i = 0; i < students.length; i++)
        {
            if(students[i].isFail())
            {
                students[i].show();
                foundFail = true;
            }
        }

        if(!foundFail)
            System.out.println("No student failed.");
    }
} */


/* 
java StudentApp_1.java

Enter details for Student 1:
Roll No: 1
Name: harshad
Enter 3 subject marks:
65 50 40

Enter details for Student 2:
Roll No: 2
Name: sahil
Enter 3 subject marks:
50 80 90

Enter details for Student 3:
Roll No: 3
Name: soham
Enter 3 subject marks:
42 65
45

Enter details for Student 4:
Roll No: 4
Name: dhruve
Enter 3 subject marks:
80 60 90

Enter details for Student 5:
Roll No: 5
Name: Rakshe
Enter 3 subject marks:
100 100 100

--- Total Marks of Each Student ---
RollNo: 1, Name: harshad, Marks: 65 50 40
Total Marks: 155

RollNo: 2, Name: sahil, Marks: 50 80 90
Total Marks: 220

RollNo: 3, Name: soham, Marks: 42 65 45
Total Marks: 152

RollNo: 4, Name: dhruve, Marks: 80 60 90
Total Marks: 230

RollNo: 5, Name: Rakshe, Marks: 100 100 100
Total Marks: 300


--- Student with Highest Average ---
RollNo: 5, Name: Rakshe, Marks: 100 100 100
Average Marks: 100.0

--- Students Who Failed in Any Subject (<35) ---
No student failed.
 */
 
 /*Q1. Problem:
Create a POJO class Student with fields: rollNo, name, marks[] (array of 3 subjects). Store data for 5 students using an array of objects. Perform the following operations:
Calculate the total marks of each student.
Find the student with the highest average marks.
Display the list of students who have failed in any subject (marks < 35).
Explanation:
This problem tests array of objects, iteration inside objects, and conditional checks. You practice object encapsulation (POJO) and multiple computations
*/
import java.util.*;

class Student
{
	//Fields (Variables)
    private int rn;
    private String name;
    private int[] marks;

	//Setter Method
    public void setArr(int rn, String name, int marks[])
    {
        this.rn = rn;
        this.name = name;
        this.marks = marks;
    }
	//Getter Methods
	//These are used in DisplayStudent class to read student data.
    int getRn()
    {
        return rn;
    }

    String getName()
    {
        return name;
    }

    int[] getMarks()
    {
        return marks;
    }
}

//This class performs all operations on array of students.
class DisplayStudent
{    
    private Student s[]; // reference to array of students
	
	//Method to Receive Student Array
    public void totalMarks(Student s[])
    {
        this.s = s;  // storing passed array inside class variable
    }
	
	//This method performs three operations:
    void show()
    {
        // Operation 1: Print Total Marks of Each Student
        System.out.println("RollNo--Name--TotalMarks");
        for(int i = 0; i < s.length; i++)
        {
            int[] marks = s[i].getMarks();
			
            int total = 0;

            for(int j = 0; j < marks.length; j++)
            {
                total += marks[j];
            }

            System.out.println(s[i].getRn() + "\t" + s[i].getName() + "\t" + total);
        }

        // 2nd operation: Highest Average
        System.out.println("\nHighest Average of Marks:");
        double max = -1;
        int index = 0;

        for(int i = 0; i < s.length; i++)
        {
            int[] marks = s[i].getMarks();
			//Checking average for each student
            int total = 0;

            for(int j = 0; j < marks.length; j++)
            {
                total += marks[j];
            }
			// Update highest average
            double avg = total / (double)marks.length;

            if(avg > max)
            {
                max = avg;
                index = i;
            }
        }

        System.out.println("RollNo--Name--Average");
        System.out.println(s[index].getRn() + "\t" + s[index].getName() + "\t" + max);

        // 3rd operation: Failed students
        System.out.println("\nStudents Who Failed in Any Subject (<35):");
        System.out.println("RollNo--Name");

        for(int i = 0; i < s.length; i++)
        {
            int[] marks = s[i].getMarks();

            for(int j = 0; j < marks.length; j++)
            {
                if(marks[j] < 35)
                {
                    System.out.println(s[i].getRn() + "\t" + s[i].getName());
                    break;
                }
            }
        }
    }
}
//3. Main Class: StudentApp_1
public class StudentApp_1
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
		
        DisplayStudent d = new DisplayStudent();
		//Create Student array of 5 students
        Student s[] = new Student[5];

        for(int i = 0; i < s.length; i++)
        {	
			//Input loop for 5 students
            s[i] = new Student();

            System.out.print("Enter Roll No: ");
            int rn = sc.nextInt();

            System.out.print("Enter Name: ");
            String name = sc.next();

            int marks[] = new int[3];
            System.out.print("Enter 3 Subject Marks: ");
            for(int j = 0; j < marks.length; j++)
            {
                marks[j] = sc.nextInt();
            }

			//Input loop for 5 students
            s[i].setArr(rn, name, marks);
        }
		
		// Passing array to DisplayStudent
        d.totalMarks(s);
		//Printing all outputs
        d.show();
    }
}
