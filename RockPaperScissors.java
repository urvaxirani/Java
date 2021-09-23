/**
 *@author Urvax Irani
 *email: urvax.irani@gmail.com
 *date: 9/20/2021
 *purpose: RockPaperScissors
 */

import java.awt.BorderLayout;
import java.util.Random;
import java.util.Scanner;


public class RockPaperScissors {
    public static void main(String[] args) {
        /*Declare Variables to store number of rounds inputted by the user, 
        player's choice, current round, winner of the round 
        and if player wants to play again*/
        int numberOfRounds = 0;
        String stringNumberOfRounds = "";
        int playerChoice;
        String stringPlayerChoice = ""; 
        int currentRound = 1;
        int tie = 0;
        int computerWins = 0;
        int playerWins = 0;
        int playAgain;
        String stringPlayAgain;
        
         Scanner myScanner = new Scanner(System.in);
         
    //Use do-while loop so the game plays atleast once and then repeats if player selects 1 = yes     
    do{  
        //Take user input on number of rounds he wants to play and store it in a variable
        System.out.println("Please enter how many rounds would you like to play? ");
        stringNumberOfRounds = myScanner.nextLine();
        numberOfRounds = Integer.parseInt(stringNumberOfRounds);
        
        //if number of rounds are between 1 and 10 the program continues 
        //else it gives a sorry message and asks player to input rounds between 1 & 10
        if (numberOfRounds <= 10 && numberOfRounds >= 1)
            {
             //while loop used to repeat game for the number of rounds requested by player
             while (currentRound <= numberOfRounds)
                {
                    //Input from user for his choice between rock, paper & scissor
                    System.out.println("Please enter the number representing your choice (1 = Rock,2 = Paper,3 = Scissor): ");
                    stringPlayerChoice = myScanner.nextLine();
                    playerChoice = Integer.parseInt(stringPlayerChoice);
        
                    //Generation of random selection between rock paper and scissor by the computer
                    Random rng = new Random();

                    int[] choice = new int[] {1, 2, 3};
                    int randomIndex = rng.nextInt( choice.length );
                    int randomChoice = choice[randomIndex];
                    
                    /*Using if condition to identify if its a tie, player wins or computer wins and 
                    counting the number of times of each instance to find the overall winner*/
                    if (playerChoice == randomChoice)
                    {
                        System.out.println("This Round is a Tie! ");
                        tie ++;
                    }
                    else if (playerChoice == 1 && randomChoice == 2 )
                    {
                        System.out.println("Computer wins this Round! ");
                        computerWins++;
                    }
                    else if (playerChoice == 3 && randomChoice == 2 )
                    {
                        System.out.println("You wins this Round! ");
                        playerWins++;
                    }
                    else if (playerChoice == 1 && randomChoice == 3 )
                    {
                        System.out.println("You wins this Round! ");
                        playerWins++;
                    }
                    else if (playerChoice == 2 && randomChoice == 1 )
                    {
                        System.out.println("You wins this Round! ");
                        playerWins++;
                    }
                    else if (playerChoice == 2 && randomChoice == 3)
                    {
                        System.out.println("Computer wins this Round! ");
                        computerWins++;
                    }
                    else if (playerChoice == 3 && randomChoice == 1 )
                    {
                        System.out.println("Computer wins this Round! ");
                        computerWins++;
                    }
             currentRound++;
            }
             //Printing out the result
            System.out.println("number of rounds tie: " + tie);
            System.out.println("number of rounds You won: " + playerWins);
            System.out.println("number of rounds computer won: " + computerWins);
            
            //Using if condition to identify overall winner of all rounds
            if (computerWins > playerWins)
            {
                System.out.println("Computer is the overall winner of all rounds");
            }
            else if (playerWins > computerWins)
            {
                System.out.println("You are the overall winner of all rounds");
            }
            else
            {
               System.out.println("There is no overall winner of all rounds. Its a tie!"); 
            }
        
        }    
        else 
        {
            System.out.println("Sorry Number of Rounds Need To Be Between 1 To 10! Please Try Again! ");
        }
        //Asking input from user if he wants to play again
        //If yes then game repeats, if no then thank you message
        System.out.println("Do you want to play again? type 1 for Yes and 2 for No ");
        stringPlayAgain = myScanner.nextLine();
        playAgain = Integer.parseInt(stringPlayAgain);
    } while(playAgain == 1);
    System.out.println("Thanks for playing! "); 
    }
}

