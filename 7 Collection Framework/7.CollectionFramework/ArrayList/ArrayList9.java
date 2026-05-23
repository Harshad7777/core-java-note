// Q9. Write a java program to Copy all elements from one integer ArrayList to another.
// Explanation:
//  This practices:
// Working with multiple ArrayList objects
// Element-by-element copying


import java.util.*;
public class ArrayList9
{
    public static void main(String x[])
    {
        ArrayList <Integer> List1 = new ArrayList<>();
        //Adding 5 number to the arrayList
        List1.add(10);
        List1.add(20);
        List1.add(30);          
        List1.add(40);
        List1.add(50);

        System.out.println("Original List: " + List1);
        // Create a new ArrayList to copy elements
        
        ArrayList<Integer> List2 = new ArrayList<>();
        // Copy elements from List1 to List2
        for(Integer num : List1)
        {
            List2.add(num);
        }   
        System.out.println("Copied List: " + List2);
    }

}

// Original List: [10, 20, 30, 40, 50]
// Copied List: [10, 20, 30, 40, 50]