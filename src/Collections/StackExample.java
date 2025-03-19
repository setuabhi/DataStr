package Collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();


        System.out.println("Stack: " + stack);

        // Accessing elements
        System.out.println("Peek: " + stack.peek());   // 30
        System.out.println("Pop: " + stack.pop());     // Removes and return 30
        System.out.println("Stack after pop: " + stack);

        // Search
        System.out.println("Position of 10: " + stack.search(10)); // Position 2
    }
}
