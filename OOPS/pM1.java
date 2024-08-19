package OOPS;


class Animals{
    String name;
    String type;
    int legs;
    //Constructor
    Animals(){
        System.out.println("Constructor Called");
    }
    //Function
    public void printInfo(String name){
        System.out.println(this.name);
    }
    public void printInfo(String name, String type){
        System.out.println(this.name + " " + this.type);
    }
    public void printInfo(int legs){
        System.out.println(this.legs);
    }

}
//main
public class pM1 {
    public static void main(String[] args) {
        Animals anm1 = new Animals();
        anm1.name = "Snow Lepoard";
        anm1.type = "Carnivorous";
        anm1.legs = 4;
        anm1.printInfo(anm1.name , anm1.type);
        anm1.printInfo(anm1.name);

        
    }
    
}
