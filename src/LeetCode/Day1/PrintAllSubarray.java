package LeetCode.Day1;

public class PrintAllSubarray {
    public static void main(String[] args) {
        int[] arr = {-1, -3, 3, -2, 4, 5, -1, 0};
        printAll(arr);
        String s = "Abhi";
    }

    /**
     * output: -1 then -1 -3 then -1 -3 3 then 1 -3 3 2
     *
     * @param arr
     */
    private static void printAll(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                print(arr, i, j); // print array element from i to j will give all subarrays
            }
        }
    }

    private static void print(int[] arr, int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
}
