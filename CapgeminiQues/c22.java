//Same as C2
// Input 1:
// aabbbbeeeeffggg
// Output:
// a2b4e4f2g3
package CapgeminiQues;

import java.util.Scanner;

public class c22 {
    //method
    private static String modifiedString(String str , int n){
        StringBuilder result = new StringBuilder();
        int count = 1;
        for(int i=1; i<n; i++){
            if( str.charAt(i) == str.charAt(i-1)){
                count++;
            }
            else{
                result.append(str.charAt(i-1));
                if(count > 1){
                    result.append(count);
                }
                count = 1;
            }
        }
        //for ending character group
        result.append(str.charAt(n-1));
        if(count > 1){
            result.append(count);
        }

        return result.toString();
    }
    //main
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String str = ip.nextLine();
        int n = str.length();
        System.out.println(modifiedString(str, n));
        ip.close();
    }
    
}
