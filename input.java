import java.util.*;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();//next() sirf ek hi token(single word) leta hai eg. if terminal pe "Bharvi Patel" input diya toh sirf "Bharvi" print hoga
        System.out.println("My name is "+name);
        String fullName = sc.nextLine();//nextLine() can take more than one token
        System.out.println(fullName);

/* nextInt() - integer type k liye
   nextFloat() - floating points k liye
   nextDouble() - double dt
   nextLong() - long dt
   nextShort() - short dt 
   and many more... 
 */

 //Example - take 2 variables x and y,print their sum
        int x =sc.nextInt();
        int y = sc.nextInt();
        int sum = x+y;
        System.out.println("Sum of "+x+" and "+y+" is "+sum);

        sc.close();
   }
    
}
