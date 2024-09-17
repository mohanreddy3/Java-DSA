// Given two integer arrays nums1 and nums2, return an array of their intersection
// Each element in the result must be unique and you may return the result in any order.
// Example 1:
// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2]
// Example 2:
// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [9,4]
// Explanation: [4,9] is also accepted.
//LeetCode 349 (Intersection of 2 Arrays)

package HashMap;

import java.util.Arrays;
import java.util.HashSet;

public class l5 {
    //method
    static int[] intersectionArray(int[] arr1 , int[] arr2){
        //step-1
        HashSet<Integer> set = new HashSet<>();
        //store elements of arr1 in set.
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        //create a result HashSet and store the Intersection(common unique elements) in that.
        HashSet<Integer> resultSet = new HashSet<>();
        // compare arr2
        for(int j=0; j<arr2.length; j++){
            if(set.contains(arr2[j])){
                resultSet.add(arr2[j]);
            }
        }
        //convert HashSet into Array (Imp)
        int [] resultArray = new int[resultSet.size()];
        int index =0;
        //adv loop
        for(int Elmnt : resultSet){
            resultArray[index++] = Elmnt;
        }
        return resultArray;
    }
    //main
    public static void main(String[] args){
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] finalResultArray = intersectionArray(arr1, arr2); //to get result from a function which returns an Array.
        int[] fArray = intersectionArray(nums1, nums2);
        System.out.println(Arrays.toString(finalResultArray));
        System.out.println(Arrays.toString(fArray));
        // for( int num : finalResultArray){
        //     System.out.print(num + " ");
        // }

    }
    
}
