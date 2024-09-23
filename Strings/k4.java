//skipping a character in a string. (using Recursion)
//EX: Remove 'a' from given string.
//ip: abbccda
//op: bbccd
package Strings;

public class k4 {
    //method 1 (empty string and original stirng)
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
    //method 2(only Original string is passsed as arguments).
    static String skip2(String org){
        if(org.isEmpty()){
            return "";
        }
        char ch = org.charAt(0);
        if( ch =='a'){
            return skip2(org.substring(1));
        }
        else{
            return ch + skip2(org.substring(1));
        }
    }
    //main
    public static void main(String[] args) {
        skip("","abbccda");
        System.out.println(skip2("aabbcadefa"));
        
    }
    
}
