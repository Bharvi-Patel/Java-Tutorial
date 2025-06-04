import java.util.*;

public class patterns {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Solid Rectangle
        for(int i=1;i<=4;i++){//no of rows - OUTER LOOP
            for(int j=1;j<=5;j++){// multiple stars in single row - INNER LOOP
                System.out.print("*");
            }
            System.out.println("");
        }
        
        //Hollow Rectangle
        for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                if(i==1 || j==1 || i==4 || j==5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        } 

        //Half Pyamid - Right Angled Triangle
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Inverted Half Pyramid
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("*");
        }
        System.out.println();
        }

        //Left Angled Traingle
        for(int i=1;i<=n;i++){//Outer loop
            //Inner Loop -> space print
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //Inner loop -> to print *
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Half Pyramid with Numbers  
        /* 1
           12
           123
           1234
           12345
         */
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //Inverted Half Pyramid with Numbers
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //Floyd's Triangle
        /* 1
           2  3
           4  5  6
           7  8  9  10
           11 12 13 14 15
         */
        int number = 1; 
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }

        //0-1 Triangle
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
