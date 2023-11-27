package Array.Sortings;

public class pracsort {
    public static void main(String args[])
    {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
      // bubblesort(arr);
     // Selectionsort(arr);
     //InsertionSort(arr);
     countingsorting(arr);
       printarray(arr);
    }
    public static void bubblesort(int arr[])
    {
        for(int a=0;a<arr.length-1;a++)
        {
            for(int b=0;b<arr.length-1-a;b++)
            {
                if(arr[b]<arr[b+1])
                {
                    int temp=arr[b];
                    arr[b]=arr[b+1];
                    arr[b+1]=temp;
                }
            }
        }
    }
    public static void Selectionsort(int arr[])
    {
        for(int a=0;a<arr.length-1;a++)
        {
            int midpos=a;
            for(int b=a+1;b<arr.length;b++)
            {
                if(arr[midpos]<arr[b])
                {
                    midpos=b;
                }
            }
            int temp=arr[midpos];
            arr[midpos]=arr[a];
            arr[a]=temp;
            
        }
    }
    public static void InsertionSort(int arr[])
    {
        for(int a=1;a<arr.length;a++)
        {
            int curr=arr[a];
            int prev=a-1;
             while(prev>=0&&arr[prev]<curr)
             {
               arr[prev+1]=arr[prev];
               prev--;
             }
             arr[prev+1]=curr;
        }
    }
    public static void countingsorting(int arr[])
    {
        int largest=Integer.MIN_VALUE;
        for(int a=0;a<arr.length;a++)
        {
            largest=Math.max(largest,arr[a]);
        }
        int count[]=new int[largest+1];
        for(int a=0;a<arr.length;a++)//frequency
        {
            count[arr[a]]++;
        }
        int j=0;
        for(int a=count.length-1;a>=0;a--)//sorting
        {
            while(count[a]>0)
            {
                arr[j]=a;
                j++;
                count[a]--;
            }
        }
    }
    public static void printarray(int arr[])
    {
        for(int a=0;a<arr.length;a++)
        {
            System.out.print(arr[a]+" ");
        }
        System.out.println();
    }
    
}
