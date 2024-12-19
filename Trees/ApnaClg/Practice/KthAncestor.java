package Trees.ApnaClg.Practice;

public class KthAncestor {
    //Node Structure
    static class Node{
        int data;
        Node left;
        Node right;
        //contr
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

        int n=6;
        int k=1;
        //method calling
        findKthAncestor(root, n, k);

    }
    //method -> to find the Kth Ancestor
    private static int findKthAncestor(Node root, int n, int k){
        //base case
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        //check for left & right
        int left = findKthAncestor(root.left, n, k);
        int right = findKthAncestor(root.right, n, k);
        if(left == -1 && right == -1){
            return -1;
        }
        int max = Math.max(left, right);
        if(max+1 == k){
            System.out.println(root.data);
        }
        return max+1;
    }
    
}
