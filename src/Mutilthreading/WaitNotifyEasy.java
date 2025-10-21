package Mutilthreading;

public class WaitNotifyEasy {
    public static void main(String[] args) {
        WaitNotifyEasy waitNotify = new WaitNotifyEasy();

        // Student Thread (Waits for signal)
        Thread student = new Thread(waitNotify::waitForTeacher);

        // Teacher Thread (Gives signal after some time)
        Thread teacher = new Thread(waitNotify::giveSignal);

        student.start();
        teacher.start();
    }

    public void waitForTeacher() {
        synchronized (this) {
            try {
                System.out.println("Student is waiting for the teacher...");
                wait();  // Student waits here
                System.out.println("Student got the signal and starts studying!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void giveSignal() {
        synchronized (this) {
            try {
                Thread.sleep(5000); // Simulate delay before giving signal
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Teacher gives the signal!");
            notify();  // Teacher gives signal to wake up student
        }
    }
}