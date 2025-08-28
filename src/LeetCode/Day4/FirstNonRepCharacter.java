package LeetCode.Day4;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class FirstNonRepCharacter {
    public static void main(String[] args) {
        String s = "abcabd";
        System.out.println(firstNonRepChar(s));
    }

    private static Object firstNonRepChar(String s) {
        LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<>();

        for (char c : s.toCharArray()) {
            linkedHashMap.put(c, linkedHashMap.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : linkedHashMap.entrySet()) {
            if (entry.getValue() == 1) return entry.getKey();
        }
        return null;
    }
}
