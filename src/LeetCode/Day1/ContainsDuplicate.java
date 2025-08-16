package LeetCode.Day1;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15, 78};

        System.out.println(checkDuplicate(nums));
    }

    private static boolean checkDuplicate(int[] nums) {
        HashSet < Integer> hashSet = new HashSet<>();
        for(int i: nums)
        {
            if(!hashSet.add(i))
            {
                return true;
            }
        }
        return false;
    }
}
