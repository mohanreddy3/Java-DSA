//Level Order Traversal

package Trees.ApnaClg;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
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
    //method
    private static void levelOrderTraversal(Node root){
        //base case
        if(root == null){
            return;
        }
        //Create a Queue DS
        Queue<Node> q = new LinkedList<>();
        //add root and null
        q.add(root);
        q.add(null);
        //iterative approach
        while(! q.isEmpty()){
            //remove Current Node
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println(); // print new line
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data + " "); // print node value
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
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
        levelOrderTraversal(root);
    
    }
}
