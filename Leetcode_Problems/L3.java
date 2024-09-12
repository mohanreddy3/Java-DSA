//Finding the Subarray which has highest sum -> Follow up ques for L22.java
package Leetcode_Problems;

public class L3 {
    //method
    static void displaySubArray(int [] arr){
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int start =0;
        int ansStart = -1;
        int ansEnd = -1;

        for( int i=0; i< arr.length; i++){
            if( i==0 ){
                start = i;
            }
            sum = sum + arr[i];
            if(sum > maxSum){
                maxSum = sum;
                ansStart = start;
                ansEnd =i;

            }
            if(sum < 0){
                sum = 0;
            }
        }
        System.out.print("Sub Array is :");
        for(int j =ansStart; j<ansEnd; j++){
            System.out.print(arr[j] +  " ");
        }
        System.out.println();
        System.out.println( "Max Sum is " + maxSum);
    }
    //main
    public static void main(String[] args){
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        displaySubArray(arr);

    }

    
}
