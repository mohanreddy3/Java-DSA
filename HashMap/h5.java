//Apna clg
//Intersection of two arrays
// arr1 ={1,2,3};
// arr2 ={4,5,3,2,6,3};
// no of common unique elements -> 2.
package HashMap;

import java.util.HashSet;

public class h5 {
    //method
    static int interArray(int[] arr1, int[] arr2){
        //step-1
        int count =0;
        HashSet<Integer> set =new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int j=0; j<arr2.length; j++){
            //match -> remove element from set & increase count.
            if(set.contains(arr2[j])){
                count++;
                set.remove(arr2[j]);
            }
        }
        return count;
    }
    //main
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 ={4,5,3,2,6,3};
        System.out.println(interArray(arr1, arr2));

    }
    
}
