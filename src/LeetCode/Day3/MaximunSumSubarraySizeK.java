package LeetCode.Day3;

/**
 * Calculate currSum of first sizeK
 * iterate from sizeK, add and substract
 * if (currSum>maxSum)
 * end index = i
 * start index= i-sizeK+1
 */
public class MaximunSumSubarraySizeK {
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 1, 3, 2};
        maxsumsubarraySizeK(arr, 3);
    }

    private static void maxsumsubarraySizeK(int[] arr, int sizeK) {
        int startOutputIndex = -1, endOutputIndex = -1;
        int maxSum = Integer.MIN_VALUE, currSum = 0;
        for (int i = 0; i < sizeK; i++) {
            currSum += arr[i];
        }
        maxSum=currSum;
        startOutputIndex = 0;
        endOutputIndex =sizeK-1;

        for (int i = sizeK; i < arr.length; i++) {
            currSum+=arr[i];
            currSum-=arr[i-sizeK];

            if(currSum>maxSum)
            {
                maxSum=currSum;
                endOutputIndex=i;
                startOutputIndex=i-sizeK+1;
            }
        }

        System.out.println(maxSum+" "+startOutputIndex+" "+endOutputIndex);
    }
}
