package Stacks;

public class StackC {
    static class Node {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this .next=null;
        }

    }

    static class Stack {
        static Node head=null;
        public static boolean isEmpty()
        {
            return head==null;
        }
        //push
        public static void push(int data)
        {
             Node newNode=new Node(data);
            if(isEmpty())
            {
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;

        }
        //pop
        public static int pop()
        {
            if(isEmpty())
            {
                return -1;
            }
            else{
                int val=head.data;
                head=head.next;
                return val;
            }
        }
        public static int peek()
        {
            if(isEmpty())
            {
                return -1;
            }
            else{
                return head.data;

        }

    }

    public static void main(String[] args) {
        Stack S = new Stack();
        S.push(1);
        S.push(2);
        S.push(3);
        while (!S.isEmpty()) {
            System.out.println(S.peek());
            S.pop();
        }

    }
}
}

