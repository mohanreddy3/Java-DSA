package Trees.ApnaClg;

public class MinDistBtwNodes {
    //Node structure
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
    /*
               1
              / \         
             2   3
            / \ / \
           4  5 6  7       
         */
        public static void main(String[] args) {
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.left = new Node(6);
            root.right.right = new Node(7);
            int n1 = 5;
            int n2 = 3;
            //method calling
            System.out.println(minDistBtwNodes(root, n1, n2));
        }
        //method 1 -> to find minimum distance btw 2 nodes
        public static int minDistBtwNodes(Node root, int n1, int n2){
            Node lca = findLca(root, n1, n2);
            int dist1 = lcaDist(lca, n1);
            int dist2 = lcaDist(lca ,n2);
            return dist1+dist2;
        }
        //method 2 -> to find Least Common Ancestor of 2 Node
        public static Node findLca(Node root, int n1, int n2){
             // 3 base cases
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }
        //check for right & left childsS
        Node leftLca = findLca(root.left, n1, n2);
        Node rightLca = findLca(root.right, n1, n2);
        if(leftLca == null){
            return rightLca;
        }
        if(rightLca == null){
            return leftLca;
        }
        //if both are not equal to null
        return root;
    }
    //Method 3 -> to find distance between Lca and given Node
    public static int lcaDist(Node root, int n){
        //base case
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        //check for right & left childs
        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);
        // 3 cases
        if(leftDist == -1 && rightDist == -1){
            return -1;
        }
        else if(leftDist == -1){
            return rightDist+1;
        }
        else{
            return leftDist+1;
        }

    }
       
    
}
