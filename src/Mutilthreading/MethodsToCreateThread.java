package Mutilthreading;

public class MethodsToCreateThread implements Runnable{
    @Override
    public void run() {
        int i=10;
        while(--i > 0) {
            System.out.println("Doing task from " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new MethodsToCreateThread());
        t1.start();
        Thread.ofVirtual().start(t1);

        ExtendThread t2 = new ExtendThread();
        t2.start();
        Thread.ofVirtual().start(t2);

        Thread t3 = new Thread(() -> { //Doing implements Runnable only
            int i=10;
            while(--i > 0) {
                System.out.println("Doing task from " + Thread.currentThread().getName());
            }
        });
        t3.start();

        Thread.ofVirtual().start(() -> {
            int i = 10;
            while (--i > 0) {
                System.out.println("Doing task from " + Thread.currentThread().getName());
            }
        });

        int i=10;
        while(--i > 0) {
            System.out.println("Doing task from " + Thread.currentThread().getName());
        }


}

}
