// Q15. Write a java program to check whether elements of an ArrayList form a palindrome.
// 	Explanation
// Compare elements from start and end using two pointers.
// If mismatch → not palindrome.

import java.util.*;
public class ArrayList15 
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++)
        {
            list.add(sc.nextInt());
        }

        int start = 0;
        int end = list.size() - 1;
        boolean isPalindrome = true;

        while(start < end)
        {
            if(!list.get(start).equals(list.get(end))) //.equals() → compares values ✅
            {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if(isPalindrome)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
}

// Index:  0   1   2   3   4
// List : [1, 2, 3, 2, 1]
// start = 0
// end   = 4

// Enter number of elements: 5
// Enter elements: 1 2 3 2 1
// Palindrome