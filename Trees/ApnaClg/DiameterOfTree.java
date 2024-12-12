package Trees.ApnaClg;
//APPROACH 1 -> O(N^2)
public class DiameterOfTree {
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
        System.out.println(diameterOfTree(root));
        }
    //method -> height of a tree
    public static int heightOfTree(Node root){
        //base case
        if(root == null){
            return 0;
        }
        int lh = heightOfTree(root.left);
        int rh = heightOfTree(root.right);
        int treeHeight = Math.max(lh,rh)+1;
        return treeHeight;
    }
    //method -> To find Diameter of a Tree (TC: O(N^2))
    public static int diameterOfTree(Node root){
        if(root == null){
            return 0;
        }
        int leftDiam = diameterOfTree(root.left);
        int leftHt = heightOfTree(root.left);
        int rightDiam = diameterOfTree(root.right);
        int rightHt = heightOfTree(root.right);

        int selfDiam = leftHt + rightHt + 1;
         return Math.max(selfDiam , Math.max(leftDiam,rightDiam));
    }

    
}
