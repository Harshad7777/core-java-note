
// Q5. Create 2 threads and print their names using getName().
// Output:
// Thread-0
// Thread-1
// Explanation:
// Default names are assigned by JVM.


class MyThread extends Thread 
{
    public void run() 
	{
        try 
		{
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(100);
        } 
		catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
    }
}

public class Test5 
{
    public static void main(String[] args) 
	{
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();

        t1.start();
        t2.start();
		t3.start();
    }
}


/* C:\Users\harsh\Downloads\core-java-code\java\10.Multithreading>java Test5.java
Thread-0
Thread-1 
Thread-2*/
