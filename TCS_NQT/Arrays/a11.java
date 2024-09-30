//Remove duplicates from a sorted array
package TCS_NQT.Arrays;

// import java.util.Arrays;

public class a11 {
    //method
    static int removeDup(int[] arr , int n){ //returning index after removing duplicates
            int i=0;
            for(int j=1; j<n; j++){
                if(arr[i]!=arr[j]){
                    i++;
                    arr[i]=arr[j];   
                }
            }
            return i+1;
            // System.out.println(Arrays.toString(arr));
    }

    //main
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,3};
        int n= arr.length;
        int index = (removeDup(arr, n));
        for( int i=0; i<index; i++){
            System.out.print(arr[i] + " ");
        }

    }
    
}
