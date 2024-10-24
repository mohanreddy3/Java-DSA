// Find the max frequency element present in the array. 
//ip: 1,2,3,4,5,4,3,2,3,3
// op : 3 
package TCS_NQT.Codes;
import java.util.*;
public class C1 {
    //method 1
    private static ArrayList<Integer> inputCommasSeperated(){
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner ip = new Scanner(System.in);
        String str = ip.nextLine();
        Scanner ss = new Scanner(str).useDelimiter(",");
        while(ss.hasNextInt()){
            arr.add(ss.nextInt());
        }
        ip.close();
        ss.close();
        return arr;   
    }

    //method 2
    private static void findMaxFreq(ArrayList<Integer> arr1){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr1){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num, 1);
            }
        }
        int maxFreq =0;
        int maxFreqElm = 0;
        for(HashMap.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > maxFreq){
                maxFreq = entry.getValue();
                maxFreqElm = entry.getKey();
            }
        }
        System.out.println(maxFreqElm);

    }
    //main
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = inputCommasSeperated(); // ip method called
        findMaxFreq(arr1);
    }
    
}
