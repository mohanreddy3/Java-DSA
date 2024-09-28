//Find the smallest number in an array
package TCS_NQT.Arrays;

import java.util.Scanner;

public class a1 {
    //main
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int size = ip.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = ip.nextInt();
        }
        int smallestNum = Integer.MAX_VALUE;
        for(int i=0; i<size; i++){
            if(arr[i] < smallestNum){
                smallestNum = arr[i];
            }
        }
        System.out.println("Smallest Number is: "+smallestNum);
        ip.close();
    }

    
}
