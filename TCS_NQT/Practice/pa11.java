////Remove duplicates from a sorted array
package TCS_NQT.Practice;

// import java.util.Arrays;

public class pa11 {
    //method
    static int duplRemove(int[] arr, int n){
        // Arrays.sort(arr);
        int i=0; 
        for(int j=1; j<n; j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1; //returning index of array after removal.
    }
    //main
    public static void main(String[] args) {
        int [] arr ={1,2,2,11,11,22,33,33,33,44}; //must be a sorted array.
        int n = arr.length;
        int newIndex = duplRemove(arr, n);
        //printing array after removing duplicates.
        for(int i=0; i<newIndex; i++){
            System.out.print(arr[i] + " ");
        }

        
    }
    
}
