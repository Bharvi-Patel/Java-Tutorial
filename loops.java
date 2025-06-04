import java.util.*;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //for loop
        for(int i=0;i<3;i++){
            System.out.println("Hare Krishn");
        }

        for(int i=0;i<=10;i++){
            System.out.print(i+" ");
        }

        System.out.println("");

        //while loop
        int j = 10;
        while(j>=0){
            System.out.print(j+" ");
            j--;
        }

        System.out.println("");

        //do while loop
        int k = 0;
        do{
            System.out.print(k+" ");
            k++;
        }
        while(k<=10);

        System.out.println("");

        //Sum of first n natural number
        int sum=0;
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);

        //Print the table of a number
        int mul;
        for(int i=1;i<=10;i++){
            mul = n*i; 
            System.err.println(n+"*"+i+"="+mul);
        }

        sc.close();
    }
}

/* 

 For Loop:-
 for(initialisation;condition;updatation){
 //do something
 }

 While Loop:-
 while(condition){
 //do something
 }

 Do While Loop:-
 do{
 //do something
 }while(condition);

*/