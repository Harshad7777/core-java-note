// Q19. Check whether the ArrayList reads the same forward and backward.

// Explanation
// Use two indexes: start & end.
// Compare elements until they meet.

// Input :- [1, 2, 3, 2, 1]
// Output :- Palindrome


import java.util.*;
public class ArrayList19
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        
        System.out.println("enter number:");
        int n = sc.nextInt();
        
        System.out.println("enter element:");
        for(int i=0; i<n; i++)
        {
            al.add(sc.nextInt());
        }
        
        int start = 0;
        int end = al.size()-1;
        boolean flag = true;

        for(int i=0; i<al.size()/2; i++)n 
        {
            if(al.get(start)!=al.get(end))
            {
                flag = false;
                break;
            }
            start++;
            end--;
        }
        if(flag)
        {
            System.out.println("palindrome ");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}

// enter number:
// 5
// enter element:
// 1 2 3 2 1
// palindrome 