package javabasics;

import java.util.*;
public class inputsumandproductab {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input a");
        int a=sc.nextInt();
        System.out.println("input b");
        int b=sc.nextInt();
        int sum=a+b;
        int product=a*b;
        System.out.println("the sum is = "+sum);
        System.out.println("the product is = "+product);
        sc.close();

    }
    
}
