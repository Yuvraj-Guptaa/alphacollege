package Array.twoDarrays;

public class questions2d {
    public static void main(String args[])
    {
        //int matrix[][]={{4,7,8},{8,8,7}};
     // question1(matrix, 7);
     int matrix[][]={{1,4,9},{11,4,3},{2,2,3}};
     question2(matrix);
   // transpose(matrix);
    


    }
        public static void question1(int matrix[][],int key)
        {
            int count=0;
            for(int a=0;a<matrix.length;a++)
            {
                for(int b=0;b<matrix[0].length;b++)
                {
                    if(matrix[a][b]==key){
                        count++;

                    }
                }

            }
            System.out.println(count);
        }
        public static void question2(int matrix[][])
        { int sum=0;
            for(int a=0;a<matrix[0].length;a++)
            {
              sum+=matrix[1][a];
              
           
        }
        
            System.out.println(sum);
        }
       

public static void transpose(int matrix[][])
{ System.out.println("original matrix below");
    for(int a=0;a<matrix.length;a++)
    {
        for(int b=0;b<matrix[0].length;b++)
        {
            System.out.print(matrix[a][b]+" ");
        }
        System.out.println();
    }
    System.out.println("transpose matrix below");
    for(int a=0;a<matrix.length;a++)
    {
        for(int b=0;b<matrix[0].length;b++)
        {
            System.out.print(matrix[b][a]+" ");
        }
        System.out.println();
    }
}
}


    

