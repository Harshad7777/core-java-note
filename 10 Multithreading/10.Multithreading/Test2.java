// Q2. Create two threads:
// One thread for even numbers (1–20)
// One thread for odd numbers (1–20)
// Output:
// Odd: 1
// Even: 2
// Odd: 3
// Even: 4
// Explanation:
// Each thread checks condition (i % 2 == 0) and prints accordingly.

class OddThread extends Thread 
{
    public void run() 
	{
        try {
            for(int i = 1; i <= 20; i++) 
			{
                if(i % 2 != 0) 
				{
                    System.out.println("Odd: " + i);
                    Thread.sleep(100);
                }
            }
        } 
		catch (InterruptedException e) 
		{
            e.printStackTrace();
        }
    }
}

class EvenThread extends Thread 
{
    public void run() 
	{
        try 
		{
            for(int i = 1; i <= 20; i++) 
			{
                if(i % 2 == 0) 
				{
                    System.out.println("Even: " + i);
                    Thread.sleep(100);
                }
            }
        } 
		catch (Exception ex) 
		{
            System.out.println("Error is " + ex);
        }
    }
}

public class Test2 
{
    public static void main(String[] args) 
	{
        new OddThread().start();
        new EvenThread().start();
    }
}
/* 
C:\Users\harsh\Downloads\core-java-code\java\10.Multithreading>java Test2.java
Odd: 1
Even: 2
Odd: 3
Even: 4
Even: 6
Odd: 5
Odd: 7
Even: 8
Odd: 9
Even: 10
Even: 12
Odd: 11
Even: 14
Odd: 13
Even: 16
Odd: 15
Odd: 17
Even: 18
Odd: 19
Even: 20
 */