package Trees.ApnaClg.Concepts;

public class SubTree {
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

    //method 1 -> to find subRoot in the Main Tree
    public static boolean isSubtree(Node root, Node subRoot){
        //base case
        if( root == null){
            return false;
        }
        if(root.data == subRoot.data){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }
        // boolean leftAns = isSubtree(root.left, subRoot);
        // boolean rightAns = isSubtree(root.right, subRoot);
        //  return (leftAns || rightAns) ;

        //more optimized one (we don't need to check 2nd Case if we find true in the 1st case itself )
        return (isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot)); 

    }
    //method 2 -> checks whether two Trees are Indentical or not.
    public static boolean isIdentical(Node node, Node subRoot){
        //it's easy to find Non Identical Conditions
        if(node == null && subRoot == null){
            return true;
        }
        else if(node == null || subRoot == null || node.data != subRoot.data){
            return false;
        }
        if(! isIdentical(node.left, subRoot.left)){
            return false;
        }
        if(! isIdentical(node.right, subRoot.right)){
            return false;
        }

        //if none above the conditions follow
        return true;

    }
    //main
    public static void main(String[] args) {
        //Main Tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        //SubTree
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        //function call
        System.out.println(isSubtree(root, subRoot));
    }
    
}
