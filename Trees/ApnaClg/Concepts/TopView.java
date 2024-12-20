package Trees.ApnaClg.Concepts;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopView {
     static class Node{
        int data;
        Node left;
        Node right;
        //constructor
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    //helper class -> to assign multiple values in Queue.
    static class Info{
        Node node;
        int HorDist;
        //constructor
        public Info(Node node, int HorDist){
            this.node = node;
            this.HorDist = HorDist;
        }
    }

    //method
    private static void topView(Node root){
        //base case
        if(root == null){
            return;
        }
        //create a Queue Ds
        Queue<Info> q = new LinkedList<>(); 
        //create a HashMap to store -> (HD, Node Values)
        HashMap<Integer, Node> map = new HashMap<>();
        //keep track of min and max Horizontal Distances
        int min =0; int max =0;
        //add root, null in queue.
        q.add(new Info(root, 0));
        q.add(null);
        //iterative approach
        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                //condititon 1 -> first time encountoring that HD
                if(! map.containsKey(curr.HorDist)){
                    map.put(curr.HorDist, curr.node);
                }
                //condition 2 -> for left child
                if(curr.node.left != null){
                    q.add(new Info(curr.node.left ,curr.HorDist-1));
                    min =  Math.min(min, curr.HorDist-1);
                }
                //condition 3 -> for right child
                if(curr.node.right != null){
                    q.add(new Info(curr.node.right, curr.HorDist+1));
                    max = Math.max(max, curr.HorDist+1);
                }
            }
        }
         //loop to print Top View output
         for(int i=min; i<=max; i++){
            System.out.print(map.get(i).data + " ");
        }  
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

        //calling Method
       topView(root);

    }

    
}
