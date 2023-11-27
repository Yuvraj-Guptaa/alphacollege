package Recursion;

public class Recursionbasics {
     public static void printDec(int n)
     {
        if(n==1)
        {
            System.out.print("1");
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
     }
     public static void printInc(int n)
     {
        if(n==1)
        {
            System.out.println("1");
            return;
        }
        printInc(n-1);
        System.out.println(n);
     }
     public static int fact(int n)
     {
        if(n==0)
        {
            return 1;
        }
        int fm1=fact(n-1);
        int fn=n*fm1;
        return fn;
     }
     public static int calsum(int n)
     {
        if(n==1)
        {
            return 1;
        }
        int Summ=calsum(n-1);
        int sum=n+Summ;
        return sum;

     }
     public static int  fib(int n)
     {
        if(n==1||n==0)
        {
            return n;
        }
        int fnm1=fib(n-1);
        int fnm2=fib(n-2);
        int fn=fnm1+fnm2;
        return fn;
     }
     public static boolean isSorted(int arr[],int i)
     {
        if(i==arr.length-1){
            return true;
        }

        if(arr[i]>arr[i+1])
        {
            return false;
     
        } 
           return isSorted(arr, i+1);
            
            
           
        
    
    }
    public static void main(String[] args) {
       // int n=10;
        //printDec(n);
       // printInc(n);
      // System.out.println(fact(5));
      // System.out.println(calsum(5));
      //System.out.println(fib(5));
      int arr[]={1,2,3,4,5};
      int n=0;
      System.out.println(isSorted(arr, n));

    }
    
}
