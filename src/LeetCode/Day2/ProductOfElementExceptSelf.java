package LeetCode.Day2;

import java.util.Arrays;

/**
 * put 1 at first element of prefix and 1 as last element of postfix
 * prefix[i]= product before i
 * postfix[i]=product after i
 */
public class ProductOfElementExceptSelf {
    public static void main(String[] args) {
        int[] nums = {6, 2, 3, 4, 0};
        productOfNoExceptSelf(nums);
    }

    private static void productOfNoExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] postFix = new int[nums.length];

        prefix[0] = 1;
        postFix[nums.length - 1] = 1;

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            postFix[i] = postFix[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = prefix[i] * postFix[i];
        }

        System.out.println(Arrays.toString(nums));
    }
}
