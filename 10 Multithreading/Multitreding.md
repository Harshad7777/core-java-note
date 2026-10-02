# Java Multithreading

[Basics](#basics) | [Thread Methods](#thread-methods) | [Synchronization](#synchronization) | [Thread Communication](#thread-communication) | [Advanced Concepts](#advanced-concepts) | [Executors & Pools](#executors-and-thread-pools) | [Interview Cheat Sheet](#interview-cheat-sheet)

---

## Basics

### 1. What is a Process?

A process is an independent program that is currently executing in memory.

Each process has its own memory space and system resources.

Examples:

- browser
- VS Code
- music player

### Important interview point

A process is heavyweight because it has separate memory and resources.

---

### 2. What is a Thread?

A thread is the smallest unit of execution inside a process.

It is also called a lightweight process.

### Example

In a browser:

- one thread loads the page
- one thread plays a video
- one thread handles clicks

### Important interview point

Threads share the memory of the same process.

---

### 3. What is Multithreading?

Multithreading is the execution of multiple threads concurrently inside a single process.

### Benefits

- faster execution
- better CPU utilization
- improved responsiveness
- background tasks can run while main task continues

### Important interview point

Multithreading improves performance, but it can create synchronization issues.

---

### 4. How to create a thread in Java?

There are two common ways:

#### 1) Extend `Thread` class

```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running");
    }
}
```

#### 2) Implement `Runnable` interface

```java
class MyTask implements Runnable {
    public void run() {
        System.out.println("Thread running");
    }
}
```

### Important interview point

`Runnable` is preferred because Java supports single inheritance.

---

### 5. Thread class vs Runnable interface

| Thread Class | Runnable Interface |
| ----------- | ------------------ |
| Must extend `Thread` | Must implement `Runnable` |
| Cannot extend another class | Can extend another class |
| Less flexible | More flexible |

### Important interview point

In real projects, `Runnable` and `ExecutorService` are preferred.

---

### 6. Difference between `start()` and `run()`

| `start()` | `run()` |
| --------- | ------- |
| creates a new thread | normal method call |
| JVM schedules it | no new thread is created |
| executes asynchronously | executes sequentially |

### Example

```java
Thread t = new Thread();
t.start();   // new thread
// t.run(); // normal method call
```

### Important interview point

Never call `run()` directly if you want real multithreading.

---

### 7. What is `sleep()` method?

`sleep()` pauses the current thread for a specified time.

```java
Thread.sleep(2000); // 2 seconds
```

### Simple explanation

The thread waits for some time.

### Important interview point

`sleep()` does not release the lock.

---

### 8. What is `join()` method?

`join()` makes one thread wait until another thread completes execution.

```java
t1.join();
```

### Simple explanation

Thread B waits until Thread A finishes.

### Important interview point

Used when execution order matters.

---

### 9. What is `isAlive()` method?

`isAlive()` checks whether a thread is still running.

```java
System.out.println(t.isAlive());
```

### Return values

- `true` → thread is running
- `false` → thread completed

### Important interview point

Useful for monitoring thread status.

---

### 10. What is Main Thread?

The main thread is the first thread created by the JVM when a Java program starts.

```java
public static void main(String[] args)
```

### Important interview point

All child threads are usually created from the main thread.

---

## Thread Methods

### 11. What is Thread Priority?

Thread priority is a hint to the scheduler about which thread should get preference.

Priority range:

- `MIN_PRIORITY = 1`
- `NORM_PRIORITY = 5`
- `MAX_PRIORITY = 10`

```java
t1.setPriority(8);
```

### Important interview point

Priority is only a hint and is not guaranteed.

---

### 12. What is `setPriority()`?

`setPriority()` assigns a priority to a thread.

```java
Thread t = new Thread();
t.setPriority(7);
```

### Important interview point

Valid values are from 1 to 10.

---

### 13. What is `getPriority()`?

`getPriority()` returns the current priority of a thread.

```java
System.out.println(t.getPriority());
```

### Important interview point

Default priority is `5`.

---

### 14. What is `stop()`?

`stop()` was used to forcibly terminate a thread.

```java
t.stop();
```

### Important correction

`Thread.stop()` is deprecated and unsafe.

### Why unsafe?

- can leave shared data inconsistent
- can break synchronization

### Preferred alternatives

- `interrupt()`
- `volatile` flag

### Important interview point

If asked in interview: avoid `stop()`. It is deprecated.

---

### 15. What is `interrupt()`?

`interrupt()` is used to signal a thread that it should stop or handle interruption.

```java
t.interrupt();
```

### Important interview point

It does not force-stop the thread immediately. It is a request for interruption.

---

### 16. What is a Daemon Thread?

A daemon thread is a background thread that supports user threads.

Examples:

- garbage collector
- background clean-up tasks

```java
t.setDaemon(true);
```

### Important interview point

The JVM exits when only daemon threads remain.

---

### 17. User Thread vs Daemon Thread

| User Thread | Daemon Thread |
| ---------- | ------------- |
| important work | background support |
| JVM waits for completion | JVM may terminate it |
| example: main thread | example: GC |

### Important interview point

Daemon threads depend on user threads.

---

## Synchronization

### 18. What is Synchronization?

Synchronization is a mechanism that controls access to shared resources so that only one thread executes a critical section at a time.

```java
synchronized void display() {
    // critical section
}
```

### Important interview point

It prevents race conditions and data inconsistency.

---

### 19. What is a Race Condition?

A race condition occurs when multiple threads access and modify shared data at the same time, causing unpredictable results.

### Example

Two threads update the same bank balance simultaneously.

### Important interview point

Solved using synchronization, locks, or atomic classes.

---

### 20. What is Data Inconsistency?

Data inconsistency happens when shared data becomes incorrect because multiple threads modified it without proper synchronization.

### Example

Expected:

```java
count = 2
```

Actual:

```java
count = 1
```

### Important interview point

This is a common issue in unsynchronized multithreading.

---

### 21. What is a synchronized method?

A synchronized method allows only one thread at a time to execute that method on the same object.

```java
synchronized void display() {
    System.out.println("Shared Resource");
}
```

### Important interview point

The lock is acquired on the current object (`this`) for non-static methods.

---

### 22. What is a synchronized block?

A synchronized block locks only a specific section of code instead of the whole method.

```java
void show() {
    synchronized (this) {
        System.out.println("Critical section");
    }
}
```

### Important interview point

The synchronized block is more efficient because its scope is smaller.

---

### 23. synchronized method vs synchronized block

| Synchronized Method | Synchronized Block |
| ------------------- | ------------------ |
| locks the whole method | locks only a block |
| less flexible | more flexible |
| can reduce performance | better optimized |

### Important interview point

Use a synchronized block when only part of the code needs protection.

---

### 24. What is Deadlock?

Deadlock occurs when two or more threads wait forever for each other's resources.

### Example

- Thread A holds Lock1 and waits for Lock2
- Thread B holds Lock2 and waits for Lock1

### Important interview point

Avoid by using consistent lock ordering.

---

## Thread Communication

### 25. What is `wait()` method?

`wait()` makes the current thread release the lock and wait until another thread notifies it.

```java
synchronized (obj) {
    obj.wait();
}
```

### Important interview point

`wait()` belongs to the `Object` class, not the `Thread` class.

---

### 26. What is `notify()` method?

`notify()` wakes up one waiting thread on the same object monitor.

```java
synchronized (obj) {
    obj.notify();
}
```

### Important interview point

`notify()` must be called inside a synchronized block or method.

---

### 27. What is `notifyAll()` method?

`notifyAll()` wakes up all waiting threads on the same object monitor.

```java
synchronized (obj) {
    obj.notifyAll();
}
```

### Important interview point

It is safer than `notify()` when multiple threads depend on the same condition.

---

### 28. wait() vs sleep()

| `wait()` | `sleep()` |
| -------- | --------- |
| belongs to `Object` | belongs to `Thread` |
| releases lock | does not release lock |
| used for communication | used for pause/delay |
| must be used inside synchronized context | no synchronized block required |

### Important interview point

This is one of the most common multithreading interview questions.

---

## Advanced Concepts

### 29. What is Thread Life Cycle?

A thread goes through several states during execution.

Main states:

1. `NEW`
2. `RUNNABLE`
3. `BLOCKED`
4. `WAITING`
5. `TIMED_WAITING`
6. `TERMINATED`

### Important interview point

The official Java API uses `RUNNABLE`, not `RUNNING`.

---

### 30. Thread states in Java

#### NEW

Thread was created but not started.

```java
Thread t = new Thread();
```

#### RUNNABLE

After calling `start()`.

```java
t.start();
```

#### BLOCKED

Waiting for a monitor lock.

#### WAITING

Waiting indefinitely.

```java
obj.wait();
```

#### TIMED_WAITING

Waiting for a fixed time.

```java
Thread.sleep(2000);
```

#### TERMINATED

Thread execution is finished.

---

### 31. What is Thread Group?

A `ThreadGroup` groups multiple threads so they can be managed together.

```java
ThreadGroup tg = new ThreadGroup("MyGroup");
Thread t1 = new Thread(tg, "Thread1");
```

### Important interview point

`ThreadGroup` is an older API and is rarely used in modern Java applications.

---

### 32. What is `ExecutorService`?

`ExecutorService` is an interface used to manage and execute tasks asynchronously.

```java
ExecutorService service = Executors.newFixedThreadPool(3);
service.submit(() -> System.out.println("Task running"));
service.shutdown();
```

### Important interview point

It is part of `java.util.concurrent` and is preferred for modern Java code.

---

### 33. What is a Thread Pool?

A thread pool is a collection of reusable threads used to execute tasks.

### Advantages

- avoids repeated thread creation
- improves performance
- reduces resource overhead

### Important interview point

Thread pools are used widely in production applications.

---

### 34. Thread vs ExecutorService

| Thread | ExecutorService |
| ------ | --------------- |
| manual thread creation | manages thread pool |
| less scalable | more scalable |
| direct control | managed execution |

### Important interview point

In real-world Java applications, `ExecutorService` is preferred.

---

### 35. What is `volatile`?

`volatile` ensures that changes to a variable are immediately visible to all threads.

```java
volatile boolean flag = true;
```

### Important interview point

`volatile` gives visibility, not full atomicity.

For example:

```java
count++;
```

is still not thread-safe even if `count` is `volatile`.

---

### 36. synchronized vs volatile

| `synchronized` | `volatile` |
| -------------- | ---------- |
| provides mutual exclusion | provides visibility only |
| locks code section | no lock |
| safer for compound operations | lightweight but limited |

### Important interview point

Use `volatile` for simple flags; use `synchronized` when multiple steps must be protected.

---

### 37. What is `Callable`?

`Callable` is similar to `Runnable`, but it can return a result and throw checked exceptions.

```java
Callable<Integer> task = () -> 10;
```

### Important interview point

`Runnable` has no return value; `Callable` can return a value.

---

### 38. Runnable vs Callable

| Runnable | Callable |
| -------- | -------- |
| no return value | returns value |
| `run()` method | `call()` method |
| cannot throw checked exceptions | can throw checked exceptions |

### Important interview point

`Callable` is often used with `ExecutorService`.

---

### 39. What is `Future`?

`Future` represents the result of an asynchronous task.

```java
Future<Integer> future = service.submit(() -> 100);
Integer result = future.get();
```

### Important interview point

`future.get()` blocks until the result is ready.

---

### 40. Why is modern multithreading preferred?

Modern APIs like `ExecutorService`, thread pools, and `CompletableFuture` are preferred because they are easier to manage and more scalable.

### Benefits

- thread reuse
- better resource management
- easier error handling
- cleaner code

### Important interview point

Prefer `java.util.concurrent` than manual thread management.

---

## Executors and Thread Pools

### 41. What is `ReentrantLock`?

`ReentrantLock` is an explicit lock implementation with more control than `synchronized`.

```java
ReentrantLock lock = new ReentrantLock();

lock.lock();
try {
    System.out.println("Critical section");
} finally {
    lock.unlock();
}
```

### Important interview point

A thread that already holds the lock can lock it again.

---

### 42. synchronized vs ReentrantLock

| `synchronized` | `ReentrantLock` |
| ------------- | -------------- |
| automatic lock/unlock | manual lock/unlock |
| simpler | more flexible |
| no timeout support | supports timeout and `tryLock()` |

### Important interview point

Always unlock in a `finally` block.

---

### 43. What is `Semaphore`?

A `Semaphore` controls access to a limited number of resources using permits.

```java
Semaphore semaphore = new Semaphore(2);
semaphore.acquire();
semaphore.release();
```

### Important interview point

Useful for resource-limited systems such as database connections or printers.

---

### 44. What is `CountDownLatch`?

`CountDownLatch` lets one or more threads wait until a set of tasks is complete.

```java
CountDownLatch latch = new CountDownLatch(3);
latch.countDown();
latch.await();
```

### Important interview point

It is one-time use and cannot be reset after reaching zero.

---

### 45. What is `CyclicBarrier`?

`CyclicBarrier` lets multiple threads wait for each other at a common point before continuing.

```java
CyclicBarrier barrier = new CyclicBarrier(3);
barrier.await();
```

### Important interview point

Unlike `CountDownLatch`, it can be reused.

---

### 46. CountDownLatch vs CyclicBarrier

| CountDownLatch | CyclicBarrier |
| -------------- | ------------- |
| one-time use | reusable |
| threads wait for counter to become zero | threads wait for each other |
| `countDown()` reduces count | `await()` waits at barrier |

### Important interview point

Latch = wait for tasks to finish
Barrier = wait until all threads meet

---

### 47. What is `ForkJoinPool`?

`ForkJoinPool` is a special thread pool used for divide-and-conquer tasks.

### Simple explanation

A large task is split into smaller subtasks, processed in parallel, and then combined.

### Important interview point

It uses work-stealing for execution efficiency.

---

### 48. What is `CompletableFuture`?

`CompletableFuture` is used for asynchronous programming and chaining tasks without blocking.

```java
CompletableFuture<String> future =
    CompletableFuture.supplyAsync(() -> "Hello");
```

### Important interview point

It supports chaining like `thenApply()`, `thenAccept()`, etc.

---

### 49. Future vs CompletableFuture

| Future | CompletableFuture |
| ----- | ----------------- |
| basic async result | advanced async programming |
| `get()` based | supports chaining and callbacks |
| limited features | more flexible |

### Important interview point

`CompletableFuture` is preferred in modern Java asynchronous programming.

---

### 50. Best practices for multithreading in Java

1. Use `ExecutorService` instead of manually creating many threads
2. Minimize shared mutable data
3. Use synchronization only where needed
4. Prefer concurrent collections
5. Always release locks in `finally`
6. Avoid deadlocks
7. Handle `InterruptedException` correctly
8. Use atomic classes for simple counters
9. Prefer modern concurrency APIs

### Important interview point

Real-world Java code should prefer `java.util.concurrent` utilities.

---

# Interview Cheat Sheet

## 1. Process vs Thread

| Process | Thread |
| ------- | ------ |
| independent program | smallest unit of execution |
| heavyweight | lightweight |
| separate memory | shares memory |

---

## 2. Thread Creation

### Extend Thread

```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Running");
    }
}
```

### Implement Runnable (preferred)

```java
class MyTask implements Runnable {
    public void run() {
        System.out.println("Running");
    }
}
```

---

## 3. Key Methods

| Method | Use |
| ------ | --- |
| `start()` | start a new thread |
| `run()` | thread logic |
| `sleep()` | pause thread |
| `join()` | wait for another thread |
| `yield()` | hint to scheduler |
| `interrupt()` | request interruption |
| `isAlive()` | check if running |

---

## 4. Thread States

```text
NEW → RUNNABLE → BLOCKED / WAITING / TIMED_WAITING → TERMINATED
```

---

## 5. Synchronization

Used to prevent threads from accessing shared data at the same time.

### Synchronized Method

```java
synchronized void show() {
}
```

### Synchronized Block

```java
synchronized(this) {
}
```

---

## 6. sleep() vs wait()

| `sleep()` | `wait()` |
| --------- | -------- |
| `Thread` class | `Object` class |
| does not release lock | releases lock |
| used for delay | used for communication |

---

## 7. notify() vs notifyAll()

| `notify()` | `notifyAll()` |
| ---------- | ------------- |
| wakes one thread | wakes all waiting threads |

---

## 8. volatile

```java
volatile boolean flag = true;
```

Used for visibility across threads.

Important:

- `volatile` = visibility only
- not full thread safety for compound operations

---

## 9. Deadlock

When two threads wait forever for each other's locks.

### Avoidance

- consistent lock order
- hold locks for shortest time
- avoid nested locks when possible

---

## 10. Race Condition

Multiple threads update shared data at the same time.

### Solution

- synchronization
- locks
- atomic variables

---

## 11. ExecutorService

```java
ExecutorService service = Executors.newFixedThreadPool(3);
service.submit(() -> System.out.println("Task"));
service.shutdown();
```

### Benefits

- reusable threads
- better performance
- easier management

---

## 12. Callable and Future

```java
Callable<Integer> task = () -> 10;
Future<Integer> future = service.submit(task);
```

- `Callable` returns a value
- `Future` holds the result

---

## 13. CompletableFuture

```java
CompletableFuture.supplyAsync(() -> "Hello");
```

Better for modern asynchronous programming.

---

## 14. Concurrency utilities

- `ReentrantLock`
- `Semaphore`
- `CountDownLatch`
- `CyclicBarrier`
- `ForkJoinPool`
- `AtomicInteger`
- `ConcurrentHashMap`

---

## Final quick revision

- Process = running program
- Thread = smallest execution unit
- Multithreading = multiple threads in one process
- `start()` = new thread
- `run()` = normal method
- `sleep()` = pause
- `join()` = wait for thread completion
- `wait()` = release lock and wait
- `notify()` = wake one waiting thread
- `notifyAll()` = wake all waiting threads
- `synchronized` = lock shared code
- `volatile` = visibility only
- `ExecutorService` = modern thread management
- `CompletableFuture` = modern async programming

---

## Final interview summary

Multithreading means executing multiple tasks concurrently to improve performance, responsiveness, and efficient resource use.
