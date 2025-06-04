//OPERATORS : are used to perform operations on variables and values
import java.util.*;

public class operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 4;
        int b = 8;
        int c = 2;
        int d = 15;
        int e = 2;

        //Arithmetic
        System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
        System.out.println("SUbtraction of "+a+" from "+b+" is "+(a-b));
        System.out.println("Division of "+b+" by "+c+" is "+(b/c));
        System.out.println("Multiplication of "+a+" and "+b+" is "+(a*b));
        System.out.println("Modulus of "+a+" and "+b+" is "+(a%b));

        //Assignment
        a *= 3;
        System.out.println(a);

        //Comparison
        System.out.println(c==e);
        System.out.println(a>=b);
        System.out.println(b>a);
        System.out.println(b<=d);

        //Logical 
        System.out.println(b>a && a<d);
        System.out.println(a<d || a>b);
        
        //Bitwise
        System.out.println(2 & 3);
        System.out.println(2 | 3);

        sc.close();

    }
}


/* 
 TYPES OF OPERATORS
   Arithmetic Operators(can't work on boolean values) - + , - , * , / , %(returns the value of remainder ; works on floats and double) , ++ , -- 
   Assignment Operators - == , += , -= , *= , /=
   Comparison Operators - == , > , < , >= , <= (returns true or false)
   Logical Operators - && , || , !  (returns true or false)
   Bitwise Operators - & , | (operates bitwise ; pehle value ko 0's and 1's mein convert karega fir unpe operation karega)
   Relational Operators - 
   eg. of bitwise : 10    (2)             10
                    11    (3)             11
                    ---  (& operation)    ---(| operation) 
                    10(2)                   11(3)
 */

 /* 
   Resulting dt after arithmetic operations : here,b=byte, s=short, i=int, l=long, f=float, d=double, c=char 
   b+s=int
   s+i=int
   l+f=float  ex. float 9.08 + 4748278;
   i+f=float  ex. float 3.3 + x(x is any integer value)
   c+i=int
   c+s=int
   l+d=double
   f+d=dounle
  */

/*  finds the percentage of 5 subjects  

    Scanner sc = new Scanner(System.in);
        int total_marks=sc.nextInt();//enter total number of marks whether 100 0r 80
        float sub1 = sc.nextFloat();
        float sub2 = sc.nextFloat();
        float sub3 = sc.nextFloat();
        float sub4 = sc.nextFloat();
        float sub5 = sc.nextFloat();

        float percentage = ((sub1+sub2+sub3+sub4+sub5)/(total_marks * 5)) *100;
        System.out.println(percentage+"%");
*/   


/* Program to detect whether a number entered by the user is an integer or not
 
    System.out.println("Enter your number : ");
    Scanner sc =  new Scannner(system.in);
    System.out.println(sc.hasNextInt()); //returns true or false

 */

 /* Program to encypt a grade by adding 8 to it.Decrypt it to show the correct grade
   
    char grade = 'B' ;
    grade = (char)(grade + 8);//typecasting
    System.out.println(grade);

    //Decrypting the grade
    grade = (char)(grade - 8);
    System.out.println(grade);
 */
  