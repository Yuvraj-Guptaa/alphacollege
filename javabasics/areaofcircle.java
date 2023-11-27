package javabasics;
import java.util.*;
public class areaofcircle {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("input radius");
       double r=sc.nextDouble();
       float pi=3.14f;
    double area=pi*r*r;
    System.out.println("the area of the circle is ="+area);
    sc.close();    
    }
    
}
