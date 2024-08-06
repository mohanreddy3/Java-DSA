// Factorial of a number (Functional Recursion)
package Recursion;

public class R7 {
    //main
    public static void main(String[] args) {
        int num = 3;
     System.out.println("Factorial is :" + fibboFunction(num));   
    }
    //Function
    public static int fibboFunction(int num){
        if(num == 1){
            return 1;
        }
        else{
            return num * fibboFunction(num-1);
        }
    }

    
}
