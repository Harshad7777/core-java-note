// Q14. Write a java program to find the second largest number in an ArrayList.

// Explanation
// largest
// secondLargest
//  Update accordingly during traversal.

import java.util.*;

public class ArrayList14 
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> List = new ArrayList<>();
        System.out.println("Enter the number of elements in the ArrayList:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0; i<n; i++)
        {
            List.add(sc.nextInt());
        }
        if(List.size()<2)
        {
            System.out.println("Not enough element to find second largest.");
            return;
        }
        int Largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(Integer num : List)
        {
            if(num > Largest)
            {
                secondLargest = Largest;
                Largest = num;
            }
            else if(num > secondLargest && num != Largest)
            {
                secondLargest = num;
            }
        }
        System.out.println("second Largest number in the ArrayList: " + secondLargest);
    }
}


// Enter the number of elements in the ArrayList:
// 5
// Enter the elements:
// 10 12 15 16 20
// second Largest number in the ArrayList: 16