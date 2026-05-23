/* Q12. Write a Java function to count how many prime numbers exist in an array.
Return the total count. */


public class CountPrimeRec_12 
{
    static boolean isPrime(int n, int i) {
        if (n <= 1)
            return false;
        if (i > n / 2)
            return true;
        if (n % i == 0)
            return false;
        return isPrime(n, i + 1);
    }

    static int countPrimes(int arr[], int index) {
        if (index == arr.length)
            return 0;
        int add = isPrime(arr[index], 2) ? 1 : 0;
        return add + countPrimes(arr, index + 1);
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 10, 11};
        System.out.println("Prime Count: " + countPrimes(arr, 0));
    }
}
