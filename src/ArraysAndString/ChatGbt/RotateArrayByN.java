package ArraysAndString.ChatGbt;

import java.util.Arrays;

public class RotateArrayByN {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Original Array : " + Arrays.toString(nums));
        rotateRight(nums,3);
        System.out.println("Right rotated by 3: " + Arrays.toString(nums));
        rotateLeft(nums,4);
        System.out.println("Left rotated by 4: " + Arrays.toString(nums));
    }

    public static void rotateLeft(int[] nums, int k) {
        int n = nums.length;
        k %= n; // Ensure k is within bounds
        reverse(nums, 0, k - 1);       // Reverse the first k elements
        reverse(nums, k, n - 1);       // Reverse the remaining elements
        reverse(nums, 0, n - 1);       // Reverse the entire array
    }

        public static void rotateRight(int[] nums, int k) {
            k %= nums.length;
            reverse(nums, 0, nums.length - 1); //Reverse entire
            reverse(nums, 0, k - 1); //Reverse First k
            reverse(nums, k, nums.length - 1); //Reverse Remaining
        }

        private static void reverse(int[] nums, int start, int end) {
            while (start < end) {
                nums[start] = nums[start]+nums[end];
                nums[end] = nums[start] - nums [end];
                nums[start] = nums[start] - nums [end];
                start++;
                end--;
            }
        }
    }

