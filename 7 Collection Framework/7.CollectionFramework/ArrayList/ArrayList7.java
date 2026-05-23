// Q7. Write a java program to Remove all even numbers from an integer ArrayList.
// Explanation:
//  This teaches:
// Removing elements using remove(index)
// Handling shifting of elements after removal
// Reverse loop concept

import java.util.*;

public class ArrayList7
{
    public static void main(String x[])
    {
        ArrayList<Integer> List = new ArrayList<>();
        //adding 5 number to thee Arraylist
        List.add(11);
        List.add(20);
        List.add(31);
        List.add(40);
        List.add(51);
        //Removing all Even number from the arraylist
        for(int i=0; i<List.size(); i++)
        {
            if(List.get(i)%2==0)
            {
                List.remove(i);
                i--; //Decrement i to adjust for the shifted element after removal   
            }
        }
        for(int i=0; i<List.size(); i++)
        {              
            System.out.println(List.get(i));
        }
    }
}

// 11
// 31
// 51