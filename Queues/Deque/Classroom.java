package Queues.Deque;
import java.util.*;
public class Classroom {

    public static void main(String[] args) {
        Deque<Integer>deque=new LinkedList<>();
        deque.addFirst(1);//1
        deque.addFirst(2);//21
        deque.addLast(3);//213
        deque.addLast(4);//2134
        System.out.println(deque);
        // deque.removeFirst();
        deque.removeLast();
         System.out.println(deque);
         System.out.println("first element = "+deque.getFirst());
         System.out.println("Last element = "+deque.getLast());

    }
    
}
