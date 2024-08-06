package Sorting;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] array = {4 ,3 ,2, 1};
        //Insertion sort
        for(int i =0; i<array.length; i++){
            int j=i;
            //inner loop
            while( j>0 && array[j-1]>array[j]){
                //swap (a[j-1] , a[j])
                int temp = array[j-1];
                array[j-1] = array[j];
                array[j] = temp;
                j--;
            }
        }
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        
    }
}
