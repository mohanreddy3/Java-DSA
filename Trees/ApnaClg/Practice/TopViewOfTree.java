package Trees.ApnaClg.Practice;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopViewOfTree {
    static class Node{
        int data; 
        Node left;
        Node right;
        //constr
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    //helper class
    public static class Info{
        Node node;
        int hd;
        //constr
        Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    } 

    //method
    public static void topViewOfTree(Node root){
        if(root == null){
            return;
        }
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int min =0; 
        int max =0;
        q.add(new Info(root, 0));
        q.add(null);
        while(! q.isEmpty()){
            Info curNode = q.remove();
            if(curNode == null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            } 
            else{
                //condition 1 -> to check if this the first encounter of HD.
                if(! map.containsKey(curNode.hd)){
                    map.put(curNode.hd, curNode.node);
                }
                //condition 2 -> to check for left child
                if(curNode.node.left != null){
                    q.add(new Info(curNode.node.left, curNode.hd-1));
                    min = Math.min(min, curNode.hd-1);
                }
                //conditon 3 -> to check for right child
                if(curNode.node.right != null){
                    q.add(new Info(curNode.node.right, curNode.hd+1));
                    max = Math.max(max, curNode.hd+1);
                }
            }
        }
        //printing the top view output
        for(int i=min; i<= max; i++){
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
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        topViewOfTree(root);
    }
   
    
}
