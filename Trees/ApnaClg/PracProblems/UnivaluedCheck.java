package Trees.ApnaClg.PracProblems;

public class UnivaluedCheck {
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
     *  2
       / \
      2   2
     / \
    2   5
     */
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(2);
        root.left.right = new Node(5);
        //method calling
        System.out.println(UnivaluedOrNot(root));
        

    }
    //method 1 -> Check whether given tree is Univalued or not
    private static boolean UnivaluedOrNot(Node root){
        //if root = null it is considered as Univalued
        if(root == null){
            return true;
        }

        return isUnivalued(root, root.data);
    }
    //method 2 -> to check for subtrees
    private static boolean isUnivalued(Node root, int data){
        if(root == null ){
            return true;
        }
        if(root.data != data){
            return false;
        }

        return (isUnivalued(root.left , data) && isUnivalued(root.right, data));
    }
    
}
