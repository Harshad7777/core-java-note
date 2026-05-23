// Q8. Write a java program to Reverse an integer ArrayList without using inbuilt reverse method.
// Explanation:
//  This improves:
// Index manipulation
// Swapping logic
// Understanding list size

import java.util.*;

public class ArrayList8 
{
    public static void main(String x[])
    {
        ArrayList <Integer> List = new ArrayList<>();
        // Adding 5 numbers to the ArrayList}   
        List.add(10);
        List.add(20);  
        List.add(30);
        List.add(40);       
        List.add(50);

        System.out.println("Original List: " + List);

        // Reverse the ArrayList manually
        int size = List.size();
        for(int i=0; i<size/2; i++)
        {
            int temp = List.get(i);
            List.set(i, List.get(size-1-i));
            List.set(size-1-i, temp);
        }

        System.out.println("Reversed List: " + List);
   }
}

// Original List: [10, 20, 30, 40, 50]
// Reversed List: [50, 40, 30, 20, 10]


// Iteration 1 (i = 0)
// Swap index 0 and 4
// [50, 20, 30, 40, 10]
// Iteration 2 (i = 1)
// Swap index 1 and 3
// [50, 40, 30, 20, 10]
// Middle element (30) remains same.