package Lambda_Expressions;


@FunctionalInterface //only 1 method
interface A{

    void greet();
    
    String toString(); // methods belongs to Object Class are permitted
}
public class L1 {
    public static void main(String[] args) {
        // A obj = new A() { // Anonymous Inner Class (traditional way)
        //     public void greet(){
        //         System.out.println("Heyy there!");
        //     }   
        // };
        // Using Lambda Expression
        A obj = () -> System.out.println("Hey there!!"); 
        //lambda exp knows which method to point coz it's a Functional Interface (only 1 method)
        obj.greet();
    }
    
}
