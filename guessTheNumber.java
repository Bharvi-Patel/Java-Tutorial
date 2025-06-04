//allows the user to play "Guess the Number" game once

import java.util.*;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    Game(){                              
        Random rand = new Random();
        this.number = rand.nextInt(100);
        
    }
 

    int takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
        return inputNumber;
    }

    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber==number){
            System.out.format("Yess you guessed it right,it was %d\n You guessed it in %d attempts\n",number,noOfGuesses);
            return true;
        }else if(inputNumber<number){
            System.out.println("Too less...");
        }else if(inputNumber>number){
            System.out.println("Too high...");
        }
            return false;
        
      
    }

    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses = noOfGuesses;

    }
    public int getNoOfGuesses(){
        return noOfGuesses;
    }
    
}



public class guessTheNumber {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b=false;
        while(!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
              
        }
  
        
    }
}

