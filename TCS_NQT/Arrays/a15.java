//Find all non-repeating elements in an array.
/*
 * Complexity:
 * Time : O(N)
 * Space: O(N)
 */
package TCS_NQT.Arrays;

import java.util.HashMap;

public class a15 {
    //method
    static void nonRepeatElm(int[] arr , int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }
        }
        //Printing non-repeating elements
        //Using Entry(), entrySet()
        System.out.println("Non Repeated Elements are: ");
        for(HashMap.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()== 1){
                System.out.print(entry.getKey() + " ");
            }
        }
    }
    //main
    public static void main(String[] args) {
        int [] arr ={1,1,2,3,2,4,5,5,6};
        int n = arr.length;
        nonRepeatElm(arr, n);
    }
    
}
