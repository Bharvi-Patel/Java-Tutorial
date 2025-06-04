import java.util.*;

public class func {

     //Function to print my name
     public static void printMyName(String name){
        System.out.println("My name is "+name);
        return; //agar ye kuch return kr raha hota for eg. int toh return ke sath int likhte(return 1;) ; return to where you came from primarily
    }

    //Make a function to add two numbers  
    public static void addTwoNumbers(int a,int b){
        int c = a+b;
        System.out.println("Sum of "+a+" and "+b+" = "+c);
        return;
    }

    //Multiply 2 numbers and return their product
    public static int multiplyNumbers(int x,int y){
        int mul = x*y;
        return mul;
    }

    //Find Factorial of a number
    public static void Factorial(int n){
      if(n<0){
        System.out.println("Invalid Number");
        return;
      }

      int fact = 1;

      for(int i=n;i>=1;i--){
        fact = fact * i;
      }

      System.out.println("Factorial of "+n+" = "+fact);
      return;
    }


    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String name = sc.nextLine();
      int a = sc.nextInt();
      int b = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();
      int n = sc.nextInt();

      printMyName(name);
      addTwoNumbers(a,b);
      int mul = multiplyNumbers(x, y);
      System.out.println("Multipliocation of "+x+" and "+y+" = "+mul);
      Factorial(n);
    }
}


/*
  Functions:-
  returnType functionName(type arg1,type arg2...){
  //Operation
  }

  returnType = void, int,float,string,double,char etc.(void - returns nothing)
  functionName = can be anything *should not be a java keyword* eg. printMyName
  type = type of the argument i.e., int,float,boolean,string... eg. int age,float height

 */

/* Another way 
  import java.util.*;

  public class func {
  
    //Make a function to add two numbers  
    public static int addTwoNumbers(int a,int b){
        int c = a+b;
        return c;
    }

    //multiplication of two numbers
    public static int multiplyNumbers(int x,int y){
        return x*y
    }

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();

      int c = addTwoNumbers(a,b);
      System.out.println(c);

      System.out.println("Product of 2 numbers is : "+ multiplyNumbers(x,y));


    }
}
 */ 