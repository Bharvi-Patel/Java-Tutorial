//Variables and datatypes - JAVA - typed language(variable define karne se pehle uska datatype define karna padta hai)
//Literals : constant value which can be assigned to the variable

public class dt_var_literals{
    public static void main(String[] args) {

        String name = "Bharvi Patel";
        int a = 10;
        int b = 20;
        int c = 2;
        short d = 28;
        float f1 = 5.5f;//F or f must be added at the end while declaring float literal 
        double price = 25.25; //double is the default type for decimals(D or d laga sakte hai)
        char ch = 'B'; //Character literals should be declared in single qoutes only
        long l = 5677777238847872L;//L or l is required

        b=25;
        System.out.println(b);
        
        int sum = a+b;
        System.out.println("Sum of a and b is : "+sum);

        int mul = a*c;
        System.out.println("Multiplication of a and c is : "+mul);

        int ans = (a*b)/(a-b);
        System.out.println("Answer of (a*b)/(a-b) is : "+ans);

        
        // System.out.println(name);
        // System.out.println(d);
        // System.out.println(f1);
        // System.out.println(ch);
        // System.out.println(price);
        // System.out.println(l);
    }
}

/* Variable : container that stores any value

Data Types -> Primitive datatypes : byte=1byte(default value=0) value ranges from -128 to 227 (formula : multiply 8 into number of bytes than divide by 2) ,
                                       short=2bytes(dafault value=0) value ranges from -2^16/2 to 2^16/2 - 1 ,
                                       int=4bytes(default value=0) value ranges from -2^32/2 to 2^32/2 - 1 ,
                                       float(7digits after point)=4bytes(dafault value=0.0f) ,
                                       long=8bytes(dafualt value=0) value ranges from -2^64/2 to 2^64/2 - 1 ,
                                       double(14digits)=8bytes(default value=0.0d ,
                                       char=2bytes(default value=\0000) supports unicode characters; value ranges from 0 to 65537(2^16-1) ,
                                       bool= size depends(default value=false) ; value can be true or false
              -> Non-Primitive datatypes(derived from primitives) : These are of variable size and ae usually declared with a new keyword
                                                                    string,array,class,object,interface 
 */