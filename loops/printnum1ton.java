package loops;
import java.util.*;
public class printnum1ton {
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Input number");
     int n =sc.nextInt();
     int a=1;
     while(a<=n)
     {
        System.out.println(a);
        a++;
     }
     sc.close();
    }
    
}
