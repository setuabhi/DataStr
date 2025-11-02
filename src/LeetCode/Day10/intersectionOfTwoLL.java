package LeetCode.Day10;

import LeetCode.Day9.LinkedList;

import java.util.HashSet;

public class intersectionOfTwoLL {
    public static void main(String[] args) {
        LinkedList lA3 = new LinkedList(6);
        LinkedList lA2 = new LinkedList(5);
        LinkedList lA1 = new LinkedList(4);
        LinkedList head1 = new LinkedList(2);
        head1.next = lA1;
        lA1.next = lA2;
        lA2.next = lA3;

        LinkedList head2 = new LinkedList(7);
        head2.next=lA2;

  //      System.out.println(intersectionWithMap(head1,head2).val);
        System.out.println(intersectionWithOutMap(head1,head2).val);
    }
//reduce temp of larger one to match with smaller one
    private static LinkedList intersectionWithOutMap(LinkedList head1, LinkedList head2) {
        int countHead1=0;
        int countHead2=0;
        LinkedList temp1=head1;
        LinkedList temp2=head2;
        while(temp1!=null)
        {
            countHead1++;
            temp1=temp1.next;
        }
        while(temp2!=null)
        {
            countHead2++;
            temp2=temp2.next;
        }
        temp1=head1;
        temp2=head2;
        if(countHead2>countHead1) {
            int temp = countHead2 - countHead1;
            while (temp-->0)
            {
                temp2=temp2.next;
            }
        }
        else
        {
            int temp = countHead1 - countHead2;
            while (temp-- >0)
            {
                temp1=temp1.next;
            }
        }

        while(temp1!=null) // we can write tem2 as well since both have same length
        {
            if(temp1==temp2) return temp1;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return null;
    }

    private static LinkedList intersectionWithMap(LinkedList head1, LinkedList head2) {
        LinkedList temp1= head1;
        LinkedList temp2= head2;
        HashSet<LinkedList> hashSet = new HashSet<>();
        while(temp1!=null)
        {
            hashSet.add(temp1);
            temp1=temp1.next;
        }
        while(temp2!=null)
        {
           if(hashSet.contains(temp2))
           {
               return temp2;
           }
            temp2=temp2.next;
        }
        return null;
    }
}
