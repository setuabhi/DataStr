package LeetCode.Day1;

/**
 * Initialize MaxSum to math min
 * Initialize currentSum , startIndex, EndIndex, tempStartIndex to 0
 * Iterate from first element, calculate currentSum, if it's more than MaxSum, update startIndex, EndIndex, MaxSum
 * if currentSum is negative, no need to carry forward, set it to zero and update tempStartIndex to next element
 */
public class Kradanes {
    public static void main(String[] args) {
        int[] arr =  {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSumN2(arr));
        System.out.println(kradanes(arr));
    }

    private static int maxSumN2(int[] arr) {
        int MaxSum = Integer.MIN_VALUE;
        int currentSum , startIndexOfMaxSubArray = -1, endIndexOfMaxSubArray = -1;
        for (int i = 0; i < arr.length; i++) {
            currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j]; // all sub-arrays sum, 1st time -2 the -2+1
                if (currentSum > MaxSum) {
                    //bcoz i to j is the subarray
                    startIndexOfMaxSubArray = i;
                    endIndexOfMaxSubArray = j;
                    MaxSum = currentSum;
                }
            }
        }
        System.out.println(startIndexOfMaxSubArray + " " + endIndexOfMaxSubArray);
        return MaxSum;
    }

    private static int kradanes(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0, startIndexOfMaxSubArray = -1, endIndexOfMaxSubArray = -1, tempStartIndex=-1;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
                startIndexOfMaxSubArray=tempStartIndex;
                endIndexOfMaxSubArray = i;
            }
            if (currentSum < 0) {
                currentSum = 0; // no need to carry forward negative number
                tempStartIndex = i + 1; // We are starting fresh from next index
            }
        }

        if (maxSum == arr[0]) // to handle case if all no are negative and first is highest
        {
            startIndexOfMaxSubArray = 0;
        }
        System.out.println(startIndexOfMaxSubArray + " " + endIndexOfMaxSubArray);
        return maxSum;
    }

}
