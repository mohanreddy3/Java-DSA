// Problem Statement: Given an array Arr[] of integers, rearrange the numbers of the given array into the lexicographically next greater permutation of numbers.
// If such an arrangement is not possible, it must rearrange to the lowest possible order (i.e., sorted in ascending order).
/*
 * Input format:
 Arr[] = {1,3,2}
Output
: Arr[] = {2,1,3}

Input format:
 Arr[] = {3,2,1}
Output: 
Arr[] = {1,2,3}
 */
package Striver_SDE;
import java.util.*; 

public class Sd2 {
    //method
    private static List<Integer> nextPermutation(List<Integer> list){
        int n = list.size();
        int index = -1;
        //find the break point.
        for(int i=n-2; i>0; i--){
            if(list.get(i) < list.get(i+1)){
                index = i;
                break;
            }
        }
        //if the index is -1 -> greatest permutation
        if(index == -1){
            Collections.reverse(list);
            return list;
        }
        // find  smallest num which is greater than the value at index. & swap it
        for(int i=n-1; i >index; i--){
            if(list.get(i) > list.get(index)){
                int temp = list.get(i);
                list.set(i,list.get(index));
                list.set(index, temp);
                break;

            }
        }
        //now reverse the subList from index+1 to n.
        List<Integer> subList = list.subList(index+1 , n);
        Collections.reverse(subList);
        return list;
    }
    //main
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(new Integer[] {2, 1, 5, 4, 3, 0, 0});
        List<Integer> result = nextPermutation(list);
        for(int num : result){
            System.out.print(num + " ");
        }
    }
    
}
