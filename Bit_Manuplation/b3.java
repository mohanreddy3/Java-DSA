// Clear Bit --> Converts a Bit into 0.
package Bit_Manuplation;

public class b3 {
    public static void main(String[] args) {
        int num = 5;
        int pos = 2;
        // Create a BitMask
        int BitMask = 1<<pos;
        // Apply NOT Operation on BitMask.
        int NotBitMask = ~(BitMask);
        // Perform AND Operation 
        int NewNumber = NotBitMask & num ;
        System.out.println(NewNumber);
    }    
}
