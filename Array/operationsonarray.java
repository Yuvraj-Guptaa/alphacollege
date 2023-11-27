package Array;
import java.util.*;
public class operationsonarray {
    public static void input()
    {
        int marks[]=new int[100];
        Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt();//phy
        marks[1]=sc.nextInt();//maths
        marks[2]=sc.nextInt();//eng
        System.out.println("phy ="+marks[0]);
        System.out.println("maths ="+marks[1]);
        System.out.println("eng ="+marks[2]);
        // marks[2]=marks[2]+8;
         //System.out.println("math ="+marks[2]);
         int percentage=(marks[0]+marks[1]+marks[2])/3;
         System.out.println("Percentage is ="+percentage+"%");
         System.out.println("length of array"+marks.length);
    }
    public static void main(String args[])
    {
        //creating an array
        input();
        int marks[]=new int [50];
        int numbers[]={1,2,3,4};

    }
    
}
