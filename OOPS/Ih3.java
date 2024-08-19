//Hirerchical Inheritance 
package OOPS;

//Base Class
class Animals3{
    String name;
    String food_type;
    String type;
    int no_of_legs;
    //Function
    public void printInfo(){
        System.out.println(this.name + "\n" + this.type + "\n" + this.food_type + "\n" +  this.no_of_legs);
    }
}

//Child class
class Bats extends Animals3{
    //Function
    public void sounds(){
        System.out.println("kech kech!");
    }
    
}

//Another Child class
class Cats extends Animals3{
    //Function
    public void sounds(){
        System.out.println("Meoww!");
    }
}

public class Ih3 {
    public static void main(String[] args) {
        Bats bat = new Bats();
        Cats cat = new Cats();
        //Intialization for Bat
        bat.name = "Bat";
        bat.food_type = "Omnivorous";
        bat.type = "Air & Trees";
        bat.no_of_legs = 2;
        bat.sounds();
        //Intialization for Cat
        cat.name = "Cat";
        cat.food_type = "Carnivorous & Milk";
        cat.type = "Land & My Heart";
        cat.no_of_legs = 4;
        bat.printInfo();
        cat.printInfo();
        cat.sounds();
    

        
    }
    
}
