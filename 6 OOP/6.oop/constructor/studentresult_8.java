/* Q8. Create a Student class with 3 subject marks:
      m1, m2, m3 (initialize via constructor)

      Write a method calculateResult():
      Total = m1 + m2 + m3
      Percentage = total / 3

      If any subject < 35 → print “Fail”
      Else print Percentage and Grade:

      ≥ 75 → Distinction
      ≥ 60 → First Class
      ≥ 50 → Second Class
      Else → Pass

      Explanation:
      OR logic for fail
      Else-if ladder for grading
*/

import java.util.*;

class Student
{
    private int m1, m2, m3;

    // Parameterized constructor
    public Student(int m1, int m2, int m3)
    {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    // Method to calculate result
    public void calculateResult()
    {
        int total = m1 + m2 + m3;
        double percentage = total / 3.0;

        // Fail condition - ANY one subject < 35
        if(m1 < 35 || m2 < 35 || m3 < 35)
        {
            System.out.println("Fail");
        }
        else
        {
            System.out.println("Percentage: " + percentage);

            // Grade calculation using else-if ladder
            if(percentage >= 75)
            {
                System.out.println("Grade: Distinction");
            }
            else if(percentage >= 60)
            {
                System.out.println("Grade: First Class");
            }
            else if(percentage >= 50)
            {
                System.out.println("Grade: Second Class");
            }
            else
            {
                System.out.println("Grade: Pass");
            }
        }
    }
}

public class studentresult_8
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks of subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks of subject 3: ");
        int m3 = sc.nextInt();

        Student s = new Student(m1, m2, m3);
        s.calculateResult();
    }
}
/* 
>java studentresult_8.java
Enter marks of subject 1: 60
Enter marks of subject 2: 70
Enter marks of subject 3: 80
Percentage: 70.0
Grade: First Class */
