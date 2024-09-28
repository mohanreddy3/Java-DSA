/*
 * Implement the following Function

def ProductSmallestPair(sum, arr)

The function accepts an integers sum and an integer array arr of size n.
 Implement the function to find the pair, (arr[j], arr[k]) where j!=k, 
 Such that arr[j] and arr[k] are the least two elements of array (arr[j] + arr[k] <= sum) 
 and return the product of element of this pair

NOTE

Return -1 if array is empty or if n<2
Return 0, if no such pairs found
All computed values lie within integer range
Example

Input

sum:9

size of Arr = 7

Arr:5 2 4 3 9 7 1

Output

2

Explanation

Pair of least two element is (2, 1) 2 + 1 = 3 < 9, 
Product of (2, 1) 2*1 = 2. Thus, output is 2

Sample Input

sum:4

size of Arr = 6

Arr:9 8 3 -7 3 9

Sample Output

-21
 */
package Accenture_Problems;

import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Sum:");
        int sum = ip.nextInt();
        System.out.println("Size:");
        int size = ip.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements:");
        for(int i=0; i<size; i++){
            arr[i] = ip.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;
        for(int i=0; i<size; i++){
            if(min > arr[i]){
                secMin = min;
                min = arr[i];
            }
            else if( arr[i] < secMin && arr[i] != secMin){
                 secMin = arr[i];
            }
            
        }
        System.out.println("Smallest: "+min);
        System.out.println("Second Smallest: "+secMin);
        if(min+secMin <= sum){
            System.out.println("Product of the pair is: " + min*secMin);
        }
        ip.close();

        
    }
    
}
