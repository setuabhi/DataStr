package LeetCode.Day11;

import java.util.Stack;

/**
 * store two elements in stack, first element, second min till now
 */
public class MinStack {
    Stack<int[]> stack = new Stack<>();

    void push(int data) {
        stack.push(new int[]{data, stack.empty() ? data : Math.min(data, stack.peek()[1])});
    }
    int top() {
        return stack.peek()[0];
    }

    int pop() {
        return stack.pop()[0];
    }

    int getMin() {
        return stack.peek()[1];
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(2);
        minStack.push(0);
        minStack.push(7);
        System.out.println(minStack.getMin());
        System.out.println(minStack.top());
        System.out.println(minStack.pop());
        System.out.println(minStack.pop());
        System.out.println(minStack.pop());
    }
}
