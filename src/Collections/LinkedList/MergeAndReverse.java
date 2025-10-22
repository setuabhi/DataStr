package Collections.LinkedList;

import java.util.Stack;

public class MergeAndReverse {
    public static void main(String[] args) {

        LinkedList ll = new LinkedList(6);
        LinkedList l2 = new LinkedList(4);
        LinkedList head = new LinkedList(2);
        head.next = l2;
        l2.next = ll;

        LinkedList ll1 = new LinkedList(7);
        LinkedList l21 = new LinkedList(5);
        LinkedList head1 = new LinkedList(3);
        head1.next = l21;
        l21.next = ll1;
        LinkedList reverseList= reverseList(head);
        LinkedList mergedTwoLists = mergeTwoLists(head, head1);
        System.out.println("HI");
    }


    public static LinkedList reverseList(LinkedList head) {
        LinkedList prev = null;
        LinkedList next = null;
        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;

        }
        return prev;
    }


    public static LinkedList mergeTwoLists(LinkedList list1, LinkedList list2) {

        LinkedList dummy = new LinkedList(0);
        LinkedList output = dummy;


        while (list1 != null && list2 != null) {

            if (list1.val < list2.val) {
                dummy.next = list1;
                list1 = list1.next;
            } else {
                dummy.next = list2;
                list2 = list2.next;
            }

            dummy = dummy.next; // Here Dummy variable is moving but output is still pointing from zero

        }

        // Append the remaining nodes (if any)
        if (list1 != null) dummy.next = list1;
        if (list2 != null) dummy.next = list2;

        return output.next;
    }
}
