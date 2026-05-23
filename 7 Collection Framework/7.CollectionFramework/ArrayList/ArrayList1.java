// ArrayList Assignment :- 
// Q1. Create an ArrayList of integers. Add 5 numbers and display all elements using a loop.
// Explanation:
// 	This helps you understand:
// How to declare an ArrayList
// How to add elements using add()
// How to traverse an ArrayList using for loop

import java.util.*;

public class ArrayList1 {
    public static void main(String x[]) {
        ArrayList<Integer> list = new ArrayList<>();

        // Adding 5 numbers to the ArrayList
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Arraylist elements:");
        for (int i = 0; i < list.size(); i++) 
            {
                System.out.print(list.get(i) + " ");
            }
        // Iterator<Integer> it = list.iterator();
        // while (it.hasNext())
        // {
        //    System.out.print(it.next() + " ");
        // }
    }
}

// Arraylist elements:
// 10 20 30 40 50