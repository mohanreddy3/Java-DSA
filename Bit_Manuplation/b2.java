//SET BIT --> converts 0 to 1.
package Bit_Manuplation;

public class b2 {
    public static void main(String[] args) {
        int num = 5; 
        int pos = 1;
        // Create Bitmask
        int BitMask = 1 << pos;
        // Perform OR Operation with Number.
        int NewNumber = BitMask | num;
        System.out.println(NewNumber); 
    }
    
}
