package Mutilthreading;

public class ImplementsRunnable implements Runnable{
    @Override
    public void run() {
        int i=10;
        while(--i > 0) {
            System.out.println("Doing task from " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new ImplementsRunnable());
        t1.start();
        ExtendThread t2 = new ExtendThread();
        t2.start();
        Thread t3 = new Thread(() -> {
            int i=10;
            while(--i > 0) {
                System.out.println("Doing task from " + Thread.currentThread().getName());
            }
        });
        t3.start();
        int i=10;
        while(--i > 0) {
            System.out.println("Doing task from " + Thread.currentThread().getName());
        }


}

}
