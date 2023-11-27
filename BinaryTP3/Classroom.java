package BinaryTP3;
import java.util.*;

import functions.mathclass;
public class Classroom {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTrees{
        public static void levelOrder(Node root,int k)
        {
            if(root==null)
            {
                return;
            }
            Queue<Node>q=new LinkedList<>();
            q.add(root);
            q.add(null);
            int i=1;
            while(!q.isEmpty())
            {
                Node currNode=q.remove();
                if(currNode==null)
                {
                    System.out.println();
                    i++;
                    if(q.isEmpty())
                    {
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    if(k==i)
                    {
        
                System.out.print(currNode.data+" ");
                    }
                if(currNode.left!=null)
                {
                    q.add(currNode.left);
                    
                }
                if(currNode.right!=null)
                {
                    q.add(currNode.right);
                }

            }
        }
    }
    public static void Klevel(Node root,int level,int k)
    {
        if(root==null)
        {
            return;
        }
        if(level==k)
        {
            System.out.print(root.data+" ");
            return;
        }
        Klevel(root.left, level+1, k);
        Klevel(root.right, level+1, k);
    }
    public static boolean getPath(Node root,int n,ArrayList<Node>path)
    {
        if(root==null)
        {
            return false;
        }
       path.add(root);
       if(root.data==n)
       {
        return true;
       }
       boolean foundleft=getPath(root.left, n, path);
       boolean foundright=getPath(root.right, n, path);
       if(foundleft||foundright)
       {
        return true;
       }
       path.remove(path.size()-1);
       return false;

    }
    public static Node lca(Node root,int n1,int n2)
    {
        ArrayList<Node>path1=new ArrayList<>();
        ArrayList<Node>path2=new ArrayList<>();
        getPath(root,n1,path1);
        getPath(root,n2,path2);
        //last common  ancestor
        int i=0;
        for ( ; i < path1.size()&&i<path2.size(); i++) {
            if(path1.get(i)!=path2.get(i))
            {
                break;
            }
            

        }
        //last common node=i-1th
        Node lca=path1.get(i-1);
        return lca;
    }
    public static Node lca2(Node root,int n1,int n2)
    {
        
        if(root==null||root.data==n1||root.data==n2)
        {
            return root;
        }
        Node leftlca=lca2(root.left, n1, n2);
        Node rightlca=lca2(root.right, n1, n2);
        //leftlca=val rightlca=null
        if(rightlca==null)
        {
            return leftlca;
        }
        if(leftlca==null){
            return rightlca;
        }
        return root;

    }
      public static int lcaDist(Node root,int n)
      {
        if(root==null)
        {
            return -1;
        }
        if(root.data==n)
        {
            return 0;
        }
        int leftDist=lcaDist(root.left, n);
        int rigthDist=lcaDist(root.right, n);
        if(leftDist==-1&&rigthDist==-1)
        {
            return -1;
        }
        else if(leftDist==-1){
            return rigthDist+1;

        }
        else 
        {
            return leftDist+1;
        }
      }
    public static int MinDist(Node root,int n1,int n2)
    {
        Node lca=lca2(root, n1, n2);
        int dist1=lcaDist(lca,n1); //lca to node distance
        int dist2=lcaDist(lca,n2);
        return dist1+dist2;


    }
      public static int KAncestor(Node root,int n,int k)
      {
        if(root==null)
        {
            return -1;
        }
        if(root.data==n)
        {
            return 0;
        }
        int leftDist=KAncestor(root.left, n, k);
        int rightDiam=KAncestor(root.right, n, k);
        if(leftDist==-1&&rightDiam==-1)
        {
            return -1;
        }
        int max=Math.max(leftDist,rightDiam); //valid distance
        if(max+1==k)
        {
            System.out.println(" ="+root.data);
        }
        return max+1;
      }
      public static int transfrom(Node root){
        if(root==null)
        {
            return 0;
        }
        int leftchild=transfrom(root.left);
        int rightchikd=transfrom(root.right);
        int data=root.data;
        int newleft=root.left==null?0:root.left.data;
        int newright=root.right==null?0:root.right.data;
        root.data=newleft+leftchild+newright+rightchikd;
        return data;
      }
      public static void preorder(Node root)
      {
        if(root==null)
        {
            return ;

        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
      }
    }
    public static void main(String[] args) {
        BinaryTrees tree=new BinaryTrees();
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        //tree.levelOrder(root,3);
       // tree.Klevel(root, 1, 2);
      // int n1=4;int n2=5;
      // System.out.println(tree.lca2(root,n1,n2).data);
     // System.out.println(tree.MinDist(root, n1, n2));
    // int n=5;int k=2;
   //  System.out.println(tree.KAncestor(root, n, k));
   tree.transfrom(root);
   tree.preorder(root);

        
    }

    
}
