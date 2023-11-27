package printstarpattern;

public class p4 {
    public static void main(String args[])
    {
        int n=4;
        char ch='A';
        for(int c=1;c<=n;c++)
        {
            for(int r=1;r<=c;r++)
            {
                System.out.print(ch);ch++;
            }
            System.out.println();
        }
    }
    
}
