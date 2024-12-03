/*
 *  Find the Duplicates in an Array:
 Problem: Find duplicates in a given array of integers.
 Input:
 Array: [4, 3, 2, 7, 8, 2, 3, 1]
 Output:
 Duplicates: 2, 3
 */
package CapgeminiQues;

import java.util.HashMap;

public class Cp12 {
    //method
    private static void findDuplicates(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int num = arr[i];
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num, 1);
            }
        }
        //use Entry Set
        for(HashMap.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 2){
                System.out.print(entry.getKey()+" ");
            }

        }

    }
    //main
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        findDuplicates(arr);
    }
    
}
