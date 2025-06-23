//casting
public class casting_constant {
    public static void main(String[] args) {
        //Implicit Casting
        double price = 150.00;
        double finalPrice = price + 18;

        System.out.println(finalPrice);

        int p = 150;
        // int fP = p + 18.0;//this would give error

        //Explicit Casting
        int fP = p + (int)18.0;
        System.out.println(fP);



        //Constant
        int age = 20;
        age = 21; 
        //variable age's value is getting updated;to make sure it remains constant...we use final keyword
        final float PI = 3.14f;
        // pi = 1.1f;//this would give error

        //using constant variables ko capitals letters mein denote karte hai
    }

    
}
