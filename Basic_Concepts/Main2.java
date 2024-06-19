package Basic_Concepts;
import java.util.*;
public class Main2 {
    public static void main(String[] args) {
        System.out.println(" Enter a & b :");
        Scanner ip = new Scanner(System.in);
        int a = ip.nextInt();
        int b = ip.nextInt();
        if (a==b){
            System.out.println("a and b are equal");
        }
        else if ( a>b){
            System.out.println("a is greater than b");
        }
        else{
            System.out.println(" b is greater than a");
        }
        ip.close();
    }
}
