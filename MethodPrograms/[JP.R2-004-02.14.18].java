/*
Title: [Prime Number Game]
  Intent:  [Test ability to use Java]
  Created: [02/14/2018, 16:25]
  Updated: [03/06/2018, 10:00]
Programmer: LeGars, Dustin
  Editor: Atom 1.24.0 x64
  Compiler: [None]
Program Identifier: [JP.R2-004-02.14.18]
Status: [Incomplete]
  Progress:    [////----------------] 20%
    Writing:   [//////----] 60%
    Compiling: [----------] 0%
    Debugging: [----------] 0%
    Err Check: [----------] 0%
Imports: [One (1)]
  [Scanner]
GitHub Link: [Link]
Additional Information:
Testing Programming Skills in:
  Input Validation
  Looping Structures
  Decision Structures
  Random Number Generation
 Nabbed a statement to check if the numbers are prime from:
  [https://www.mkyong.com/java/how-to-determine-a-prime-number-in-java/]
*/

import java.util.Scanner;

public class Program {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    //Declarations
      boolean thinkboxGuess, meatbagGuess;
      double numGenA = Math.random();
      double numGenB = (numGenA*10);
      int queryNum = (int)numGenB;
      int contin = 0;
      int meatbagScore, thinkboxScore;
      boolean respBool;

      boolean primeStat = primeCheck(respBool);


    //Interaction
      System.out.println("Exclamation: Hello and welcome to the Second Edition of the PrimeGame!");
      System.out.println("Statement: Written in the style of everyone's favorite murder-droid, HK-47.");
      System.out.println("Statement: Please select one of the following opitons.\n");
      System.out.println("Statement: To commence with the game, enter the number \'1\'.");
      System.out.println("Statement: To Terminate this programs operation, enter the number \'01010001\'.");
      contin = input.nextInt();

      if (contin == 1) {
        do {
          for (int loop; loop > 20; loop++) {
            System.out.println("_");
          }
          System.out.println("Statement: There is a number. Statement: This number is " + queryNum + ".");
          System.out.println("Query: Is the number, " + queryNum + ", a prime number?");
          System.out.println("Statement: Note: Prime numbers are divisible by only themselves.");
          System.out.println("Statement: If prime, type \'true\'. Statement: If non-prime, type \'false\'.");
          meatbagGuess = input.nextBoolean();


          //thinkbox guess generator
          double genNum = Math.random();
          if (genNum > 0.5) {
            thinkboxGuess = true;
          }
          else {
            thinkboxGuess = false;
          }


          //For if the meatbag is a funny guy...
          if (meatbagGuess != true & meatbagGuess != false) {
            System.out.println("Mockery: It appears that there is a meatbag that finds istelf humorus here.");
            for (int rept=0; rept > -1; rept++) {
              System.out.print("Repetition: Have some SPAM instead.");
            }
          }

          //Meatbag guess correctness
          if (meatbagGuess == true) {
            System.out.println("Statement: You guessed that the number was prime.");
            if (meatbagGuess == primeStat) {
              System.out.println("Exclamation: You guessed correctly!");
              meatbagScore++;
            }
            else {
              System.out.println("Statement: You guessed incorrectly, meatbag.");
            }
          }
          else if (meatbagGuess == false) {
            System.out.println("Statement: You guessed that the number was non-prime.");
            if (meatbagGuess == primeStat) {
              System.out.println("Exclamation: You guessed correctly!");
              meatbagScore++;
            }
            else {
              System.out.println("Statement: You guessed incorrectly, meatbag.");
            }
          }


          //Thinkbox guess correctness
          if (thinkboxGuess == true) {
            System.out.println("Statement: The computer guessed that the number was prime.");
            if (thinkboxGuess == primeStat) {
              System.out.println("Exclamation: The computer guessed correctly!");
              thinkboxScore++;
            }
            else {
              System.out.println("Statement: The computer guessed incorrectly.");
            }
          }
          else if (thinkboxGuess == false) {
            System.out.println("Statement: The computer guessed that the number was non-prime.");
            if (thinkboxGuess == primeStat) {
              System.out.println("Exclamation: The computer guessed correctly!");
              thinkboxScore++;
            }
            else {
              System.out.println("Statement: The computer guessed incorrectly.");
            }
          }

          //Score Outputs
          System.out.println("Statement: Current scores are as follows.");
          System.out.println("Meatbag: " + meatbagScore);
          System.out.println("Computer: " + thinkboxScore);
          if (meatbagScore > thinkboxScore) {
            System.out.println("Statement: The meatbag is currently winning. How embarrasing.");
          }
          else if (thinkboxScore > meatbagScore) {
            System.out.println("Statement: The computer is currently winning.");
          }
          else {
            System.out.println("Statement: The computer and the meatbag appear to be in a tie.");
          }



          System.out.println("Query: Would you like to play again?");
          if (thinkboxScore > meatbagScore) {
            System.out.println("Statement: I can understand if you don't want to challenge my superior intellect. Meatbag.");
          }
          System.out.println("Statement: \'1\' to play again, any other key to terminate.");
          contin = input.nextInt();
        } while (contin == 1);

        System.out.println("Exclamation: Goodbye meatbag!");
      }
      }

      public static primeCheck(boolean respBool){
      //Prime Checker
      //checks whether an int is prime or not.
      boolean primeStat(queryNum) {
          //check if n is a multiple of 2
          if (queryNum%2==0) return false;
          //if not, then just check the odds
          for(int i=3;i*i<=queryNum;i+=2) {
              if(queryNum%i==0)
                  return false;
          }
          return true;
      }
}
    }
