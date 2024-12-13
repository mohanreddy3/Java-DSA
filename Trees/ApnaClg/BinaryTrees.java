package Trees.ApnaClg;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTrees {

    //creating Node class
    static  class Node{
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

    //Binary Tree Class
    static class BinaryTree{
        static int index = -1;
        public static Node buildTree(int[] nodes){
            index++;
            if(nodes[index] == -1){
                return null;
            }
            
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
        //Preorder Traversal
        public static void preOrder(Node root){
            //base case
            if(root == null){
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
        //Level Order Traversal
        public static void levelOrder(Node root){
            //base case
            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(! q.isEmpty()){
                Node curNode = q.remove();
                if(curNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(curNode.data + " ");
                    if(curNode.left != null){
                        q.add(curNode.left);
                    }
                    if(curNode.right != null){
                        q.add(curNode.right);
                    }
                }

            }
        }
    }
    //main
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root  = tree.buildTree(nodes);
        System.out.println(root.data);
        tree.preOrder(root);
        System.out.println();
        tree.levelOrder(root);
    }
}
