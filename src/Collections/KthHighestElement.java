package Collections;

import java.util.PriorityQueue;

public class KthHighestElement {
    public static void main(String[] args) {
        int[] array = {4, 2, 1, 6, 5};
        System.out.println(findKthLargest(array, 3));
    }

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
}
