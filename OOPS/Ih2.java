//MultiLevel Inheritance
/*
 * Base class 
 *     |
 * Derived calss (base class)
 *     |
 * Derived class
 */
package OOPS;
//Base class
class Animals2{
    String name;
    String food_type;
    String type;
    int no_of_legs;
    //Function
    public void printInfo(){
        System.out.println( this.type + "\n" + this.food_type + "\n" +  this.no_of_legs);
    }
}
//Derived Class (Base class for Baby_Hippo)
class Hippo extends Animals2{
    String size;
    //Function
    public void animalName(){
        System.out.println(this.name);
    }
}
//2nd Derived Class
class Baby_Hippo extends Hippo{
    //Function
    public void printSize(){
        System.out.println(this.size);
    }

}
//Main
public class Ih2 {
    public static void main(String[] args) {
        //Object 1
        Hippo h1 = new Hippo();
        h1.name = "Hippopotamus";
        h1.type = "Land & Water";
        h1.food_type = "Herbivorous";
        h1.no_of_legs = 4;
        //Object 2
        Baby_Hippo h2 = new Baby_Hippo();
        h2.size ="Small af";
        h2.name = "Baby Hippo";
        h2.type = "Land";
        h2.food_type = "Milk";
        h2.no_of_legs = 4;
        //Function calling
        h1.animalName();
        h1.printInfo();
        h2.animalName();
        h2.printInfo();
        h2.printSize();




    }
    
}
