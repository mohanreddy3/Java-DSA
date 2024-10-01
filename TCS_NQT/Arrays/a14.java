//Find all repeating elements in an array
// Input: 
// Arr[] = [1,1,2,3,4,4,5,2]
// Output:
//  1,2,4
/*
 * Time Complexity: O(N)
Reason: Entire array is traversed to insert them in the map.
Space Complexity: O(N)
Reason: Map is used to store the count of each element.
 */
package TCS_NQT.Arrays;

import java.util.HashMap;

public class a14 {
    //method
    static void repeatingElem(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for( int i : arr){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }
        }
        //HashMap Entry() method -> printing the map 
        System.out.println("Repeating elements are: ");
        for(HashMap.Entry<Integer,Integer> entry : map.entrySet()){ //entryset() [imp]
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() + " ");
            }
        }

    }
    //main
    public static void main(String[] args) {
        int [] arr = {1,1,2,3,4,4,5,2};
        repeatingElem(arr);

    }

    
}
