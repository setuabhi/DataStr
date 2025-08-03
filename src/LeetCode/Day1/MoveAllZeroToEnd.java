package LeetCode.Day1;

import java.util.Arrays;

/**
 * Iterate and update existing array using below logic
 * if number is zero don't increase counter and at last fill all with zeros
 */
public class MoveAllZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {5, 3, 0, 1, 0, 13, 17};
        moveToEnd(arr);
    }

    private static void moveToEnd(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[counter] = arr[i];
                counter++;
            }
        }

        for (int i = counter; i < arr.length; i++) {
            arr[counter] = 0;
            counter++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
