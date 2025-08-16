package LeetCode.Day1;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, 8, 9};
        reverseArray(arr1);
        System.out.println(arr1);
    }

    private static void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (end > start) {
            arr[start] = arr[start] + arr[end] - (arr[end] = arr[start]);
            start++;
            end--;
        }
    }
}
