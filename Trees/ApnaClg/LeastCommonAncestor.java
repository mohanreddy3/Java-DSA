package Trees.ApnaClg;
// TC : O(n) , SC: O(1)+ recursion Stack Space
public class LeastCommonAncestor {
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
    //method -> to find Least Common Ancestor
    public static Node lcd(Node root, int n1, int n2){
        //3 base cases
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }
        //check for Left & Right childs -> Recursive Fun()
        Node LeftLcd = lcd(root.left, n1, n2);
        Node RightLcd = lcd(root.right, n1, n2);
         
        if(LeftLcd == null){
            return RightLcd;
        }
        if(RightLcd == null){
            return LeftLcd;
        }
        // if(LeftLcd != null && RightLcd != null){ -> This is the final possible case
        //     return root;
        // }
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
        int n1= 6; 
        int n2 =7;
      System.out.println(lcd(root, n1, n2).data);

    }
    
}
