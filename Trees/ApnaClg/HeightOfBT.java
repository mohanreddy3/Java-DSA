package Trees.ApnaClg;

public class HeightOfBT {
    //Node Data Structure.
     private static class Node{
        int data;
        Node left;
        Node right;
        //Constructor
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
     }
     //method to find Height
     public static int findHeight(Node root){
        if(root == null){
            return 0;
        }
        //recursive fun
        int lh = findHeight(root.left); // left subtree height
        int rh = findHeight(root.right); // right subtree height
        int totalHeight = Math.max(lh,rh)+1;
        return totalHeight;
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
        System.out.println(findHeight(root));

     }
    
}
