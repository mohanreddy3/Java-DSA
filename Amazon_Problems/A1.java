/*
 * input: 10
 * array: [10,3,5,7,2,8,9,6,1,4]
 * target : 7
 * output: 3
 */


package Amazon_Problems;
import java.util.*;
public class A1 {
    //method
    private static void sumOfDistinctPair(int n, int[] array, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        int count =0;
        for(int i=0; i<n; i++){
            if(map.containsKey(target - array[i]));
        }
        
    }









    //main
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        // int size = ip.nextInt();
        int[] array = {10,3,5,7,2,8,9,6,1,4};
        int n = array.length;
        int target = 7;
        sumOfDistinctPair(n , array, target);

    }
}
