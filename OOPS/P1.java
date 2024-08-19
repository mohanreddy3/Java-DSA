package OOPS;
//Classes always start with Uppercase.
class Pen {
    String colour;
    String type;
    //Functions starts with Lowercases.
    public void write(){
        System.out.println("Write Something");
    }

    public void printColour(){
        System.out.println(this.colour);
    }

    public void printType(){
        System.out.println(this.type);
    }
}

public class P1 {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.colour = "Black";
        pen1.type = "Gel";
    
        Pen pen2 = new Pen();
        pen2.colour = "Blue";
        pen2.type = "BallPoint";
        pen1.printColour();
        pen1.printType();
        pen2.printColour();
        pen2.printType();

    }
}
