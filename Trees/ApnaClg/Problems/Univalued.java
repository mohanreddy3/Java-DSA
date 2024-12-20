//Tc: The algorithm visits each node exactly once -> O(N)
//SC :The space complexity depends on the recursion stack.
// worst case :(a completely skewed tree) ->  O(N)
// best case :(balanced tree) -> O(Log(N))
package Trees.ApnaClg.Problems;
public class Univalued {
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
    2   2
     */
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(2);
        root.left.right = new Node(2);
        System.out.println(isUnivalued(root));

    }
    //method 1 -> to find whether given tree in Univalued or not
    private static boolean isUnivalued(Node root){
        //no root is considered as Univalued
        if( root == null){
            return true;
        }
        return checkUnivalued(root, root.data);

    }
    //method 2 -> to check for subtrees
    private static boolean checkUnivalued(Node root , int data){
        if(root == null){
            return true;
        }
        //if root value is not equal then obviously it's false
        if( root.data != data){
            return false;
        }
        //check if both subtrees return true
        return (checkUnivalued(root.left, data) && checkUnivalued(root.right, data));
    }
    
}
