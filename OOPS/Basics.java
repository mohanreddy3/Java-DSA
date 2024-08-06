package OOPS;

public class Basics {
     public static void main(String[] args) {
          Student Std1 = new Student();
          Std1.rollno = 69;
          System.out.println(Std1.rollno);
          System.out.println(Std1.name);
          System.out.println(Std1.marks);
     }
     
}
 class Student{
     int rollno;
     String name;
     float marks;

 }
