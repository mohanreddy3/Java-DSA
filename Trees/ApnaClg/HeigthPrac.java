package Trees.ApnaClg;

public class HeigthPrac {
    // Each Node Data Structure
     static class Node{
        int data;
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
        System.out.println("Height of Tree is : "+heightOfTree(root));
    }
    //method to find Height of a tree
    private static int heightOfTree(Node root){
        //base case
        if(root == null){
            return 0;
        }
        //calculate heigths of subtrees of Root
        int lh = heightOfTree(root.left);
        int rh = heightOfTree(root.right);
        int finalHeight = Math.max(lh,rh)+1;

        return finalHeight;
    }
}
