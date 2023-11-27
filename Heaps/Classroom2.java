package Heaps;

public class Classroom2 {
    public static void heapify(int arr[],int i,int size)
    {
        int left=2*i+1;
        int right=2*i+2;

        int maxindex=i;
        if(left<size&&arr[left]>arr[maxindex])
        {
            maxindex=left;
        }
        if(right<size&&arr[right]>arr[maxindex])
        {
            maxindex=right;
        }
        if(maxindex!=i)
        {
            //swapp
            int temp=arr[i];
            arr[i]=arr[maxindex];
            arr[maxindex]=temp;
            heapify(arr, maxindex, size);
        }
    }
    public static void heapSort(int arr[]) //O(nlogn)
    {
        //step 1 to build maxhheap
        int n=arr.length;
        for (int i = n/2; i>=0; i--) {
            heapify(arr,i,n);
            
        }
        //step 2 to push largest at end
        for (int i = n-1; i > 0; i--) {
            //swap(largest-first with last index )
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr,0,i);
            
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,3};
        heapSort(arr);
        //print
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }
        System.out.println();
    }
    
}
