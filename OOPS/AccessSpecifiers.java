//Access Specifiers
/*
 1. Public ( can be accessed by any package & classes )
 2. Default ( can be accessed only )
 3. Protected
 4. Private
 */ 

package OOPS;


class AccDetails{
    public String name;
    private String password;
    //Getters & Setters
    //Getter
    public String getPassword(){
        return this.password;
    }
    //Setter
    public void setPassword(String str){
        this.password = str;
    }

}

//main
public class AccessSpecifiers {
    public static void main(String args[]) {
        AccDetails  acc1 = new AccDetails();
        acc1.name = "SavingsAcc";
        acc1.setPassword("Mohan#2004");
        System.out.println(acc1.getPassword());

      
    }
    
}
