class Pen{
    String colour;
    String type;

    public void write(){
        System.out.println("writting something");
    }
    public void printColour(){
        System.out.println(this.colour);
    }
}
class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
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


        Student s1 = new Student("uthkarsh", 20);
        s1.printInfo();
    }
}
