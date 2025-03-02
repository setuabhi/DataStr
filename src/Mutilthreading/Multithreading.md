1. Multithreading is a concurrent execution of multiple threads in a single process 
   to achieve maximum utilization of CPU.

2. A process is a standalone instance of a running program that has its own memory space, system resources, and execution environment. 
   A thread, on the other hand, is a lightweight process that exists within a process and shares the same memory space, system resources, and execution environment with other threads in the same process.
   Executors are higher-level abstractions for managing threads in Java. Executors provide a way to manage a pool of threads and execute tasks concurrently.
   We can create threads directly using new keyword or with the help of executer service 

3. Extending the Thread class limits the subclass because it can't extend any other class,
   whereas Runnable is a functional interface and can be used with the Thread class or any other class.

4. Thread.State enum provides constants for each of these states, Thread.getState() method can be used to determine the current state of a thread.

5.**In Java, a thread can exist in one of the following states:**

      New:
      This is the initial state of a thread when it's created using the Thread class constructor.
      The thread has not yet started execution.
      The start() method must be called to transition the thread to the runnable state.
   
      Runnable:
      A thread in this state is ready to be executed by the CPU.
      It's waiting in the thread pool for its turn to acquire CPU time.
      The thread scheduler selects threads from the runnable pool for execution based on factors like priority and scheduling algorithms.
   
      Running:
      The thread is currently executing its code on the CPU.
      Only one thread can be in the running state at a given time per CPU core.
      The thread can be preempted by the operating system or voluntarily yield the CPU to other threads.
   
      Blocked:
      The thread is temporarily unable to execute due to external constraints.
      Common reasons for blocking:
      Waiting to acquire a lock on a synchronized block or method.
      Waiting for I/O operations to complete (e.g., reading from a file).
      Waiting to get notified
   
      Waiting:
      The thread is waiting indefinitely for another thread to perform a specific action.
      This state is typically entered by calling methods like Object.wait() without a timeout.
   
      Timed Waiting:
      The thread is waiting for a specific amount of time for another thread to perform an action.
      This state is entered by calling methods like Thread.sleep(), Object.wait() with a timeout, or Thread.join() with a timeout.
   
      Terminated:
      The thread has finished executing its code.
      It can no longer be executed.

6.**What is CAS (Compare-And-Swap)?**

      CAS (Compare-And-Swap) is an atomic operation used in concurrent programming to ensure safe updates to shared variables without using locks. It is the foundation of many non-blocking algorithms, including Java’s Atomic classes (AtomicInteger, AtomicLong, etc.).
      
      How CAS Works
      CAS involves three key components:
      
         1. Expected value (old value)
         2. New value (updated value)
         3. Memory location (variable being updated)

      The CAS operation works like this:
         It reads the current value from memory.
         It compares the read value with the expected value.
         If the values match, it updates the variable with the new value atomically.
         If the values don’t match, the update fails, and the operation is retried.

      CAS in Action (Example)
      Imagine a count variable initially set to 5:
      

      AtomicInteger count = new AtomicInteger(5);
      
      // Simulating a CAS operation:
      boolean success = count.compareAndSet(5, 6);

      If count == 5, update it to 6 and return true.
      If count != 5, do nothing and return false (another thread modified it first).

         Why CAS is Better than Locks?
         ✅ Non-blocking: CAS does not block other threads, unlike synchronized.
         ✅ Faster: Avoids the overhead of acquiring and releasing locks.
         ❌ Spinning (Busy-waiting) Risk: If multiple threads repeatedly fail the CAS check, performance may degrade (solved using retry loops).
      
      Where is CAS Used in Java?
      AtomicInteger, AtomicLong, AtomicReference (for safe concurrent updates)
      ConcurrentHashMap (for lock-free bucket updates)
      ThreadPoolExecutor (for managing worker thread states)

7.**Race Condition**

    A race condition occurs in multi-threaded programs when two or more threads access and modify shared data simultaneously in an unpredictable order, leading to incorrect results or unexpected behavior.
    
    Example of a Race Condition
    Imagine two threads trying to increment a shared counter:

    class Counter {
    private int count = 0;

    void increment() {
        count++;  // Not atomic! Read -> Modify -> Write
        }
    }   

    What Happens in a Race Condition?
    1. Thread 1 reads count = 5 (before updating).
    2. Thread 2 reads count = 5 (before Thread 1 writes back).
    3. Thread 1 increments count and writes count = 6.
    4. Thread 2 increments count and writes count = 6 (but expected was 7).

    🔴 Final result: count = 6 instead of 7.
    🔴 One increment operation is lost!

8.**Volatile and Atomic Data types**

    🔴 volatile variable is always read from and written to main memory, not from thread-specific caches. This means changes made by one thread to a volatile variable are visible to other threads immediately, race condtion can occur as it's not thread safe
    🔴 Amotic is thread safe, Operations like incrementAndGet() are atomic and thread safe, Uses volatile internally
        ✅ Multiple threads can access a volatile variable at the same time.
        ❌ Concurrent updates on volatile variables are NOT atomic, leading to race conditions.
        ✅ Use AtomicInteger or synchronized if atomicity is required.
