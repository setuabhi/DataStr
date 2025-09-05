package LeetCode.Day5;

import java.util.*;

/**
 * keep element only between i and j in set, then load it to set
 * Sort data then use Set<List<Integer>> output to avoid duplicate as List.equals() compares contents
 */
public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(arr, 0));
    }

    private static Object threeSum(int[] arr, int sum) {
        Arrays.sort(arr);
        Set<List<Integer>> output = new HashSet<>();
        Set<Integer> hs;
        for (int i = 0; i < arr.length - 1; i++) //i< arr.length-1 to avoid null pointer exception in next loop
        {
            hs = new HashSet<>();
            for (int j = i + 1; j < arr.length; j++) {
                int desired = sum - (arr[i] + arr[j]);
                if (hs.contains(desired)) {
                    output.add(new ArrayList<>(Arrays.asList(arr[i], desired, arr[j])));
                }
                hs.add(arr[j]);
            }
        }
        return output;
    }
}
