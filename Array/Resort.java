package Array;

public class Resort {
    public static void main(String args[])
    {
        int arr[]={5,4,3,2,1};
        //bubblesort(arr);
       // selectionsort(arr);
       //insertionsort(arr);
     //  divide(arr, 0, arr.length-1);
     quicksort(arr, 0, arr.length-1);
        print(arr);

    }
    public static void print(int arr[])
    {
        for(int a=0;a<arr.length;a++)
        {
            System.out.print(arr[a]+" ");
        }
        System.out.println();
    }
    public static void bubblesort(int arr[])
    {
        for(int turn=0;turn<arr.length-1;turn++)
        {
            for(int a=0;a<arr.length-1-turn;a++)
            {
                if(arr[a]>arr[a+1])
                {
                    int temp=arr[a];
                    arr[a]=arr[a+1];
                    arr[a+1]=temp;
                }
            }
        }
    }
    public static void selectionsort(int arr[])
    {
        for(int turn=0;turn<arr.length-1;turn++)
        {
            int minpos=turn;
            for(int a=turn+1;a<arr.length;a++)
            {
                if(arr[minpos]>=arr[a])
                {
                    minpos=a;
                }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[turn];
            arr[turn]=temp;
        }
    }
    public static void insertionsort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0&&arr[prev]>curr)
            {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    public static void divide(int arr[],int si,int en)
    {
        if(si>=en)
        {
            return;
        }
        else
        {
            int mid=(si+en)/2;
            divide(arr,si,mid);
            divide(arr,mid+1,en);
            conqueror(arr,si,mid,en);

        }
    }
    public static void conqueror(int arr[],int si,int mid,int en)
    {
        int ind1=si;
        int ind2=mid+1;
        int x=0;
        int merge[]=new int[en-si+1];
        while(ind1<=mid&&ind2<=en)
        {
            if(arr[ind1]<=arr[ind2])
               merge[x++]=arr[ind1++];
               else
               merge[x++]=arr[ind2++];

        }
        while(ind1<=mid)
        {
            merge[x++]=arr[ind1++];
        }
        while(ind2<=mid+1)
        {
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
          else{
            int pidx=partation(arr,si,en);
            quicksort(arr, si, pidx-1);
            quicksort(arr, pidx+1, en);
          }
        }
        public static int partation(int arr[],int si,int en)
        {
          int pivot=arr[en];
          int i=si-1;
          for(int a=si;a<en;a++)
          {
              if(arr[a]<=pivot)
              {
                i++;
                int temp=arr[a];
                arr[a]=arr[i];
                arr[i]=temp;
              }
          }
                  i++;
                int temp=pivot;
                arr[en]=arr[i];
                arr[i]=temp;
                return i;

        }

    }
    
    
