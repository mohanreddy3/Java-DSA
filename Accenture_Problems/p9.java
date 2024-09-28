//max Product in sub Array.
package Accenture_Problems;

public class p9 {
    //method
    static int maxSubarrySum(int[] arr){
        int maxProduct =Integer.MIN_VALUE;
        int prodcut =1;
        for(int i=0; i<arr.length; i++){
            prodcut = prodcut * arr[i];
            if(prodcut > maxProduct){
                maxProduct = prodcut;
            }
            // if(prodcut < 0){
            //     prodcut=1;
            // }
        }
        return maxProduct;
    }
    //main
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.print(maxSubarrySum(arr));

    }
    
}
