// Arrays taking input from user.
package Arrays_Concepts;

import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int size = ip.nextInt();
        int Numbers []=new int [size];
        //input
        for(int i=0; i<size;i++){
            Numbers[i]= ip.nextInt();
        }
        //output
        for(int i=0; i<size; i++){
            System.out.println(Numbers[i]);
        } 
        ip.close();
    }
    
}
