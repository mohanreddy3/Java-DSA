//Remove characters from a string except alphabets
package TCS_NQT.String_pblms;

public class S6 {
    //method
    private static void removeChar(String str){
        int n = str.length();
        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            if((ch >= 'a' && ch <='z') || (ch >= 'A' && ch <= 'Z')){
                continue;
            }
            else{
                str = str.substring(0, i) + str.substring(i+1);
                i--;
                n--;
            }
        }
        System.out.println(str);
    }
    //main
    public static void main(String[] args) {
        String str = "K3 Mo$han@123 Redd3y";
        removeChar(str);
    } 
}



// Another approach :
// StringBuffer ans = new StringBuffer();
//int ascii = (int) str.charAt(i); //ascii value
// if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) // if alphabets
// ans.append(str.charAt(i));
