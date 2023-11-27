package Linkedlistt;

public class DoubleLL {
    public static class Node{
        int data;
        Node prev;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //add
    public void addFirst(int data)
    {
        Node newNode=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
        }
        else{
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        }
    }
    public static void addLast(int data)
    {
        Node newNode=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=null;
            return;
        }
        else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }

    //remove

    public int removeFirst()
    {
        if(head==null)
        {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1)
        {
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;//if single node is present this line will give error
        size--;
        return val;
    }
    public int removeLast()
    {
        if(head==null)
        {
            
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1)
        {
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        Node prev=head;
       for (int i = 0; i <size-2; i++) {
               prev=prev.next;
        
       }
       int val=prev.next.data;
       prev.next=null;
       tail=prev;
       size--;
       return val;

    }
    public void reverse()
    {
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }



    //print
    public void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DoubleLL dll=new DoubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(4);
        dll.addLast(5);
        // dll.print();
        // System.out.println(dll.size);
        // dll.removeFirst();
        // dll.removeLast();
        // dll.removeLast();
        dll.print();
        dll.reverse();
        dll.print();
    }
    
}
