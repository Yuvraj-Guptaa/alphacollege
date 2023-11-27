package javabasics;

import java.util.*;
public class input {
    public static void main(String args[])
    {  
Scanner sc=new Scanner(System.in);
System.out.println("Input name ");
String name=sc.nextLine();
System.out.println("Input number");
int a =sc.nextInt();

System.out.println(a);
System.out.println(name);
sc.close();

    }
}
