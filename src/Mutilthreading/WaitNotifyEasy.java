package Mutilthreading;

import java.time.LocalDateTime;

public class WaitNotifyEasy {
    public static void main(String[] args) {
        WaitNotifyEasy waitNotify = new WaitNotifyEasy();

        // Student Thread (Waits for signal)
        Thread student = new Thread(() -> waitNotify.waitForTeacher());

        // Teacher Thread (Gives signal after some time)
        Thread teacher = new Thread(() -> waitNotify.giveSignal());

        student.start(); // code will
        teacher.start();
    }

    public void waitForTeacher() {
        synchronized (this) { //student thread acquires lock on waitNotify object
            try {
                System.out.println("Student is waiting for the teacher... " + LocalDateTime.now());
                Thread.sleep(5000);
                wait();  //student thread releases lock and move to waiting state and after this teacher thread acquires lock on waitNotify object
                System.out.println("Student got the signal and starts studying! " + LocalDateTime.now());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void giveSignal()  {
        synchronized (this) { //teacher thread acquires lock on waitNotify object after line 24 execution
            try {
                System.out.println("Inside Teacher Synchonized block " + LocalDateTime.now());
                Thread.sleep(5000);

                System.out.println("Teacher gives the signal! " + LocalDateTime.now());
                notify();  // Teacher moved student thread to running state but still lock teacher thread has, after line 40 execution, teacher thread releases lock and student will acquire
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}