// Q1. Create two threads:
// Thread 1 prints numbers from 1–5
// Thread 2 prints numbers from 6–10
// Both threads should run simultaneously.
// Output: 1 6 2 7 3 8 4 9 5 10
// Explanation:
// Two threads execute independently. Since scheduling is controlled by JVM, output order may differ.

class Thread1 extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) 
                {
                    System.out.print(i + " ");
                    sleep(100);
                }
             // small delay
        } 
        catch (Exception ex) 
        {
            System.out.println("Error is " + ex);
        }
    }
}

class Thread2 extends Thread 
{
    public void run() 
    {
        try
        {
            for (int i = 6; i <= 10; i++) 
                {
                    System.out.print(i + " ");
                    sleep(100);
                }
        }
        catch
        {
            System.out.println("Error is "+ex);
        }
    }
}
public class Thread
