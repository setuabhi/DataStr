package LeetCode.Day6;

/**
 * There will be two cases: either left half will be sorted or Right Half
 * If left half is sorted then minimum will lie in right half
 * If right half is sorted then minimum will lie in left half
 */
public class MinimumInSortedRotatedArray {
    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 10, 11, 12, 1, 2, 3, 4, 5, 6};
        System.out.println(searchMinInSortedRotatedArray(arr));
    }

    private static Object searchMinInSortedRotatedArray(int[] arr) {
        int left = 0, right = arr.length - 1, minimum = Integer.MAX_VALUE;
        while (left <= right) {
            int mid = (left + right) / 2;
            minimum = Math.min(arr[mid], minimum);
            if (arr[mid] <= arr[right]) { //Means right half is sorted, minimum will be in left
                right = mid - 1;
            } else { //Means left half is sorted, minimum will be in right
                left = mid + 1;
            }
        }
        return minimum;
    }
}

