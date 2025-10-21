package LeetCode.Day3;

/**
 * while sumOfWindow greater than maxSum reduces window size by reducing windowLeft and reduce sumOfWindow
 * sumOfWindow-=arr[windowLeft];
 * windowLeft--;
 * <p>
 * if(windowRight- windowLeft > maxLength): update result indexes and maxLength;
 */
public class MaxSizeSubArraySum {
    public static void main(String[] args) {
        int[] arr = {-1, -1, -1, 4, 0, 0, 0, -1, -1, 6};
        subArraySizeLessEqK(arr, 0);
    }

    private static void subArraySizeLessEqK(int[] arr, int maxSum) {
        int windowLeft = 0;
        int sumOfWindow = 0, lengthOfSubArray = Integer.MIN_VALUE;
        int resultLeftIndex = -1, resultRightIndex = -1;

        for (int windowRight = 0; windowRight < arr.length; windowRight++) {
            sumOfWindow += arr[windowRight];

            while (sumOfWindow > maxSum) {
                sumOfWindow -= arr[windowLeft];
                windowLeft++;
            }

            if (windowRight - windowLeft > lengthOfSubArray) {
                resultLeftIndex = windowLeft;
                resultRightIndex = windowRight;
                lengthOfSubArray = windowRight - windowLeft;
            }
        }

        System.out.println(resultLeftIndex + " " + resultRightIndex);
    }
}
