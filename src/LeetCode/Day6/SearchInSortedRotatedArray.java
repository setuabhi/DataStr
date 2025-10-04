package LeetCode.Day6;

/**
 * There will be two cases: either left half will be sorted or Right Half
 * If left half is sorted and target lies in it then right= mid-1 and if target doesn't lie then left= mid+1
 * If right half is sorted and target lies in it then left= mid+1 and if target doesn't lie then right= mid-1
 */
public class SearchInSortedRotatedArray {
    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 1, 2, 3, 4, 5, 6};
        System.out.println("Index of 1: " + search(arr, 1));
    }

    private static Object search(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (arr[mid] <= arr[right]) { //Means right half is sorted
                if (target >= arr[mid] && target <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else { //Means left half is sorted
                if (target >= arr[left] && target <= arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
}

