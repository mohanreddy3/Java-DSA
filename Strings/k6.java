//Skipping a string which doesn't start from other string.(I know that's confusing af but hang on).
//ip : abapplecd ,abappfcd (skip app if it doesn't start with "apple")
//op : abapplecd , abfcd 
package Strings;

public class k6 {
    //method
    static String skipApp(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("app") && !(str.startsWith("apple"))){
            return skipApp(str.substring(3));
        }
        else{
            return str.charAt(0) + skipApp(str.substring(1));
        }
    }
    //main
    public static void main(String[] args) {
        System.out.println(skipApp("abapplecd"));
        System.out.println(skipApp("abappfcd"));
        
    }
    
}
