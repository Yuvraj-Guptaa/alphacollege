package Array.Sortings;

public class sort {
    public static void main(String args[])
    {
        int arr[]={5,4,2,3,1};
       // insertionsort(arr);
       countingSort(arr);
        print(arr);

    }
    public static void bubblesort(int arr[])
    {
        for(int turn=0;turn<arr.length-1;turn++ )
        {
            for(int j=0;j<arr.length-1-turn;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void optibubblesort(int arr[])
    {
        for(int turn=0;turn<arr.length-1;turn++ )
        {
            int flag=0;
            for(int j=0;j<arr.length-1-turn;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    flag++;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            
            if(flag==0)
            break;
        }}
    }
    public static void selectionsort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int minpos=i;

            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[minpos]>arr[j])
                {
                    minpos=j;
                }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;

        }
    }
    public static void insertionsort(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0&&arr[prev]>curr)//finding out the correct postion
            {
                arr[prev+1]=arr[prev];
                prev--;
            }
           //insertion
           arr[prev+1]=curr;
        }
    }
    public static void countingSort(int arr[])
    {
        int largest=Integer.MIN_VALUE;
        for(int a=0;a<arr.length;a++)
        {
            largest=Math.max(largest,arr[a]);
        }
        int count[]=new int[largest+1]; //we also count 0
        for(int i=0;i<arr.length;i++)//original array pe iterate 
        {
            count[arr[i]]++;//to calculate frquency
        }
        //sorting
        int j=0;
        for(int i=0;i<count.length;i++)
        {
            while(count[i]>0)
            {
                arr[j]=i;
                j++;
                count[i]--;
            }
        }

        
    }

    public static void print(int arr[])
    {
        for(int a=0;a<arr.length;a++)
        {
            System.out.print(arr[a]);
        }
        System.out.println();
    }
}
