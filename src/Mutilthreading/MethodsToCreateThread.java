package Mutilthreading;

public class MethodsToCreateThread implements Runnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MethodsToCreateThread());
        t1.start();
        Thread.ofVirtual().start(t1); //Virtual thread

        ExtendThread t2 = new ExtendThread();
        t2.start();
        Thread.ofVirtual().start(t2); //Virtual thread

        Thread t3 = new Thread(() -> { //Doing implements Runnable only
            int i = 3;
            while (--i > 0) {
                System.out.println("Doing task from " + Thread.currentThread().getName());
            }
        });
        t3.start();

        Thread.ofVirtual().start(() -> { //Doing implements Runnable only using virtual thread
            int i = 3;
            while (--i > 0) {
                System.out.println("Doing task from " + Thread.currentThread().getName());
            }
        });

    }

    @Override
    public void run() {
        int i = 3;
        while (--i > 0) {
            System.out.println("Doing task from " + Thread.currentThread().getName());
        }
    }

}
