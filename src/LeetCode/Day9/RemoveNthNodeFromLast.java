package LeetCode.Day9;

/**
 * Edge case for head is important
 */
public class RemoveNthNodeFromLast {
    public static void main(String[] args) {
        LinkedList l0 = new LinkedList(6);
        LinkedList l1 = new LinkedList(4);
        LinkedList l2 = new LinkedList(5);
        LinkedList head = new LinkedList(2);
        head.next = l2;
        l2.next = l1;
        l1.next = l0;
        LinkedList output = removeNthFromEnd(head, 4); // will remove 4
        System.out.println("Test");
    }

    private static LinkedList removeNthFromEnd(LinkedList head, int index) {
        int count = 0;
        LinkedList temp = head;
        //Take node count
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        int indexToBeRemoved = count - index; // one node before will be the value
        if (indexToBeRemoved == 0) // head only we need to remove
            return head.next;

        count = 0;
        temp = head;
        while (temp != null) {
            count++;
            if (count == indexToBeRemoved) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
}
