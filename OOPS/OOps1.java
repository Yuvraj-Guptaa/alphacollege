package OOPS;

public class OOps1 {
    public static void main (String args[])
    {
       
         Student s1=new Student();
         s1.name="Yuvi";
         s1.roll=220;
         s1.password="abcd";
         s1.marks[0]=100;
         s1.marks[1]=60;
         s1.marks[2]=80;
         Student s2=new Student(s1);//copy
         s2.password="xyz";
         s1.marks[1]=70;
         s1.marks[2]=89;
         for(int a=0;a<3;a++)
         {
            System.out.println(s2.marks[a]);
         }
         
    }


    
}
class Student
{
    String name;
    int roll;
    String password;
    int marks[];
   /* Student(Student s1) //shallow copy constructor
    {
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks=s1.marks;
    }*/
    //deep copy constructor
    Student(Student s1)
    {
        
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        for(int i=0;i<marks.length;i++)
        {
            this.marks[i]=s1.marks[i];
        }
    }

   Student(String name)
    {
        marks=new int[3];
        this.name=name;

        System.out.println("hello");
    }
    Student()
    {
        marks=new int[3];
        System.out.println("non parameterized");
    }

    Student(int roll)
    {
        marks=new int[3];
        this.roll=roll;
    }
}
