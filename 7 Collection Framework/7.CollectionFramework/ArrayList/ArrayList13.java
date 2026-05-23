// Q13. Write a java program to Insert a number at a given index in an ArrayList.

// 	Explanation
// Use add(index, element) method.
// Shifts elements to the right.

import java.util.*;
public class ArrayList13
{
    public static void main(String x[])
    {
        //input from user
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> List = new ArrayList<>();

        System.out.println("Enter the number of element in the ArrayList:");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for(int i=0; i<n; i++)
        {
            List.add(sc.nextInt());
        }

        System.out.println("Enter the index to insert the number:");
        int index = sc.nextInt();
        System.out.println("Enter the number to be inserted:");
        int num = sc.nextInt();

        List.add(index, num);
        System.out.println("Updated ArrayList: " + List);
    }
}

// Enter the number of element in the ArrayList:
// 5 
// Enter the elements:
// 10 11 12 13 14  
// Enter the index to insert the number:
// 0
// Enter the number to be inserted:
// 50
// Updated ArrayList: [50, 10, 11, 12, 13, 14]