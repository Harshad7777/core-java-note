// Q16. Given an ArrayList of integers, find the first element that occurs only once.
// Explanation
// For each element, count how many times it appears.
// The first element with count 1 is the answer.

// Input:- [4, 5, 1, 2, 0, 4]		Output :- 5

import java.util.*;

public class ArrayList16 {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();

        System.out.print("Enter number element:");
        int n = sc.nextInt();

        System.out.println("Enter element");
        for (int i = 0; i < n; i++) 
            {
                al.add(sc.nextInt());
            }

        for (int i = 0; i < al.size(); i++) 
            {
            int count = 0;
            for (int j = 0; j < al.size(); j++) 
                {
                    if (al.get(i).equals(al.get(j)))
                        count++;
               }
            if (count == 1) 
                {
                    System.out.println(al.get(i));
                    break;
                }

            // 4 == 4 → count = 1
            // 4 != 5
            // 4 != 1
            // 4 != 2
            // 4 != 0
            // 4 == 4 → count = 2
        }
    }
}

// Enter number element:6
// Enter element
// 4 5 1 2 0 4
// 5
