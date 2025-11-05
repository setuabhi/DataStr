package LeetCode.Day9;

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
        LinkedList reverseList = reverseList(head);
        LinkedList mergedTwoLists = mergeTwoSortedLists(head, head1);
        System.out.println("HI");
    }


    public static LinkedList reverseList(LinkedList head) {
        LinkedList dummy = null;
        while (head != null) {
            LinkedList next = head.next;
            head.next = dummy;
            dummy = head;
            head = next;
        }
        return dummy;
    }


    public static LinkedList mergeTwoSortedLists(LinkedList head1, LinkedList head2) {
        LinkedList dummy = new LinkedList(-1);
        LinkedList temp=dummy;
        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        if (head1 != null) {
            temp.next = head1;
        }
        if (head2 != null) {
            temp.next = head2;
        }
        return dummy.next;
    }
}
