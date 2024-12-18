package Trees.ApnaClg.Practice;

public class MinDistBtw2Nodes {
    //Node  structure
    static class Node {
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

    //method to find Least Common Ancestor
    private static Node findLca(Node root, int n1, int n2){
        //base cases
        if(root == null || root.data == n1 || root.data == n2 ){
            return root;
        }

        //check for left and right Childs
        Node leftLca = findLca(root.left, n1, n2);
        Node rightLca = findLca(root.right, n1, n2);

        //check if any of them are null
        if(leftLca == null){
            return rightLca;
        }
        if(rightLca == null){
            return leftLca;
        }
        // last case if (rightLca && leftLca != null)
        return root;
    }
    //main logic
    //To Find Min dist btw 2 nodes
    public static int minDist(Node root, int n1, int n2){
        Node lca = findLca(root, n1, n2);
        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca, n2);
         return dist1+dist2;
    }
    //helper fun() -> to find distance between lca and node
    public static int lcaDist(Node root, int n){
        //base case
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        //check left and right childs
        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);

        if( leftDist == -1 && rightDist == -1){
            return -1;
        }
        else if(leftDist == -1){
            return rightDist+1;
        }
        else{
            return leftDist+1;
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
        int n1 = 4;
        int n2 = 7;
        System.out.println(minDist(root, n1, n2));
    }

    
}
