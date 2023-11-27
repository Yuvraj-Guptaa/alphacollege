package BinaryTP1;
import java.util.*;

import Array.Sortings.sort;
public class BinaryTreeprac {
    static class Node{
        Node left,right;
        int data;
        public Node(int data)
        {
            this.left=null;
            this.right=null;
            this.data=data;
        }

    }
    public static class BinaryTree
    {
        public static int  idx=-1;
        public static Node buildtree(int arr[])
        {
            idx++;

            if(arr[idx]==-1)
            {
                return null;

            }
            else{
                Node newNode=new Node(arr[idx]);
                newNode.left=buildtree(arr);
                newNode.right=buildtree(arr);
                return newNode;

            }
        }
    
    public static void preoder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preoder(root.left);
        preoder(root.right);
    }
    public static void levelorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            Node currNode=q.remove();
            if(currNode==null)
            {
                System.out.println();
                if(q.isEmpty())
                {
                    break;
                }
                else{
                    q.add(null);
                    
                }
            }
            else{
            System.out.print(currNode.data+" ");
            if(currNode.left!=null)
            {
                q.add(currNode.left);
            }
            if(currNode.right!=null){
                q.add(currNode.right);
            }
        }
    }


    }
    public static int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static void levelordermirror(Node root)
    {
        if(root==null)
        {
            return;
        }
        else{
            Queue<Node>q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty())
            {
                Node currNode=q.remove();
                if(currNode==null)
                {
                    System.out.println();
                    if(q.isEmpty())
                    {
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(currNode.data+"   ");
                    Node temp=currNode.left;
                    currNode.left=currNode.right;
                    currNode.right=temp;
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
    }
    public static void zigzagorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        Stack<Node>s1=new Stack<>();
        Stack<Node>s2=new Stack<>();
        boolean ltr=true;
        s1.push(root);
        while(!s1.isEmpty())
        {
            Node currNode=s1.pop();
            System.out.print(currNode.data);
            if(ltr)
            {
                if(currNode.left!=null)
                {
                    s2.push(currNode.left);
                }
                if(currNode.right!=null)
                {
                    s2.push(currNode.right);
                }
            }
            else{
                
                if(currNode.left!=null)
                {
                    s2.push(currNode.left);
                }
                if(currNode.right!=null)
                {
                    s2.push(currNode.right);
                }

            }
            if(s1.isEmpty())
            {
                ltr=!ltr;
                Stack<Node>temp=s1;
                s1=s2;
                s2=temp;
            }
            
        }
    }
    public static Node lca(Node root,int n1,int n2)
    {
        if(root==null||root.data==n1||root.data==n2)
        {
            return root;
        }
        else{
            Node lca=lca(root.left, n1, n2);
            Node rca=lca(root.right, n1, n2);
            if(lca==null)
            {
                return rca;
            }
            if(rca==null)
            {
                return lca;
            }
            return root;

        }
    }
}
public static Node buildBST(Node root,int val)
{
    if(root==null)
    {
        root=new Node(val);
        return root;
    }
    if(root.data<val)
    {
        root.right=buildBST(root.right, val);
    }
    if(root.data>val)
    {
        root.left=buildBST(root.left, val);
    }
    return root;


}
public static Node delete(Node root,int val)
{
    if(root.data<val)
    {
        root.right=delete(root.right,val);
    }
    if(root.data>val)
    {
        root.left=delete(root.left, val);
    }
    else{ //voila case
        if(root.right==null&&root.left==null) //no child
        {
            return null;
        }
        if(root.right==null) //one child
        {
            return root.left;
        }
        if(root.left==null) //one chile
        {
            return root.right;
        }
        if(root.right!=null &&root.left!=null)
        {
            Node IS=inordersuceesor(root.right);
            root.data=IS.data;
            root.right=delete(root.right, IS.data);
        }
    }
    return root;
}
public static Node inordersuceesor(Node root)
{
    while(root.left!=null)
    {
        root=root.left;
    }
    return root;
}

    public static void main(String[] args) {
        BinaryTree tree=new  BinaryTree();
        Node root=null;
      //  int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int arr[]={8,5,3,1,4,6,10,11,14};
        for (int i = 0; i < arr.length; i++) {
            root=buildBST(root, arr[i]);
        }
     //   System.out.println(root.data);
       // Node root=tree.buildtree(arr);
       // System.out.println(root.data);
        //tree.preoder(root);
        tree.levelorder(root);
        delete(root, 1);
        System.out.println();
        tree.levelorder(root);
        //System.out.println(tree.height(root));
       // tree.levelordermirror(root);
      // tree.zigzagorder(root);
     //Node lca= tree.lca(root, 4, 5);
    // System.out.println(lca.data);

    }
    
}
