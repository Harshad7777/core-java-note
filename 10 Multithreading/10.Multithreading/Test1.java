//  Practice Assignment
// ================================================================
// Q1. Create two threads:
// Thread 1 prints numbers from 1–5
// Thread 2 prints numbers from 6–10
// Both threads should run simultaneously.
// Output: 1 6 2 7 3 8 4 9 5 10
// Explanation:
// Two threads execute independently. Since scheduling is controlled by JVM, output order may differ.

class T1 extends Thread 
{
    public void run() 
	{
        try 
		{
            for(int i = 1; i <= 5; i++) 
			{
                System.out.print(i + " ");
                Thread.sleep(100);   // small delay
            }
        } 
		catch (InterruptedException e) 
		{
            e.printStackTrace();
        }
    }
}
class T2 extends Thread 
{
    public void run() 
	{
        try 
		{
            for(int i = 6; i <= 10; i++) 
			{
                System.out.print(i + " ");
                Thread.sleep(100);
            }
        } 
		catch (InterruptedException e) 
		{
            e.printStackTrace();
        }
    }
}

public class Test1 
{
    public static void main(String[] args) 
	{
        T1 t1 = new T1();
        T2 t2 = new T2();
        t1.start();
        t2.start();
    }
}

/* C:\Users\harsh\Downloads\core-java-code\java\10.Multithreading>java Test1.java
1 6 2 7 3 8 9 4 5 10 */
