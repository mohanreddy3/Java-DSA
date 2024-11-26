//Same problem but using Tabulation Format
package DynamicProgramming;

import java.util.Arrays;

public class JumpingFrog {
    //main
    public static void main(String[] args) {
        int[] arr = {30,10,60,10,60,50};
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        dp[0] =0;
        for(int ind=1; ind<n; ind++){
            int jumpTwo = Integer.MAX_VALUE;
            int JumpOne = dp[ind-1]+ Math.abs(arr[ind] - arr[ind-1]);
            if(ind > 1){
                jumpTwo = dp[ind-2] + Math.abs(arr[ind] - arr[ind-2]);
            }
            dp[ind] = Math.min(jumpTwo, JumpOne);
        }
        System.out.println(dp[n-1]);
        
    }
    
}
