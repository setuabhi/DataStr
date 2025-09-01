package LeetCode.Day4;

public class ReverseString {
    public static void main(String[] args) {
        String S = "abhinav";
        System.out.println(reverseItUsingBuffer(S));
        System.out.println(reverseItUsingCharArray(S));
    }

    private static String reverseItUsingCharArray(String s) {
        char[] array = s.toCharArray();
        int start = 0, end = s.length() - 1;
        while (end > start) {
            char temp = array[start];
            array[start++] = array[end];
            array[end--] = temp;
        }

        return new String(array);
    }

    private static String reverseItUsingBuffer(String s) {
        StringBuffer sb = new StringBuffer(s);
        return sb.reverse().toString();
    }
}
