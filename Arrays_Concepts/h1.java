//Find the maximum & minimum number in an array of integers. 
package Arrays_Concepts;

import java.util.Scanner;

public class h1 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter size of the array:");
        int size = ip.nextInt(); 
        int array1 []= new int[size];
        //input
        System.out.println("Enter the values:");
        for(int i=0; i<size; i++){
            array1[i]=ip.nextInt();
        }
        //Integer.MIN_VALUE represents the smallest possible value that an int variable can hold, which is -2,147,483,648.
        //Integer.MAX_VALUE represents the largest possible value that an int variable can hold, which is 2,147,483,647.
        // int max = Integer.MAX_VALUE;
        // int min = Integer.MIN_VALUE;
        int max = array1[0];
        int min = array1[0];

        // checking max & min
        for(int i=0; i<size; i++){
            if( array1[i]> max){
                max=array1[i];
            }
            if(array1[i]< min){
                min = array1[i];
            }
        } ip.close();

        System.out.println("Largest element is :"+ max);
        System.out.println("Smallest element is:"+ min);
    }
    
}
