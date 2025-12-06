package LeetCode.Day12;

import java.util.Stack;

/*
Move all from stack to temp
Push x
move all from temp to stack
 */
public class QueueUsingStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> temp = new Stack<>();
    void offer(int x)
    {
        while(!stack.isEmpty()) temp.push(stack.pop());
        stack.push(x);
        while(!temp.isEmpty()) stack.push(temp.pop());
    }
    int poll()
    {
        return stack.pop();
    }

    public static void main(String[] args) {
        QueueUsingStack queueUsingStack =new QueueUsingStack();
        queueUsingStack.offer(1);
        queueUsingStack.offer(2);
        queueUsingStack.offer(3);
        System.out.println(queueUsingStack.poll());
    }
}
