# Multithreading Programs in Java

## Code Links

1. [Q1. Simultaneous Execution of Two Threads](#q1-simultaneous-execution-of-two-threads)
2. [Q2. Print Even and Odd Numbers using Multithreading](#q2-print-even-and-odd-numbers-using-multithreading)
3. [Q3. Multithreading using Runnable Interface](#q3-multithreading-using-runnable-interface)
4. [Q4. Delay Thread Execution using sleep()](#q4-delay-thread-execution-using-sleep)
5. [Q5. Display Default Thread Names](#q5-display-default-thread-names)
6. [Q6. Set and Get Custom Thread Names](#q6-set-and-get-custom-thread-names)
7. [Q7. Sequential Thread Execution using join()](#q7-sequential-thread-execution-using-join)
8. [Q8. Set and Get Thread Priorities](#q8-set-and-get-thread-priorities)


## Q1. Simultaneous Execution of Two Threads

**Problem Statement:**  
Create two threads:  
- Thread 1 prints numbers from 1–5.  
- Thread 2 prints numbers from 6–10.  
Both threads should run simultaneously.

*Example Output:*
```text
1 6 2 7 3 8 4 9 5 10
```
```java
class First extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1; i<=5; i++)
			{
				System.out.print(i+" ");
				Thread.sleep(10);
			}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}
class Second extends Thread
{
	public void run()
	{
		try
		{
			for(int i=6; i<=10; i++)
			{
				System.out.print(i+" ");
				Thread.sleep(10);
			}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}
public class Q1
{
	public static void main(String x[]) throws InterruptedException
	{
		First f = new First();
		f.start();
		
		Second s = new Second();
		s.start();
	}
}
```

## Q2. Print Even and Odd Numbers using Multithreading

**Problem Statement:**  
Create two threads:  
- One thread for even numbers (1–20).  
- One thread for odd numbers (1–20).

*Example Output:*
```text
Odd: 1
Even: 2
Odd: 3
Even: 4...
```
```java
class Odd extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1; i<=20; i+=2)
			{
				System.out.println("Odd: "+i);
				sleep(100);
			}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		
	}
}
class Even extends Thread
{
	public void run()
	{
		try
		{
			for(int i=2; i<=20; i+=2)
			{
				System.out.println("Even: "+i);
				Thread.sleep(100);
			}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}


public class Q2
{
	public static void main(String x[]) throws InterruptedException
	{
		Odd o = new Odd();
		o.start();
		
		Even e = new Even();
		e.start();
	}
}
```

## Q3. Multithreading using Runnable Interface

**Problem Statement:**  
Create a class implementing `Runnable` interface that prints "Hello Multithreading" 5 times.

*Example Output:*
```text
Hello Multithreading
Hello Multithreading
Hello Multithreading
Hello Multithreading
Hello Multithreading
```
```java
class MyRunnable implements Runnable 
{

    public void run() 
	{
        for (int i = 1; i <= 5; i++) 
		{
            System.out.println("Hello Multithreading");
        }
    }
}

public class Q3 {

    public static void main(String[] args) {

        MyRunnable obj = new MyRunnable();
        Thread t = new Thread(obj);
        t.start();
    }
}
```

## Q4. Delay Thread Execution using sleep()

**Problem Statement:**  
Create a thread that prints numbers from 1–5 with a 1-second delay between each number using `Thread.sleep(1000)`.

*Example Output:*
```text
1 (1 sec delay)
2 (1 sec delay)...
```
```java
class Print extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1; i<=5; i++)
			{
				System.out.println(i+" "+"("+"1 sec delay"+")");
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}

public class Q4
{
	public static void main(String x[]) throws InterruptedException
	{
		Print p = new Print();
		p.start();
	}
}
```

## Q5. Display Default Thread Names

**Problem Statement:**  
Create 2 threads and print their default names using `getName()`.

*Example Output:*
```text
Thread-0
Thread-1
```
```java
class One extends Thread
{
	public void run()
	{
		try
		{
			System.out.println(getName());
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}

class Two extends Thread
{
	public void run()
	{
		try
		{
			System.out.println(getName());
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}

public class Q5
{
	public static void main(String x[]) throws InterruptedException
	{
		One o = new One();
		o.start();
		
		Two t = new Two();
		t.start();
	}
}
```

## Q6. Set and Get Custom Thread Names

**Problem Statement:**  
Set custom thread names as `"StudentThread"` and `"TeacherThread"` using `setName()`.

*Example Output:*
```text
StudentThread is running
TeacherThread is running
```
**Explanation:**  
Use `setName()` to assign custom names to threads.

```java
class StudentThread extends Thread
{
	public void run()
	{ 
		System.out.println(Thread.currentThread().getName()+" is running");
	}
}

class TeacherThread extends Thread
{
	public void run()
	{
			System.out.println(Thread.currentThread().getName()+" is running");
	}
}

public class Q6
{
	public static void main(String x[])
	{
		StudentThread st = new StudentThread();
		
		st.setName("StudentThread");
		
		st.start();
        
		TeacherThread tt = new TeacherThread();
	
		tt.setName("TeacherThread");
		
		tt.start();
	}
}
```

## Q7. Sequential Thread Execution using join()

**Problem Statement:**  
Create two threads where Thread A prints 1–5, and Thread B starts only after Thread A finishes.

**Explanation:**  
Use `t1.join()` before starting `t2` so Thread B waits for Thread A to complete.

```java
class A extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1; i<=5; i++)
			{
				System.out.println(i);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class B extends Thread
{
	public void run()
	{
		try
		{
			for(int i=6; i<=10; i++)
			{
				System.out.println(i);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

public class Q7
{
	public static void main(String x[]) throws InterruptedException
	{
		A a = new A();
		a.start();
		a.join();
		
		B b = new B();
		b.start();
	}
}
```

## Q8. Set and Get Thread Priorities

**Problem Statement:**  
Create two threads with priority 1 and priority 10. Print their assigned priorities.

**Explanation:**  
Use `setPriority()` to modify thread scheduling priority levels.

```java
class FirstPriority extends Thread
{
	public void run()
	{
		System.out.println("FirstPriority: "+Thread.currentThread().getPriority());
	}
}

class LastPriority extends Thread
{
	public void run()
	{
		System.out.println("LastPriority: "+Thread.currentThread().getPriority());
	}
}

public class Q8
{
	public static void main(String x[])
	{
		FirstPriority fp = new FirstPriority();
		fp.setPriority(1);
		fp.start();
		
		LastPriority lp = new LastPriority();
		lp.setPriority(10);
		lp.start();
	}
}
```
