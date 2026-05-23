// Q4. Create an ArrayList and find the minimum element.
// Explanation:
//  Similar to max logic, this improves:
// Conditional checking
// Traversal logic


import java.util.*;

public class ArrayList4
{
    public static void main(String x[])
    {
        ArrayList <Integer> List = new ArrayList();
        // Adding 5 numbers to the ArrayList
        List.add(10);
        List.add(20);
        List.add(30);
        List.add(40);
        List.add(50);

        int min = List.get(0); //initially assume first element is minimum
        for(int i=0; i<List.size(); i++)
        {
            if(List.get(i)< min)
            {
                min = List.get(i); //update min if current element is less than min
            }
        }
        System.out.println("Minimum element is: " + min);

    }
}

// Minimum element is: 10