package LeetCode.Day6;

import java.util.Arrays;

/**
 * Time nlog(n) and space  n
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] array = {4, 7, 9, 10, 0, -1};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void mergeSort(int[] A) {
        int n = A.length;
        if (A.length == 1) {
            return; // Base case: array of size 0 or 1 is already sorted
        }

        int mid = n / 2;

        // Create left and right subarrays
        int[] left = new int[mid];
        int[] right = new int[n - mid];
        int rightIndex = 0;

        // Copy data into left subarray
        for (int i = 0; i < mid; i++) {
            left[i] = A[i];
        }

        // Copy data into right subarray
        for (int i = mid; i < n; i++) {
            right[rightIndex++] = A[i];
        }

        // Recursive calls
        mergeSort(left);
        mergeSort(right);

        // Merge step
        merge(left, right, A);
    }

    public static void merge(int[] left, int[] right, int[] A) {
        int i = 0, j = 0, k = 0;
        int nL = left.length;
        int nR = right.length;

        // Compare elements from left and right arrays and merge
        while (i < nL && j < nR) {
            if (left[i] <= right[j]) {
                A[k++] = left[i++];
            } else {
                A[k++] = right[j++];
            }
        }

        // Copy remaining elements from left (if any)
        while (i < nL) {
            A[k++] = left[i++];
        }

        // Copy remaining elements from right (if any)
        while (j < nR) {
            A[k++] = right[j++];
        }
    }
}
