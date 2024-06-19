/*
 * Input an email from the user. You have to create a username from the email by
 *  deleting the part that comes after ‘@’. Display that username to the user.
Example : 
email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
email = “helloWorld123@gmail.com”; username = “helloWorld123”
 */
package Strings;
import java.util.Scanner;
public class h3 {
    public static void main(String[] args) {
        System.out.println("Enter your Email id: ");
        Scanner ip = new Scanner (System.in);
        StringBuilder str = new StringBuilder(ip.nextLine());
       //loop
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)== '@'){
                System.out.println("Index where '@' is :" + i);
                //delete
                str.delete(i, str.length());
            }
        }ip.close();
        System.out.println("Username is : " + str);
    }
    
}
