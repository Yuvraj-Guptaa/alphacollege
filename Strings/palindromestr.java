package Strings;

public class palindromestr {
    public static boolean isPalindrome(String str)
    {
        for (int i = 0; i < str.length()/2; i++) {
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-i-1))
            {
                return false;
            }
           
            
        }
        return true;
    }
    public static float getShortestPath(String path)
    {
        int x=0;
        int y=0;
        for (int i = 0; i < path.length(); i++) {
            char dir=path.charAt(i);
            //South
            if(dir=='S')
            {
                y--;
            }
            else if(dir=='N')
            {
                y++;
            }
            else if(dir=='W')
            {
                x--;
            }
            //East
            else{
                x++;
            }
        }
            int X2=(x*x);
            int Y2=(y*y);
            return (float)Math.sqrt(X2+Y2);
            
        }
    public static String subString(String str,int si,int ei)
    {
        String substr="";
        for(int i=si;i<ei;i++)
        {
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
   String fruits[]={"apple","mango","banana"};
   String largest=fruits[0];
   for(int i=0;i<fruits.length;i++)
   {
     if(largest.compareTo(fruits[i])<0)
     {
        largest=fruits[i];
     }
   }
   System.out.println(largest);

    }
    
}
