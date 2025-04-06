package Mutilthreading;

/**
 * wait() and notify() gives IllegalMonitorStateException without synchorinized block
 */

public class WaitNotifyPrintOddEven {
    volatile int x = 0;
    int max;

    public WaitNotifyPrintOddEven(int max) {
        this.max = max;
    }

    void printEven() throws InterruptedException {
        while (x<=max) {
            synchronized (this) {
                if (x % 2 != 0) {
                    System.out.println("Waiting for Odd Thread Notify");
                    wait(); //Even thread will not move to next line until gets notify call
                } else {
                    System.out.println("Thead: " + Thread.currentThread().getName() + " " + x++);
                    Thread.sleep(3000);
                    System.out.println("Notified Odd Thread");
                    notifyAll();
                }

            }
        }
    }

    void printOdd() throws InterruptedException {
        while (x<=max) {
            synchronized (this) {
                if (x % 2 == 0) {
                    System.out.println("Waiting for Even Thread Notify");
                    wait();
                } else {
                    System.out.println("Thead: " + Thread.currentThread().getName() + " " + x++);
                    Thread.sleep(5000);
                    System.out.println("Notified Even Thread Thread");
                    notify();
                }
            }
        }
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
        t1.start();
        t2.setName("Odd Thread");
        t2.start();

    }
}