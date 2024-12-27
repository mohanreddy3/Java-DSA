package DynamicProgramming.Practice;

public class KnapSackTab {
    //main
    public static void main(String[] args) {
        int[] val = {15,14,10,45,30};
        int[] wt = {2,5,1,3,4};
        int W = 7;
        System.out.println(knapSackTab(val, wt, W));
    }
    //method -> Tabluation Method
    private static int knapSackTab(int[] val , int[] wt, int W){
        int n = val.length;
        //intialize the Dp 2D array (Since two variables are changing)
        int[][] dp = new int[n+1][W+1];
        // Base Cases
        //fill 0th col -> 0
        for(int i=0; i<dp.length; i++){
            dp[i][0] = 0;
        }
        //fill 0th row -> 0
        for(int j=0; j<dp[0].length; j++){
            dp[0][j] = 0;
        }
        //Logic for Tabulation Approach
        for(int i=1; i<n+1; i++){
            for(int j=1; j<W+1; j++){
                int v = val[i-1]; // ith item value
                int w = wt[i-1];  // ith item weight
                //valid condition
                if(w <= j){
                    //include
                    int incProfit = v + dp[i-1][j-w];
                    //exclude
                    int excProfit = dp[i-1][j];

                    dp[i][j] = Math.max(incProfit, excProfit);
                }
                else{ // invalid condition
                    //exclude
                    int excProfit = dp[i-1][j];
                    dp[i][j] = excProfit;
                }   
            }
        }

        return dp[n][W];
    }

    
}
