package Array;

import java.util.*;

public class ArraysCC1 {
    public static int getlargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE;// +INFINTY
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value is " + smallest);

        return largest;
    }
    //subarrays
    public static void printSubarrays(int numbers[])
    { int ta=0; int sum=0;
        for(int i=0;i<numbers.length;i++)
        {
            int start=i;
            for(int j=i;j<numbers.length;j++)
            {
                int end=j;
                //int current=numbers[j];
                for(int s=start;s<=end;s++)
                {
                    
                    System.out.print(+numbers[s]+" ");
                    
                   
                   
                }
               
                System.out.println();
    
                ta++;
            }
            System.out.println();

        }
        System.out.println("total pairs ="+ta);
    }
    public static void printmaxSubarrays(int numbers[])
    { 
        int currsum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++)
        {
            int start=i;
            for(int j=i;j<numbers.length;j++)
            {   currsum=0;
                int end=j;

                for(int s=start;s<=end;s++)
                {
                    
                   currsum+=numbers[s];
                    
                   
                   
                }
                System.out.print("Current sum "+currsum);
                if(maxSum<currsum)
                {
                    maxSum=currsum;
                }
               
                System.out.println();
    
              
            }
            System.out.println();

        }
        System.out.println("max sum is = "+maxSum);
      
    }
    public static void printmaxSubarraysprefixsum(int numbers[])
    { 
        int currsum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefixsum[]=new int[numbers.length];
        prefixsum[0]=numbers[0];
        for(int i=1;i<prefixsum.length;i++)
        {
            prefixsum[i]=prefixsum[i-1]+numbers[i];
        }
        for(int i=0;i<numbers.length;i++)
        {
            int start=i;
            for(int j=i;j<numbers.length;j++)
            {   currsum=0;
                int end=j;

                // for(int s=start;s<=end;s++)
                // {
                    
                //    currsum+=numbers[s];
                    
                   
                   
                // }

               currsum=start==0 ? prefixsum[end]: prefixsum[end]-prefixsum[start-1];
                if(maxSum<currsum)
                {
                    maxSum=currsum;
                }
               
                System.out.println();
    
              
            }
            System.out.println();

        }
        System.out.println("max sum is = "+maxSum);
      
    }
    public static void kadanes(int numbers[])
    {
       int max=Integer.MIN_VALUE;
       int cs=0;
       for(int i=0;i<numbers.length;i++)
       {
        cs=cs+numbers[i];
        if(cs<0)
       {
        cs=0;
       }
       max=Math.max(cs,max);
       }
       System.out.println("Our max subarray sum is : " +max);
       
    }
    public static void negativekadanes(int numbers[])
    {
       int min=Integer.MAX_VALUE;
       int cs=0;
       for(int i=0;i<numbers.length;i++)
       {
        cs=cs+numbers[i];
      
       min=Math.min(cs,min);
       }
       System.out.println("Our min subarray sum is : " +min);
       for(int i=0;i<numbers.length;i++)
       {
       if(numbers[i]<0)
       {
       System.out.println("-1");
       
       }
    }
       
    }
    

    public static void main(String args[]) {
       // int numbers[] = { 2, 4, 6, 8 ,10};
       // System.out.println("largest value is : " + getlargest(numbers));
        // printSubarrays(numbers);
        //printmaxSubarrays(numbers);
       // printmaxSubarraysprefixsum(numbers);
       //int numbers[]={-2,-3,4,-1,-2,1,5,-3};
       int numbers[]={-1,-8,-3,-4};
       //kadanes(numbers);
       negativekadanes(numbers);
    }

}
