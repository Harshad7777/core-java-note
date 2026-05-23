// Q2. Create an ArrayList of integers and calculate the sum of all elements.

// 	Explanation:
// 	 This question practices:
// Iterating over ArrayList
// Performing arithmetic operations
// Using get(index) method

import java.util.*;

public class Arraylist2
{
    public static void main(String x[])
    {
        ArrayList<Integer> List = new ArrayList<>();
        // Adding 5 numbers to the ArrayList
        List.add(10);
        List.add(20);
        List.add(30);
        List.add(40);
        List.add(50);
        
        int sum = 0;
        for( int i=0; i<List.size(); i++)
        {
            sum = sum + List.get(i);
        }
        System.out.println("sum of all elements in the ArrayList is : "+sum);
    }
}

// output:
// sum of all elements in the ArrayList is : 150
