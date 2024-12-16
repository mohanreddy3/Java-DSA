package Trees.ApnaClg.Practice;
//Breadth First Search 
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
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
    private static void BFStraversal(Node root){
        //base case
        if(root == null){
            return;
        }
        //Create a queue Ds
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(! q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data + " ");
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
        BFStraversal(root);
        

    }
    
}
