package ArraysAndString.ChatGbt;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepCharacter {

    public static void main(String[] args) {
      System.out.println(longest("abaacdebfbghij"));
    }

    /**
     * Sliding window example
     * @param input = string
     * @return
     */
    private static String longest(String input) {
        Set<Character> hashset= new HashSet<>();
        int start=0,end=0,maxLength=0;
        for(char c: input.toCharArray())
        {
            while(hashset.contains(c)) // to move the start pointer after the repeating character, in out case start will move at 2 index('c')
            {
                hashset.remove(input.charAt(start));
                ++start;
            }
            hashset.add(c);
            ++end;
            maxLength=Math.max(maxLength,end-start);

        }

        return maxLength+"";
    }
}
