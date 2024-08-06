package Recursion;

public class R1 {
    public static void main(String[] args) {
        recFunction();
    }

    

    //Function
    static int count =0;
    public static void recFunction(){
        if(count ==30){
            return;
        }
        else{
        System.out.println(count);
        count++;
        recFunction();
        }
        
    }
}




