package Sorting;

public class S1 {
    public static void main(String[] args) {
        //SELECTION SORT --> TC : O(n2)
        int array[] = {9,8,7,6,5,4,3,2,1,0};
        for(int i=0; i<array.length; i++){
            int smallest = i;
            for(int j=i; j<array.length; j++){
                if(array[smallest]>array[j]){
                    smallest =j;
                }
            }
            //swap
            int temp = array[smallest];
            array[smallest] = array[i];
            array[i]= temp;
            //printing the output
            System.out.print(array[i] + " ");
        }
    }
}
