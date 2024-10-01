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
package TCS_NQT.Practice;

import java.util.HashMap;

public class pa14 {
    //method
    static  void repeatingElem(int[] arr){
      HashMap <Integer,Integer> map = new HashMap<>();
      for( int i=0; i<arr.length; i++){
        if(map.containsKey(arr[i])){
            map.put(arr[i], map.get(arr[i])+1);
        }else{
            map.put(arr[i], 1);
        }
      }
      //printing Repeated elements using Entry() in HashMap.
      System.out.println("Repeated Elements are: ");
      for(HashMap.Entry<Integer, Integer> entry : map.entrySet()){
        if(entry.getValue()>1){
            System.out.println(entry.getKey() + " ");
        }
      }
    }
    //main
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4,5,2};
        repeatingElem(arr);

    }
    

    
}
