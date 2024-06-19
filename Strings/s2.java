// In-built functions used in strings. 
package Strings;

// import java.util.Scanner;

public class s2 {
    public static void main(String[] args) {
        //concatenation
        String FirstName = "Mohan";
        String SecondName = "Reddy";
        String FullName = FirstName + " " + SecondName;
        System.out.println(FullName);
        //length
        System.out.println(FullName.length());
        //charAt
        for(int i=0;i<FullName.length(); i++){
            System.out.println(FullName.charAt(i));
        }

    }

    
}
