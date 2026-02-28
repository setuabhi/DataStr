package LeetCode.Day1;

public class BestTimeBuySellStocks {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 1, 4, 13};
        bestTime(arr);
    }

    private static void bestTime(int[] arr) {
        int bestProfit = Integer.MIN_VALUE; // to consider negative number
        int minTempIndex = 0, startOutputIndex = -1, endOutputIndex = -1;
        for (int i = 1; i < arr.length; i++) {
            int currentProfit = arr[i] - arr[minTempIndex];

            if (currentProfit > bestProfit) {
                bestProfit = currentProfit;
                startOutputIndex = minTempIndex;
                endOutputIndex = i;
            }

            if (arr[i] < arr[minTempIndex]) {
                minTempIndex = i;
            }
        }

        System.out.println(startOutputIndex + " " + endOutputIndex + " " + bestProfit);
    }
}
