package javabasics;

import java.util.*;
class largestofthreenum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input A,B,C");
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        if((A>=B)&&(A>=C))
        {
            System.out.println(A);
        }
        else if(B>=C)
        {
            System.out.println(B);
        }
        else
        {
            System.out.println(C);
        }
        sc.close();
    }
}