//skipping a character in a string. (using Recursion)
//EX: Remove 'a' from given string.
//ip: abbccda
//op: bbccd
package Strings;

public class k4 {
    //method
    static void skip(String ans ,String org ){
        //base condition
        if(org.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = org.charAt(0);
        if(ch == 'a'){
            //recursion call
            skip(ans, org.substring(1)); //substring -> divides string from tht particular index.            
        }else{
            skip(ans + ch, org.substring(1));
        }

    }
    //main
    public static void main(String[] args) {
        skip("","abbccda");
        
    }
    
}
