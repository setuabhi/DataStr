package LeetCode.Day11;

import java.util.Stack;

public class validPArenthesis {
    public static void main(String[] args) {
        String s = "[{}])";
        System.out.println(checkParenthsis(s));
    }

    private static boolean checkParenthsis(String s) {
        Stack<Character> stack = new Stack<>();
        Boolean output = true;
        for (char c : s.toCharArray()) {
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            } else {
                output= compareBoth(c, !stack.isEmpty() ?stack.pop():' '); // to handle [{}])
            }
        }
        if (!stack.empty()) {
            output = false; // to handle "([{}]"
        }
        return output;
    }

    private static Boolean compareBoth(char current, Character pop) {
        return (pop == '{' && current == '}') ||
                (pop == '(' && current == ')') ||
                (pop == '[' && current == ']');
    }
}
