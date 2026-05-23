// Q3. Create a class implementing Runnable that prints "Hello Multithreading" 5 times.
// Output:
// Hello Multithreading
// Hello Multithreading
// Hello Multithreading
// Hello Multithreading
// Hello Multithreading
// Explanation:
// Thread is created using:
// Thread t = new Thread(obj);
// t.start();

class MyRunnable implements Runnable 
{
    public void run() 
	{
        try 
		{
            for(int i = 1; i <= 5; i++) 
			{
                System.out.println("Hello Multithreading");
                Thread.sleep(500);
            }
        } 
		catch (InterruptedException e) 
		{
            e.printStackTrace();
        }
    }
}

public class Test3 
{
    public static void main(String[] args) 
	{
        MyRunnable obj = new MyRunnable();
        Thread t = new Thread(obj);
        t.start();
    }
}

/* 
C:\Users\harsh\Downloads\core-java-code\java\10.Multithreading>java Test3.java
Hello Multithreading
Hello Multithreading
Hello Multithreading
Hello Multithreading
Hello Multithreading */