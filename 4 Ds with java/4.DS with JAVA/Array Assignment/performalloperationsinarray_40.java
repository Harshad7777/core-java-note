/* 
Q5. Write a java program to take input array from user and perform all operations in array.
Input Array :  5732  8659  2534  9625  7354  1325
	
Case 1 :  Sort Number In Ascending Order.
	    Output :- 2357  5689  2345  2569  3457  1235 
				
Case 2 : Sort Number In Descending Order.
  Output :- 7532  9865  5432  9652  7543  5321
				
Case 3 : Store sum of digits at same index.
	  Output :-  17  28  14  22  19  11
	
Case 4 : Store the even number at the first and odd number at the last of digit at same index.
	   Output :-  2573  6859  4253  2695  4735  2135
				
Case 5 : Store only prime number at the same index of digit.
		Output :- 2573  5  253  25  357  235

 */
import java.util.*;
public class performalloperationsinarray_40 
{
    // Helper method: check prime
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        int[] a = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++)
		{
            a[i] = sc.nextInt();
        }

        // Case 1: Sort digits of each number in Ascending Order
        /* System.out.println("Case 1 : Sort Number In Ascending Order.");
        for (int i = 0; i < size; i++) {
            char[] digits = String.valueOf(a[i]).toCharArray();
            Arrays.sort(digits);
            System.out.print(new String(digits) + " ");
        } */
		for(int i=0; i<a.length; i++)
		{
			for(int j=(i+1); i<a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Display array after the sorting");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(" " +a[i]);
		}
}
}	
		/* 
		
        // Case 2: Sort digits of each number in Descending Order
        System.out.println();
        System.out.println("Case 2 : Sort Number In Descending Order.");
        for (int i = 0; i < size; i++) {
            char[] digits = String.valueOf(a[i]).toCharArray();
            Arrays.sort(digits);
            // reverse order
            for (int j = digits.length - 1; j >= 0; j--) {
                System.out.print(digits[j]);
            }
            System.out.print(" ");
        }

        // Case 3: Sum of digits at same index
        System.out.println();
        System.out.println("Case 3 : Store sum of digits at same index.");
        for (int i = 0; i < size; i++) {
            int num = a[i], sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            System.out.print(sum + " ");
        }

        // Case 4: Even digits first, odd digits later
        System.out.println();
        System.out.println("Case 4 : Store the even digits first and odd digits last at the same index.");
        for (int i = 0; i < size; i++) {
            String digits = String.valueOf(a[i]);
            String even = "", odd = "";
            for (int j = 0; j < digits.length(); j++) {
                int d = digits.charAt(j) - '0';
                if (d % 2 == 0) even += d;
                else odd += d;
            }
            System.out.print(even + odd + " ");
        }

        // Case 5: Store only prime digits at same index
        System.out.println();
        System.out.println("Case 5 : Store only prime digits at the same index.");
        for (int i = 0; i < size; i++) {
            String digits = String.valueOf(a[i]);
            String primes = "";
            for (int j = 0; j < digits.length(); j++) {
                int d = digits.charAt(j) - '0';
                if (isPrime(d)) primes += d;
            }
            if (primes.equals("")) primes = "0"; // if no prime digit
            System.out.print(primes + " ");
        }
    }
} */






/* 
import java.util.*;

public class PerformAllOperationsInArray {

    // helper: check prime digit
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // helper: convert number to digit array
    public static int[] toDigits(int num) {
        int temp = num, count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        int digits[] = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    // helper: convert digits back to number
    public static int toNumber(int[] digits) {
        int num = 0;
        for (int d : digits) {
            num = num * 10 + d;
        }
        return num;
    }

    // helper: sort digits ascending
    public static int[] sortAscending(int[] digits) {
        for (int i = 0; i < digits.length - 1; i++) {
            for (int j = 0; j < digits.length - i - 1; j++) {
                if (digits[j] > digits[j + 1]) {
                    int t = digits[j];
                    digits[j] = digits[j + 1];
                    digits[j + 1] = t;
                }
            }
        }
        return digits;
    }

    // helper: sort digits descending
    public static int[] sortDescending(int[] digits) {
        for (int i = 0; i < digits.length - 1; i++) {
            for (int j = 0; j < digits.length - i - 1; j++) {
                if (digits[j] < digits[j + 1]) {
                    int t = digits[j];
                    digits[j] = digits[j + 1];
                    digits[j + 1] = t;
                }
            }
        }
        return digits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int a[] = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        // Case 1: Ascending
        System.out.println("Case 1 : Sort Number In Ascending Order.");
        for (int i = 0; i < size; i++) {
            int digits[] = toDigits(a[i]);
            digits = sortAscending(digits);
            System.out.print(toNumber(digits) + " ");
        }

        // Case 2: Descending
        System.out.println();
        System.out.println("Case 2 : Sort Number In Descending Order.");
        for (int i = 0; i < size; i++) {
            int digits[] = toDigits(a[i]);
            digits = sortDescending(digits);
            System.out.print(toNumber(digits) + " ");
        }

        // Case 3: Sum of digits
        System.out.println();
        System.out.println("Case 3 : Store sum of digits at same index.");
        for (int i = 0; i < size; i++) {
            int num = a[i], sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            System.out.print(sum + " ");
        }

        // Case 4: Even digits first, odd digits later
        System.out.println();
        System.out.println("Case 4 : Store the even digits first and odd digits last.");
        for (int i = 0; i < size; i++) {
            int digits[] = toDigits(a[i]);
            int evens[] = new int[digits.length];
            int odds[] = new int[digits.length];
            int eCount = 0, oCount = 0;

            for (int d : digits) {
                if (d % 2 == 0) evens[eCount++] = d;
                else odds[oCount++] = d;
            }

            // combine evens + odds
            int result[] = new int[eCount + oCount];
            int k = 0;
            for (int j = 0; j < eCount; j++) result[k++] = evens[j];
            for (int j = 0; j < oCount; j++) result[k++] = odds[j];

            System.out.print(toNumber(result) + " ");
        }

        // Case 5: Prime digits only
        System.out.println();
        System.out.println("Case 5 : Store only prime digits at same index.");
        for (int i = 0; i < size; i++) {
            int digits[] = toDigits(a[i]);
            int primes[] = new int[digits.length];
            int pCount = 0;

            for (int d : digits) {
                if (isPrime(d)) primes[pCount++] = d;
            }

            if (pCount == 0) {
                System.out.print("0 "); // no primes in number
            } else {
                int result[] = new int[pCount];
                for (int j = 0; j < pCount; j++) result[j] = primes[j];
                System.out.print(toNumber(result) + " ");
            }
        }
    }
}
 */