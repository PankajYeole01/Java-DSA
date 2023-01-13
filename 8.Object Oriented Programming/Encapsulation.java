import java.util.*;
//Encapsulation - wrapping up of data and methos under a single unit is called as encapsulation 
// when constructors are called memory is allocated to an attributed of an objetc 

public class Encapsulation {
    public static void main(String args[]){
        Student s1 = new Student("Pankaj");
        System.out.println(s1.name);

    }
    
}
class Student{
    String name;
    int roll;
    Student(String name){
        this.name = name;
    }
    
}
