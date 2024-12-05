package Trees.ApnaClg;

public class BT {
    static class Node{
        int data; 
        Node left;
        Node right;
         Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
         }
    }
    //Binary Tree Class
    public static class Binarytree{
        static int indx = -1;
        public static Node buildTree(int[] nodes){
            indx++;
            if(nodes[indx] == null){
                return;
            }
        }
    }
    
}
