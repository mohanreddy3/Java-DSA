//Average of all elements in an array
package TCS_NQT.Arrays;

public class a9 {
    //method
    static int avgOfElm(int[] arr, int n){
        int sumOfElm = 0;
        for(int i=0; i<n; i++){
            sumOfElm += arr[i];
        }
        //avg
        int avg = sumOfElm / n;
        return avg;
    }
    //main
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        int n= arr.length;
        System.out.println("Avg is : "+avgOfElm(arr, n));
    }
    
}
