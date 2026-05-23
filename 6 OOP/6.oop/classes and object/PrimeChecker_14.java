/* 14. Check for Prime Numbers
Create a class PrimeChecker with a method isPrime to check if a number is prime.
Explanation: Introduces number theory logic. */

class PrimeChecker
{
    public boolean isPrime(int n)
    {
        if(n <= 1)
            return false;

        for(int i = 2;  i * i <= n; i++)   // loop until √n
        {
            if(n % i == 0)
                return false; // not prime
        }
        return true; // prime
    }
}
public class PrimeChecker_14
{
    public static void main(String[] args)
    {
        PrimeChecker obj = new PrimeChecker();

        int num = 17;
        System.out.println(num + " is prime? " + obj.isPrime(num));
    }
}




/* java primeCheker_14.java
17 is prime? true */