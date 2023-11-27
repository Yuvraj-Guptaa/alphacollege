package Stacks;
import java.util.*;

public class infixtopostfix {
    public static Character getperator(Character ch)
    {
        if(ch=='('||ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch==')')
         ch=ch;
         return ch;
        
    }
    public static int higherpp(char ch)
    {
        if(ch=='*'||ch=='/')
        {
            return 2;
        }
        else//(ch=='+'||ch=='-')
        {
            return 1;
        }
    }
    public static void infixtopostfixq(String eqn)
    {
           int length=eqn.length();
           Stack<Character>s=new Stack<>();
           for (int i = 0; i < length; i++) {
            Character ch=eqn.charAt(i);
            if(getperator(ch)=='(')
            {
              s.push(ch);
            }
            
            if(ch>=(char)48&&ch<=(char)57)
            {
                System.out.print(ch);
            }
            if(')'==getperator(ch))
            {
                while(!s.isEmpty())
                {
                    char op=s.pop();
                    System.out.print(op);
                    if(op=='(')
                    {
                        break;
                    }
                }
            }
            if(getperator(ch)=='+'||getperator(ch)=='-'||getperator(ch)=='*'||getperator(ch)=='/')
            {
                if(s.isEmpty())
                {
                    s.push(ch);
                }
                else{
                    

                }
            }
            
           }
    }
    public static void main(String[] args) {
        

    }
    
}
