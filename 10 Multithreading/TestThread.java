// Q1. Create two threads:
// Thread 1 prints numbers from 1–5
// Thread 2 prints numbers from 6–10
// Both threads should run simultaneously.
// Output: 1 6 2 7 3 8 4 9 5 10
// Explanation:
// Two threads execute independently. Since scheduling is controlled by JVM, output order may differ.
class Thread1 extends Thread
{
    public void run()
    {
        for(int i = 1; i <= 5; i++)
        {
            System.out.print(i + " ");
            try { Thread.sleep(100); } catch(Exception e) {}
        }
    }
}

class Thread2 extends Thread
{
    public void run()
    {
        for(int i = 6; i <= 10; i++)
        {
            System.out.print(i + " ");
            try { Thread.sleep(100); } catch(Exception e) {}
        }
    }
}

public class TestThread
{
    public static void main(String[] args)
    {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
    }
}


// Multithreading> cd "c:\Users\harsh\Downloads\core java notes\core-java-note\10 Multithreading\" ; if ($?) { javac TestThread.java } ; if ($?) { java TestThread }
// 1 6 7 2 3 8 4 9 5 10 
