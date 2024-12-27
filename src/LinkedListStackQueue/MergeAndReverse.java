package LinkedListStackQueue;

public class MergeAndReverse {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(4);
        linkedList.removeLast();
        linkedList.addAtStart(15);
        linkedList.addAtLast(10);
        linkedList.removeLast();
        linkedList.removefirst();
        linkedList.getHead();
        linkedList.printList();

        LinkedListSIngleClass ll = new LinkedListSIngleClass(6);
        LinkedListSIngleClass l2 = new LinkedListSIngleClass(4);
        LinkedListSIngleClass head = new LinkedListSIngleClass(2);
        head.next=l2;
        l2.next=ll;
        LinkedListSIngleClass ll1 = new LinkedListSIngleClass(7);
        LinkedListSIngleClass l21= new LinkedListSIngleClass(5);
        LinkedListSIngleClass head1 = new LinkedListSIngleClass(3);
        head1.next=l21;
        l21.next=ll1;
     //   reverseList(head);
        mergeTwoLists(head,head1);
        System.out.println("Hi");

    }

    public static LinkedListSIngleClass reverseList(LinkedListSIngleClass head) {
        LinkedListSIngleClass prev = null;

        while (head != null) {
            LinkedListSIngleClass next = head.next;
            head.next = prev;
            prev = head;
            head = next;

        }
return prev;
    }

    public static LinkedListSIngleClass mergeTwoLists(LinkedListSIngleClass list1, LinkedListSIngleClass list2) {

        LinkedListSIngleClass output=new LinkedListSIngleClass(0);;
        LinkedListSIngleClass tail=output;


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
