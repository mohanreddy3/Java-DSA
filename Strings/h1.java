//Take an array of Strings input from the user 
//& find the cumulative (combined) length of all those strings.

package Strings;

import java.util.Scanner;

public class h1 {
    public static void main(String[] args) {
        System.out.print("Enter the size of array:");
        Scanner ip = new Scanner(System.in);
        int size = ip.nextInt();
        String Array1 []= new String[size]; 
        //input
        System.out.println("Enter Values in array:");
        for (int i=0; i<size; i++){
            Array1[i]= ip.nextLine();
        }
        //output
        System.out.println("Elements present in array: ");
        for( int i =0; i<size; i++){
            System.out.println(Array1[i]);
        } 
        //length of each string
        int combLength = 0;
        for (int i=0; i<size;i++){
            System.out.println( "length of char at index " + i + " : " + Array1[i].length());
            //combined length
            combLength = combLength + Array1[i].length();
        }ip.close();
        System.out.println("Combined Length is:"+combLength);
      
    }    

}
