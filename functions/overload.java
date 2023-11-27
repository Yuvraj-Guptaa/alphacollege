package functions;

public class overload {
    public static int sum(int a,int b)
    {
        return a+b;
    }
    public static int sum(int a,int b,int c)
    {
        return a+b+c;
    }
    //func to cal float sum
 public static float sum(float a,float b)
 {
    return a+b;
 }
 public static boolean isPrime(int n)//optimized
 { boolean isPrime=true;
    if(n==2)
    {
        System.out.println(isPrime);
    }

    
    for(int i=2;i<=Math.sqrt(n);i++)
    {
        if(n%i==0)
        {
            isPrime=false;
            break;
        }

    }
    return isPrime;

 }
 public static void PrimeinRange()
 {
    for(int a=2;a<=10;a++)
    {
        if(isPrime(a)){
        System.out.println(a);
        }
    }
 }
/*  public static boolean isPrime(int n)//not optimized
 { boolean isPrime=true;
    if(n==2)
    {
        System.out.println(isPrime);
    }

    
    for(int i=2;i<=Math.sqrt(n);i++)
    {
        if(n%i==0)
        {
            isPrime=false;
            break;
        }

    }
    return isPrime;

 }*/

    public static void main(String args[])
    {
        PrimeinRange();
    }
    
}
