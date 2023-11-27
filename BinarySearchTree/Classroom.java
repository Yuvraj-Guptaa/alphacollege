package BinarySearchTree;

public class Classroom {
    static class Node{
        Node left;
        Node right;
        int data;
        public Node(int data)
        {
            this.data=data;
            left=right=null;

        }
    }
    public static void preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        
        preorder(root.right);

    }
    public static Node createmirror(Node root)
    {
        if(root==null)
        {
            return null;
        }
       Node leftmirror= createmirror(root.left);
        Node rightmirror= createmirror(root.right);
        root.left=rightmirror;
        root.right=leftmirror;
        return root;
    }
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(5);
        root.right=new Node(10);
        root.left.left=new Node(3);
        root.left.right=new Node (6);
        root.right.right=new Node(11);
        preorder(root);
        System.out.println();
       root= createmirror(root);
        preorder(root);
    }
    
}
