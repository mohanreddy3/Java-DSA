package Trees.ApnaClg.Practice;

public class SumTree {
    static class Node{
        int data;
        Node left;
        Node right;
        //constr
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
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
        //method calling
        transfrom(root);
        preOrder(root);
    }
    //method -> to transform a BTree into it's corresponding Sum Tree
    private static int transfrom(Node root){
        //base case
        if(root == null){
            return 0;
        }
        //transform Left Subtree & Right Subtree
        int leftChild = transfrom(root.left);
        int rightChild = transfrom(root.right);
        //check whether left & right of the root are null or not
        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;
        //store the data value in a variable as it changes after perfoming operations
        int data = root.data;
        //now update the root's data.
        root.data = newLeft + newRight + leftChild + rightChild;
        //at last return the current root's data
        return data;
    }
    //method 2 -> Preorder printing
    private static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+ " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    
}
