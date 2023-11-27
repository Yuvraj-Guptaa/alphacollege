package Heaps;
import java.util.*;
import java.util.PriorityQueue;
public class Classroom {
    static class Student implements Comparable<Student> //overriding
    {
        String name;
        int rank;
        public Student(String name,int rank)
        {
            this.name=name;
            this.rank=rank;
        }
        @Override 
        public int compareTo(Student s2)
        {
            return this.rank-s2.rank;
        }
    }
    public static void main(String[] args) {
        // PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Student>pq=new PriorityQueue<>(Comparator.reverseOrder());
        // pq.add(3);
        // pq.add(4);//O(logn)
        // pq.add(1);
        // pq.add(7);
        pq.add(new Student("Yuvraj", 10));
        pq.add(new Student("Gauri", 9));
        pq.add(new Student("A", 4));
        pq.add(new Student("d", 3));

        while(!pq.isEmpty())
        {
            System.out.println(pq.peek().name+" "+pq.peek().rank);//O(1)
            pq.remove();//O(logn)
        }

        
    }
    
}
