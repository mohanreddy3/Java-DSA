package DynamicProgramming.ApnaClg;

public class KanpSackTabulation {

    //main
    public static void main(String[] args) {
        int[] val = {15,14,10,45,30};
        int[] wt = {2,5,1,3,4};
        int W = 7;
        
        //method calling
        System.out.println(knapSackTabulation(val, wt, W));
    }

    //method
    private static int knapSackTabulation(int[] val , int[] wt, int W){
        int n = val.length;
        //create a 2D array (since 2 variables are changing here)
        int[][] dp = new int[n+1][W+1];
        //Base Cases
        //filling 0th Col -> 0
        for(int i=0; i<n+1; i++){
            dp[i][0] = 0;
        }
        //fill 0th row -> 0
        for(int j=0; j<W+1; j++){
            dp[0][j] = 0;
        }
        //Logic for Tabular approach
        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                int v = val[i-1]; //ith item value
                int w = wt[i-1]; //ith item weight
                //valid condition
                if(w <= j){
                    //include
                    int incProfit = v + dp[i-1][j-w];
                    //exclude
                    int excProfit = dp[i-1][j];

                    dp[i][j] = Math.max(incProfit, excProfit);
                }
                else{
                    //invalid condition
                    //exclude
                    int excProfit = dp[i-1][j];
                    dp[i][j] = excProfit;
                }
            }
        }

        return dp[n][W];

    }
    
}
