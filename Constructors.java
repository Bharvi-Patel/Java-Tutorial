class Emp2{
    int id;
    String name;

    // this is difficult to do for large number of properties so instead we creates constructors
    // public String getName(){
    //     return name;
    // }
    
    // public void setName(String n){
    //     this.name = n;
    // }

    // public int getId(){
    //     return id;
    // }

    // public void setId(int i){
    //     this.id = i;
    // } 
    
         //Default Constructor
         public Emp2(){
            System.out.println("Default Constructor called...");
        }

        //Parameterized Constructor
        Emp2(String name,int id){
            this.name = name; 
            this.id = id;
        }

        /* "this" keyword refers to the current instance of the class.
         In OOPs it is used to : pass the current object as the parameter to another method
                                 refer to the current class instance variable  */

        //Copy Constructor
        Emp2(Emp2 newEmp){
            this.name = newEmp.name;
            this.id = newEmp.id;
        }
}


public class Constructors {
    public static void main(String[] args) {
        Emp2 Naruto = new Emp2();
        Emp2 Sasuke = new Emp2("Bharvi",2010);
        System.out.println("Parameterized constructor...");
        System.out.println("Name : "+Sasuke.name+" and Id : "+Sasuke.id);
        Emp2 Sakura = new Emp2(Sasuke);
        System.out.println("Copy Constructor...");
        System.out.println("Name : "+Sakura.name+" and Id : "+Sakura.id);
    }
    
}


/*
 Constructors : -
 A member function used to initialize an object while creating it.
 public Emp2(){
    id = 10;
    name = "Bharvi"
    }

    Types of Constructors : 
    (i)Non-Parameterized/Default Constructor
    -->A constructor that has no parameters.It is invoked at the time of creating an object.If we don't create one then it is created by default by java.
       (a)Implicit Default Constructor: If no constructor is defined in a class, the Java compiler automatically provides a default constructor
       (b)Explicit Default Constructor: If we define a constructor that takes no parameters, it’s called an explicit default constructor.
          This constructor replaces the one the compiler would normally create automatically.

    (ii)Parameterized Constructor
    -->A constructor that has parameters.It is used to provide different values to distinct objects.

    (iii)Copy COnstructor - an overloaded constructor used to declare and initialize object from another object
      -->Unlike other constructors copy constructor is passed with another object which copies the data available from the passed object
       to the newly created object.
  
*/ 

 /*
  Note:  It is not necessary to write a constructor for a class. It is because the java compiler creates a default constructor
   (constructor with no arguments) if your class doesn’t have any. 

   How Java Constructors are Different From Java Methods?
   Constructors must have the same name as the class within which it is defined it is not necessary for the method in Java.
   Constructors do not return any type while method(s) have the return type or void if does not return any value.
   Constructors are called only once at the time of Object creation while method(s) can be called any number of times

  */

  /*
   unline languages like python, C++ and Javascript has no Destructor.Instead,java has an efficient garbage collector that deallocates memory automatically.
   */
