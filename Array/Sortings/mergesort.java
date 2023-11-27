package Array.Sortings;

public class mergesort {
    public static void conquer(int arr[],int si,int mid,int ei)
    {
        //O(n)
        int merge[]=new int[ei-si+1];
        int inx1=si;
        int inx2=mid+1;
        int x=0;
        while(inx1<=mid&&inx2<=ei)
        {
          if(arr[inx1]<=arr[inx2])
          {
            merge[x++]=arr[inx1++];
          }
          else
          {
            merge[x++]=arr[inx2++];
          }
        }
        while(inx1<=mid)
        {
            merge[x++]=arr[inx1++];
        }
        while(inx2<=ei)
        {
            merge[x++]=arr[inx2++];
        }
        for(int a=0,j=si;a<merge.length;a++,j++)
        {
            arr[j]=merge[a];
        }

    }
    public static void divide(int arr[],int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        //O(logn)
       int mid=(si+ei)/2;
       divide(arr,si,mid);
       divide(arr,mid+1,ei);
       conquer(arr,si,mid,ei);
    }
    public static void main(String args[])
    {
        int arr[]={6,3,9,5,2,8};
        int n=arr.length;
        divide(arr, 0, n-1);
        //print
        for(int a=0;a<n;a++)
        {
            System.out.print(arr[a]);
        }
        //time complexity nlogn

    }
    
}
