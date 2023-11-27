
package loops;
import java.util.Scanner;
public class Q1break {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        /*while(true)
        {
           int n=sc.nextInt();
           if(n%10==0)
           {
            break;
           }
           else{
            System.out.println(n);
           }
        }*/
        do {
            int n=sc.nextInt();
            if(n%10==0)
            break;
            else
            System.out.println(n);;
        }while(true);
        }
    }
    

