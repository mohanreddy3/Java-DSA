package Trees.ApnaClg;
// Print Elements in Kth Level.
public class KthLevel {
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
    //method to print Elements in Kth Level.
    public static void kLevel(Node root, int level ,int k ){
        if(root == null){
            return;
        }
        if(level == k){
            System.out.print(root.data + " ");
        }
        //recursive fun for left child
        kLevel(root.left, level+1, k);
        //recursive fun for right child
        kLevel(root.right, level+1, k);

    }
    //main
    public static void main(String[] args) {
        /*
               1
              / \         
             2   3
            / \ / \
           4  5 6  7
                
         */
       //Main Tree
       Node root = new Node(1);
       root.left = new Node(2);
       root.right = new Node(3);
       root.left.left = new Node(4);
       root.left.right = new Node(5);
       root.right.left = new Node(6);
       root.right.right = new Node(7);
       int k = 3;
       kLevel(root, 1, k);

    }
    
}

