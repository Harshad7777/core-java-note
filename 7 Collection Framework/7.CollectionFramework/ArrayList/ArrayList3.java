// Q3. Write a program to find the maximum value from an integer ArrayList.
// Explanation:
//  You will learn:
// How to compare elements
// Store maximum value manually
// Logical thinking without built-in methods

import java.util.*;

public class ArrayList3 
{
    public static void main(String x[]) 
    {
        ArrayList<Integer> List = new ArrayList<>();
        // Adding 5 numbers to the Arraylist
        List.add(10);
        List.add(20);
        List.add(30);
        List.add(40);
        List.add(50);

        int max = List.get(0); // Initially assume first element is maximum
        for (int i = 1; i < List.size(); i++) 
            {
            if (List.get(i) > max) 
                {
                    max = List.get(i); // update max if current element is grater than max
                }
            }
        System.out.println("Maximum value in the ArrayList is: " + max);    
    }
}

// Maximum value in the ArrayList is: 50