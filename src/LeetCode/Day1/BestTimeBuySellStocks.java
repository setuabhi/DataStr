package LeetCode.Day1;

/**
 * Initialize MaxSum to math min
 * Initialize startIndex, endIndex, tempStartIndex to 0
 * Iterate from 2nd Element and calculate profit using minTempIndex
 * if profit is more than best profit , update best profit / minIndex / maxIndex
 * if curr element is less than minTemp then update minTemp
 */
public class BestTimeBuySellStocks {
    public static void main(String[] args) {
        int[] arr =  {5, 3, 7, 1, 4, 13};
        bestTime(arr);
    }

    private static void bestTime(int[] arr) {
        int bestProfit=Integer.MIN_VALUE; // to consider negative number
        int minTempIndex=0,minIndexOfMaxProfitSubArray=0,maxIndexOfMaxProfitSubArray=0;
        for(int i=1; i<arr.length;i++)
        {
            int currentProfit = arr[i] - arr[minTempIndex];

            if(currentProfit>bestProfit)
            {
                bestProfit = currentProfit;
                minIndexOfMaxProfitSubArray=minTempIndex;
                maxIndexOfMaxProfitSubArray=i;
            }

            if(arr[i]<arr[minTempIndex])
            {
                minTempIndex=i;
            }
        }

        System.out.println(minIndexOfMaxProfitSubArray +" "+ maxIndexOfMaxProfitSubArray+" "+ bestProfit);
    }
}
