package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>(); // or deque = new LinkedList<>();

        // Adding elements (both ends)
        deque.offer("Front");  // Adds to front
        deque.offer("Back");    // Adds to back
        deque.offer("Start"); // Adds to front without exception
        deque.offer("End");   // Adds to back without exception
        System.out.println("Deque: " + deque);

        // Accessing elements
        System.out.println("First element (peekFirst): " + deque.peekFirst()); // Start
        System.out.println("Last element (peekLast): " + deque.peekLast());    // End

        // Removing and getting elements
        System.out.println("Remove First: " + deque.remove("Front")); // Removes Front
        System.out.println("Remove First: " + deque.pollFirst()); // Removes Start without exception
        System.out.println("Remove Last: " + deque.pollLast());   // Removes End without exception

        System.out.println("Deque after removals: " + deque);
    }
}
