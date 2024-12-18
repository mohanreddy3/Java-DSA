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
        int n2 = 5;
        System.out.println(findLca(root,n1, n2).data);
    }

    
}
