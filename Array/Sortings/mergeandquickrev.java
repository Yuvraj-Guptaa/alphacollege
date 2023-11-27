package Array.Sortings;

public class mergeandquickrev {
    public static void divide(int arr[],int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int mid=si+(ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conqueror(arr,si,mid,ei);
    }
    public static void conqueror(int arr[],int si,int mid,int ei)
    {
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid&&j<=ei)
        {
            if(arr[i]<arr[j])
            {
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid)
        {
            temp[k++]=arr[i++];
        }
        while(j<=ei)
        {
            temp[k++]=arr[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++)
        {
            arr[i]=temp[k];
        }

    }
    public static void quickSort(int arr[],int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int pidx=partition(arr,si,ei);
        quickSort(arr, si, pidx-1);
        quickSort(arr, pidx+1, ei);
    }
    public static int partition(int arr[],int si,int ei)
    {
        int pivot=arr[ei];
        int i=si-1;
        for (int j = si; j < ei; j++) {
            if(arr[j]<pivot)
            {
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
            
        }
        
        i++;
        //swap
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void print(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        System.out.println("Unsorted array below");
        print(arr);
        System.out.println();
        System.out.println("Sorted array below");
        //divide(arr, 0, arr.length-1);
        quickSort(arr, 0, arr.length-1);
        print(arr);

    }
    
}
