import java.util.*;

public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        //if statement
        if(age>=18){
        System.out.println("You are an Adult.");
        }
        
        //if_else statement
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println(a+" is an even number!");
        }
        else{
            System.out.println(a+" is an odd number!");
        }

        //else-if statement
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(b==c){
            System.out.println("both numbers are equal");
        }
        else if(a>b){
            System.out.println(b+" is greater than "+c);
        }
        else{
            System.out.println(c+" is greater than "+b);
        }



/*  Examples:-
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b){
            System.out.println("both numbers are equal");
        }
        else{
            if(a>b){
                System.out.println(a+" is greater than "+b);
            }
            else{
                System.out.println(b+" is greater than "+a);
            }
        }
        */

        sc.close();
    }   
}


