// Q6. Set thread names as "StudentThread" and "TeacherThread".
// Output:
// StudentThread is running
// TeacherThread is running
// Explanation:
// Use setName().


class MyThread extends Thread 
{
    public void run() 
    {
        try 
		{
            System.out.println(Thread.currentThread().getName() + " is running");
            Thread.sleep(1000);
        } 
		catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
    }
}

public class Test6 
{
    public static void main(String[] args) 
	{
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("StudentThread");
        t2.setName("TeacherThread");

        t1.start();
        t2.start();
    }
}

/* C:\Users\harsh\Downloads\core-java-code\java\10.Multithreading>java Test6.java
TeacherThread is running
StudentThread is running */
