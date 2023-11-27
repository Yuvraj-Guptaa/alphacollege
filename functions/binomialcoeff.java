package functions;

public class binomialcoeff {
    public static int factorial(int n)
    {
        int pro=1;
        for(int a=1;a<=n;a++)
        {
          pro*=a;
        }
        return pro;
    }
    public static int bincoeff(int n,int r)
    {
        int n_factorial=factorial(n);
        int r_factorial=factorial(r);
        int nr_factorial=factorial(n-r);
        int ncr= (n_factorial)/(r_factorial*nr_factorial);
        return ncr;
    }
    public static void main(String args[])
    {
        System.out.println(bincoeff(5,2));
    }

    
}
