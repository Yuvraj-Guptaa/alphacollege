package Array.Sortings;

public class Prac {
    public static void main(String args[])
    {
       // int arr[]={1,2,3,4,5};
        int arr[]={5,4,3,2,1};
        int n=arr.length;
       // divide(arr, 0, n-1);
       // bubblesort(arr);
      // selectionsort(arr);
      //insertionsort(arr);
      //quicksort(arr, 0, n-1);
       //print(arr);
       //System.out.println(linearsearch(arr, 2));
       System.out.println(binarysearch(arr, 4));
    }
    public static int linearsearch(int arr[],int key)
    {
        for(int a=0;a<arr.length;a++)
        {
            if(arr[a]==key)
            {
                return a;
            }
            
        }
        return -1;
    }
    public static int binarysearch(int arr[],int key)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            if(key>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return -1;

    }
    public static void bubblesort(int arr[])
    {
        for(int a=0;a<arr.length-1;a++)
        {
            for(int b=0;b<arr.length-1-a;b++)
            {
                if(arr[b]>arr[b+1])
                {
                    int temp=arr[b];
                    arr[b]=arr[b+1];
                    arr[b+1]=temp;
                }
            }
        }
    }
    public static void selectionsort(int arr[])
    {
        for(int turn=0;turn<arr.length-1;turn++)
        {
            int midpos=turn;
            
            for(int j=turn+1;j<arr.length;j++)
            {
                if(arr[midpos]>arr[j])
                {
                    midpos=j;
                }

            }
            int temp=arr[midpos];
            arr[midpos]=arr[turn];
            arr[turn]=temp;
        }
    }
    public static void insertionsort(int arr[])
    {
        for(int a=1;a<arr.length;a++)
        {
            int cur=arr[a];
            int prev=a-1;
            while(prev>=0&&arr[prev]>cur)
            {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=cur;

        }
    }
    public static void divide(int arr[],int si,int en)
    {
        int mid=(si+en)/2;
        if(si>=en)
        {
            return;
        }
        else{
            divide(arr,si,mid);
            divide(arr,mid+1,en);
            conquer(arr,si,mid,en);

        }
    }
    public static void conquer(int arr[],int si,int mid,int en)
    {
         int ind1=si;
         int ind2=mid+1;
         int x=0;
         int merge[]=new int[en-si+1];
         while(ind1<=mid&&ind2<=en)
         {
             if(arr[ind2]>=arr[ind1])
             {
                merge[x++]=arr[ind1++];
             }
             else{
                merge[x++]=arr[ind2++];
             }
         }
         while(ind1<=mid)
         {
        merge[x++]=arr[ind1++];
         }
         while(ind2<=en){
            merge[x++]=arr[ind2++];
         }
         for(int a=0,j=si;a<merge.length;a++,j++)
         {
            arr[j]=merge[a];
         }

    }
    public static void quicksort(int arr[],int si,int en)
    {
        if(si>=en)
        {
            return;

        }
        else
        {
           int pidx=partition(arr,si,en);
        quicksort(arr,si,pidx-1);
        quicksort(arr,pidx+1,en);

        }
    }
    public static int partition(int arr[],int si,int en)
    {
        int pivot=arr[en];
        int i=si-1;
        for(int j=si;j<en;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                
            }
        }
        i++;
                int temp=pivot;
                arr[en]=arr[i];
                arr[i]=temp;
                return i;

    }

    
    public static void print(int arr[])
    {
        for(int a=0;a<arr.length;a++)
        {
            System.out.print(arr[a]);
        }
    }
}
