package Mutilthreading;

/**
 * if t1 is accessing method1 using obj1 of SynchonizedExample then t2 can't access method2 and method3
 * But t2 can access method4 at the same time due to Object lock
 */
public class SynchonizedExample {

    public void method1()  {
        synchronized (this) {  // Lock current object,
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("method1 works!");
        }
    }

    public synchronized void method2() {  // Locks `this`
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("method2 works!");
    }

    public void method3()  {
        synchronized (this) {  // Lock current object,
            System.out.println("method3 works!");
        }
    }
    private final Object lock = new Object();
    public void method4()  {
        synchronized (lock) {  // Lock a specific object
            System.out.println("method4 works!");
        }
    }

    public void method5() {
        synchronized (SynchonizedExample.class) {  // Locks the whole class,  meaning only one thread across all instances of MyClass can execute the synchronized block at a time.
            System.out.println("method5 works");
        }
    }

    public static void main(String[] args)  {
        SynchonizedExample obj1 = new SynchonizedExample();
        Thread t1 = new Thread(() -> obj1.method1(), "T1");
        Thread t2 = new Thread(() -> obj1.method2(), "T2");
        Thread t3 = new Thread(() -> obj1.method4(), "T3");

        t1.start();
        t2.start();
        t3.start();
    }


}
