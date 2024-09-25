/* QUES 4
 * You are given a function,
int findCount(int arr[], int length, int num, int diff);

The function accepts an integer array ‘arr’, its length and two integer variables ‘num’ and ‘diff’. 
Implement this function to find and return the number of elements of ‘arr’ having an absolute difference of less than or equal to ‘diff’ with ‘num’.
Note: In case there is no element in ‘arr’ whose absolute difference with ‘num’ is less than or equal to ‘diff’, return -1.

Example:
Input:

arr: 12 3 14 56 77 13
num: 13
diff: 2
Output:
3

Explanation:
Elements of ‘arr’ having absolute difference of less than or equal to ‘diff’ i.e. 2 with ‘num’ i.e. 13 are 12, 13 and 14.
 */
package Accenture_Problems;

import java.util.Scanner;

public class p4 {
    //method
    static int noOfElmAbsDiff(int[] arr, int length, int num, int diff){
        int count=0;
        for(int i=0; i<length; i++){
            int result = num - arr[i];
            if(result < 0){
                result = result *(-1); //Extrordinary Logic
            }
            if(result <= diff){         
                    count++; 
            }
        }
        return count;
    }
    //main
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("length:");
        int length = ip.nextInt();
        int[] arr = new int[length];
        System.out.print("Enter eleents in array:");
        for(int i=0; i<length; i++){
            arr[i]=ip.nextInt();
        }
        System.out.println("num:");
        int num = ip.nextInt();
        System.out.println("diff:");
        int diff = ip.nextInt();
        System.out.println(noOfElmAbsDiff(arr, length, num, diff));
        ip.close();
    }
}
