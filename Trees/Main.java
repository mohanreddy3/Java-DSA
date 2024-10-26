package Trees;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(ip);
        tree.displayPretty();

    }
    
}
