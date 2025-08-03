package LeetCode.Day1;

import java.util.Arrays;

public class DutchNationalFlag {
    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
        sortWith4lops(arr);
    }

    /**
     * Count 0,1,2 then fill them in array
     * @param arr
     */
    private static void sortWith4lops(int[] arr) {
        int count0 = 0, count1 = 0, count2 = 0;

        // Count 0s, 1s, and 2s
        for (int num : arr) {
            if (num == 0) count0++;
            else if (num == 1) count1++;
            else count2++;
        }

        // Rewrite the array
        int index = 0;
        while (count0-- > 0) arr[index++] = 0;
        while (count1-- > 0) arr[index++] = 1;
        while (count2-- > 0) arr[index++] = 2;
        System.out.println(Arrays.toString(arr));
    }
}
