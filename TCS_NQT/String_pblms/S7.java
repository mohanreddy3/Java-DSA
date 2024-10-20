//Reverse a String
package TCS_NQT.String_pblms;

public class S7 {
    //method
    private static String reverseString(StringBuilder str){
        int n = str.length();
        for(int i=0; i<n/2; i++){
            //defining indexes
            int startIndex = i;
            int endIndex = n-i-1;
            //defining characters
            char startChar= str.charAt(startIndex);
            char endChar = str.charAt(endIndex);
            //replacing characters
            str.setCharAt(startIndex, endChar);
            str.setCharAt(endIndex, startChar);
        } 
        return str.toString();
    }
    //main
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Mohan");
        System.out.println(reverseString(str));
    }
}

// TC: O(n)
// SC: O(1)
