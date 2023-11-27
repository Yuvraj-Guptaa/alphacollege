
package Array.twoDarrays;
import java.util.*;
public class Matrics {
    public static void search(int matrix[][],int key)
    {
        int n=matrix.length; //it gives row length
        int m=matrix[0].length; //it gives column length
        int flag=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==key)
                {
                    System.out.println("Key found at index "+"("+i+","+j+")");
                    flag=1;
                    break;
                }
              
            }
        }
            
           if(flag==0)
           {
            System.out.println("key not found");
            return;
           }    
        
    }
    public static void largestele(int matrix[][])
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]>max)
                {
                     max=matrix[i][j];
                }
            }
        }
        System.out.println("Largest element present is = "+max);

    }
    public static void smallestele(int matrix[][])
    {
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]<smallest)
                {
                    smallest=matrix[i][j];
                }
            }
        }
        System.out.println("Smallest element present is = "+smallest);
    }
    public static void printSpiral(int matrix[][])
    {
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;
         while(startRow<=endRow&&startCol<=endCol)
         {
            //top
            for(int j=startCol;j<=endCol;j++)
            {
                System.out.print(matrix[startRow][j]+" ");

            }
            //right
            for(int j=startRow+1;j<=endRow;j++)
            {
                System.out.print(matrix[j][endCol]+" ");

            }
            //bottom
            for(int j=endCol-1;j>=startCol;j--)
            {
                if(startRow==endRow)
                {
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            //left
            for(int j=endRow-1;j>=startRow+1;j--)
            {
                if(startCol==endCol)
                {
                    break;
                }
                System.out.print(matrix[j][startCol]+" ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;

         }
         System.out.println();
    }
    public static void diagonalsum(int matrix[][])
    {//O(n^2)
        int sum=0;
        // for(int i=0;i<matrix.length;i++)
        // {
        //     for(int j=0;j<matrix[0].length;j++)
        //     {
        //         if(i==j)
        //         {
        //             sum+=matrix[i][j];
        //         }
        //         else if((i+j)==matrix.length-1)
        //         {
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }
        for(int i=0;i<matrix.length;i++)
        {
            sum+=matrix[i][i];
            //sd
            if(i!=matrix.length-i-1)
            sum+=matrix[i][matrix.length-i-1];
        }
       System.out.println(sum);
    }
    public static boolean staircaseSearch(int matrix[][],int key)
    { //using topright corner
        int row=0,col=matrix[0].length-1;
        while(row<matrix.length&&col>=0)
        {
            if(matrix[row][col]==key)
            {
                System.out.println("found key at"+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col])
            {
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static boolean staircaseSearchhw(int matrix[][],int key)
    { // using bottom left element
        int row=matrix.length-1,col=0;
        int count=0;
        while(row>=0&&col<matrix[0].length)
        {
            if(matrix[row][col]==key)
            {
                System.out.println("found key at"+row+","+col+")");
                count++;
                System.out.println(count);
               // return true;
            }
            else if(key<matrix[row][col])
            {
                row--;
            }
            else{
                col++;
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String args[])
    {
        // int matrix[][]=new int[3][3];
        // Scanner sc=new Scanner(System.in);
        // int n=matrix.length; //it gives row length
        // int m=matrix[0].length; //it gives column length
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<m;j++)
        //     {
        //         matrix[i][j]=sc.nextInt();
        //     }
        // }
        //int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},
        //{13,14,15,16}};
        int matrix[][]={{4,7,8},{8,8,7}};
        int key=7;
        //System.out.println(staircaseSearch(matrix, key));
        System.out.println(staircaseSearchhw(matrix, key));
       // printSpiral(matrix);
       //diagonalsum(matrix);
        //output
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<m;j++)
        //     {
        //         System.out.print( matrix[i][j]);
               
        //     }
        //     System.out.println();
        // }
       // search(matrix, 10);
       //largestele(matrix);
       //smallestele(matrix);
    }
    
}
