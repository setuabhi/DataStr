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
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }
        for (char c : s.toCharArray()) {
            if (hashMap.get(c) == 1) {
                return c;
            }
        }
        return null;
    }
}
