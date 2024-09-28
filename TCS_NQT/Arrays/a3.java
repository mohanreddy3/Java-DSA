//Second Smallest and Second Largest element in an array
package TCS_NQT.Arrays;

public class a3 {
    //method 1
    static int secLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int SecLargest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                SecLargest = largest;
                largest = arr[i];
            }
            else if( arr[i] > SecLargest && arr[i] != largest){
                SecLargest = arr[i];
            }
        }
        return SecLargest;
    }

    //method 2
    static int secSamllest(int[] arr){
        int smallest = Integer.MAX_VALUE;
        int SecSmallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < smallest){
                SecSmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] < SecSmallest && arr[i] != smallest){
                SecSmallest = arr[i];
            }
        }
        return SecSmallest;

    }
    //main
    public static void main(String[] args) {
        int[] arr = {12, 13, 14, 15, 98};
        System.out.println("Second Largest Element is: "+secLargest(arr));
        System.out.println("Second Smallest Element is: "+ secSamllest(arr));
        
    }
    
}
