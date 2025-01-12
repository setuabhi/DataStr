package ArraysAndString;

public class KradanAlgorithm {
    public static int maxSubarraySum(int[] nums) {
        int maxSoFar = nums[0]; // Initialize maxSoFar with the first element
        int currMax = nums[0];   // Initialize currMax with the first element

        for (int i = 1; i < nums.length; i++) {
            currMax = Math.max(nums[i], currMax + nums[i]); // Choose between starting a new subarray (nums[i]) or extending (currMax + nums[i])
            maxSoFar = Math.max(maxSoFar, currMax); // Update maxSoFar if necessary
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = maxSubarraySum(nums);
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}
