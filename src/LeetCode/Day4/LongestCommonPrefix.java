package LeetCode.Day4;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] array = {"tresdf", "trelbk", "treqq"};
        System.out.println(longestCommonprefix(array));
    }

    private static String longestCommonprefix(String[] array) {
        Arrays.sort(array);
        int output = -1;
        for (int i = 0; i < array[0].length(); i++) {
            if (array[0].charAt(i) == array[array.length - 1].charAt(i)) {
                output++;
            } else break;
        }

        if (output > -1) return array[0].substring(0, output);
        else return null;
    }
}
