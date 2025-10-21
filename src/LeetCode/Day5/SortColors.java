package LeetCode.Day5;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 0, 0, 1, 2, 0, 1};
        System.out.println(Arrays.toString(sortColors(arr)));
    }

    private static int[] sortColors(int[] nums) {
        int count0 = 0, count1 = 0, count2 = 0;

        // Count frequencies
        for (int num : nums) {
            if (num == 0) count0++;
            else if (num == 1) count1++;
            else count2++;
        }

        // Overwrite the array
        int index = 0;
        while (count0-- > 0) nums[index++] = 0;
        while (count1-- > 0) nums[index++] = 1;
        while (count2-- > 0) nums[index++] = 2;

        return nums;
    }
}
