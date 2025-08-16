package LeetCode.Day2;

import java.util.HashMap;

/**
 * If element count more size/2 of array
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majority(nums));
    }

    private static int majority(int[] nums) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for (int i : nums) {
            hashmap.put(i, hashmap.getOrDefault(i, 0) + 1);
            if (hashmap.get(i) > nums.length / 2) {
                return i;
            }
        }
        return -1;
    }
}
