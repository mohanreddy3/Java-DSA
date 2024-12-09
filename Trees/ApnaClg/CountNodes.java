package Trees.ApnaClg;

public class CountNodes { 
    //Node Data Structure -> Class
     static class Node{
        int data ;
        Node left;
        Node right;
        //constructor
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
        //calling method
        System.out.println(countNode(root));

    }
    //method to count Nodes in a BTree
    public static int countNode(Node root){
        //base case
        if(root == null){
            return 0;
        }
        int ln = countNode(root.left);// no of roots in left subtree
        int rn = countNode(root.right);// no of roots in right subtree
        int treeNodes = ln+rn+1; // main Logic
        return treeNodes;
    }
}
