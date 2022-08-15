//Krutika Ghode
//oasis infobyte
import java.util.Scanner;
import java.util.Random;
class numberGuess {
    public static void main(String args[])
    {
       int magicNumber;
       Random random  = new Random();
       Scanner sc = new Scanner(System.in);  
       System.out.println("Welcome to the Number Guessing Game \n This game consists of 3 levels \n Level 1 has 6 Guesses \n Level 2 has 3 Guesses \n Level 3 has 1 Guess");
       System.out.println("HERE WE GO");
       int L1 = 6;
       boolean flag = false;
       for(int level = 1; level<=3; level++)
       {
           flag = false;
           System.out.println("LEVEL " + level);
           magicNumber = random.nextInt(101);
           System.out.println("MAGIC NUMBER IS:" + magicNumber);
           int guessNum;
           int choice = 1;
           for(int noOfGuesses = 1; noOfGuesses<=L1; noOfGuesses++)
           {
           System.out.println("Attempt" + choice + " \n GUESS THE MAGIC NUMBER ");  
           guessNum = sc.nextInt();
           if(guessNum >100 || guessNum<0)
           {
            System.out.println("Oops!! Must be in the range 0-100"); 
           }
           else if(magicNumber>guessNum)
           {
             System.out.println("Your Guess is LOW");
           }
           else if(magicNumber<guessNum)
           {
            System.out.println("Your Guess is HIGH");
           }
           else if(magicNumber==guessNum)
           {
            System.out.println("HURRAY you guessed the Magic Number");
            
            if(level != 3)
            {   System.out.println("Congrtulations - You've qualified to the next level");    
             }
            flag = true;

            break;
           }
           choice++;
        }
        L1=L1/2;
        if(flag)
        {
         continue;
        }
        else{
            System.out.println("You Lost");
            break;
        }
       }
       System.out.println("Play Again");
    } 
}
