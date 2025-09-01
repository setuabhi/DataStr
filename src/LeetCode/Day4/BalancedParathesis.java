package LeetCode.Day4;

import java.util.Stack;

public class BalancedParathesis {
    public static void main(String[] args) {
        System.out.println(checkValid("({[]})"));
        System.out.println(checkValid("([{]})"));
    }

    private static boolean checkValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray())
        {
            if(c=='(' || c=='{' || c=='[')
            {
                stack.push(c);
            }
            else
            {
               if(!compare(c,stack.pop()))
               {
                   return false;
               }
            }
        }
        return true;
    }

    private static boolean compare(char c, char pop) {
        return (c == ']' && pop == '[') || (c == ')' && pop == '(') || (c == '}' && pop == '{');
    }
}
