package LeetCode.Day10;

import LeetCode.Day9.LinkedList;

/**
 * Traverse all element using while (head != null || head1 != null)  and handle null pointer exception scenario
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        LinkedList l2 = new LinkedList(5);
        LinkedList head = new LinkedList(3);
        head.next = l2;// It's in reverse order, number is 642

        LinkedList ll11 = new LinkedList(9);
        LinkedList ll1 = new LinkedList(9);
        LinkedList l21 = new LinkedList(5);
        LinkedList head1 = new LinkedList(4);
        head1.next = l21;
        l21.next = ll1;
        ll1.next = ll11;/// It's in reverse order, number is 783

        LinkedList sum = findSum(head, head1); // output = 5->2->4->1
    }

    private static LinkedList findSum(LinkedList head, LinkedList head1) {
        int sum;
        int carry = 0;
        LinkedList dummy = new LinkedList(-1);
        LinkedList temp = dummy;

        while (head != null || head1 != null) {
            int twoNodeSum = (head == null ? 0 : head.val) + (head1 == null ? 0 : head1.val) + carry;
            sum = twoNodeSum % 10;
            carry = twoNodeSum / 10;
            LinkedList temp1 = new LinkedList(sum);
            temp.next = temp1;
            temp = temp1;
            if (head != null) head = head.next;
            if (head1 != null) head1 = head1.next;
        }
        if (carry != 0) {
            temp.next = new LinkedList(carry);
        }

        return dummy.next;
    }
}
