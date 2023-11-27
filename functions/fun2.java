package functions;
import java.util.*;
public class fun2 {
    public static int sum(int a,int b)//paramters or formal parameters
    {
        int sum=a+b;
     return sum;
    
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Input a and b");
      int a=sc.nextInt();
      int b=sc.nextInt();
      sc.close();
      int sum=sum(a,b);//arguments or actual paramters
      System.out.println("sum is"+sum);
      
    }
    
}
