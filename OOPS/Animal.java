package OOPS;
class main{
    public static void main(String args[])
    {
        Fish shark=new Fish();
        
        Bird br=new Bird();
        
        Mammals mm=new Mammals();

        shark.eat();
        shark.swim();
        br.eat();
        br.fly();
        mm.walks();
        mm.eat();

        //Dog dobby=new Dog();
        //dobby.eat();
        //dobby.legs=4;
        //System.out.println(dobby.legs);
        
    }
    }

//base class 
class Animal {
    String color;
    void eat()
    {
        System.out.println("eats");
    }
    void brearthe()
    {
        System.out.println("breathes");
    }
}

//derived class
class Fish extends Animal{
    int fins;
    void swim()
    {
        System.out.println("Swims in water");
    }
}
class Bird extends Animal
{
    void fly()
    {
        System.out.println("Bird flys");
    }
}
class Mammals extends Animal{
    int legs;
    void walks()
    {
        System.out.println("Mammals is walking");
    }
}

/*class Dog extends Mammals{
    String breed;
}*/
