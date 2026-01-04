package Mutilthreading;

/**
 * wait() and notify() gives IllegalMonitorStateException without synchorinized block
 */

public class WaitNotifyPrintOddEven {
    //volatile variable is always read from and written to main memory, not from thread-specific caches. This means changes made by one thread to a volatile variable are visible to other threads immediately, race condition can occur as it's not thread safe
    volatile int x = 1;
    int max;

    public WaitNotifyPrintOddEven(int max) {
        this.max = max;
    }

    public static void main(String[] args) {
        WaitNotifyPrintOddEven waitNotify = new WaitNotifyPrintOddEven(10);
        Thread t1 = new Thread(() -> {
            try {
                waitNotify.printEven();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                waitNotify.printOdd();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.setName("Even Thread");
        t2.setName("Odd Thread");
        t2.start();
        t1.start();

    }

    void printOdd() throws InterruptedException {
        while (x <= max) {
            synchronized (this) {
                if (x % 2 != 0) {
                    System.out.println("Thread: " + Thread.currentThread().getName() + " " + x++);
                    wait();
                }
            }
        }
    }

    void printEven() throws InterruptedException {
        while (x <= max) {
            synchronized (this) {
                if (x % 2 == 0) {
                    System.out.println("Thread: " + Thread.currentThread().getName() + " " + x++);
                    notify();
                }

            }
        }
    }
}