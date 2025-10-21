package LeetCode.Day6;

/**
 * Find first and lastOccurence, output= lastOccurence-firstOccurence+1
 * Same as Binary search, if you find element, store it on FirstOccurence and make right pointer= mid-1;
 * in Next Loop if you find element, store it on LastOccurence and make left pointer= mid+1;
 */
public class FrequencyInASortedArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 6, 6, 6, 8, 9, 10};
        System.out.println("Frequency of 6: " + fequencyOfx(a, 6));

    }

    private static int fequencyOfx(int[] a, int target) {
        int left = 0, right = a.length - 1, firstOcc = -1, lastOccurencce = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] == target) {
                firstOcc = mid;
                right = mid - 1;
            } else if (a[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        left = 0;
        right = a.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] == target) {
                lastOccurencce = mid;
                left = mid + 1;
            } else if (a[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println("leftOcc= " + firstOcc + " last Occ= " + lastOccurencce);
        return lastOccurencce - firstOcc + 1;
    }
}
