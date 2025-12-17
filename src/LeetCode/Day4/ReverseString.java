package LeetCode.Day4;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String S = "ab srivas";
        System.out.println(reverseItUsingCharArray(S));
        System.out.println(reverseWord(S));
    }

    private static String reverseWord(String s) {
        String[] str = s.split(" ");
        String output = "";
        for (int j = str.length-1; j >=0; j--) {
            output = output + str[j] + " ";
        }
        return output.trim();
    }

    private static String reverseItUsingCharArray(String s) {
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            String output = "";
            for (int j = str[i].length()-1; j >=0; j--) {
                output= output+str[i].charAt(j);
            }
            str[i]=output;
        }
        return String.join(" ",str);
    }

    private static String reverseItUsingBuffer(String s) {
        return null;
    }
}
