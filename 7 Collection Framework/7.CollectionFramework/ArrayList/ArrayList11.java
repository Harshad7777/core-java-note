// Q11. Write a java program to count how many prime numbers are present in an ArrayList.
// Explanation
// For each number:
// Check divisibility from 2 to n-1
// If divisible → not prime
// Count primes


import java.util.*;
public class ArrayList11
{
    public static void main(Sting x[])
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

        int count = 0;
        for(Integer num : List)
        {
            if(isPrime(num))
            {
                count++;
            }
        }
        System.out.println("Number of prime numbers in the ArrayList: " + count);
    }
    public static boolean isPrime(int num)
    {
        if(num <=1 )
        {
            return false;
        }
    }
}