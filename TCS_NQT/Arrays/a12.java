//Remove duplicates from unsorted array (HashMap)
package TCS_NQT.Arrays;

import java.util.HashMap;

public class a12 {
    static void removeDupl(int[] arr){
        int n= arr.length;
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if(!map.containsKey(arr[i])){ //if not true.
                System.out.print(arr[i] + " ");
                map.put(arr[i], 1);
            }
        }
    }
    //main
    public static void main(String[] args) {
        int[] arr ={ 4, 3, 9, 2, 8, 4, 1, 10, 8, 34};
        removeDupl(arr);

    }
   
    
}
