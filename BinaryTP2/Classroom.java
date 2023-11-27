package BinaryTP2;
import java.util.*;
public class Classroom {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }
    public static int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        else{
            int lh=height(root.left);
            int rh=height(root.right);
            return Math.max(lh,rh)+1;
        }
    }
    public static int diameter2(Node root) //O(n^2)
    {
        if(root==null)
        {
            return 0;
        }
        int leftdiam=diameter2(root.left);
        int lefth=height(root.left);
        int rightdiam=diameter2(root.right);
        int righth=height(root.right);
        int selfdiam=lefth+righth+1;
        return Math.max(selfdiam,Math.max(leftdiam,rightdiam));

    }
    static class Info{
        int diam;
        int ht;
        public Info(int diam,int ht)
        {
            this.diam=diam;
            this.ht=ht;
        }
    }

    public static Info diameter(Node root){
       
        if(root==null)
        {
            return new Info(0, 0);
        }
        Info leftInfo=diameter(root.left);
        Info rightInfo=diameter(root.right);
        int diam=Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
        int ht=Math.max(leftInfo.ht,rightInfo.ht)+1;
        return new Info(diam, ht);
    }
    public static boolean isIdentical(Node node,Node subRoot)
    {
        if(node==null&&subRoot==null)
        {
            return true;
        }
        else if(node==null||subRoot==null||node.data!=subRoot.data)
        {
            return false;
        }
        if(!isIdentical(node.left, subRoot.left)){
        return false;
        }
        if(!isIdentical(node.right, subRoot.right))
        {
            return false;
        }
        return true;

    }
    public static boolean isSubtree(Node root,Node subRoot) //root finding
    {
        if(root==null)
        {
            return false;
        }
        if(root.data==subRoot.data)
        {
            if(isIdentical(root,subRoot))
            {
                return true;
            }
        }
        boolean leftAns=isSubtree(root.left, subRoot); //lsubtree-true;
        boolean rightAns=isSubtree(root.right, subRoot);//rsubtree-true;
        return leftAns||rightAns;
        //return isSubtree(root.left, subRoot)||isSubtree(root.right, subRoot);
}
static class Info1{

    Node node;
    int hd;
    public Info1(Node node,int hd)
    {
        this.node=node;
        this.hd=hd;
    }
}
public static void topview(Node root)
{
    //level order
    Queue<Info1>q=new LinkedList<>();
    HashMap<Integer,Node>map=new HashMap<>();
    int min=0;
    int max=0;
    q.add(new Info1(root, 0));
    q.add(null);
    while(!q.isEmpty())
    {
        Info1 curr=q.remove();
        if(curr==null)
        {
            if(q.isEmpty())
            {
                break;
            }
            else{
                q.add(null);
            }
        }
        else{
            if(!map.containsKey(curr.hd))//first time hd is occuring
            {
                  map.put(curr.hd,curr.node);
            }
            if(curr.node.left!=null)
            {
                q.add(new Info1(curr.node.left, curr.hd-1));
                min=Math.min(min,curr.hd-1);
            }
            if(curr.node.right!=null)
            {
                q.add(new Info1(curr.node.right, curr.hd+1));
                max=Math.max(max,curr.hd+1);
            }

        }
    }
    for (int i = min; i <=max; i++) {
        System.out.print(map.get(i).data+" ");
        
    }
    System.out.println();

}
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);


        Node subroot=new Node(2);
        subroot.left=new Node(4);
        subroot.right=new Node(5);
        topview(root);
        //System.out.print(diameter(root).ht);
       // System.out.println(isSubtree(root, subroot));
    }
    
}
