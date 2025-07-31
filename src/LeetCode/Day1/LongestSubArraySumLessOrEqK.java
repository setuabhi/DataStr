package LeetCode.Day1;

public class LongestSubArraySumLessOrEqK {
    public static void main(String[] args) {
        int[] arr = {-1,4,1,0,-1,0,1};
        System.out.println(maxSumWindowN2(arr,5));
    }

    private static int maxSumWindowN2(int[] arr, int sum) {
        int MaxSum = Integer.MIN_VALUE;
        int startIndexOfMaxSubArray = -1, endIndexOfMaxSubArray = -1;
        for (int i = 0; i < arr.length; i++) {
            int sumInRange = 0;
            for (int j = i; j < arr.length; j++) {
                sumInRange += arr[j]; // all sub-arrays sum, 1st time -2 the -2+1
                if (sumInRange >= MaxSum && sumInRange <= sum) { // >= is important
                    MaxSum=sumInRange;
                    //bcoz i to j is the subarray
                    startIndexOfMaxSubArray = i;
                    endIndexOfMaxSubArray = j;
                }
            }
        }
        System.out.println(startIndexOfMaxSubArray + " " + endIndexOfMaxSubArray);
        return MaxSum;
    }
}
