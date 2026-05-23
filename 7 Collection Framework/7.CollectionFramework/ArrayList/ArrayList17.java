// Q17. Find the element that appears more than n/2 times in an ArrayList.
// Explanation
// Count frequency of each element.
// If frequency > size/2 → majority element.

// Input :- [2, 2, 1, 2, 3, 2, 2]
// Output :- 2

import java.util.*;
public class ArrayList17
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        System.out.print("Enter number of element:");
        int n = sc.nextInt();

        System.out.print("enter number :");
        for(int i=0; i<n; i++)
        {
            al.add(sc.nextInt());
        }

        int majorityCount = al.size()/2;
        int majorityElement = 0;
        for(int i=0; i<al.size(); i++)
        {
            int count = 0;
            for(int j=0; j<al.size();j++)
            {
                if(al.get(i).equals(al.get(j)))
                    count++;
            }
            if(count > majorityCount)
            {
                majorityElement = al.get(i);
            }
        }
        System.out.print("Element : "+majorityElement);
    }
}

// Enter number of elements: 7
// Enter elements:
// 2 2 1 2 3 2 2
// Majority Element: 2

