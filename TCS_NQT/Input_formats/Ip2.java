 //  Input format Case 3: 1,2,3,4,5
package TCS_NQT.Input_formats;

import java.util.ArrayList;
import java.util.Scanner;

public class Ip2 {
    //method
     public static ArrayList<Integer> inputSepByCommas(){
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner ip = new Scanner(System.in);
        String str = ip.nextLine();
        Scanner ss = new Scanner(str).useDelimiter(",");
        while(ss.hasNextInt()){
            arr.add(ss.nextInt());
        }
        ip.close();
        ss.close();
        return arr;
     }
    public static void main(String[] args) {
        //Case 3: 1,2,3,4,5
        ArrayList<Integer> arr1 = inputSepByCommas() ;
        for(int num :  arr1){
            System.out.print(num + " ");
        }
        // System.out.println();
    }
    
}
