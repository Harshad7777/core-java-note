// Q5. Store numbers in an ArrayList and count how many are even and how many are odd.
// Explanation:
//  This helps practice:
// Modulus operator %
// Condition-based counting
// Iteration over collections

import java.util.*;

public class ArrayList5 
{
    public static void main(String x[]) 
    {
        ArrayList<Integer> List = new ArrayList<>();
        // Adding 5 elements to the Arraylist
        List.add(10);
        List.add(20);
        List.add(30);
        List.add(40);
        List.add(50);

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < List.size(); i++) 
            {
            if (List.get(i) % 2 == 0) 
                {
                   evenCount++; // Increment even count if number is even
            } 
            else 
                {
                   oddCount++; // Increment odd count if number is odd
                }  
        }
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}

// Even numbers: 5
// Odd numbers: 0