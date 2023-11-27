package OOPS;

public class Oops {

    public static void main (String args[])
    {
        Pen p1=new Pen();//created a pen object 
        p1.setColor("blue");
        System.out.println(p1.getcolor());
        p1.setTip(5);
        System.out.println(p1.gettip());
        p1.setColor("yellow");
        System.out.println(p1.getcolor());
        
    }
}

class Pen{
private String color;
private int tip;
String getcolor()
{
    return this.color;
}
void setColor(String newColor)
{
    color=newColor;
}
void setTip(int tip)
{
    this.tip=tip;
}
int gettip()
{
    return this.tip;
}
}


