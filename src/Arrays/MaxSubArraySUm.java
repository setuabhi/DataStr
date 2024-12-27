package Arrays;

public class MaxSubArraySUm {
    public static void main(String[] args) {
        int[] array = {2,-5,7,-6,5,4,-10};
        int[] array_negative = {-4,-5,-1,-2};
        System.out.println(maxSumKradanes(array));
        System.out.println(maxSumKradanes(array_negative));

    }

    private static int maxSumKradanes(int[] arr) {
        int maxCurrent = arr[0];
        int maxGlobal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            // Calculate maxCurrent for the current position
            maxCurrent = Math.max(arr[i], maxCurrent + arr[i]);

            // Update maxGlobal if maxCurrent is greater
            if (maxCurrent > maxGlobal) {
                maxGlobal = maxCurrent;
            }
        }

        return maxGlobal;
    }


}
