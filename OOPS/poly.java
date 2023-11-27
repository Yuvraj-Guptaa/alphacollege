package OOPS;
public class poly{

    public static void  main(String args[])
    {
           calc obj=new calc();
           System.out.println(obj.sum(1,2));
           System.out.println(obj.sum((float)1.7,(float)2.7));
           System.out.println(obj.sum(1,2,3));
           deer d=new deer();
           d.eat();
           
           
           
           
           
           
           
           
           
           
           
           ;
    }
}
class Animal{
    void eat()
    {
        System.out.println("eats anything");
    }

}
class deer extends Animal{
    void eat()
    {
        System.out.println("eats grass");
    }
}
 class calc {
    int  sum(int a,int b)
    {
        return a+b;

    }
    float sum(float a,float b)
    {
        return a+b;
    }
    float sum(int a, int b, int c)
    {
        return a+b+c;
    }
    
}
