package Endsem;
import java.util.*;
public class Binarytree {
    static class Node{
        Node left,right;
        int data;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static class Bt{
        
        static int idx=-1;
        public static Node buildbt(int arr[])
        {
            idx++;
            if(arr[idx]==-1)
            {
                return null;
            }
            else{
                Node newNode=new Node(arr[idx]);
                newNode.left=buildbt(arr);
                newNode.right=buildbt(arr);
                return newNode;
            }
        }
        public static void preorder(Node root)
        {
            if(root==null)
            {
                return;
            }
            else{
                System.out.print(root.data+" ");
                preorder(root.left);
                preorder(root.right);
            }
        }
        public static void inorder(Node root)
        {
            if(root==null)
            {
                return;
            }
            else{
                inorder(root.left);
                System.out.print(root.data+" ");
                inorder(root.right);
            }
        }
        public static void postorder(Node root)
        {
            if(root==null)
            {
                return;
            }
            else{
                postorder(root.left);
                postorder(root.right);
                System.out.print(root.data+" ");
            }
        }
        public static void levelorder(Node root)
        {
            if(root==null)
            {
                return ;
            }
            else{
                Queue<Node>q=new LinkedList<>();
                q.add(root);
                q.add(null);
                while(!q.isEmpty())
                {
                    Node curr=q.remove();
                    if(curr==null)
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
                        System.out.print(curr.data+" ");
                        if(curr.left!=null)
                        {
                            q.add(curr.left);
                        }
                        if(curr.right!=null)
                        {
                            q.add(curr.right);
                        }
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
            else{
                int lh=height(root.left);
                int rh=height(root.right);
                return Math.max(lh,rh)+1;
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
                Node rightNode=lca(root.right, n1, n2);
                if(lca==null)
                {
                    return rightNode;
                }
                if(rightNode==null)
                {
                    return lca;
                }
            }
            return root;
        }
        public static void mirrorbt(Node root)
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
                Node curNode=q.remove();
                if(curNode==null)
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
                    System.out.print(curNode.data);
                    Node temp=curNode.left;
                    curNode.left=curNode.right;
                    curNode.right=temp;
                    if(curNode.left!=null)
                    {
                        q.add(curNode.left);
                    }
                    if(curNode.right!=null)
                    {
                        q.add(curNode.right);
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
            else{
                Stack<Node>s1=new Stack<>();
                Stack<Node>s2=new Stack<>();
                s1.push(root);
                boolean ltr=true;
                while(!s1.isEmpty())
                {
                    Node currNode=s1.pop();
                    System.out.print(currNode.data+" ");
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
                    Stack temp=s1;
                    s1=s2;
                    s2=temp;
                }
                    
                }
            }
        }
        public static Node buildbst(Node root,int val)
        {
            if(root==null)
            {
                root=new Node(val);
                return root;
            }
            else{
                if(val>root.data)
                {
                    root.right=buildbst(root.right, val);
                }
                if(val<root.data)
                {
                    root.left=buildbst(root.left, val);
                }
                
            }
            return root;
        }
        public static Node delete(Node root,int val)
        {
            if(root.data<val)
            {
                root.right=delete(root.right, val);
            }
            if(root.data>val)
            {
                root.left=delete(root.left,val);
            }
            else{//voila case
                //case1 no child
                 if(root.left==null&&root.right==null)
                 {
                    return null;
                 }
                 //case2 one child
                 if(root.left==null)
                 {
                    return root.right;
                 }
                 else if(root.right==null)
                 {
                    return root.left;
                 }
                 //(root.left!=null&&root.right!=null)
                 {
                    Node inorder=inordersuc(root.right);
                    root.data=inorder.data;
                    root.right=delete(root.right, inorder.data);

                 }


            }
            return root;
        }
        public static Node inordersuc(Node root)
        {
            while(root.left!=null)
            {
                root=root.left;
            }
            return root;
        }
       


    }
    public static void main(String[] args) {
        // int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
         Bt obj=new Bt();
        // Node root=obj.buildbt(arr);
       // System.out.println(root.data);
        // obj.preorder(root);
        // System.out.println();
        // obj.inorder(root);
        // System.out.println();
        // obj.postorder(root);
        // System.out.println();
        // obj.levelorder(root);
        // System.out.println();
        // obj.zigzagorder(root);
        // obj.mirrorbt(root);
    //     System.out.print(obj.height(root));
    //     System.out.println();
    //    Node lca= obj.lca(root, 4, 5);
    //    System.out.println(lca.data);
    int values[]={5,1,3,4,2,7};
    Node root=null;
    for (int i = 0; i < values.length; i++) {
       root= obj.buildbst(root,values[i]);
    
        
    }
    System.out.println(root.data);
    System.out.println();
    obj.inorder(root);
   root= obj.delete(root, 2);
    System.out.println();
    obj.inorder(root);
    }
    
}
