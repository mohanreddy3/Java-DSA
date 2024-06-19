/*
 * Write a program to find if a number is a power of 2 or not.
 */
package Bit_Manuplation;

public class h1 {
    public static void main(String[] args) {
        int num = 32;
        int pos = 3;
        if(num > 8){
            pos++;
        }
        //Get Bit
        int BitMask = 1<<pos;
        //AND operation
        
        if((BitMask & num)==0){
            System.out.println("It is not a power of 2.");
        }else{
            System.out.println("It is a power of 2.");
        }
    }
   
}
