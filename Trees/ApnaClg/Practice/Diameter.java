package Trees.ApnaClg.Practice;

public class Diameter {
    static class Node{
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
    //main
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        //calling method
        System.out.println(diameterFun(root));

    }
    //height of the Tree
    private static int heightFun(Node root){
        if(root == null){
            return 0;
        }
        int lh = heightFun(root.left);
        int rh = heightFun(root.right);
        int rootHeight = Math.max(lh, rh) + 1;
        return rootHeight;
    } 
    //Diameter of a Tree -> O(N^2) [Approach 1]
    private static int diameterFun(Node root){
        if(root == null){
            return 0;
        }
        int ld = diameterFun(root.left);
        int lh = heightFun(root.left);
        int rd = diameterFun(root.right);
        int rh = heightFun(root.right);

        int selfDiameter = lh+rh+1;

        return Math.max(selfDiameter, Math.max(ld, rd));

    }
    
}
