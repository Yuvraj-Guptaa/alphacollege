package functions;

public class functionsquestions {
    public static int avgnum(int a,int b,int c)
    {
        return (a+b+c)/3;
    }
    public static boolean isEven(int n)
    {
           if(n%2==0)
           {
            return true;
           }
           else
           {
            return false;
           }
    }
    public static void palin(int n)
    {
        int n1=n;
        int rev=0;
        while(n>0)
        {
            int r=n%10;
            rev=(rev*10)+r;
            n=n/10;
        }
        if(rev==n1)
        {
            System.out.println("Number is palindrome "+n1);

        }
        else
        {
            System.out.println("Number is not palindrome "+n1);
        }

    }
    public static int sumofdigit(int n)
    {
        int sum=0;
        while(n>0)
        {
            int d=n%10;
            sum=sum+d;
            n=n/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        System.out.println("Average of the given number is = "+avgnum(5,5,5));
        System.out.println(isEven(10));
        palin(321);
        System.out.println("Sum of digits is "+sumofdigit(51));
    }
    
}
