package Strings;

public class s3 {
    public static void main(String[] args) {
        //comparing two strings
        /*
          3 cases:
          1) s1 > s2 : +ve Value
          2) s1 == s2 : 0
          3) s1 < s2 : -ve value
         */
        // "==" sometimes fails.
         String s1 = "Mohan";
         String s2 = "Mohan";

         if(s1.compareTo(s2)==0){
            System.out.println("Stirngs are Equal");
         }
         else{
            System.out.println("Strings are not Equal");
         }
        
    }
}
