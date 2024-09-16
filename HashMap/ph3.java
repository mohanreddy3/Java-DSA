//Apna Clg
//Majority Element
//Given an integer array og size n , find all the elements that appear more than n/2 times
//ex: arr[] = { 1,3,2,5,1,3,1,5,1}
// output : 1

package HashMap;

import java.util.HashMap;

public class ph3 {
    //method
    static void majElement(int [] arr){
        //here (key-Element, value-Freq)
        //step-1
        HashMap <Integer,Integer> map = new HashMap<>();
        //step-2
        int n = arr.length;
        for(int i=0; i<n; i++){
            //if key already exists
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            //if key doesn't exit
            else{
                map.put(arr[i] ,1);
            }
        }
        //checking freq condition
        //adv for loop
        // int result =0;
        for( int key : map.keySet()){
            if(map.get(key) > n/3){
                    // result = key; 
                    System.out.println(key);    
            }
        }    
      
    // return result; 
    }
    //main
    public static void main(String[] args){
        int [] arr = {1,3,2,5,1,3,1,5,1};
        int [] arr1 = {1,2};
        majElement(arr);
        majElement(arr1);

    }
    
}
