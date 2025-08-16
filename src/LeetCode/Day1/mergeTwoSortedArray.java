package LeetCode.Day1;

import java.util.Arrays;

/*
three loop solution
 */
public class mergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 9};
        mergeTwoSortedArr(arr1, arr2);
    }

    private static void mergeTwoSortedArr(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        int arr1Counter = 0, arr2Counter = 0, arrMegredCounter = 0;
        while (arr1Counter < arr1.length && arr2Counter < arr2.length) { // && to avoid null pointer at line 17

            if (arr1[arr1Counter] < arr2[arr2Counter]) {
                merged[arrMegredCounter++] = arr1[arr1Counter++];
            } else {
                merged[arrMegredCounter++] = arr2[arr2Counter++];
            }
        }

        while (arr1Counter < arr1.length) {
            merged[arrMegredCounter++] = arr2[arr1Counter++];
        }
        while (arr2Counter < arr2.length) {
            merged[arrMegredCounter++] = arr2[arr2Counter++];
        }

        System.out.println(Arrays.toString(merged));
    }
}
