package functions;

public class BtoD_DtoB {
    
    public static int BintoDec(int n)
    {
        int deci=0;int i=0;
        while(n>0)
        {
            int d=n%10;
            deci=deci+(d*(int)Math.pow(2,i++));
            n=n/10;
        }
        return deci;

    }
    public static int DectoBin(int n)
    {
        int i=0;
        int bin=0;
        while(n>0)
        {
            int d=n%2;
            bin=bin+(d*(int)Math.pow(10,i++));
            n=n/2;

        }
        return bin;
    }
    public static void main(String args[])
    {
      //  System.out.println(BintoDec(100))
        System.out.println(DectoBin(5));
    }
    
}
