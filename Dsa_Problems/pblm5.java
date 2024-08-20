//Left rotate an Array by one place. 
package Dsa_Problems;

public class pblm5 {
    //Function
    public static int leftRotate(int arr[], int size){
        int temp = arr[0];
        for(int i=1; i<size; i++){
            arr[i-1] = arr[i];
        }
        arr[size-1]= temp;
        return 0;
    }
    //main
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        int size = arr.length;
        int result = leftRotate(arr, size);
        System.out.println(result);
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
