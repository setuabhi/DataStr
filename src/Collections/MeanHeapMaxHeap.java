package Collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Offer and poll complexity log(n)
 */
public class MeanHeapMaxHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(20);
        minHeap.offer(10);
        minHeap.offer(6);
        minHeap.offer(50);
        System.out.println(minHeap.poll()); // return min element and remove it

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.offer(20);
        maxHeap.offer(10);
        maxHeap.offer(6);
        maxHeap.offer(50);
        System.out.println(maxHeap.poll()); // return min element and remove it

        //Heap using comparator
        PriorityQueue<ComparatorExample> sortedById = new PriorityQueue<>(Comparator.comparing(ComparatorExample::getId));
        sortedById.offer(new ComparatorExample(3, "Alice"));
        sortedById.offer(new ComparatorExample(4, "Abc"));
        sortedById.offer(new ComparatorExample(1, "Def"));
        System.out.println(sortedById.poll().toString());

        //Heap using comparable
        PriorityQueue<StudentComparable> sortedByIdComparable = new PriorityQueue<>();
        sortedByIdComparable.offer(new StudentComparable(3, "Alice"));
        sortedByIdComparable.offer(new StudentComparable(4, "EEE"));
        sortedByIdComparable.offer(new StudentComparable(1, "AAA"));
        System.out.println(sortedByIdComparable.poll().toString());

    }
}
