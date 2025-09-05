package LeetCode.Day5;

/**
 * Valid if left and right char matches after ignoring space
 * considering only alphanumeric characters
 */
public class ValidPalindrome {
    public static void main(String[] args) {
        String s="abc c b  a  ";
        System.out.println(checkIt(s));
    }

    private static boolean checkIt(String s) {
        int left=0,right=s.length()-1;
        while(left<right)
        {
            while (left<right && !Character.isAlphabetic(s.charAt(right))) right--;
            while (left<right && !Character.isAlphabetic(s.charAt(left))) left++;
            if(s.charAt(right)!=s.charAt(left)) return false;
            left++;
            right--;
        }
        return true;
    }
}
