package LeetCode.day8;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3, 3, 3, 3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k))); // [2, 1]
    }

    private static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        //Count frequency
        for (int a : nums) {
            hm.put(a, hm.getOrDefault(a, 0) + 1);
        }
        // Step 2: Sort by frequency (high to low)
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hm.entrySet());
        list.sort(Comparator.comparing(a -> a.getValue(), Collections.reverseOrder())); // sort descending

        // Step 3: Take top K elements
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }

        return result;

    }
}
