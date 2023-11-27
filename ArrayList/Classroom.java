package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.*;
public class Classroom {
  public static void swap(ArrayList<Integer> list,int idx1,int idx2)
  {
      int temp=list.get(idx1);
      list.set(idx1,list.get(idx2));
      list.set(idx2,temp);
  }
    public static void main(String args[])
    {
        //Java Collection Framework
        //String | Boolean are the classes
        //Class name ibjectname=new Classname();
        // Angular brackets show which type of data is stored
      // ArrayList<Integer>list=new ArrayList<>();
      // ArrayList<String> list2=new ArrayList<>();
      // ArrayList<Boolean> list3=new ArrayList<>();

      // list.add(2);
      // list.add(5);
      // list.add(9);
      // list.add(7);
      // list.add(8);
     // list.add(1,9); //O(n)
      //System.out.println(list);
      //get operation
      //  int element= list.get(2);
      // System.out.println(element);
      //remove operation
      //list.remove(2);
      // System.out.println(list);
      //set operation
      // list.set(2,10);
      // System.out.println(list);
      //contains operation  element exist or not
      // System.out.println(list.contains(2));
      // System.out.println(list.contains(11));
      // System.out.println(list.size());
      //print the arraylist
      // for(int i=list.size()-1;i>=0;i--)
      // {
      //    System.out.print(list.get(i)+" ");
      // }
    //   int max=Integer.MIN_VALUE;
    //   for(int a=0;a<list.size();a++)
    //   {
    //     if(list.get(a)>max)
    //     {
    //       max=list.get(a);
    //     }
    //   }
    //   System.out.println(max);
    // }
    // int idx1=1;
    // int idx2=3;
    // swap(list, idx1, idx2);
    // System.out.println(list);
    // Collections.sort(list);
    // System.out.println(list);
    // //descending
    // Collections.sort(list,Collections.reverseOrder());
    // System.out.println(list);
    // //comprator-fn logic
    ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
    // ArrayList <Integer>list=new ArrayList<>();
    // list.add(1);
    // list.add(2);
    // mainList.add(list);
    // ArrayList<Integer>list2=new ArrayList<>();
    // list2.add(3);
    // list2.add(4);
    // mainList.add(list2);
    // for(int i=0;i<mainList.size();i++)
    // {
    //   ArrayList<Integer>currlist=mainList.get(i);
    //   for(int j=0;j<currlist.size();j++)
    //   {
    //     System.out.print(currlist.get(j));
    //   }
    //   System.out.println();
    // }
    // System.out.println(mainList);
    ArrayList<Integer> list1=new ArrayList<>();
    ArrayList<Integer> list2=new ArrayList<>();
    ArrayList<Integer> list3=new ArrayList<>();
    for(int i=1;i<=5;i++)
    {
       list1.add(i*1);//12345
       list1.add(i*2);//246810
       list1.add(i*3);//3691215


    }
    mainList.add(list1);
    mainList.add(list2);
    mainList.add(list3);
    System.out.println(mainList);
   //nested loops
  //  for(int i=0;i<mainList.size();i++)
  //  {
  //   ArrayList<Integer>currlist=mainList.get(i);
  //   for(int j=0;j<currlist.size();j++)
  //   {
  //    System.out.print(currlist.get(j)+" ");
  //   }
  //  System.out.println();
}
}


