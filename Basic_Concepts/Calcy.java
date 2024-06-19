package Basic_Concepts;
/* Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
	1 : + (Addition) a + b
2 : - (Subtraction) a - b
3 : * (Multiplication) a * b
4 : / (Division) a / b
5 : % (Modulo or remainder) a % b
Calculate the result according to the operation given and display it to the user.
*/
import java.util.*;
public class Calcy {
    public static void main(String[] args) {
        System.out.println(" Enter two numbers:");
        Scanner ip = new Scanner (System.in);
        int a = ip.nextInt();
        int b = ip.nextInt();
        // new line must be added to take another input.
        ip.nextLine();
        System.out.println("Enter your desired operation:");
        String c = ip.nextLine();
        char operation = c.charAt(0);
        System.out.println("You've Entered :"+ operation);
        if( operation == '+'){
            System.out.println(a+b);
        }
        else if (operation == '-'){
            System.out.println(a-b);
        }
        else if (operation== '*'){
            System.out.println(a*b);
        }
        else if (operation=='/'){
            System.out.println(a/b);
        }
        else if(operation=='%'){
            System.out.println(a%b);
        }
        ip.close();

    }
}
