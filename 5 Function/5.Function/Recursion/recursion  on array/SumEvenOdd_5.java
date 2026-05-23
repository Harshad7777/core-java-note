/* Q5. Write a Java program that finds the sum of even and odd elements in an array using functions.
Example Input:
arr = {10, 15, 8, 7, 9, 12}
Output:
Sum of Even: 30  
Sum of Odd: 31 */


import java.util.*;
public class SumEvenOddRec_5 

{
    static int evenSum = 0, oddSum = 0;

    static void sumEvenOdd(int arr[], int index) 
	
	{
        if (index == arr.length)
            return;

        if (arr[index] % 2 == 0)
            evenSum += arr[index];
		
        else
            oddSum += arr[index];

        sumEvenOdd(arr, index + 1);
    }

    public static void main(String[] args) 
	
	{
        int arr[] = {10, 15, 8, 7, 9, 12};
        sumEvenOdd(arr, 0);
        System.out.println("Sum of Even: " + evenSum);
        System.out.println("Sum of Odd: " + oddSum);
    }
	
}


