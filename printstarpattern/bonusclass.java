package printstarpattern;

public class bonusclass {
    public static void numberpyramid(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int sp=1;sp<=n-i;sp++)
            {
                System.out.print(" ");
            }
            for(int nu=1;nu<=i;nu++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void palindromepattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int sp=1;sp<=n-i;sp++)
            {
                System.out.print(" ");
            }
            for(int d=i;d>=1;d--)
            {
                System.out.print(d);
            }
            for(int as=2;as<=i;as++)
        {
            System.out.print(as);
        }
        System.out.println();
            
        }
    }
    public static void main(String args[])
    {
         //numberpyramid(6);
         palindromepattern(3);
    }

    
}
