/*
 * Find all Symmetric Pairs in the array of pairs
 * Input: (1,2),(2,1),(3,4),(4,5),(5,4)
   Output: (2,1) (5,4)
 */

package TCS_NQT.Practice;

import java.util.HashMap;

public class pa16 {
    //method
    static void SymmPairs(int[][] arr , int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<n;i++){
            int first = arr[i][0];
            int second = arr[i][1];
            if(map.get(second) != null && map.get(second) == first){
                System.out.println(first + "," + second);
            }else{
                map.put(first, second);
            }

        }
    }
    //main
    public static void main(String[] args) {
        int arr [][] ={{1,2}, {2,1},{3,4},{4,5},{5,4}};
        int n = arr.length;
        SymmPairs(arr, n);
    }
    
}
