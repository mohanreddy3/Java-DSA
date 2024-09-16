//Apna Clg
//Union of 2 Arrays
// arr1 ={1,2,3};
// arr2 = {4,2,5,6,1,7};
// no of elements after union -> 7 {1,2,3,4,5,6,7}
package HashMap;

import java.util.HashSet;

public class h4 {
    //method
    static int unionArray(int[] arr1 , int[] arr2){
        //declare HashSet (Stores only unique values)
        HashSet<Integer> set = new HashSet<>();
        // for array1
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        //for array2
        for( int i=0; i<arr2.length; i++){
            set.add(arr2[i]);
        }
        return set.size();
    }
    //main
    public static void main(String[] args){
        int[] arr1 ={1,2,3};
        int[] arr2 = {4,2,5,6,1,7};
        System.out.println(unionArray(arr1, arr2));
    }
    
}
