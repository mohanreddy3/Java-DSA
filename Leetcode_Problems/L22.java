//max sum in a subarray (Kadens Method) -> (LeetCode pblm :  53)
package Leetcode_Problems;

public class L22 {
    //method
    static int maxSubarrySum(int[] arr){
        int maxSum =Integer.MIN_VALUE;
        int sum =0;
        for(int i=0; i<arr.length; i++){
            sum = sum+arr[i];
            if(sum > maxSum){
                maxSum = sum;
            }
            if(sum < 0){
                sum =0;
            }
        }
        return maxSum;
    }
    //main
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.print(maxSubarrySum(arr));

    }
    
}
