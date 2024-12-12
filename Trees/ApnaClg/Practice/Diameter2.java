package Trees.ApnaClg.Practice;

public class Diameter2 {
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
        System.out.println("Diameter of Tree is "+diam2(root).dm);
        System.out.print("Height of Tree is "+diam2(root).ht);
       
    }
    //Info Class
    static class Info{
        int dm;
        int ht;
        //constructor
        Info(int dm , int ht){
            this.dm = dm;
            this.ht = ht;
        }
    }
    //Diameter -> Approach 2 (TC: O(N))
    private static Info diam2(Node root){
        //base case
        if(root == null){
            return new Info(0,0);
        }
        Info leftInfo = diam2(root.left);
        Info rightInfo = diam2(root.right);
        int dm = Math.max(Math.max(leftInfo.dm, rightInfo.dm), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht)+1;
        return new Info(dm ,ht); 
    }
    
}
