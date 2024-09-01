//removing duplicates from a sorted array
package Practice_Dsa_Pblms;

public class p4 {
    //function 
    public static int eliminateDuplicate(int arr[], int size){
        int i=0;
        for(int j=1; j<size; j++){
        if(arr[j] != arr[i]){
            arr[i+1] = arr[j];
            i++;
        }                                   
        }
        return i+1;
    }
    //main
    public static void main(String[] args) {
        int arr[] = { 1,2,2,4,5,5};
        int size = arr.length;
        int result = eliminateDuplicate(arr, size);
        System.out.println("Index " + result);
        for(int j=0; j<result; j++){
            System.out.print(arr[j] + " ");
        }

    }
}
