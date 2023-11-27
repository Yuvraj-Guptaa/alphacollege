package Queues;
import java.util.*;
class QueueJCF
{
    public static void main(String[] args) {
        //Queue<Integer> obj=new LinkedList<>(); //ArrayDeque
        Queue<Integer> obj=new ArrayDeque<>();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        while(!obj.isEmpty())
        {
            System.out.println(obj.peek());
            obj.remove();
        }
        
    }
}