//Find the largest number in an array
package TCS_NQT.Arrays;

public class a2 {
    //main
    public static void main(String[] args) {
        int[] arr = {12,4,69,4};
        int largestNum = Integer.MIN_VALUE;
        for( int i=0; i<arr.length; i++){
            if(arr[i] > largestNum){
                largestNum = arr[i];
            }
        }
        System.out.println("Largest Element is : " + largestNum);
    }
    
}
