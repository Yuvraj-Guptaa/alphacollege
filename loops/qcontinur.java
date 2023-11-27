package loops;
import java.util.Scanner;
public class qcontinur {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("input number");
      
      do
      {
        int num=sc.nextInt();
      if(num%10==0)
      {
        continue;
      }
      else{
        System.out.println(num);
        
      }
    }while(true);
}
    
}
