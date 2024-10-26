// Constructing a Binary Tree
package Trees;
import java.util.*;
  class BinaryTree {

     // Tree already contains a Node (Root) so we define it here.
     private Node root; 
      
    //constructor for this class
    public BinaryTree(){

    }

    //Creating a Node Data Structure
    private class Node {
        int value;
        Node left;
        Node right;
        // whenever we create a node we need to assign a Value to it.
        // so create a constructor
        public Node(int value){
            this.value = value;
        }
    }

      
        //Insert the elements (Method 1)
        public void populate(Scanner ip){
            System.out.println("Enter the Root Node: ");
            int value = ip.nextInt();
            root = new Node(value); // create a new node(root) & assign the value.
            // once our root is created we'll call a recursive function to fill the tree(next nodes)
            populate(ip, root);
        }
        //method 2 (for recursion) (Left Node)
        private void populate(Scanner ip , Node node){
            System.out.println("Do you want to enter left of " + node.value); //left of current node's value.
            boolean left = ip.nextBoolean();
            if(left){
                System.out.println("Enter the value for left of " + node.value);
                int value = ip.nextInt();
                node.left = new Node(value); // creates a new node(left) & assigns the value.
                // call the recursion again to continue inserting nodes at left.
                populate(ip , node.left);
            }
            // (recursive) (Right Node)
            System.out.println("Do you want to enter right of :" + node.value);
            boolean right = ip.nextBoolean();
            if(right){
                System.out.println("Enter the value for right of " + node.value);
                int value = ip.nextInt();
                node.right = new Node(value);
                populate(ip, node.right); //to continue insertion nodes at right
            }
        }
        //Displaying the tree
        public void display(){
            display(this.root, "");
        }
        
        // recursive function for displaying tree
        private  void display(Node node, String indent){
            if(node == null ){
                return;
            }
            System.out.println(indent + node.value);
            display(node.left ,indent + "\t");
            display(node.right , indent + "\t");
        }
        
        // For printing Pretty
        public void displayPretty(){
            displayPretty(root , 0);
        }
        private void  displayPretty(Node node, int level){
            if(node == null){
                return;
            }
            displayPretty(node.right, level+1);
            if(level != 0){
                for(int i=0; i<level-1; i++){
                    System.out.print("|\t\t");
                }
                System.out.println("|------>" + node.value);
            }
            else{
                System.out.println(node.value);
            }
            displayPretty(node.left, level+1);

        }

}
