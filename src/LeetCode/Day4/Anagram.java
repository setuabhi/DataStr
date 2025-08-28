package LeetCode.Day4;


public class Anagram {
    public static void main(String[] args) {

   System.out.println(testAna("jar", "arj"));
    }

    private static boolean testAna(String s, String t) {
        int[] a = new int[128];
        for (char c : s.toCharArray()) {
            a[c] = a[c]++;
        }

        for (char c : t.toCharArray()) {
            a[c] = a[c]--;
        }
        for (int aa : a) {
            if (aa != 0)
                return false;
        }
        return true;
    }
}
