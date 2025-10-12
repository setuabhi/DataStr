package LeetCode.Day6;

import java.util.Arrays;

/**
 *
 * n-1 pass required
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array1 = {4, 7, 9, 10, 0, -1};
        bubbleSort(array1);
        System.out.println(Arrays.toString(array1));
    }
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
