package printstarpattern;

public class p1 {
    public static void main(String args[])
    {
        for(int line=1;line<=4;line++)
        {
            for(int star=1;star<=line;star++)
            {//onelline 
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
