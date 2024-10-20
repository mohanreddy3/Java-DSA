//Remove spaces from a string
package TCS_NQT.String_pblms;
public class S5 {
    //method
    static void removeSpaces(String str){
        int n = str.length();
        for(int i=0; i<n; i++){
            if(str.charAt(i) == ' '){
                str = str.substring(0, i) + str.substring(i+1);
                i--;
                n--;
            }
        }
        System.out.println(str);
    }
    //main
    public static void main(String[] args) {
        String str = "K Mohan Sai Reddy";
        removeSpaces(str);
        
    }
    
}
