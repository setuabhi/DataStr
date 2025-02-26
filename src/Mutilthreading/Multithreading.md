1. Multithreading is a concurrent execution of multiple threads in a single process 
   to achieve maximum utilization of CPU.
2. A process is a standalone instance of a running program that has its own memory space, system resources, and execution environment. 
   A thread, on the other hand, is a lightweight process that exists within a process and shares the same memory space, system resources, and execution environment with other threads in the same process.
   Executors are higher-level abstractions for managing threads in Java. Executors provide a way to manage a pool of threads and execute tasks concurrently.
   We can create threads directly using new keyword or with the help of executer service 
3. Extending the Thread class limits the subclass because it can't extend any other class,
   whereas Runnable is a functional interface and can be used with the Thread class or any other class.
4. Thread.State enum provides constants for each of these states, Thread.getState() method can be used to determine the current state of a thread.
   In Java, a thread can exist in one of the following states:

      
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