// To find Fibbonaci Num Using DP (Lec -1)

package DynamicProgramming.ApnaClg;

public class Fibbonaci {
    //main
    public static void main(String[] args) {
        int n = 3;
        int[] dp = new int[n+1];
        System.out.println(fibDp(n, dp));
    }
    //method -> to find fibo num in given position (Using Dp)
    private static int fibDp(int n, int[] dp){
        if(n == 0 || n == 1){
            return n;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        dp[n] = fibDp(n-1, dp) + fibDp(n-2, dp);
        return dp[n];
    }

}
