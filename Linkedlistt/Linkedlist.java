package Linkedlistt;



public class Linkedlist
{
    public static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    //Methods
    //add()y
    //remove
    //print
    //search
    public void addFirst(int data)
   {
         //step 1 =create new node
         Node newNode=new Node(data);
         size++;
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        //step 2-NewNode next=head
        newNode.next=head; //link
        //step 3=head=newNode
        head=newNode;

    }
    public void addLast(int data)
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
    public void print() //O(n)
    {
        if(head==null)
        {
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void add(int idx,int data)
    {  //O(n )
        if(idx==0)
        {
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1)
        {
            temp=temp.next;i++;
        }
        //i=idx-1; temp=prev
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public int removeLast()
    {
        if(size==0)
        {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1)
        {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        //prev-i=size-2;
        Node prev=head;
        for(int i=0;i<size-2;i++)
        {
            prev=prev.next;
        }
        int val=prev.next.data;//tail data
        prev.next=null;
        tail=prev;
        size--;
        return val;

        }
    
    public int removefirst()
    {
        if(size==0)
        {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1)
        {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int iterativesearch(int key)
    {
           Node temp=head;
           int i=0;
           while(temp!=null)
           {
            if(temp.data==key)
            {
                return i;
            }
            else{
                temp=temp.next;
                i++;
            }
           }
           return -1;
    }
    public int helper(Node head,int key)//O(nq)
    {
        if(head==null)
        {
            return -1;

        }
        if(head.data==key)
        {
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx==-1)
        {
            return -1;
        }
        else{
            return idx+1;
        }
    }
    public int recSearch(int key)
    {
            return helper(head, key);
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
    public void deletenthfromend(int n)
    {
        //calculate size
        int sz=0;
        Node temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            sz++;
        }
        if(n==sz)
        {
            head=head.next; //remove first
            return;
        }
        //sz-n
        int i=1;
        int itoFind=sz-n;
        Node prev=head;
        while(i<itoFind)
        {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    //slow-fast approach
    public Node findMid(Node head) //helper
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next; //+1
            fast=fast.next.next; //+2
        }
        return slow; //slow is my mid node;
    }
    public boolean checkpalindrome()
    {
        if(head==null &&head.next==null)
        {
            return true;
        }
        //step 1 find mid
        Node midNode=findMid(head);

        //step 2 reverse 2nd half
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        Node right=prev; //rigth half head;
        Node left=head;


        //step 3 check left half and right half
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
  public boolean isCycle()
  {          
    Node slow=head;
    Node fast=head;
    while(fast!=null&&fast.next!=null)
    {
        fast=fast.next.next;//+2
        slow=slow.next;//+1
        if(slow==fast)
        {
            return true; //cycle exists
        }
    }
    return false;//cycle doesn?t exist;

  }
  public static void removeCycle()
  {
    //detect cycle 
    Node slow=head;
    Node fast=head;
    boolean cycle=false;//cycle doesnt exist
    while(fast!=null&&fast.next!=null)
    {
        fast=fast.next.next;
        slow=slow.next;
        if(slow==fast)
        {
                 cycle=true;
                 break;
        }
    }
    if(cycle==false)
    {
        return;
    }
    //find meeting point 
    slow=head;
    Node prev=null;
    while(slow!=fast)
    {
        slow=slow.next;
        fast=fast.next;
        prev=fast;//last node
    }
    //remove cycle -last.next=null
      prev.next=null;
  }
public static void main(String args[])
{
   Linkedlist ll=new Linkedlist();
   //ll.head=new Node(1);
   //ll.head.next=new Node(2);
//    ll.print();
//    ll.addFirst(2);
//    ll.print();
//    ll.addFirst(1);
//    ll.print();
//    ll.addLast(4);
//    ll.print();
//    ll.addLast(5);
//    ll.add(2, 3);
// ll.print();
  // System.out.println(ll.iterativesearch(9));
   //System.out.println(ll.size);
   //ll.removefirst();
   //ll.print();
 //  ll.removeLast();
  // ll.print();
   //System.out.println(ll.size);
  // System.out.println(ll.recSearch(5));
  //ll.reverse();
 // ll.deletenthfromend(3);
//  ll.addLast(1);
//  ll.addLast(2);
//  ll.addLast(2);
//  ll.addLast(1);
//  ll.print();
//  System.out.println(ll.checkpalindrome());
//  ll.print();
  //ll.print();
  head=new Node(1);
  Node temp=new Node(2);
  head.next=temp;
  head.next.next=new Node(3);
  head.next.next.next=temp;
    //1-2-3-2
System.out.println(ll.isCycle());
removeCycle();
System.out.println(ll.isCycle());

}
}