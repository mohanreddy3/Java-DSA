package Placement_Pblms;

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        System.out.println("Enter the Size of Array:");
        Scanner ip = new Scanner(System.in);
        int size = ip.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements: ");
        for(int i=0; i<size; i++){
            array[i] = ip.nextInt();
        }
        int max = array[0];
        for(int i=0; i<size; i++){
            if(array[i]>max){
                max = array[i];
            }
        }ip.close();
        System.out.println("max is :" + max);
    }
    
}
