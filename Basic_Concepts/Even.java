package Basic_Concepts;
import java.util.*;
public class Even {
    public static void main(String[] args) {
        System.out.println("Enter the desired Number:");
        Scanner ip = new Scanner(System.in);
        int num = ip.nextInt();
        if ( num % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        ip.close();
    }
}
