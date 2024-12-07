package Trees.ApnaClg;
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
    }
    //main
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // BinaryTree tree = new BinaryTree();
        Node root  = BinaryTree.buildTree(nodes);
        System.out.println(root.data);
    }
}
