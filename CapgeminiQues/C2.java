/*
 * Problem Statement –
given a string with multiple characters that are repeated consecutively. 
You’re supposed to reduce the size of this string using mathematical logic given as in the example below :
Input 1:
aabbbbeeeeffggg
Output:
a2b4e4f2g3

Input 2 :
abbccccc
Output:
ab2c5
 */
package CapgeminiQues;

import java.util.Scanner;

public class C2 {
    //method
    private static void modifyString(String str, int n){
        //to store the compressed String -> at last return it as String using toSring().
        StringBuilder result = new StringBuilder();
        int count =1;
        for( int i=1; i<n; i++){
            if(str.charAt(i) == str.charAt(i-1)){
                count++;
            }
            else{
                result.append(str.charAt(i-1));
                if(count > 1){
                    result.append(count);
                }
                count = 1; //again reset the count to default value.
            }
        }
        //handling last character group.
        result.append(str.charAt(n-1));
        if(count > 1){
            result.append(count);
        }
        //printing the output
        System.out.println(result.toString());
    }
    //main
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String str = ip.nextLine();
        int n = str.length();
        modifyString(str, n); 
        ip.close();
    }
    
}
