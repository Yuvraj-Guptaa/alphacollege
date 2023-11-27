package functions;

public class factofun {
    public static int factorial(int n)
    {
        int pro=1;
        for(int a=1;a<=n;a++)
        {
          pro*=a;
        }
        return pro;
    }
    public static void main(String args[])
    {
        int factorial=factorial(3);
        System.out.println(factorial);
        int factorial1=factorial(4);
        System.out.println(factorial1);
        int factorial2=factorial(5);
        System.out.println(factorial2);
    }
    
}
