package Trees.ApnaClg.Practice;

public class SubTreeCheck {
    static class Node{
        int data; 
        Node left;
        Node right;
        //constructor
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    //main
    public static void main(String[] args) {
        //main Tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        //SubTree
        Node subRoot  = new Node(2);
        subRoot.left = new Node(4);
        subRoot.left.left = new Node(5);

        //Function Call
        System.out.println(isSubtree(root, subRoot));
        
    }
    //method 1 -> to find subRoot in main Tree.
   private static boolean isSubtree(Node root, Node subRoot){
        //base case
        if(root == null){
            return false;
        }
        if(root.data == subRoot.data){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }
        boolean LeftAns = isSubtree(root.left, subRoot);
        boolean RightAns = isSubtree(root.right, subRoot);
         return (LeftAns || RightAns);
        
         // return (isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot));
        
   } 
   //method 2 -> to check if two trees are identical
   private static boolean isIdentical(Node node, Node subRoot){
    //it's easy to find Non Identical Conditions.
    if( node == null && subRoot == null){
        return true;
    }
    else if(node == null || subRoot == null || node.data != subRoot.data){
        return false;
    }
    //recursive fun
    if(! isIdentical(node.left, subRoot.left)){
        return false;
    }
    if(! isIdentical(node.right, subRoot.right)){
        return false;
    }
    //if none of the conditions satisfy.
    return true;
   }
    
}
