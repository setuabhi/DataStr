package ArraysAndString.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepCharacter {

    public static void main(String[] args) {
      System.out.println(longest("abcdefe"));
    }

    /**
     * Sliding window example
     * @param input = string
     * @return
     */
    private static int longest(String input) {
        Set<Character> hashset= new HashSet<>();
        int left = 0; // Start pointer for the sliding window
        int maxLength = 0;
        for(int right =0; right< input.length(); right++)
        {
            while(hashset.contains(input.charAt(right))) // to move the start pointer after the repeating character, in out case start will move at 2 index('c')
            {
                hashset.remove(input.charAt(left));
                left++;
            }
            hashset.add(input.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1); //abcdefe is an example to understand
        }

        return maxLength;
    }
}
