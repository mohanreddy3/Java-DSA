//Find the median of the given array
package TCS_NQT.Arrays;

import java.util.Arrays;

public class a10 {
    //method
    static void medianOfArray(int[] arr, int n){
        Arrays.sort(arr);
        if(n%2 ==0){
            int index1 = (n / 2)-1;
            int index2 = (n / 2);
            System.out.println((double)(arr[index1]+arr[index2]) / 2);
        }
        else{
            System.out.println(arr[(n / 2)]);
        }
    }
    //main
  public static void main(String[] args) {
    int[] arr = {3,2,4,1,5};
    int[] arr1 = {1,2,3,4,5,6};
    int n= arr.length;
    int n1 = arr1.length;
    medianOfArray(arr, n);
    medianOfArray(arr1, n1);

  }


    
     
}
