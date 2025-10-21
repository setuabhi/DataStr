package LeetCode.Day1;

import java.util.HashMap;

/**
 * Use hashmap
 * check target - current data present or not in map
 * else put in Hashmap
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};

        findTwoSum(nums, 22);

    }

    private static void findTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int startOutputIndex = -1, endOutputIndex = -1;

        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                endOutputIndex = i;
                startOutputIndex = hashMap.get(target - nums[i]);
            } else {
                hashMap.put(nums[i], i);
            }
        }

        System.out.println(startOutputIndex + " " + endOutputIndex);
    }
}
