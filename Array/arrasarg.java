package Array;

public class arrasarg {
    public static void update(int marks[],int nonchangable)
    {
        nonchangable=10;
        for(int a=0;a<marks.length;a++)
        {
           marks[a]=marks[a]+1;
        }
    }
    public static void main(String args[])
    {
        int marks[]={98,96,99};
        int nonchangable=5;
        update(marks,nonchangable);
        System.out.println(nonchangable);
        //for printing our marks
        for(int a=0;a<marks.length;a++)
        {
           System.out.print(marks[a]+" ");
        }
        System.out.println();

    }
    
}
