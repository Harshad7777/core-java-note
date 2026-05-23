// Q12. Write a java program to remove all odd number from an arraylist.
// Explanation
// Use loop with index.
// If element is odd → remove it.
// Adjust index after removal.
import java.util.*;
public class ArrayList12
{
    public static void main(String x[])
    {
        //input from user
        Scanner sc = new Scanner(System.in);

        ArrayList <Integer> List = new ArrayList<>();

        System.out.println("Enter the number of elements in the ArrayList:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0; i<n; i++)
        {
            List.add(sc.nextInt());
        }

        for(int i=0; i<List.size(); i++)
        {
            if(List.get(i) % 2 != 0)
            {
                List.remove(i);
                i--; // Adjust index after removal
            }
        }
        System.out.println("ArrayList after removing odd numbers: " + List);
    }
}


// Enter the number of elements in the ArrayList:
// 5
// Enter the elements:
// 10 11 12 13 14 15
// ArrayList after removing odd numbers: [10, 12, 14]