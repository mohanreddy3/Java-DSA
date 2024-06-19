//Function for Printing TABLE for a number.
package Functions_Concepts;

import java.util.Scanner;

public class h3 {
    public static void TableCreation (int num){
        int j =0;
        for(int i=2; i<=10; i++){
            j=num*i;
            System.out.println(j);
        }       
    }
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner ip = new Scanner(System.in);
        int num = ip.nextInt();
        TableCreation(num);
        ip.close();
    }
    
}
