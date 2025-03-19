package Collections.LinkedList;

import java.util.Stack;

public class MergeAndReverse {
    public static void main(String[] args) {

        LinkedList ll = new LinkedList(6);
        LinkedList l2 = new LinkedList(4);
        LinkedList head = new LinkedList(2);
        head.next=l2;
        l2.next=ll;
        LinkedList ll1 = new LinkedList(7);
        LinkedList l21= new LinkedList(5);
        LinkedList head1 = new LinkedList(3);
        head1.next=l21;
        l21.next=ll1;
        reverseListUsingStack(head);
        LinkedList output= reverseListWithoutStack(head);
        mergeTwoLists(head,head1);

    }

    public static void reverseListUsingStack(LinkedList head) {
        Stack<Integer> store = new Stack<>();
        LinkedList temp = head;
        while (temp != null) {
            store.push(temp.val);
            temp=temp.next;
        }
        temp= head;
        while (temp != null) {
            temp.val=store.pop(); // this changed head data too since temp is pointing to head address
            temp=temp.next;
        }
        System.out.println("HI");
    }
    public static LinkedList reverseListWithoutStack(LinkedList head) {
        LinkedList prev = null;
        while (head != null) {
            LinkedList next = head.next;
            head.next = prev;
            prev = head;
            head = next;

        }
        return prev;
    }

    public static LinkedList mergeTwoLists(LinkedList list1, LinkedList list2) {

        LinkedList output=new LinkedList(0);;
        LinkedList tail=output;


        while(list1!=null || list2!=null )
        {
            if(list1==null)
            {
                tail.next=list2;
                list2=list2.next;
            }
           else if(list2==null)
            {
                tail.next=list1;
                list1=list1.next;
            }
          else if(list1.val<=list2.val)
           {
               tail.next=list1;
               list1=list1.next;
           }
           
           else
           {
               tail.next=list2;
               list2=list2.next;
           }


           tail=tail.next;



        }
        return output.next;
    }
    }
