package Basic_Concepts;
import java.util.*;
public class Main3 {
    public static void main(String[] args) {
        System.out.println("Enter 1 or 2 or 3 : ");
        Scanner ip = new Scanner(System.in); 
        int number = ip.nextInt();
        switch(number){
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("Bonjour");
            break;
            default: System.out.println("Invalid Input");
        }
        ip.close();
    }
}
