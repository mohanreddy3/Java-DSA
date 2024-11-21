//Count frequency of each element in an array
package TCS_NQT.Arrays;

import java.util.HashMap;

public class a5 {
    //method
    static void countFreq(int[] arr){
        HashMap <Integer,Integer> freqMap = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(freqMap.containsKey(arr[i])){
                freqMap.put(arr[i], freqMap.get(arr[i])+1);
            }
            else{
                freqMap.put(arr[i], 1);
            }
        }

        //printing the frequency of each element
        //using some cool HashMap methodology
        //New to Mohan!
        System.out.println("Frequency of Elements:");      
        for(HashMap.Entry<Integer,Integer> entry : freqMap.entrySet()){
            System.out.println(entry.getKey() + "|" + entry.getValue());
        } 
        //or you can do this too..
        System.out.println(freqMap);
        
    }
    //main
    public static void main(String[] args) {
        int[] arr = {10,12,10,11,13,14,13,10};
        countFreq(arr);
    }
}


























//first try!
// //method
// static void freqOfElmnt(int[] arr){
//     HashMap<Integer,Integer>  freqMap = new HashMap<>();
//     for( int i=0; i<arr.length; i++){
//         if(freqMap.containsKey(arr[i])){
//             freqMap.put(arr[i], freqMap.get(arr[i])+1);

//         }
//         else{
//             freqMap.put(arr[i], 1);
//         }
//     }
//     // New to Mohan!
//     //printing the frequency of each elemets
//     //using Hashmap special methodoligies.
//     System.out.println("Element Frequencies: ");
//    for( HashMap.Entry <Integer,Integer> entry : freqMap.entrySet() ){
//     System.out.println(entry.getKey() + " | " + entry.getValue());
//    }


    
// }
// //main
// public static void main(String[] args) {
//     int[] arr= {1,2,3,4,2,4,6};
//     freqOfElmnt(arr);

// }
