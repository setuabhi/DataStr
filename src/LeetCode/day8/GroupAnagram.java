package LeetCode.day8;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(input);
        System.out.println(result);
    }

    private static List<List<String>> groupAnagrams(String[] input) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : input) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars); // Key for anagrams
            if (map.containsKey(sorted)) {
                map.get(sorted).add(str);
            } else {
                ArrayList<String> s = new ArrayList<>();
                s.add(str);
                map.put(sorted, s);
            }
        }

        return new ArrayList<>(map.values());
    }
}
