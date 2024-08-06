// print sum of N numbers. (Functional Recursion)
package Recursion;

public class R6 {
    //main
    public static void main(String[] args) {
        int Num = 3;
        System.out.println( "Sum is : " + Function(Num));
    }

    //Function
    public static int Function(int Num){
        if(Num ==0){
            return 0;
        }
        else{
            return Num + Function(Num-1);
        }
    }

    
}
