//Apna Clg
//Union of 2 Arrays
// arr1 ={1,2,3};
// arr2 = {4,2,5,6,1,7};
// no of elements after union -> 7 {1,2,3,4,5,6,7}

package HashMap;

// import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class ph4 {
    static int unionOfArray(int [] arr1, int[] arr2){
        
        HashSet <Integer> set = new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int j=0; j<arr2.length; j++){
            set.add(arr2[j]);
        }
        return set.size();

    }
    //main()
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter size of 1st array: ");
        int size1 = ip.nextInt();
        int[] arr1 = new int[size1];
        System.out.print("Enter elements in 1st array:");
        for(int i=0; i<size1; i++){
            arr1[i] = ip.nextInt();
        }
        System.out.println("Enter size of 2nd array:");
        int size2 = ip.nextInt();
        int[] arr2 = new int[size2];
        System.out.print("Enter the elements in 2nd array:");
        for(int i=0; i<size2; i++){
            arr2[i]= ip.nextInt();
        }
        System.out.println(unionOfArray(arr1, arr2));
        ip.close();

        
    }
    
}
//Output:
// Enter size of 1st array: 
// 3
// Enter elements in 1st array:1 2 3
// Enter size of 2nd array:
// 6
// Enter the elements in 2nd array:4 2 5 6 1 7
// 7
