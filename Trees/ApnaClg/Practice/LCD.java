package Trees.ApnaClg.Practice;

public class LCD {
     //Node Data Structure -> Class
     static class Node{
        int data ;
        Node left;
        Node right;
        //constructor
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    //method 
    public static Node findLcd(Node root, int n1, int n2){
        //base cases
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }
        //check for Left and Right Childs using Recursive Fun()
        Node leftLcd = findLcd(root.left, n1, n2);
        Node rightLcd = findLcd(root.right, n1, n2);
        //check if the both childs return null or not
        if(leftLcd == null){
            return rightLcd;
        }
        if(rightLcd == null){
            return leftLcd;
        }
        // if( leftLcd & rightLcd != 0) then,
        return root;
    }
     //main
     public static void main(String[] args) {
        /*
               1
              / \         
             2   3
            / \ / \
           4  5 6  7
                
         */
       //Main Tree
       Node root = new Node(1);
       root.left = new Node(2);
       root.right = new Node(3);
       root.left.left = new Node(4);
       root.left.right = new Node(5);
       root.right.left = new Node(6);
       root.right.right = new Node(7);
        int n1= 4; 
        int n2 =7;
        System.out.println(findLcd(root, n1, n2).data);
      

    }
}
