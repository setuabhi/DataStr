package ArraysAndString;


public class Anagram {
    public static void main(String[] args) {
        String employeeName = null;

   System.out.println(testAna("jar", "arj"));
    }

    private static boolean testAna(String s, String t) {
        int[] a = new int[128];
        for (char c : s.toCharArray()) {
            a[c] = a[c] + 1;
        }

        for (char c : t.toCharArray()) {
            a[c] = a[c] - 1;
        }
        for (int aa : a) {
            if (aa != 0)
                return false;
        }
        return true;
    }
}
