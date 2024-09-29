//Calculate sum of the elements of the array
package TCS_NQT.Arrays;

public class a7 {
    //method
    static int sumOfElmn(int [] arr){
        int sum =0;
        for(int i=0; i<arr.length; i++){
            sum = sum+arr[i];
        }
        return sum;
    }
    //main
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        System.out.println(sumOfElmn(arr));
    }
    
}
