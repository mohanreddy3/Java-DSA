package Trees.ApnaClg.Practice;
//Perfect Code & Explanation by Mohan!
public class MinmDist2Node {
    //Node structure
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
    //method 1 -> to find Min dist btw two nodes
    private static int MinDistBtw2Nodes(Node root, int n1, int n2){
        //find LCA first -> seperate helper fun()
        Node lca = fndLca(root,n1,n2);
        int Dist1 = lcaDist(lca, n1);
        int Dist2 = lcaDist(lca, n2);
        return Dist1+Dist2;

    }
    //method 2 -> to find Lca of two nodes
    public static Node fndLca(Node root, int n1, int n2){
        // 3 base cases
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }
        //check left and right children
        Node LeftLca = fndLca(root.left, n1, n2);
        Node RightLca = fndLca(root.right, n1, n2);

        if(LeftLca == null){
            return RightLca;
        }
        if(RightLca == null){
            return LeftLca;
        }
        //last casr will be if( RightLca && LeftLca != null)
        return root;
    }
    //method 3 -> to find Distance btw LCA and given Node
    public static int lcaDist(Node root, int n){
        //base case
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        //check for left and right Childs
        int leftAns = lcaDist(root.left, n);
        int rightAns = lcaDist(root.right, n);

        if(leftAns == -1 && rightAns == -1){
            return -1;
        }
        else if(leftAns == -1){
            return rightAns+1;
        }
        else{
            return leftAns+1;
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
            //target Nodes
            int n1 = 4;
            int n2 = 1;
            System.out.println(MinDistBtw2Nodes(root , n1, n2));

        }
    
}
