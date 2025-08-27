package LeetCode.Day3;

/**
 * given input only lower a to z, any permutation of s1 should be substring of s2, in this case dba
 * store frequency of s1
 * iterate through second string, with fixed slide window strategy, if both s1Data and s2Data matches we are good
 */
public class PermutationInString {
    public static void main(String[] args) {
       String s1 = "abd", s2 = "eidbaooo";
        System.out.println(permuatationOfsubstr(s1,s2));
    }

    private static Boolean permuatationOfsubstr(String s1, String s2) {
        if (s1.length()>s2.length()) return false;

        int[] s1Data= new int[26];
        int[] s2Data= new int[26];

        for( char c : s1.toCharArray())
        {
            s1Data[c-'a']++;
        }

        for(int i =0 ; i< s1.length();i++)
        {
            s2Data[s2.charAt(i)-'a']++;
        }

        if (matchesTwoArrays(s1Data, s2Data)) return true;

        for(int i =s1.length() ; i< s2.length();i++)
        {
            s2Data[s2.charAt(i)-'a']++;
            s2Data[s2.charAt(i-s1.length())-'a']--;
            if (matchesTwoArrays(s1Data, s2Data)) return true;
        }

        return false;

    }

   static boolean matchesTwoArrays (int[] s1Data, int[] s2Data)
   {
       for(int i =0; i<26;i++)
       {
           if(s1Data[i]!=s2Data[i])
           {
               return false;
           }
       }
       return true;
   }
}