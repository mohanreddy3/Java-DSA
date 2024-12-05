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
            if(nodes[indx] == -1){
                return null;
            }
            Node newnode = new Node(nodes[indx]);
                newnode.left = buildTree(nodes);
                newnode.right = buildTree(nodes);
            return newnode;
        }
    }
    //main
    public static void main(String[] args){
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // Binarytree tree = new Binarytree();
        Node root =  Binarytree.buildTree(nodes);
        System.out.println(root.data);
    }
    
}
