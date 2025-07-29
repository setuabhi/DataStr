package LeetCode.Day1;

public class Kradanes {
    public static void main(String[] args) {
        int[] arr =  {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSumN2(arr));
        System.out.println(kradanes(arr));
    }

    private static int maxSumN2(int[] arr) {
        int MaxSum = Integer.MIN_VALUE;
        int startIndexOfMaxSubArray = -1, endIndexOfMaxSubArray = -1;
        for (int i = 0; i < arr.length; i++) {
            int sumInRange = 0;
            for (int j = i; j < arr.length; j++) {
                sumInRange += arr[j]; // all sub-arrays sum, 1st time -2 the -2+1
                if (sumInRange > MaxSum) {
                    //bcoz i to j is the subarray
                    startIndexOfMaxSubArray = i;
                    endIndexOfMaxSubArray = j;
                    MaxSum = sumInRange;
                }
            }
        }
        System.out.println(startIndexOfMaxSubArray + " " + endIndexOfMaxSubArray);
        return MaxSum;
    }

    private static int kradanes(int[] arr) {
        int MaxSum = Integer.MIN_VALUE;
        int sumOfSubArray = 0;
        int startIndexOfMaxSubArray = -1, endIndexOfMaxSubArray = -1, tempStartIndex=0;
        for (int i = 0; i < arr.length; i++) {
            sumOfSubArray += arr[i];
            if (sumOfSubArray > MaxSum) {
                MaxSum = sumOfSubArray;
                startIndexOfMaxSubArray=tempStartIndex;
                endIndexOfMaxSubArray = i;
            }
            if (sumOfSubArray < 0) {
                sumOfSubArray = 0; // no need to carry forward negative number
                tempStartIndex = i + 1; // We are starting fresh from next index
            }
        }

        if (MaxSum == arr[0]) // to handle case if all no are negative and first is highest
        {
            startIndexOfMaxSubArray = 0;
        }
        System.out.println(startIndexOfMaxSubArray + " " + endIndexOfMaxSubArray);
        return MaxSum;
    }

}
