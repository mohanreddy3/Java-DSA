package Placement_Class;
public class p2 {
    public static void main(String[] args) {
        int [] arr1 ={1,2,3,4};
        int [] arr2 = new int [3];
        //.arraycopy method
        System.arraycopy(arr1, 1, arr2, 0, 3);
        //loop
        for(int i :arr2){
            System.out.println(i);
        }
        // sort() method
        java.util.Arrays.sort(arr2);

    }
}
