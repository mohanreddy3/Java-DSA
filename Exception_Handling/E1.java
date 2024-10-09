package Exception_Handling;

public class E1 {
    public static void main(String[] args) {
        int a = 36;
        int b = 4;
        int c=0;
        int[] arr = {1,2,3,4};

        try{
            c = a/b;
            System.out.println(arr[5]);
        }
        //Unchecked Exception
        catch(ArithmeticException e){
            System.out.println("don't divide by 0");
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Be in your limits");
        }
        //can be used if we don't what exception we may face in the multiple statements.
        catch(Exception e){
            System.out.println("Dude kuch tho gadbad hei!");
        }
        
        System.out.println(c);
        System.out.println("Second Statement is executed");

    }
    
}
