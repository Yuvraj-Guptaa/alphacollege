package Endsem;

import Array.Sortings.sort;

public class searchingandsortingrev {
    public static void main(String[] args) {
        
       // int arr[]={1,2,3,4,5,6};
      //  System.out.print(linearsearch(arr, 5));
       // System.out.println(binarysearch(arr, 5));
       int arr[]={6,5,4,3,2,1};
       //bubblesort(arr);
      // selectionsort(arr);
      //insertionSort(arr);
       print(arr);
       System.out.println();
      // mergeSort(arr, 0, arr.length-1);
      pivot(arr, 0, arr.length-1);
       print(arr);

    }
    public static int linearsearch(int arr[],int key)
    {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key)
            {
                return i;
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
            if(arr[mid]>key)
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void print(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }
    }
    public static void bubblesort(int arr[])
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
                
            }
            
        }
    }
    public static void selectionsort(int arr[])
    {
        for (int i = 0; i < arr.length-1; i++) {
            int minpos=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[minpos]>arr[j])
                {
                    minpos=j;
                }
                
            }
            //swap
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
            
        }
    }
    public static void insertionSort(int arr[])
    {
        for (int i = 1; i < arr.length; i++) {
            int prev=i-1;
            int curr=arr[i];
            while(prev>=0&&arr[prev]>curr)
            {
                arr[prev+1]=arr[prev];
                prev--;
            }
            prev++;
            arr[prev]=curr;
            
        }
    }
    public static void mergeSort(int arr[],int st,int en)
    {
        if(st>=en)
        {
            return;
        }
        int mid=(en+st)/2;
        mergeSort(arr, st, mid);
        mergeSort(arr, mid+1, en);
        merge(arr, st, mid, en);
    }
    public static void merge(int arr[],int st,int mid,int en)
    {
        int temp[]=new int[en-st+1];
        int i=st;
        int j=mid+1;
        int k=0;
        while(i<=mid&&j<=en)
        {
            if(arr[i]<arr[j])
            {
               temp[k++]=arr[i++];
            }
            else
            {
                temp[k++]=arr[j++];
            }

        }
        while(i<=mid)
        {
            temp[k++]=arr[i++];
        }
        while(j<=en)
        {
            temp[k++]=arr[j++];
        }
        for(k=0,i=st;k<temp.length;k++,i++)
        {
            arr[i]=temp[k];
        }


    }
    public static void pivot(int arr[],int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int pidx=partation(arr,si,ei);
        pivot(arr, si, pidx-1);
        pivot(arr, pidx+1, ei);
    }
    public static int partation(int arr[],int si,int ei)
    {
        int i=si-1;
        int pivot=arr[ei];
        for(int j=si;j<ei;j++)
        {
          if(arr[j]<pivot)
             {
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
             }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
}