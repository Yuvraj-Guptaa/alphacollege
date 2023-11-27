package Heaps;
import java.util.*;
public class Heaprev {
    static class Heap{
       static  ArrayList<Integer>al=new ArrayList<>();
    public static  void add(int val)
    {
        al.add(val);
        int x=al.size()-1; //child idx
        int par=(x-1)/2; //parent idx
        while(al.get(x)<al.get(par))
        {
               int temp=al.get(x);
               al.set(x,al.get(par));
               al.set(par,temp);
        }


    }
    public static int peek()
    {
        return al.get(0);
    }
    public static void heapify(int i)
    {
        int left=2*i+1;
        int right=2*i+2;
        int minidx=i;
       if(left<al.size()&&al.get(minidx)>al.get(left))
       {
        minidx=left;
       }
       if(right<al.size()&&al.get(minidx)>al.get(right))
       {
        minidx=right;
       }
       if(minidx!=i)
       {
        int temp=al.get(i);
        al.set(i,al.get(minidx));
        al.set(minidx,temp);
        heapify(minidx);

       }
    }
    public static int remove()
    {
        int data=al.get(0);
        //swap first and last
        int temp=al.get(0);
        al.set(0,al.get(al.size()-1));
        al.set(al.size()-1,temp);

        //remove last
        al.remove(al.size()-1);

        //heapify
        heapify(0);
        return data;
    }
    public boolean isEmpty()
    {
        return al.size()==0;
    }
    public static void main(String[] args) {
        Heap pq=new Heap();
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(5);
        while(!pq.isEmpty()) //heap sort -(nlogn)
        {
            System.out.println(pq.peek());
            pq.remove();
        }
        System.out.println();
        
    }
    
}
}
