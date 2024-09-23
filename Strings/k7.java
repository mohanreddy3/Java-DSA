//Sub Sequence -> Subsets of a given string
//ex: ip : abc
//op: 
package Strings;

public class k7 {
    //method
    static void subSeq(String p, String up){ // p-processed , up-unprocessed
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSeq(p+ch, up.substring(1));
        subSeq(p, up.substring(1));        
    }
    //main
    public static void main(String[] args) {
        String str = "abc";
        subSeq( "", str);
    }
    
}
