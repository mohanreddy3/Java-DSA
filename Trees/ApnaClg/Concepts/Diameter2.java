package Trees.ApnaClg.Concepts;
//Approach 2 -> O(N)
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
        System.out.println(diameter2(root).diam);
    }

    //Info Class
    static class Info{
        int diam;
        int ht;
        
        //constructor
        Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    //method to find Diameter -> Approach 2 (TC: O(N))
    public static Info diameter2(Node root){
        //base case
        if(root == null){
            return new Info(0,0);
        }
        Info LeftInfo = diameter2(root.left);
        Info RightInfo = diameter2(root.right);
        int diam = Math.max(Math.max(LeftInfo.diam, RightInfo.diam ), LeftInfo.ht+RightInfo.ht+1 );
        int ht = Math.max(LeftInfo.ht, RightInfo.ht)+1;
        return new Info(diam , ht);

    }
}
