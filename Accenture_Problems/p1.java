/*
 * Problem Description :
The function accepts two positive integers ‘r’ and ‘unit’ and a positive integer array ‘arr’ of size ‘n’ as its argument 
‘r’ represents the number of rats present in an area, ‘unit’ is the amount of food each rat consumes and each ith element of array ‘arr’ represents the amount of food 
present in ‘i+1’ house number, where 0 <= i
Note:
Return -1 if the array is null
Return 0 if the total amount of food from all houses is not sufficient for all the rats.
Computed values lie within the integer range.
Example:

Input:

r: 7
unit: 2
n: 8
arr: 2 8 3 5 7 4 1 2
Output:

4

Explanation:
Total amount of food required for all rats = r * unit

= 7 * 2 = 14.

The amount of food in 1st houses = 2+8+3+5 = 18. Since, amount of food in 1st 4 houses is sufficient for all the rats. Thus, output is 4.
 */

package Accenture_Problems;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("r:");
        int r = ip.nextInt();
        System.out.println("unit:");
        int unit = ip.nextInt();
        System.out.println("n:");
        int size= ip.nextInt();
        int[] array = new int[size];
        System.out.print("Enter the elements in Array:");
        for(int i=0; i<array.length; i++){
            array[i] = ip.nextInt();
        }
        //base case (do it in a method)
        // if(array == null){
        //     System.out.println("-1");
        // }
        int reqFood = r*unit;
        int sum =0;
        int count =0; 
        for(int i=0; i<array.length; i++){
            if(sum < reqFood ){
                sum += array[i];
                count++;
                System.out.println(sum);
            }
        }

        System.out.println("Count is : "+count);
        ip.close();


        }
    }
    

