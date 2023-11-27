package Stacks;

public class stacksarray { static int  top=-1;
    public static void main(String args[])
    {
        int numbers[]=new int[5];
       push(1, numbers);
       push(2, numbers);
       push(3, numbers);
       push(4,numbers);
       push(5, numbers);
       pop(numbers);
      pop(numbers);
      peep(numbers);
      // push(6, numbers);
       print(numbers);
    }
    
    public static void push(int n,int numbers[])
    {
        
       
        if(top==numbers.length-1)
        {
            System.out.println("Stack overflow");
        }
        else{
            
            numbers[++top]=n;
        }
    }
    public static void pop(int numbers[])
    {
        if(top==-1)
        {
            System.out.println("Stack underflow");
        }
        else{
            int val=numbers[top];
            top=top-1;
            System.out.println("popped value "+val);
        }
    }
    public static void peep(int numbers[])
    {
        if(top==-1)
        {
            System.out.println("Stack underflow");
        }
        else{
            int val=numbers[top];
           
            System.out.println("peep value "+val);
        }
    }
    public static  void print(int arr[])
    {
        for(int a=top;a>=0;a--)
        {
         System.out.print(arr[a]+" ");
        }
    }

    
}
