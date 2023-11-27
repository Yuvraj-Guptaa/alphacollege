package javabasics;

import java.util.*;
public class ifevenodd {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println("it is even number");
        }
        else
        {
            System.out.println("it is odd number");
        }
        sc.close();
    }
    
}
