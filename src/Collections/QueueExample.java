package Collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Queue<String> queueWithFixedSize = new ArrayBlockingQueue<>(3);
        // Adding elements
        queue.offer("John");

        System.out.println("Queue: " + queue);

        // Accessing elements
        System.out.println("Peek: " + queue.peek());    // John
        System.out.println("Poll: " + queue.poll());    // Removes John and print it
        System.out.println("Queue after poll: " + queue);

        // Removing element (exception if empty)
        System.out.println("Remove: " + queue.remove("John")); // Removes Emma and print it
        System.out.println("Queue after remove: " + queue);
    }

}
