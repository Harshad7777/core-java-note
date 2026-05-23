// Q10. Write a java program to Identify and display duplicate numbers in an integer ArrayList.
// Explanation:
//  This helps you understand:
// Nested loops
// Comparison logic
// Handling repeated values

import java.util.*;
public class ArrayList10
{
    public static void main(String x[])
    {
        ArrayList <Integer> List = new ArrayList<>();
        // Adding 10 numbers to the ArrayList (with duplicates)
        List.add(10);
        List.add(20);
        List.add(30);
        List.add(20); // duplicate
        List.add(40);
        List.add(50);
        List.add(30); // duplicate
        List.add(60);
        List.add(70);
        List.add(80);

        System.out.println("Original List: " + List);

        // Identify and display duplicate numbers
        System.out.print("Duplicate numbers: ");
        
        for(int i=0; i<List.size(); i++)
        {
            for(int j=i+1; j<List.size(); j++)
            {
                if(List.get(i).equals(List.get(j)))
                {
                    System.out.print(List.get(i) + " ");
                    break; // To avoid printing the same duplicate multiple times
                }
            }
        }
    }
}

// Original List: [10, 20, 30, 20, 40, 50, 30, 60, 70, 80]
// Duplicate numbers: 20 30