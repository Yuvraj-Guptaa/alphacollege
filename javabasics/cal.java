package javabasics;
import java.util.*;
public class cal {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char value=sc.next().charAt(0);
        switch(value)
        {
            case '+':
              System.out.println("add");break;
            case '-':
            System.out.println("sub");break;
            case '*':
            System.out.println("multi");break;
            case '/':
            System.out.println("div");break;
            case '%':
            System.out.println("modulo");break;
            default:
            System.out.println("Invalid input");
        }
        sc.close();
    }
    
}
