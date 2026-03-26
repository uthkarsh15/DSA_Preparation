package oop;

//         System.out.println(this.colour);
//     }
// }
class Student{
    String name;
    int age;
    static String school;

    // public void printInfo(){
    //     System.out.println(this.name);
    //     System.out.println(this.age);
    // }

    // Student(String name, int age) {
    //     this.name = name;
    //     this.age = age;
    // }
    // Student(Student s2){
    //     this.name = s2.name;
    //     this.age = s2.age;
    // }

    // Student(){
        
    // }


    // polymorphism
    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name+" "+age);
    }
}

// abstract class Animal{
//     abstract void walk();

//     Animal(){
//         System.out.println("you are creating a new animal");
//     }

//     public void eats(){
//         System.out.println("animal eats");
//     }
// }
// class Horse extends Animal{
//     Horse(){
//         System.out.println("created a horse");
//     }
//     public void walk(){
//         System.out.println("walks on 4 legs");
//     }
// }
// class Chicken extends Animal{
//     public void walk(){
//         System.out.println("wlaks on 2 legs");
//     }
// }


// interfaces
interface Animal{
    int eyes = 2;
    public void walk();
}
interface Herbivore{

}
class Horse implements Animal,Herbivore{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}

public class oop {
    public static void main(String args[]){
        // Pen pen1 = new Pen();
        // pen1.colour = "blue";
        // pen1.type = "gel";

        // pen1.write();

        // Pen pen2 = new Pen();
        // pen2.colour = "black";
        // pen2.type = "ball point";

        // pen1.printColour();
        // pen2.printColour();


        // Student s1 = new Student("uthkarsh", 20);
        // s1.printInfo();

        // Student s1 = new Student();
        // s1.name = "uthkarsh";
        // s1.age = 24;

        // Student s2 = new Student(s1);
        // s2.printInfo();

        // s1.printInfo(s1.name, s1.age);

        // bank.Account account1 = new bank.Account();
        // account1.name = "customer1";

        // Horse horse1 = new Horse();
        // horse1.walk();
        // horse1.eats();

        // Animal animal = new Animal();
        // animal.walk();

        Student.school = "LAHS";
        Student student1 = new Student();
        student1.name = "Palak Sharma";
        System.out.println(student1.school);

    }
}

