// Q4. Create a thread that prints numbers from 1–5 with 1-second delay between each number.
// Output:
// 1 (1 sec delay)
// 2 (1 sec delay)
// ...
// Explanation:
// Use Thread.sleep(1000) inside loop.

class DelayThread extends Thread 
{
    public void run() 
	{
        try 
		{
            for(int i = 1; i <= 5; i++) 
			{
                System.out.println(i);
                Thread.sleep(1000);   // 1 second delay
            }
        } 
		catch (InterruptedException e) 
		{
            System.out.println("Thread Interrupted");
        }
    }
}

public class Test4 
{
    public static void main(String[] args) 
	{
        new DelayThread().start();
    }
}

/* C:\Users\harsh\Downloads\core-java-code\java\10.Multithreading>java Test4.java
1
2
3
4
5 */
