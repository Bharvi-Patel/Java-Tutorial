import java.util.*;

public class adv_patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        //Butterfly Pattern 

        //Upper Half     
        for(int i=1;i<=n;i++){
            //1st part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            //spaces
            int spaces = 2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }

            //2nd part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }

        //Lower Half
        for(int i=n;i>=1;i--){
            //1st part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            //spaces
            int spaces = 2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }

            //2nd part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }



        //Solid Rhombus
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        //Hollow Rhombus



        //Number Pyramid
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }



        //Palindromic Patterns
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            //1st half numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            //2nd half
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }



        //Diamond Pattern

        //Upper Half
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //Stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Lower Half
        for(int i=n;i>=1;i--){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //Stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
               }
            System.out.println();
        }


        sc.close();
    }
}
