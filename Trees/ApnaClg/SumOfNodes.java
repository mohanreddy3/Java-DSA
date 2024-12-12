package Trees.ApnaClg;

public class SumOfNodes {
    static class Node{
        int data;
        Node left;
        Node right;
        //Constructor
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    //main class
    public class Btrees{
        //main
        public static void main(String[] args) {
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.left = new Node(6);
        //calling method
        System.out.println("Sum of Nodes is:"+sumofNodes(root));
        }
    }

    //method
    public static int sumofNodes(Node root){
        //base case
        if(root == null){
            return 0;
        }
        int leftCount = sumofNodes(root.left);
        int rightCount = sumofNodes(root.right);
        int treeCount = leftCount + rightCount + root.data;
        return treeCount;
    }

    
}
