//Single Inheritance
package OOPS;

//Base class

class Animals1{
    String name;
    String food_type;
    String type;
    int no_of_legs;
    //Function
    public void printInfo(){
        System.out.println( this.type + "\n" + this.food_type + "\n" +  this.no_of_legs);
    }
}

//Derived class
class Lion extends Animals1{
    //Function
    public void animalName(){
        System.out.println(this.name);
    }

}

public class Ih1 {
    public static void main(String[] args) {
        Lion l1 = new Lion();
        l1.name = "Lion";
        l1.type = "Terestrial";
        l1.food_type ="Carnivorous";
        l1.no_of_legs = 4;
        l1.animalName();
        l1.printInfo();
        
    }
    
}
