package Strings;

import java.util.ArrayList;

public class k8 {
    //method
    static ArrayList<String> subSeqDisplay(String p , String up){ //p-Proceesed , up-unprocessed
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSeqDisplay(p + ch, up.substring(1));
        ArrayList<String> right = subSeqDisplay(p, up.substring(1));
        
        left.addAll(right);
        return left;
    }
    //main
    public static void main(String[] args) {
        String str = "abc";
         System.out.println(subSeqDisplay("", str));
        
    }
    
}
