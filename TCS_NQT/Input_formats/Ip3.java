// input Space seperated ip : 1 2 3 4 5
package TCS_NQT.Input_formats;

import java.util.ArrayList;
import java.util.Scanner;

public class Ip3 {
    //method
    static ArrayList<Integer> inputSepSpace(){
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner ip = new Scanner(System.in);
        String str = ip.nextLine();
        Scanner ss = new Scanner(str);
        while( ss.hasNextInt()){
            arr.add(ss.nextInt());
        }
        ip.close();
        ss.close();
        return arr;
    }
    //main
    public static void main(String[] args) {
        ArrayList<Integer> arr2 = inputSepSpace();
        for(int num : arr2){
            System.out.println(num + " ");
        }
    }

    
}
