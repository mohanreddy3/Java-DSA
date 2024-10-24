//Input Array format -> ip : [1,2,3,4,5]
package TCS_NQT.Input_formats;

import java.util.ArrayList;
import java.util.Scanner;

public class Ip4 {
    //method
    private static ArrayList<Integer> inputArrayFormat(){
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner ip = new Scanner(System.in);
        String str = ip.nextLine();
        for(char c : str.toCharArray()){
            if(Character.isDigit(c)){
               int num =  Character.getNumericValue(c);
                arr.add(num);
            }
        }
        ip.close();
        return arr;
    }
    //main
    public static void main(String[] args) {
        ArrayList<Integer> arr3 = inputArrayFormat();
         for(int num : arr3){
            System.out.println(num + " ");
         }
    }
    
}
