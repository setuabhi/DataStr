package LeetCode.Day2;

import java.util.HashSet;

/**
 * while duplicate present in HashSet reduces window size by reducing windowLeft:
 *   hs.remove(s.charAt(windowLeft));
 *   windowLeft++;
 *   if(windowRight- windowLeft > maxLength): update result indexes and maxLength;
 */
public class MaxSubStringWithoutRepChar {
    public static void main(String[] args) {
        String s = "abcbc";
        maxSubString(s);
    }

    private static void maxSubString(String s) {
        int windowLeft=0,resultLeftIndex=-1,resultRightIndex=-1;
        int lengthOfSubArray=Integer.MIN_VALUE;
        HashSet<Character> hs= new HashSet<>();
        for(int windowRight=0; windowRight<s.length();windowRight++)
        {
            while(hs.contains((s.charAt(windowRight))))
            {
                hs.remove(s.charAt(windowLeft));
                windowLeft++;
            }

            if(windowRight-windowLeft>lengthOfSubArray)
            {
                lengthOfSubArray=windowRight-windowLeft;
                resultLeftIndex=windowLeft;
                resultRightIndex=windowRight;
            }

            hs.add(s.charAt(windowRight));

        }

        System.out.println(resultLeftIndex +" "+resultRightIndex);
    }
}
