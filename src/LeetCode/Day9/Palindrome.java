package LeetCode.Day9;

import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        LinkedList l00 = new LinkedList(2);
        LinkedList l0 = new LinkedList(4);
        LinkedList l1 = new LinkedList(5);
        LinkedList l2 = new LinkedList(4);
        LinkedList head = new LinkedList(2);
        head.next = l2;
        l2.next = l1;
        l1.next = l0;
        l0.next=l00;
        System.out.println(checkPalindrome(head));
    }

    private static boolean checkPalindrome(LinkedList head) {
        Stack<Integer> stack = new Stack<>();
        LinkedList temp=head;
        while(temp!=null)
        {
            stack.push(temp.val);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null)
        {
            if(stack.pop()!=temp.val) return false;
            temp=temp.next;
        }
        return true;
    }
}
