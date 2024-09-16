//Apna Clg
//Majority Element
//Given an integer array og size n , find all the elements that appear more than n/3 times
//ex: arr[] = { 1,3,2,5,1,3,1,5,1}
// output : 1
package HashMap;

import java.util.HashMap;

public class h3 {
    //method
    static void majorityElement(int [] arr){
        //here   -> (key-element , value-freq)
        //step -1
        HashMap<Integer, Integer> map = new HashMap<>();
        //step -2
        int n = arr.length;
        for(int i=0; i<n; i++){
            //if key already exists in hashTable
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1); //(key , value/freq)
            }
            // if key doesn't exist
            else{
                map.put(arr[i], 1);
            }
            //adv for loop
            for(int key : map.keySet()){
               if(map.get(key) > n/3){
                System.out.println("Majority element is "+key);
               }
            }
        
        }
        
    }
    //main()
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,1,3,1,5,1};
        majorityElement(arr);
    }   
}
