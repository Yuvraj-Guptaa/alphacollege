package loops;
class breakk
{
    public static void main(String args[])
    {
        //break statement:to exit the loop keyword(break)
        for(int a=1;a<=5;a++)
        {
            if(a==3){
            break;}
            System.out.println(a);
        }
        System.out.println("I am out of the loop");
    }
}