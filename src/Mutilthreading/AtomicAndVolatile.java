package Mutilthreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicAndVolatile {
    public volatile int count = 0;
    public AtomicInteger countAtomic = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        AtomicAndVolatile atomicAndVolatile = new AtomicAndVolatile();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                atomicAndVolatile.increment();
                atomicAndVolatile.incrementAtomic();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                atomicAndVolatile.increment();
                atomicAndVolatile.incrementAtomic();
            }
        });
        t1.start();
        t2.start();
        t1.join(); //When you call t1.join() the main thread will wait for t1 to finish before continuing.
        t2.join(); //When you call t2.join() the main thread will wait for t2 to finish before continuing.
        System.out.println(atomicAndVolatile.count);
        System.out.println(atomicAndVolatile.countAtomic);
    }

    public void incrementAtomic() {
        countAtomic.incrementAndGet(); // atomic operation
    }

    public void increment() {
        count++;
    }
}
