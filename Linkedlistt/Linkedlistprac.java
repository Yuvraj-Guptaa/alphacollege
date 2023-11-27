package Linkedlistt;

public class Linkedlistprac {
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addfirst(int data)
    {
        Node newNode=new Node(data);
        size++;
        if(head==null)
        {
           head=tail=newNode;
           return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addlast(int data)
    {
        Node newNode=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;

    }
    public void addmid(int idx,int data)
    {
        Node newNode=new Node(data);
        if(idx==0)
        {
            addfirst(data);
            return;
        }
        size++;
       Node temp=head;
        int i=0;
        while(i<idx-1)
        {
             temp=temp.next;
             i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public int removeFirst()
    {
        if(size==0)
        {
            return Integer.MIN_VALUE;
        }
        else if(size==1)
        {
            int val=head.data;
            head=tail=null;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;

    }
    public int removelast()
    {
        if(size==0)
        {
            return Integer.MIN_VALUE;
        }
        else if(size==1)
        {
            int val=head.data;
            head=tail=null;
            return val;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++)
        {
            prev=prev.next;

        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public void print()
    {
        if(head==null)
        {
            System.out.println("Linked list is empty");
            return;
        }
       Node temp=head;
       while(temp!=null)
       {
        System.out.print(temp.data+"->");
        temp=temp.next;
       }
       System.out.println("null");

    }
    public static void main(String args[])
    {
        Linkedlistprac ll=new Linkedlistprac();
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(4);
        ll.addmid(2, 3);
        ll.removeFirst();
        ll.removelast();
        ll.print();
    }

    
}
