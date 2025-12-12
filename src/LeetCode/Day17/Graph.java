package LeetCode.Day17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    /*
   1 _____ 2
   |       |
   |       |
   3 ----- 4
     \   /
       5
     */
    public static void main(String[] args) {
        int noOfNodes = 5;
        ArrayList<ArrayList<Integer>> arrL = new ArrayList<>();
        for (int i = 0; i < noOfNodes + 1; i++) arrL.add(new ArrayList<>());

        // (1)--(2)
        arrL.get(1).add(2);
        arrL.get(2).add(1);

        // (1)--(3)
        arrL.get(1).add(3);
        arrL.get(3).add(1);

        // (3)--(4)
        arrL.get(3).add(4);
        arrL.get(4).add(3);

        // (2)--(4)
        arrL.get(2).add(4);
        arrL.get(4).add(2);

        // (2)--(5)
        arrL.get(2).add(5);
        arrL.get(5).add(2);

        // (4)--(5)
        arrL.get(4).add(5);
        arrL.get(5).add(4);

        System.out.println(arrL);

        Queue<Integer> queue = new LinkedList<>();
        int[] visitedArray = new int[noOfNodes + 1];

        queue.offer(1);

        while (!queue.isEmpty()) {
            int poped = queue.poll();
            visitedArray[poped] = 1;
            for (int neighbor : arrL.get(poped)) {
                if (visitedArray[neighbor]==0)
                {
                    visitedArray[neighbor] = 1;
                    queue.offer(neighbor);
                }
            }
        }
        System.out.println("Hi");
    }
}
