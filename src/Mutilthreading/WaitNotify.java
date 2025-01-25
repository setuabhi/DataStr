package Mutilthreading;

public class WaitNotify {
    private String message;
    private boolean hasMessage = false;

    // Synchronized method to send a message
    public synchronized void send(String msg) {
        while (hasMessage) {
            try {
                wait(); // Wait if a message is already available
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.message = msg;
        System.out.println("Sending message: " + msg);
        hasMessage = true;
        notify(); // Notify waiting threads
    }

    // Synchronized method to receive a message
    public synchronized String receive() {
        while (!hasMessage) {
            try {
                wait(); // Wait until a message is sent
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Receiving message: " + message);
        hasMessage = false;
        notify(); // Notify the producer that the message has been consumed
        return message;
    }

public static void main(String[] args) {
            WaitNotify service = new WaitNotify();

            // Producer thread: Sends messages
            Thread producer = new Thread(() -> {
                String[] messages = {"Hello", "How are you?", "Goodbye"};
                for (String msg : messages) {
                    service.send(msg);
                    try {
                        Thread.sleep(1000); // Simulate delay
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            // Consumer thread: Receives messages
            Thread consumer = new Thread(() -> {
                for (int i = 0; i < 3; i++) {
                    service.receive();
                    try {
                        Thread.sleep(1000); // Simulate delay
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            // Start both threads
            producer.start();
            consumer.start();
        }
}