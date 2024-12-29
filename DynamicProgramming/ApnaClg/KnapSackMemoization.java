package DynamicProgramming.ApnaClg;

public class KnapSackMemoization {

    //main
    public static void main(String[] args) {
        int[] val = {15,14,10,45,30};
        int[] wt = {2,5,1,3,4};
        int W = 7;
        int[][] dp = new int[val.length+1][W+1];
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j] = -1;
            }
        } 
        System.out.println(knapSackMemoization(val, wt, W , val.length, dp));
    }

    //method
    private static int knapSackMemoization(int[] val, int[] wt, int W, int n, int[][] dp){
       
        //base case
        if(W == 0 || n == 0){
            return 0;
        }
        if (dp[n][W] != -1){ //already calculated
            return dp[n][W];
        }
        if(wt[n-1]<=W){ //valid
            //include
            int ans1 = val[n-1] + knapSackMemoization(val, wt, W-wt[n-1], n-1, dp);
           //exclude
           int ans2 =  knapSackMemoization(val, wt, W, n-1, dp);

           dp[n][W] = Math.max(ans1, ans2);

           return dp[n][W];   
        }else{
            dp[n][W] =  knapSackMemoization(val, wt, W, n-1, dp);
            return dp[n][W];
        }
    }
    
}
