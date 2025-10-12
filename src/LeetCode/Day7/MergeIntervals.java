package LeetCode.Day7;

import java.util.Arrays;
import java.util.Comparator;

/**
 * i != arr2D.length - 1 && to avoid null pointer exception
 */
public class MergeIntervals {
    public static void main(String[] args) {
        int[][] arr2D = {
                {2, 6},
                {15, 18},
                {1, 3},
                {5, 10}
        };
        mergeThem(arr2D);
        for (int[] array : arr2D) {
            System.out.println(Arrays.toString(array));
        }
    }

    private static void mergeThem(int[][] arr2D) {
        int tempArrayIdex = 0;
        Arrays.sort(arr2D, Comparator.comparingInt(array1 -> array1[0]));
        for (int i = 0; i < arr2D.length; i++) {
            int current = i;
            while (i != arr2D.length - 1 && arr2D[current][1] > arr2D[current + 1][0]) {
                current++;
            }
            arr2D[tempArrayIdex][0] = arr2D[i][0];
            arr2D[tempArrayIdex][1] = arr2D[current][1];
            tempArrayIdex++;
            i = current;

        }
        //Fill remaining with zero
        while (tempArrayIdex < arr2D.length) {
            arr2D[tempArrayIdex][0] = 0;
            arr2D[tempArrayIdex][1] = 0;
            tempArrayIdex++;
        }
    }
}
