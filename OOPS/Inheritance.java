//Basic(Inherits properties and methods from Base class).
package OOPS;

//Base class
class Shape{
    String color;
}
//Sub class
class Triangle extends Shape {
    //Function
    public void printColor(){
        System.out.println(this.color);
    }
    
}


public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "Red";
        t1.printColor();
    }
    
}
