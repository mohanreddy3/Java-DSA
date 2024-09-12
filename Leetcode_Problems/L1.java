//Best Time to Buy & Sell Stocks.
//find Max Profit
// ip = [7,1,5,3,6,4]
//op = 5
package Leetcode_Problems;

public class L1 {
    //method
    public static int maxProfit(int [] arr){
        int minPrice = Integer.MAX_VALUE;
        int MaxProfit = 0;
        for( int i=0; i<arr.length; i++){
            if(arr[i]< minPrice){
                minPrice = arr[i];
            }
            if(arr[i] - minPrice > MaxProfit ){
                MaxProfit = arr[i]- minPrice;
            }
        }
        return MaxProfit;
    }
    //main
    public static void main(String[] args) {
        int [] arr = { 7,1,5,3,6,4};
        System.out.println(maxProfit(arr));

    }
    
}
