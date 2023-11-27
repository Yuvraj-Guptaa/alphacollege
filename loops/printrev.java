package loops;

public class printrev {
    public static void main(String args[])
    {
        int num=10899;
        while(num>0)
        {
           int r=num%10;
           System.out.print(r+"");
           num=num/10;
        }   
        
    }
    
}
