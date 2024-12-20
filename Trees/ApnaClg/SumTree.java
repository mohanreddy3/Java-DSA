package Trees.ApnaClg;

public class SumTree {
    static class Node{
        int data;
        Node left;
        Node right;
        //constr
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    //main
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        transformTree(root);
        Preorder(root);
    }
    //method -> to transform a Tree into it's Sum Tree.
    public static int transformTree(Node root){
        //base case
        if(root == null){
            return 0;
        }
        int LeftChild = transformTree(root.left);
        int RightChild = transformTree(root.right);

        int data = root.data;
        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight= root.right == null? 0 : root.right.data;
        root.data = newLeft + LeftChild + newRight + RightChild;
        return data;
    }
    //method 2 -> to print the tree in Preorder
    public static void Preorder(Node root){
        if( root == null){
            return;
        }
        System.out.print(root.data + " ");
        Preorder(root.left);
        Preorder(root.right);

    }

    
}
