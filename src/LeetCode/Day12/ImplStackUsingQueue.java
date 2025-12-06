package LeetCode.Day12;

import java.util.LinkedList;
import java.util.Queue;

/**
 * poll and offer till queue size-1
 */
public class ImplStackUsingQueue {
    Queue<Integer> queue = new LinkedList<>();

    void push(int x) {
        queue.offer(x);
        for (int i = 0; i < queue.size() - 1; i++) {
            queue.offer(queue.poll());
        }
    }

    Integer pop() {
        return queue.poll();
    }

    public static void main(String[] args) {
        ImplStackUsingQueue implStackUsingQueue = new ImplStackUsingQueue();
        implStackUsingQueue.push(1);
        implStackUsingQueue.push(2);
        implStackUsingQueue.push(3);
        implStackUsingQueue.push(4);
        System.out.println(implStackUsingQueue.pop());
    }
}
