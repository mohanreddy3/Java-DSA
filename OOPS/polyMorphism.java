//Function Overloading
package OOPS;

class Employee{
    String name;
    int age;

    //Function
    public void printInfo(String name){
        System.out.println(this.name);
    }
    public void printInfo(int age){
        System.out.println(this.age); 
    }
    public void printInfo(String name ,int age){
        System.out.println(this.name + " " +  this.age);
    }
}

public class polyMorphism {
    public static void main(String args[]) {
        Employee ep1 = new Employee();
        ep1.name = "Mohan";
        ep1.age = 20;
        ep1.printInfo( ep1.name, ep1.age);
        ep1.printInfo(ep1.age);

        
    }
    
}
