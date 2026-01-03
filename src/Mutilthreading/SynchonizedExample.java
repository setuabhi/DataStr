package Mutilthreading;

import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * this → Your house key
 * lock → Bedroom key
 * Class → Apartment main gate
 */
public class SynchonizedExample {

    public static void main(String[] args) {
        SynchonizedExample obj1 = new SynchonizedExample();
        SynchonizedExample obj2 = new SynchonizedExample();
        Thread t0 = new Thread(() -> obj1.method0(), "T0");
        Thread t1 = new Thread(() -> obj1.method1(), "T1");
        Thread t2 = new Thread(() -> obj1.method2(), "T2");
        Thread t3 = new Thread(() -> obj1.method3(), "T3");
        Thread t4 = new Thread(() -> obj1.method4(), "T4");
        Thread t5 = new Thread(() -> obj1.method4(), "T5");
        t0.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

    public void method0() {
        synchronized (this) {  // Lock current object only, if any T1 enters method1() on obj1 and T2 tries method1() on obj1, it will wait
            try {
                System.out.println("method0 works! on"+ Thread.currentThread().getName()+ " " +LocalDateTime.now());
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void method1() {
        synchronized (this) {  // Lock current object only, if any T1 enters method1() on obj1 and T2 tries method1() on obj1, it will wait
            try {
                System.out.println("method1 works! on"+ Thread.currentThread().getName()+ " " +LocalDateTime.now());
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /**
     * Only this is method level synchronization, others are synchronized block
     */
    public synchronized void method2() {  // same as method1
        try {
            System.out.println("method2 works! on"+ Thread.currentThread().getName()+ " " +LocalDateTime.now());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    private final Object object = new Object();
    public void method3() {
        synchronized (object) {  // this won't be part of lock which method1 or method2 or method4 shares as we created lock using new object
            try {
                System.out.println("method3 works! on"+ Thread.currentThread().getName()+ " " +LocalDateTime.now());
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void method4() {
        synchronized (SynchonizedExample.class) {  // Lock is on CLASS, not object. ONE lock for ALL instances even it's obj1 or obj2
            try {
                System.out.println("method4 works! on"+ Thread.currentThread().getName()+ " " +LocalDateTime.now());
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
