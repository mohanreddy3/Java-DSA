//Diamond shape
package Adv_Patterns_Concepts;

public class pblm5 {
    public static void main(String[] args) {
        int n = 4;
        //upper half
        for(int i=1;i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //printing *
            for(int j=1;j<=2*i-1; j++){ //2*(i-1) --> Logic
                System.out.print("*");
            }
            System.out.println();

        } 
        //Lower half
        for(int i=n;i>=1; i--){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //printing *
            for(int j=1;j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();

        } 


    }
    
}
