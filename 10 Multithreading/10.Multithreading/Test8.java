/* Q8. Create two threads with priority 1 and 10. Print their priority.
 Explanation :- Use setPriority(). */

class MyThread1 extends Thread
{
    public void run()
    {
        System.out.println("Thread 1 Priority: " + getPriority());
    }
}

class MyThread2 extends Thread
{
    public void run()
    {
        System.out.println("Thread 2 Priority: " + getPriority());
    }
}

public class Test8
{
    public static void main(String[] args)
    {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        try
        {
            t1.setPriority(1);   // Minimum priority
            t2.setPriority(10);  // Maximum priority
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Invalid Priority Value");
        }

        t1.start();
        t2.start();
    }
}

/* 
C:\Users\harsh\Downloads\core-java-code\java\10.Multithreading>java Test8.java
Thread 1 Priority: 1
Thread 2 Priority: 10 */
