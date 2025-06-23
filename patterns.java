import java.util.*;

public class patterns {
    /**
     * @param args
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Solid Rectangle
        /*
            *****
            *****
            *****
            *****
         */

        for (int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        //Hollow Rectangle
        /*
            *****
            *   *
            *   *
            *****
         */

        for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                if(i==1 || i==4 || j==1 || j==5){
                    System.out.print("*");
                }   else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //Half Pyamid - Right Angled Triangle
        /*
            *
            **
            ***
            ****
            *****
        */

        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Inverted Half Pyramid
        /*
           *****
           ****
           ***
           **
           *
         */

        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Left Angled Traingle(180degree rotated)
        /*
                *
               **
              ***
             ****
            *****
         */

         for(int i=1;i<=n;i++){
            //inner loop for space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
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
        /*
           1 2 3 4 5
           1 2 3 4
           1 2 3
           1 2
           1
         */

        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        // //Floyd's Triangle
        // /* 1
        //    2  3
        //    4  5  6
        //    7  8  9  10
        //    11 12 13 14 15
        //  */

        // int number = 1; 
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(number+" ");
        //         number++;
        //     }
        //     System.out.println();
        // }

        // //0-1 Triangle
        // /*
        //    1
        //    01
        //    101
        //    0101
        //    10101
        //  */

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         if((i+j)%2==0){
        //         System.out.print("1");
        //         }else{
        //             System.out.print("0");
//                 }
//             }
//             System.out.println();
//         }
        sc.close();
    }
}
