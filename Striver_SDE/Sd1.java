//Problem Statement: Given an array consisting of only 0s, 1s, and 2s. 
// Write a program to in-place sort the array without using inbuilt sort functions.
// ( Expected: Single pass-O(N) and constant space)
//Input:
//  nums = [2,0,2,1,1,0]
//Output:
//  [0,0,1,1,2,2]

//Solution:
// Dutch National flag algorithm.
// Rules: 1) arr[0…low-1] contains 0. [Extreme left part]
//        2) arr[low…mid-1] contains 1.
//        3) arr[high+1…n-1] contains 2. [Extreme right part], n = size of the array
 
package Striver_SDE;

import java.util.ArrayList;
import java.util.Arrays;

public class Sd1 {
    //method
    private static void sortArray(ArrayList<Integer> arr1 , int n){
        // 3 pointers
        int low=0 , mid=0, high= n-1; 

        while(mid <= high){
            // if value is 0
            if(arr1.get(mid) == 0){
                //swap low & mid -> increment low & mid.
                int temp = arr1.get(low);
                arr1.set(low , arr1.get(mid));
                arr1.set(mid, temp);
                low++;
                mid++;
            }
            //if value is 1 -> increment mid.
            if(arr1.get(mid)== 1){
                mid++;
            }
            //if value is 2 -> decrement high.
            if(arr1.get(mid)==2){
                //swap mid & high
                int temp = arr1.get(mid);
                arr1.set(mid, arr1.get(high));
                arr1.set(high, temp);
                high--;
            }
        }
    }
    //main
    public static void main(String[] args) {
        // Scanner ip = new Scanner(System.in);
        int n = 9;
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(new Integer[] {0,1,2,2,1,0,2,0,1}));
        sortArray(arr1 , n);
        // System.out.println(Arrays.toString(arr1));
        for(int i=0; i<n; i++){
            System.out.print(arr1.get(i) + " ");
        }
        
    }
    
}
