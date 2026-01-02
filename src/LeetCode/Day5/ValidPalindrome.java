package LeetCode.Day5;

/**
 * Valid if left and right char matches after ignoring space
 * considering only alphanumeric characters
 */
public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "abc c b  a  ";
        System.out.println(checkIt(s));
    }

    private static boolean checkIt(String s) {
        String newSting =s.replaceAll("\\s", "");
        int left = 0, right = newSting.length() - 1;
        while (left < right) {
            if (newSting.charAt(right) != newSting.charAt(left)) return false;
            left++;
            right--;
        }
        return true;
    }
}
