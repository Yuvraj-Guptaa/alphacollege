package Array.Sortings;

import java.util.Scanner;

class SolutionA {

    public static int binarysearch(int size,int[] arr) {
        int l=1;
        int hi=size;
        int temp=0;
        while(l<hi){
            int mid=(l+hi)/2;
            if(arr[mid]==mid){
                temp=mid;
                hi=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        if(arr[temp]==temp){
            return temp;
        }
        else{
            return -1;
        }
        
    }
    
    
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int size= s.nextInt();

        int[] arr=new int[size+1];
        arr[0]=-1;
        for(int i=1;i<size+1;i++){
            arr[i]=s.nextInt();
        }

        int res=binarysearch(size,arr);
        System.out.println(res>-1?res:"NOT_FOUND");
        s.close();
        
        
    }
    
}
