class Pen{
    String color;
    String type; //ballpoint,gel

    public void write(){
        System.out.println("Writing something...");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}


class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(){//constructor
        System.out.println("Constructor called!!");
    }

    // Student(String name, int age){    //Parameterized Constructors
    //     this.name = name;
    //     this.age = age;
    // }

    Student(Student s2){               //Copy constructor
        this.name = s2.name;
        this.age = s2.age;
    }
}

public class class_object {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen1.write();
     
        Pen pen2 = new Pen();
        pen2.color = "Red";
        pen2.type = "ball point";

        pen1.printColor();//this keyword returns the color of object pen1
        pen2.printColor();


        Student s1 = new Student();
        s1.name = "Bharvi";
        s1.age = 20;

        s1.printInfo();

        Student s2 = new Student(s1); //Copy constructor
        s2.printInfo();
    }
    
}

// Destructors : java has garbage collector which automatically deletes the objects or variables which are not in use and just using the memory