package Linkedlistt;
import java.util.LinkedList; //JCF

import Array.Sortings.mergesort;
public class Classroom {
 public static class Node{
    Node next;
    int data;
     Node(int data)
    {
      this.next=null;
      this.data=data;
    }
  }
  public static Node head=null;
  public static Node tail=null;
  public void addFirst(int data)
  {
    Node newNode=new Node(data);
    if(head==null)
    {
      head=newNode;
      return;
    }
    newNode.next=head;
    head=newNode;
  }
  public void addLast(int data)
  {
    Node newNode=new Node(data);
    if(head==null)
    {
      head=tail=newNode;
      return;
    }
    tail.next=newNode;
    tail=newNode;

  }
  public void print()
  {
    Node temp=head;
    while(temp!=null)
    {
      System.out.print(temp.data+"->");
      temp=temp.next;
    }
    System.out.println();
  }
  public Node getMid(Node head)
  {
          Node slow=head;
          Node fast=head.next;
          while(fast!=null&&fast.next!=null)
          {
            slow=slow.next;
            fast=fast.next.next;
          }
          return slow;  //midNode
  }
  private Node merge(Node head1,Node head2)
  {
    Node mergedll=new Node(-1);
    Node temp=mergedll;
        while(head1!=null&&head2!=null)
        {
          if(head1.data<=head2.data)
          {
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
          }
          else{
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
          }
        }
        while(head1!=null)
        {
          temp.next=head1;
          head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null)
        {
          temp.next=head2;
          head2=head2.next;
          temp=temp.next;
        }
        return mergedll.next;
  }
  public Node mergeSort(Node head)
  {    if(head==null||head.next==null)
    {
      return head;
    }
       //find mid
      Node mid=getMid(head);
       //left and right MS
       Node righthead=mid.next;
       mid.next=null;
      Node newLeft= mergeSort(head);
       Node newRight=mergeSort(righthead);

       //merge
       return merge(newLeft,newRight);

  }
   public void zigZag()
   {
    //findmid
      Node slow=head;
      Node fast=head.next;
      while(fast!=null&&fast.next!=null)
      {
        slow=slow.next;
        fast=fast.next.next;
      }
      Node mid=slow;
    //reverse 2nd half
    Node curr=mid.next;
    mid.next=null;
    Node prev=null;
    Node next;
    while(curr!=null)
    {
      next=curr.next;
      curr.next=prev;
      prev=curr;
      curr=next;
    }
    Node left=head;
    Node right=prev;
    Node nextL,nextR;
    //alt merge
    while(left!=null&&right!=null)
    {
      nextL=left.next;
      left.next=right;
      nextR=right.next;
      right.next=nextL;
      left=nextL;
      right=nextR;
    }


   }
    public static void main(String args[])
{
        //create-objects we have to use classes
        // LinkedList<Integer> ll=new LinkedList<>();
        // //add
        //   ll.addFirst(1);
        //   ll.addLast(2);
        //   ll.addLast(3);
        //   System.out.println(ll);
        // //remove
        // ll.removeLast();
        // ll.removeFirst();
        // System.out.println(ll);
        Classroom ll=new Classroom();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        //5-4-3-2-1

        ll.print();
        // ll.head=ll.mergeSort(ll.head);
        // ll.print();
        //O(nlogn)
        ll.zigZag();
        ll.print();

}

    
}
