package LeetCode.Day11;

import java.util.Stack;

public class validPArenthesis {
    public static void main(String[] args) {
        String s = "[({)}]";
        System.out.println(checkParenthsis(s));
    }

    private static boolean checkParenthsis(String s) {
        Stack<Character> stack = new Stack<>();
        Boolean output = true;
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == '[' || current == '{' || current == '(') {
                stack.push(current);
            } else {
                return compareBoth(current, stack.pop()); // return here itself
            }
        }
        if (!stack.empty()) {
            output = false; // to handle "([{}]"
        }
        return output;
    }

    private static Boolean compareBoth(char current, Character pop) {
        if (pop == '{' && current == '}')
            return true;
        else if (pop == '(' && current == ')') {
            return true;
        } else if (pop == '[' && current == ']') {
            return true;
        } else
            return false;
    }
}
