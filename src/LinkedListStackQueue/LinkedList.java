package LinkedListStackQueue;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public void addAtLast(int value)
    {
        Node newNode = new Node(value);
        tail.next=newNode;
        tail=newNode;
        ++length;
    }

    public void removefirst()
    {
       --length;
        if(head==null)
        {
            System.out.println("Empty");
        }
        else
        {
       head=head.next;}
    }

    public void removeLast()
    {
        if(head==null)
        {
            System.out.println("Empty");
        }
       else if(head.next==null)
        {
            head=null;
        }
        else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            tail = temp;
            temp.next = null;
        }

    }

    public void addAtStart(int value)
    {
        Node newNode = new Node(value);
        newNode.next=head;
        head=newNode;
        ++length;
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void reverse()
    {
        if(head==null)
        {
            System.out.println("Empty");
        }


    }
}
