/*
 * Given an array of N integers where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets such that: 

Each student gets one packet.
The difference between the number of chocolates in the packet with maximum chocolates and the packet with minimum chocolates given to the students is minimum.
Examples:

Input : arr[] = {7, 3, 2, 4, 9, 12, 56} , m = 3 
Output: Minimum Difference is 2 
Explanation:
We have seven packets of chocolates and we need to pick three packets for 3 students 
If we pick 2, 3 and 4, we get the minimum difference between maximum and minimum packet sizes.
 */
package Problems;
import java.util.Arrays; //-->  Inorder to sort the given array.
import java.util.Scanner;
public class r1 {
    public static void main(String[] args) {
        //getting no of chocolate packets --> size of array.
        System.out.print("Enter the size of array:");
        Scanner ip = new Scanner(System.in);
        int size = ip.nextInt();
        int arr1 [] = new int [size];
        //input 
        System.out.println("Enter the values in array:");
         for ( int i =0; i<size; i++){
            arr1[i]= ip.nextInt();
         }
         // getting m --> no of students
         System.out.print("Enter the m value:");
         int m = ip.nextInt();

        //  int arr1 [] = { 7, 3, 2, 4, 9, 12 ,56};
        //  int m = 3;
         System.out.println( "Minimun Difference is : ");
         findMinDiff(arr1, m);
         ip.close();
    }

    // Function for Finding Minimum difference.
     static void findMinDiff ( int arr1 [], int m){
        // sorting the given array.(Pre-defined)
        Arrays.sort(arr1);
        // store arr size in n.
        int n = arr1.length;
        // first store the min Difference as max value in given array.
        int minDiff = Integer.MAX_VALUE;
        // Find Minimum Difference using Sliding Window Approach.
        for ( int i=0; (i+m-1)<n; i++){
             // 1st and it's 3rd term differennce.
             int difference = arr1[i+m-1] - arr1[i];
             // Math.min(int a , int b); --> gives the min value btw a & b.
            minDiff = Math.min(minDiff, difference);
        }
        System.out.println(minDiff);
    }
}
// TIME COMPLEXITY - O(N log N)
// SPACE COMPLEXITY - O(1)
