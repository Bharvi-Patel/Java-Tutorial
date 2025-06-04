import java.util.Scanner;

public class func_problems {
    
    //Function to print the average of 3 numbers
    public static int printAverage(int a,int b,int c){
        return ((a+b+c)/3);
    }


    //sum of all odd numbers from 1 to n
    public static void sumOddNumbers(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            if (i%2 != 0){
                sum = sum + i;
            }
        }
        System.out.println("Sum of first "+n+" odd numbers is "+sum);
    }


    //Function to find the greater of two numbers
    public static void findGreaterNumber(int x,int y){
        if(x>y){
            System.out.println(x+" is greater than "+y);
        }else{
            System.out.println(y+" is greater than "+x);
        }
    }

    
    //Function that takes radius as input and returns circumference of a circle
    public static float circumferenceOfCircle(int r){
        float coc = 2*2.14f*r ;
        return coc;
    }


    //Eligible to vote or not
    public static void eligibleToVote(int age){
        if(age > 18){
            System.out.println("Eligible to vote!");
        }else{
            System.out.println("Not eligible to vote");
        }
    } 


    //Function to find the vslur of one number raised to another i.e. x^n
    // public static void numberRaisedToAnother(int p,int q){
    //     double ans = Math.pow(p,q);
    //     System.out.println(ans);
    //     }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        int age = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();

        System.out.println("Average of "+a+" , "+b+" and "+c+" = "+printAverage(a, b, c));
        sumOddNumbers(n);
        findGreaterNumber(x, y);
        System.out.println("Circumference of a circle with radius "+r+ " is "+circumferenceOfCircle(r));
        eligibleToVote(age);
    }
}
