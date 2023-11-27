package Array.Sortings;

public class Sortingrev {
    public static void bubbleSort(int arr[])
    { 
        for(int turns=0;turns<arr.length-1;turns++)
        {             
            for(int j=0;j<arr.length-1-turns;j++)
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
public static void selectionsort(int arr[])
{
    for(int i=0;i<arr.length-1;i++)
    {
         int minpos=i;
         for(int j=i+1;j<arr.length;j++)
         {
            if(arr[minpos]>arr[j])
            {
                minpos=j; //minimum postition update
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
        int curr=arr[i];
        int prev=i-1;
        //finding out the correct position to insert
        while(prev>=0&&arr[prev]>curr)
        {
            arr[prev+1]=arr[prev];
            prev--;
        }
        //insertiom
        arr[prev+1]=curr;
        
    }
}


public static void mergeSort(int arr[],int si,int ei)
{
    if(si>=ei)
    {
        return;
    }
    int mid=si+(ei-si)/2;
    mergeSort(arr, si, mid); //left part
    mergeSort(arr, mid+1, ei); //right part
    merge(arr,si,mid,ei);


}
public static void merge(int arr[],int si,int mid,int ei)
{
    //left(0.3)=4 right(4,6)=3 =>6-0+1=7
    int temp[]=new int[ei-si+1];
    int i=si;//iterator for left part
    int j=mid+1;//iterator for right part
    int k=0;//iterator for temp arr
    while(i<=mid&&j<=ei)
    {
        if(arr[i]<arr[j])
        {
            temp[k]=arr[i];
            i++;
            k++;

        }
        else{
            temp[k]=arr[j];
            k++;
            j++;
        }
    }
    //left part
    while(i<=mid)
    {
        temp[k]=arr[i];
        k++;
        i++;
    }
    //right part
    while(j<=ei)
    {
        temp[k]=arr[j];
        k++;
        j++;
    }
    //copy temp to original arr
    for (k = 0,i=si; k < temp.length; k++,i++) {
        arr[i]=temp[k];
        
    }



}

public static void quickSort(int arr[],int si,int ei)
{
    if(si>=ei)
    {
        return;
    }

    //last element
    int pidx=partition(arr,si,ei);
    quickSort(arr, si, pidx-1);//left part
    quickSort(arr, pidx+1, ei);//right parrt
    
}
public static int partition(int arr[],int si,int ei)
{
    int pivot=arr[ei];
    int i=si-1; //to make place for ele smaller than pivot
    for(int j=si;j<ei;j++)
    {
        if(arr[j]<=pivot)
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
        int arr[]={5,4,1,3,2};
       // bubbleSort(arr);
      // selectionsort(arr);
      //insertionSort(arr);
      //mergeSort(arr, 0, arr.length-1);
      quickSort(arr, 0, arr.length-1);
        print(arr);
        
    }
    
}
