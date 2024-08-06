//Rversing an Array using Functional Recursion.
package Recursion;

public class R8 {
    //main
    public static void main(String[] args) {
    int array [] = { 1,2,3,4,5,6};
     reverseArray(0,array);
     //printing the array
     for(int i=0; i< array.length; i++){
        System.out.print(array[i] + " ");
     }
    }

    //Function
    public static void reverseArray(int i, int array[]){
        int n = array.length;
        if ( i >= n/2){
            return;
        }
        else{
            int temp = array[i];
            array[i] = array[n-i-1];
             array[n-i-1] = temp ;
            reverseArray(i+1,array);
            

        }
    }
    
}
