package Basic_Concepts;
import java.util.*;
public class Adult {
    public static void main(String[] args) {
        System.out.println("Enter the age:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a<18) {
            System.out.println("Not an Adult");
        }
        else{
            System.out.println("Adult");
        }
        input.close();

    }
    
}
