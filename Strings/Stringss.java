package Strings;
import java.util.*;
public class Stringss {
    public static void printletters(String str)
    {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");

            
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // char arr[]={'a','b','c','d'};
        // String str="abcd";
        // String str2=new String("xyz");
        //String are immutable
        // Scanner sc=new Scanner(System.in);
        // String name;
        // name=sc.nextLine();
        // System.out.println(name);
        // String fullName="Yuvraj Gupta";
        // System.out.println(fullName.length());
        //concatenation
        String firstName="Yuvraj";
        String lastName="Gupta";
        String fullName=firstName+" "+lastName;
        printletters(fullName);



    }
    
}
