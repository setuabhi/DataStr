package LeetCode.Day1;

public class BestTimeBuySellStocks {
    public static void main(String[] args) {
        int[] arr =  {5, 3, 7, 1, 4};
        bestTime(arr);
    }

    private static void bestTime(int[] arr) {
        int minTemp = arr[0];
        int min = arr[0];
        int max = arr[0];
        int bestProfit=0;
        for(int i=1; i<arr.length;i++)
        {
            int currentProfit = arr[i] - minTemp;

            if(currentProfit>bestProfit)
            {
                bestProfit = currentProfit;
                max=arr[i];
                min=minTemp;
            }

            if(arr[i]<minTemp)
            {
                minTemp=arr[i];
            }
        }

        System.out.println(min +" "+ max+" "+ bestProfit);
    }
}
