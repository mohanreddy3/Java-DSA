package Trees.ApnaClg.Practice;

public class PrintKthLevel {
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
    //method -> Print elements in Kth level
    public static void printKthLevel(Node root, int level , int k){
        if(root == null){
            return;
        }
        if(level == k){
            System.out.print(root.data + " ");
        }
        //recursive fun() for left & right Childs
        printKthLevel(root.left, level+1, k);
        printKthLevel(root.right, level+1, k);
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
        int k = 3;
        //method calling
        printKthLevel(root, 1, k);

    }
    
}
