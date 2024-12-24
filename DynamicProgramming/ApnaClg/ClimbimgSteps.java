//Climbing Stairs:
// A person can travel either 1 or 2 Steps at-a-time.
package DynamicProgramming.ApnaClg;

import java.util.Arrays;

public class ClimbimgSteps {
    //main
    public static void main(String[] args) {
        int n=5; // 5th step
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(countSteps(n, dp));
        System.out.println(countWays(n));

    }
    //method 1 -> (memoization) to calculate no of ways to reach Nth stair (Top Down Approach)
    private static int countSteps(int n , int[] dp){
        if( n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        if(dp[n] != -1){ // it is already calculated
            return dp[n];
        }
         dp[n] = countSteps(n-1, dp) + countSteps(n-2, dp);

         return dp[n];

    }
    //method 2 (Tabulation) -> Bottom Up Approach
    private static int countWays(int n){
        int[] dp = new int[n+1];
        dp[0] = 1;
        for(int i=1;i<=n; i++){
            if(i == 1){
                dp[i] = dp[i-1] + 0;
            }
            else{
                dp[i] = dp[i-1]+dp[i-2];
            }
            
        }
        return dp[n];
    }
    
}
