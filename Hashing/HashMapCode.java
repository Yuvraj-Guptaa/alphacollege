package Hashing;

import java.util.ArrayList;
import java.util.LinkedList;

import Linkedlistt.linklist;

public class HashMapCode { //important
    static class HashMap<K,V> //generics
    {
       private class Node{
        K key;
        V value;
        public Node(K key,V value)
        {
            this.key=key;
            this.value=value;
        }

       }
        private int n;//n
        private int N;
        private LinkedList<Node>buckets[];//N //array ka type kya hau linked list in this case so array me link list store horahi hai
        @SuppressWarnings("unchecked")
        public HashMap()
        {
            this.N=4;
            this.buckets=new LinkedList[4];
            for (int i = 0; i < buckets.length; i++) {
                this.buckets[i]=new LinkedList<>(); //har ek bukcet pe linkedlist store karrahe
                
            }

                }
                private int hashFunction(K key)
                {
                           int hc=hashCode();
                           return Math.abs(hc)%N;

                }
                private int SearchinLL(K key,int bi)
                {
                          LinkedList<Node>ll=buckets[bi];
                          int di=0;
                          for(int i=0;i<ll.size();i++)
                          {
                            Node node=ll.get(i);
                            if(node.key==key)
                            {
                                return di;
                            }
                            di++;
                          }
                          return -1;
                }
                private void rehash()
                {
                    LinkedList<Node>oldbuck[]=buckets;
                    buckets=new LinkedList[N*2];
                N=2*N;
                for(int i=0;i<buckets.length;i++)
                {
                    buckets[i]=new LinkedList<>();
                }
                //nodes ->add in bucket
                for(int i=0;i<oldbuck.length;i++)
                {
                    LinkedList<Node>ll=oldbuck[i];
                    for(int j=0;j<ll.size();j++)
                    {
                        Node node=ll.remove();
                        put(node.key,node.value);
                    }

                }
                      }
                public void put(K key,V value)
                {
                    int bi=hashFunction(key); //0 to n-1;
                    int di=SearchinLL(key,bi); // valid index ; -1
                    if(di!=-1)
                    {
                        Node node=buckets[bi].get(di);
                        node.value=value;
                    }
                    else{
                        buckets[bi].add(new Node(key,value));
                        n++;
                    }
                    double lambda=(double)n/N;
                    if(lambda>2.0)
                    {
                        rehash();
                    }
                }
                public boolean containsKey(K key)
                {

                    int bi=hashFunction(key); //0 to n-1;
                    int di=SearchinLL(key,bi); // valid index ; -1
                    if(di!=-1) //valid
                    {
                       return true;
                    }
                    else{
                        return false;
                    }
                }
                public V get(K key)
                {
                    int bi=hashFunction(key); //0 to n-1;
                    int di=SearchinLL(key,bi); // valid index ; -1
                    if(di!=-1)
                    {
                        Node node=buckets[bi].get(di);
                       return node.value;
                    }
                    else{
                        return null;
                    }
                }
                public V remove(K key)
                {
                    int bi=hashFunction(key); //0 to n-1;
                    int di=SearchinLL(key,bi); // valid index ; -1
                    if(di!=-1)
                    {
                        Node node=buckets[bi].remove(di);
                        n--;
                        return node.value;
                        
                    }
                    else{
                        return null;
                    }
                }
                public ArrayList<K> keySet()
                {
                    ArrayList<K>keys=new ArrayList<>();
                    for (int i = 0; i < buckets.length; i++) {
                          LinkedList<Node>ll=buckets[i];
                          for (Node node : ll) {
                            keys.add(node.key);
                            
                          }
                        
                    }
                    return keys;
                }
                public boolean isEmpty()
                {
                    return n==0;
                }


       }
       public static void main(String[] args) {
        HashMap<String ,Integer>hm=new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Nepal", 5);
       ArrayList<String>keys=hm.keySet();
       for (String string : keys) {
        System.out.println(string);
        
       }
       System.out.println(hm.remove("India"));
       System.out.println(hm.get("India"));

       }
    }
    

