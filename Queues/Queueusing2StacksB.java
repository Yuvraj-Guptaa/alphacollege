package Queues;
import java.util.*;
public class Queueusing2StacksB {
    static  class Queue{
         static Stack<Integer> s1=new Stack<>();
         static Stack<Integer>s2=new Stack<>();

        public static boolean isEmpty()
        {
            return s2.isEmpty()&&s1.isEmpty();
        }
        //add O(n)
        public static void add(int data)
        {
            s1.push(data);


        }
    //remove
    public static void remove()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
        }
        else{
          while(!s1.isEmpty())
          {
            s2.push(s1.pop());
          }
          s2.pop();
          
        }
    }
    //peek
    public static int peek(){
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        int peek = s2.peek();
        return peek;
    }
          
    }

    

    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
                q.remove();

        }

        
    }

    

}
