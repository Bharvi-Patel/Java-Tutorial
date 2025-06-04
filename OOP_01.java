class Employee{
    int id;
    String name;

    //Method
    public void printDetails(){
        System.out.println("My id is "+ id);
        System.out.println("My name is "+name);
    }
}

public class OOP_01 {
    public static void main(String[] args) {
        System.out.println("first class");
        Employee Bharvi = new Employee();//instantiating new object
        //setting properties/Attributes
        Bharvi.id = 2029;
        Bharvi.name = "Bharvi Patel";
        
        // System.out.println(Bharvi.id);
        // System.out.println(Bharvi.name);
        Bharvi.printDetails();


        
    }
}


/*
 OOP maps code instructions with real world making the code short and easier to understand.
-> Solving a problem by creating objects is one of the most popular approaches in programming.

 CLASS - A class is a blueprint for creating objects.It represents the set of properties or methods that are common to all objects of one type. 
 In general, class declarations can include these components in order: 

 (1) Modifiers: A class can be public or have default access.
 (i) private (accessible within the class where defined) 
 (ii) default or package-private (when no access modifier is specified) 
 (iii) protected (accessible only to classes that subclass your class directly within the current or different package)
 (iv) public (accessible from any class) (Ek java file meion ek hi public class ho sakti hai)

 But, the classes and interfaces themselves can have only two access modifiers when declared outside any other class. 
 (i) public 
 (ii) default (when no access modifier is specified)

 (2)Class name: The class name should begin with the initial letter capitalized by convention.
 (3)Body: The class body is surrounded by braces, { }.

 A Class in Java can contain:
 Data member
 Method
 Constructor
 Nested Class
 Interface

OBJECTS - An object is an instantiation of a class. When a class is defined,a template(info) is defined.Memory is allocated only after object instantiation.

How tommodel a problem in OOPs :-
we identify the following -
Noun -> Class -> Employee
Adjective -> Attributes -> Name,Age,Salary
Verb -> MEthods -> getSalary(),increment()


 Writing a custom class :-
 public class Dog{
  String name;                             //Attribute 1
  String place;                            //Attribute 2
  }

  Any real world object = properties + Behaviour
  object in OOPs =        Attributes + Methods

 */