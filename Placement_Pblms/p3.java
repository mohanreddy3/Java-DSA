package Placement_Pblms;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int a = ip.nextInt();
        int r = ip.nextInt();
        int n = ip.nextInt();
        int[] array = new int[5];
        array[0] = a;
        for(int i=1; i<n; i++){
           a= a*r;
           array[i]= a;
        }
        for(int j =0; j<n; j++){
            System.out.println(array[j]);
        }ip.close();
    }
    
}
