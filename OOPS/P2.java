package OOPS;
//Check for Multiple Definitions: Ensure there are no other Student classes 
//in your classpath that could be causing conflicts.
class Student{
    String name;
    int age;
    //Function
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    //copy Constructor
    //for st1.
    Student(){
    }
    //for st2.
    Student(Student st2){
        this.name = st2.name;
        this.age = st2.age;
    }

}


public class P2 {
    public static void main(String args[]) {
        Student st1 = new Student();
        st1.name ="Mohan";
        st1.age = 20;
        Student st2 = new Student(st1);
        st2.printInfo();

    }
    
}
