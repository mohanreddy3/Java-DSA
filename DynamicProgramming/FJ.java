//practice for Frog Jump (Energy efficient path)
package DynamicProgramming;

import java.util.Arrays;

public class FJ {
    //method
    private static int ansFunc(int ind, int[] arr, int[] dp){
        //base case
        if(ind == 0){
            return 0;
        }
        if(dp[ind] != -1){
            return dp[ind];
        }
        //declare two possible methods.
        int jumpOne;
        int jumpTwo = Integer.MAX_VALUE;
        jumpOne = ansFunc(ind-1, arr, dp) + Math.abs(arr[ind] - arr[ind-1]);
        if(ind > 1){
            jumpTwo = ansFunc(ind-2, arr, dp) + Math.abs(arr[ind] - arr[ind-2]);
        }

        return Math.min(jumpOne, jumpTwo);
    }
    //main
    public static void main(String[] args) {
        int[] arr = {30,10,60,10,60,50};
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        System.out.println(ansFunc(n-1, arr, dp));
    }

}
