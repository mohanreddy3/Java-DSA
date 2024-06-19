//Hollow Rectangle
package Patterns_Concepts;
import java.util.*;
public class pblm2 {
    public static void main(String[] args) {
        System.out.print("Enter no of rows & Columns:");
        Scanner ip = new Scanner (System.in);
        int n = ip.nextInt();
        int m = ip.nextInt();
    //    int n=4; //rows 
    //    int m=5; //Columns
       //outer loop
       for(int i=1; i<=n; i++){
          //inner loop
          for(int j=1; j<=m; j++ ){
            //Cell --> (i,j)
            if(i==1||j==1||i==n||j==m){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
          }
          System.out.println();
       }
       ip.close();
    }
}
 


