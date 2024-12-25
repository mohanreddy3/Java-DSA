
// Basic Recursion Code

package DynamicProgramming.ApnaClg;

public class KnapSack {
    //main
    public static void main(String[] args) {
        int[] val = {15,14,10,45,30};
        int[] wt = {2,5,1,3,4};
        int W = 7;
        System.out.println(knapSack(val, wt, W, val.length));
    }
    //method
    private static int knapSack(int[]val, int[]wt, int W, int n){
        //base case
        if(W == 0 || n == 0){
            return 0;
        }
        if(wt[n-1] <= W){
            //valid
            int ans1 = val[n-1] + knapSack(val, wt, W-wt[n-1], n-1);
            //invalid
            int ans2 = knapSack(val, wt, W, n-1);
            return Math.max(ans1, ans2);
        }
        else{
            return knapSack(val, wt, W, n-1);
        }
    }
}
