package Mutilthreading;

public class ExtendThread extends Thread{
        @Override
        public void run() {
            int i=10;
            while(--i > 0) {
                System.out.println("Doing task from " + Thread.currentThread().getName());
            }
        }


}
