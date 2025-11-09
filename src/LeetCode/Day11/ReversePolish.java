package LeetCode.Day11;

import java.util.Stack;

/**
 * if operand push
 * if operator pop two, apply operand then push
 */
public class ReversePolish {
    public static void main(String[] args) {
        String[] array= {"4","15","5","/","+"}; // 4 + ( 15 / 5 )
        System.out.println(reversePolish(array));
    }

    private static String reversePolish(String[] array) {
        Stack<String> stack = new Stack<>();
        for(String s: array)
        {
            if("+-*/".contains(s))
            {
               int first = Integer.parseInt(stack.pop());
               int second = Integer.parseInt(stack.pop());
               int output = switch (s) {
                   case "+" -> second + first;
                   case "-" -> second - first;
                   case "*" -> second * first;
                   case "/" -> second / first;
                   default -> 0;
               };
                stack.push(output+"");
            }
            else
            {
                stack.push(s);
            }
        }
        return stack.pop();
    }
}
