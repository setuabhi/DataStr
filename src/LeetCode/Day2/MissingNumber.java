package LeetCode.Day2;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println(findmissing(nums));
    }

    private static int findmissing(int[] nums) {
        int idealSum= (nums.length * (nums.length+1))/2;
        int currentSum= Arrays.stream(nums).sum();
        return idealSum-currentSum;
    }
}
