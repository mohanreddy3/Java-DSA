package Trees.ApnaClg;

public class KthAncestorofNode {
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
        int n = 6;
        int k = 2;
        //method call
        findKthAncestor(root, n, k);

    }
    //method 1 -> to find kth ancestor of given Node
    public static int findKthAncestor(Node root, int n, int k){
        //base case
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        //check for left and right children
        int Leftans = findKthAncestor(root.left, n, k);
        int Rightans = findKthAncestor(root.right, n, k);

        if(Leftans == -1 && Rightans == -1){
            return -1;
        }
        int max = Math.max(Leftans, Rightans);
        if(max+1 == k){
            System.out.println(root.data);
        }
        
        return max+1;
        
    }
}
