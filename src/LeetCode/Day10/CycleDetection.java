package LeetCode.Day10;

import LeetCode.Day9.LinkedList;

public class CycleDetection {
    public static void main(String[] args) {
        LinkedList lA3 = new LinkedList(6);
        LinkedList lA2 = new LinkedList(5);
        LinkedList lA1 = new LinkedList(4);
        LinkedList head1 = new LinkedList(2);
        head1.next = lA1;
        lA1.next = lA2;
        lA2.next = lA3;
        lA3.next=head1;
        System.out.println(detectCycle(head1));
    }

    private static boolean detectCycle(LinkedList head) {
        LinkedList slow =head;
        LinkedList fast= head;
        while(fast!=null && fast.next != null) //&& fast.next != null is important
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }
}
