// Q18. Write a java program to Rotate the elements of an ArrayList left by K positions.

// Explanation
// Remove first element and add it at the end.
// Repeat K times.
// Input	:- Array: [1, 2, 3, 4, 5]	 K = 2
// Output :- [3, 4, 5, 1, 2]

import java.util.*;

public class ArrayList18
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();

        System.out.print("Enter number of element:");
        int n = sc.nextInt();
        
        System.out.println("enter the element:");
        for(int i=0; i<n; i++)
        {
            al.add(sc.nextInt());
        }   
        
        ArrayList<Integer> al2 = new ArrayList<>();
        System.out.print("Enter number of position to rotate:");
        int k = sc.nextInt();

        for(int i=k; i<al.size();i++)
        {
            al2.add(al.get(i));
        }
        for(int i = 0; i<k; i++)
        {
            al2.add(al.get(i));
        }
        System.out.println("Rotated ArrayList: " + al2);
    }
}


// First part  → [1, 2]
// Second part → [3, 4, 5]
// Join as:
// Second part + First part
// Result:
// [3, 4, 5, 1, 2]


// Enter number of element:5
// enter the element:
// 1 2 3 4 5
// Enter number of position to rotate: 2 
// Rotated ArrayList: [3, 4, 5, 1, 2]
