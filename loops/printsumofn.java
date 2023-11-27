package loops;
import java.util.Scanner;
class printsumofn
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input numbers to get the sum till it");
        int n=sc.nextInt();
        int a=1;int sum=0;
        while(a<=n)
        {
            sum=sum+a;a++;
        }
        System.out.println(sum);
        sc.close();
    }
}