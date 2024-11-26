/* Refer Mohan's notes for more detailed Explanaton.
 * Problem Statement:

Given a number of stairs and a frog, the frog wants to climb from the 0th stair to the (N-1)th stair. 
At a time the frog can climb either one or two steps. A height[N] array is also given.
 Whenever the frog jumps from a stair i to stair j, the energy consumed in the jump is abs(height[i]- height[j]), 
 where abs() means the absolute difference.
 We need to return the minimum energy that can be used by the frog to jump from stair 0 to stair N-1.
 input: arr = [30,10,60,10,60,50]
 op : 40
 */
package DynamicProgramming;

import java.util.Arrays;

public class FrogJump {
    //private
    private static int resFunction(int ind, int[] arr, int[] dp){
        int jumpOne;
        int jumpTwo = Integer.MAX_VALUE;
        if( ind == 0){
            return 0;
        }
        if(dp[ind] != -1){
            return dp[ind];
        }
        jumpOne = resFunction(ind-1, arr, dp)+ Math.abs(arr[ind] - arr[ind-1]);
        if(ind > 1){
            jumpTwo = resFunction(ind-2, arr, dp) + Math.abs(arr[ind] - arr[ind-2]);
        }

        return Math.min(jumpOne, jumpTwo);

    }
    //main
    public static void main(String[] args) {
        int[] arr ={30,10,60,10,60,50};
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        System.out.println(resFunction(n-1, arr, dp));
        
    }
    
}
