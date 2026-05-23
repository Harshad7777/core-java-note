// Q6. Write a java program to Check whether a given number exists in an ArrayList.
// Explanation:
//  You learn:
// Linear search logic
// Use of flag variable
// Comparison using loop

import java.util.*;

public class ArrayList6 
{
    public static void main(String x[]) 
    {
        ArrayList<Integer> List = new ArrayList<>();
        // adding 5 number to the Arraylist
        List.add(10);
        List.add(20);
        List.add(30);
        List.add(40);
        List.add(50);

        int numberToCheck = 30; // Number we want to chack
        boolean found = false; // Flag to track if number is found

        for (int i = 0; i < List.size(); i++) 
            {
                if (List.get(i) == numberToCheck) 
                {
                    found = true; // Set flag to true if number is found
                break; // Exist Looponce number is found
                 }
        }
        if (found) 
            {
                System.out.println("Number " + numberToCheck + " is found in the ArrayList.");
            } 
        else 
            {
                System.out.println("Number " + numberToCheck + " is not found in the ArrayList.");
            }
    }
}

// Number 30 is found in the ArrayList.