package DynamicProgramming.Practice;

public class KnapSackMem {
    //main
    public static void main(String[] args) {
        int[] val = {15,14,10,45,30};
        int[] wt = {2,5,1,3,4};
        int W = 7;
        int[][] dp = new int[val.length][W+1];
        //intialize the dp array to -1.
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp.length; j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(knapSackMem(val, wt, W, val.length, dp));   
    }

    //method
    private static int knapSackMem(int[]val, int[]wt, int W, int n, int[][] dp){
        //base case
        if(W == 0 || n == 0){
            return 0;
        }
        //check whether you have calculated ans it already or not
        if(dp[n][W] != -1){
            return dp[n][W];
        }
        //check for valid 
        if(wt[n-1]<=W){
            //choice 1 -> Include
            int ans1 = val[n-1]+knapSackMem(val, wt, W-wt[n-1], n-1, dp);
            //choice 2 -> Exclude
            int ans2 = knapSackMem(val, wt, W, n-1, dp);
            //store it in DP array
            dp[n][W] = Math.max(ans1, ans2);
            return  dp[n][W];
        }
        else{
            //exclude -> pehle stor karlo then return maro.
            dp[n][W] = knapSackMem(val, wt, W, n+1, dp);
            return dp[n][W];
        }


    }
    
}
