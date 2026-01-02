package LeetCode.day8;

import java.util.HashMap;

/**
 * initialize hashmap in inner loop
 */
public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        threeSum(arr, 0);
    }

    private static void threeSum(int[] arr, int sum) {
        HashMap<Integer, Integer> hm;
        for (int i = 0; i < arr.length - 1; i++)
        {
            hm = new HashMap<>();
            for (int j = i + 1; j < arr.length; j++) {
                int desired = sum - (arr[i] + arr[j]);
                if (hm.containsKey(desired)) {
                    System.out.println(i+" "+j+" "+hm.get(desired));
                }
               hm.put(arr[j],j);
            }
        }
    }
}
