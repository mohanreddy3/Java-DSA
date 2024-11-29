/*
 * Problem Statement – 4
You’re given an array of integers, print the number of times each integer has occurred in the array.
Example
Input :
10
1 2 3 3 4 1 4 5 1 2

Output :
1 occurs 3 times
2 occurs 2 times
3 occurs 2 times
4 occurs 2 times
5 occurs 1 times
 */
package CapgeminiQues;

import java.util.HashMap;
import java.util.Scanner;

public class C4 {
    //method
    private static void freqOfNum(int [] arr , int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        // System.out.println(map); -> classic op
        //using Entry Set.
        for(HashMap.Entry<Integer, Integer> entry : map.entrySet() ){
            System.out.println(entry.getKey() +" occurs "+ entry.getValue() + " times ");
        }
    }
    //main
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int size = ip.nextInt();
        int[] arr = new int[size];
        //input
        for(int i=0; i<size; i++){
            arr[i] = ip.nextInt();
        }
        freqOfNum(arr, size);
        ip.close();
    }
    
}
