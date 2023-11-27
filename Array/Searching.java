package Array;

public class Searching {
    public static int linearsearch(int num[],int key)
    {
        int start=0;
        int end=num.length-1;
        while(start<=end)
        { 
            if(num[start]==key)
            {
                return start;
            }start++;
        }
        return -1;
    }
    public static int binarysearch(int num[],int key)
    {
        int start=0;
        int end=num.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(num[mid]==key)
            {
                return mid;
            }
           else if(num[mid]>key)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int num[]={2,4,6,8,10};
        int key=4;
       // System.out.print(linearsearch(num, key));
       System.out.print(binarysearch(num, key));
    }
}
