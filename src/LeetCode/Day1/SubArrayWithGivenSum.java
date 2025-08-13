package LeetCode.Day1;

import java.util.HashMap;

/**
 * Use hashmap, key = sum till index i, value = i
 * if (currentSum - Target) present in hashmap then we found the result.
 * Store first occurence of sum in Hashmap
 */
public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {4, 1, -3, 2, 10, 6};
        sumKBrutForce(arr, 6);
        sumKOptimal(arr, 6);
    }

    private static void sumKBrutForce(int[] arr, int target) {
        int sumSubArray, startIndex = -1, endIndex = -1; // set minus one to cover case where target not found
        for (int i = 0; i < arr.length; i++) {
            sumSubArray = 0;
            for (int j = i; j < arr.length; j++) {
                sumSubArray += arr[j];
                if (sumSubArray == target) {
                    startIndex = i;
                    endIndex = j;
                }
            }
        }

        System.out.println(startIndex + " " + endIndex);

    }

    private static void sumKOptimal(int[] arr, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int currSum = 0, startIndex = -1, endIndex = -1;
        ;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            if (hm.containsKey(currSum - target)) {
                startIndex = hm.get(currSum - target) + 1;
                endIndex = i;
            }

            // store only first occurrence
            if (!hm.containsKey(currSum)) { // Important
                hm.put(currSum, i);
            }

        }
        System.out.println(startIndex + " " + endIndex);
    }
}
