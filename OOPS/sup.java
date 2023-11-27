package OOPS;

public class sup {
    public static void main(String args[])
    {
      Horse h=new Horse();
      System.out.println(h.color);
     
    }
    
}
class Animal1{
     String color;

    Animal1()
    {
        System.out.println("Animal constructor is called");
    }
}
class Horse extends Animal1{
    Horse()
    {
         super.color="brown";
        System.out.println("horse constructor is called");
    }
}
