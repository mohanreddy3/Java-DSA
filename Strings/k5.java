//Skipping an entire String in the given string.
//Ex: Freaking
//ip : Are you freaking kidding me?
//op : Are you kidding me?
package Strings;

public class k5 {
    //method
    static String skipWord(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("freaking")){ //startsWith -> checks a  particular string starts
            return skipWord(str.substring(8));
        }
        else{
            return str.charAt(0) + skipWord(str.substring(1));
        }

    }
    //main
    public static void main(String[] args) {
       System.out.println(skipWord("Are you freaking kidding me?"));
        
    }
    
}
