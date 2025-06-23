//Print Hello World

public class first{
    public static void main (String[] args) {
    System.out.println("Hello World!!!");
    }
}



/* 

 How is code running? - 
 (i)COMPILATION
JDK(JRE(JVM + Libraries)+Development Tools)
code ko ".java" se save krte hai -> fir sara code Compiler k paas jata hai(Compiler JDK mein hota hai) -> fir Compiler saare code ko Byte code mein
convert kar deta hai jiska extension hai ".class" 
Byte code koi bhi operating system pr run ho sakta hai as long as uske paas bhi JRE hai!! *Portable Language* 
(ii)EXECUTION
Byte code -> JVM -> Native code : jo code machine ko samaj aaye(0's and 1's) 

JAVA COMPONENTS 
(i)Function
public static void main(){
 *function name : main; recognized by the JVM as the starting point of the program*
 *return type : void(khali/returns nothing)*
 *public : access modifier;allows the main method to be accessed from anywhere in the program*
 *static : allows the main method to be called without creating an object of the class
}
 (ii)Class
 Class is a big entity. Ek class mein  multiple functions aaa sakte hai

 *main* function is the first part of the code jo execute hota hai

 */