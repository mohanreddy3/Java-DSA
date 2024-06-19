// Basic Arrays Working
package Arrays_Concepts;

public class a1 {
    public static void main(String[] args) {
        int Marks [] = new int[3];
        // int Marks []={91,92,93}; --> another way if we already know how many values.
        Marks[0]=91;
        Marks[1]=92;
        Marks[2]=93;
        for(int i=0; i<3; i++){
            System.out.println(Marks[i]);
        }
    }
    
}
