package Array.Sortings;

public class sortt {
    public static void main(String args[])
    {
         int num[]={5,4,3,2,1};
         //bubblesort(num);
        // selectionsort(num);
       // insertionsort(num);
       //divide(0, num.length-1, num);
       quicksort(num, 0, num.length-1);
         print(num);

    }
    public static void print(int num[])
    {
        for(int a=0;a<num.length;a++)
        {
            System.out.print(num[a]);
        }
    }
    public static void bubblesort(int num[])
    {
        for(int a=0;a<num.length-1;a++)
        {
            for(int b=0;b<num.length-1-a;b++)
            {
                if(num[b]>num[b+1])
                {
                    int temp=num[b];
                    num[b]=num[b+1];
                    num[b+1]=temp;
                }
            }
        }
    }
    public static void selectionsort(int num[])
    {
        for(int a=0;a<num.length-1;a++)
        {
            int midpos=a;
            for(int b=a+1;b<num.length;b++)
            {
                if(num[midpos]>num[b])
                {
                    midpos=b;
                }
            }
            int temp=num[midpos];
            num[midpos]=num[a];
            num[a]=temp;
    }
}
public static void insertionsort(int num[])
{
    for(int a=1;a<num.length;a++)
    {
        int curr=num[a];
        int prev=a-1;
        while(prev>=0&&num[prev]>curr)
        {
             num[prev+1]=num[prev];
             prev--;
        }
        num[prev+1]=curr;
    }
}
public static void divide(int si,int ei,int arr[])
{
    if(si>=ei)
    {
        return;
    }
    else{
       int mid=si+(ei-si)/2;
        divide(si,mid,arr);
        divide(mid+1,ei,arr);
        conquer(si,mid,ei,arr);
    }
}
public static void conquer(int si,int mid,int ei,int arr[])
{
    int i=si;
    int j=mid+1;
    int x=0;
    int temp[]=new int[ei-si+1];
    while(i<=mid&&j<=ei)
    {
        if(arr[i]<arr[j])
        {
            temp[x++]=arr[i++];
        }
        else{
            temp[x++]=arr[j++];
        }
    }
    while(i<=mid)
    {
        temp[x++]=arr[i++];
    }
    while(j<=ei)
    {
        temp[x++]=arr[j++];
    }
    for(int k=0,l=si;k<temp.length;k++,l++)
    {
        arr[l]=temp[k];
    }
}
public static void quicksort(int arr[],int si,int ei)
{
    if(si>=ei)
    {
        return;
    }
    else{
        int pidx=partation(arr,si,ei);
        quicksort(arr, si, pidx-1);
        quicksort(arr, pidx+1, ei);
    }
}
public static int partation (int arr[],int si,int ei)
{
    int pivot=arr[ei];
    int i=si-1;
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