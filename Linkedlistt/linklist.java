package Linkedlistt;

import java.net.Socket;

public class linklist {
     int size=0;
    public static void main(String args[])
    {
        linklist ll=new linklist();
        ll.addfirst(2);
        ll.print();
        ll.addfirst(1);
        ll.print();
        ll.addLast(1);
        ll.print();
        ll.addmiddle(1, 2);
        ll.print();
        //System.out.println(ll.size);
        // System.out.println("First element removed "+ll.removefirst());
        // ll.print();
        // System.out.println("Last element removed "+ll.removelast());
        // ll.print();
        // System.out.println(ll.iterativesearch(10));
        // ll.recurivesearch(10);
        //ll.reverse();
       // ll.deletenthNode(1);
       System.out.println(ll.ispalin());
        
    }
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    static Node head;
    static Node tail;
    public void addfirst(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            tail=head=newNode;
            size++;
        }
        else{
            newNode.next=head;
            head=newNode;
            size++;
        }
    }
    public void addLast(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            size++;
        }
        else{
            tail.next=newNode;
            tail=newNode;
            size++;
        }
    }
    public void addmiddle(int idx,int data)
    {
        Node newNode=new Node(data);
        if(idx==0)
        {
            addfirst(data);
            return;
        }
        else{
            int i=0;
           Node temp=head;
            while(i<idx-1)
            {
               temp=temp.next;
               i++;
            }
            newNode.next=temp.next;
            temp.next=newNode;
            size++;
        }
    }
    public int removefirst()
    {
        if(size==0)
        {
            System.out.println("Linkedlist is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1)
        {
           int val=head.data;
            head=tail=null;
            size--;
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
            System.out.println("Linkedlist is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1)
        {
           int val=head.data;
           head=tail=null;
           size--;
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
        return val;

    }
    public int iterativesearch(int key)
    {
        int i=0;
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==key)
            {
                return i;
            }
            else{
            i++;
            temp=temp.next;
            }
        }
        return -1;
    }
    public int helper(Node head,int key)
    {
        int idx=-1;
        if(head==null)
        {
            return -1;
        }
        if(head.data==key)
        {
            return 0;
        }
        idx=helper(head.next,key);
         if(idx==-1)
         {
              return -1;
         }
         else{
            return idx+1;
         }
    }
    public void recurivesearch(int key)
    {
           System.out.println(helper(head, key));
    }
    public void reverse()
    {
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
           prev=curr;
           curr=next;
        }
        head=prev;
    }
    public void deletenthNode(int n)
    {
        Node temp=head;
        int size=0;
        while(temp!=null)
        {
            temp=temp.next;
           
            size++;
        }
        System.out.println(size);;
        if(n==size)
        {
           head=head.next;
           return;
        }
        int itoFind=size-n;
        Node prev=head;
        int i=1;
        while(i<itoFind)
        {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
        
    }
    //checking if the linkedlist is palidnrome or not
    public Node middleNode(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean ispalin()
    {
        if(head==null&&head.next==null)
        {
            return true;
        }
        //step 1
        Node midn=middleNode(head);
        //step 2 find the second part reverse
        Node prev=null;
        Node curr=midn;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
        while(right!=null)
        {
            if(left.data!=right.data)
            {
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    
    public void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ->");
            temp=temp.next;

        }
        System.out.println("null");

    }

    
}
