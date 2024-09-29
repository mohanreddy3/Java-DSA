// left rotate an array by one place (Foundation to solve a8 problem in this package)
// Time Complexity - O(n) , Space - O(1);
package TCS_NQT.Arrays;

import java.util.Arrays;

public class s8 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        int n = arr.length;
        int temp = arr[0];
        for( int i=1; i<n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        System.out.println(Arrays.toString(arr));
    }
    
}
