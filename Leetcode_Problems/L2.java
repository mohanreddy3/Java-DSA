//Max sum in a SubArray (Brute Force Approach)-> hell nahh !
package Leetcode_Problems;

public class L2 {
    //method
    static int maxSumSubarray(int [] arr){
        
        int maxSum=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum =0;
                for(int k=i; k<j; k++){
                    sum = sum + arr[k];
                    maxSum = Math.max(sum , maxSum);
                }
                
            } 
        }
        return maxSum;
    }
    //main
    public static void main(String[] args){
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4}; 
        // int [] arr1 = {5,4,-1,7,8};
        System.out.println(maxSumSubarray(arr));


    }
    
}
