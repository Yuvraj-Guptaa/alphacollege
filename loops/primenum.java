package loops;
import java.util.Scanner;
public class primenum {
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Input number to check for prime");
    //6int num=sc.nextInt();
    int flag=0;
    while(true){ int num=sc.nextInt();
    for(int a=2;a<=num;a++)
    {
        
        if(num%a==0)
        {   flag=1;
            System.out.println("number is composite");
            break;
        }
        
    }
    
    if(flag!=1){
        System.out.println("Number is prime");

    }
}
}
}
