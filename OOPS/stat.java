package OOPS;

public class stat {
    public static void main(String args[])
    {
        Student s1=new Student();
        s1.name="Jvm";

        Student s2=new Student();
        System.out.println(s2.name);
    }
    

}
class Student{
    
    
   static  String name;
    void setName(String name)
    {
        this.name=name;
    }
    String getName()
    {
        return this.name;
    }
}
