package printstarpattern;

public class abst {
    public static void main(String args[])
    {
      /*  Horse h=new Horse();
       h.eat();
       h.walk();
       Chicken c=new Chicken();
       c.eat();
       c.walk();*/
       //System.out.println(h.color);
        Mustang myhorse=new Mustang();
        //Animal-Horse-Mustang

    }
    
}
abstract class Animal{
    String color;
    Animal()
    {
        color="brown";
        System.out.println("animal constructor is called");

    }
    void eat()
    {
        System.out.println("animal eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    Horse()
    {
        System.out.println("Horse constructor is called");
    }
    void changecolor()
    {
        color="dark brown";
    }
    void walk()
    {
        System.out.println("walks on $ legs");
    }
}
class Chicken extends Animal{
    void changecolor()
    {
        color="yellow";
    }
    void walk()
    {
        System.out.println("walks on 2 legs");
    }
}
class Mustang extends Horse{
    Mustang()
    {
        System.out.println("Mustang constructor is called");
    }
}