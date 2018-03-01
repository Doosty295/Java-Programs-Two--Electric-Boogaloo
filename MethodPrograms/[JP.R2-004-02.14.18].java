/*
Title: [Prime Number Game]
  Intent:  [Test ability to use Java]
  Created: [02/14/2018, 16:25]
  Updated: [02/15/2018, 10:20]
Programmer: LeGars, Dustin
  Editor: Atom 1.24.0 x64
  Compiler: [None]
Program Identifier: [JP.R2-004-02.14.18]
Status: [Incomplete]
  Progress:    [/-------------------] 5%
    Writing:   [/---------] 10%
    Compiling: [----------] NULL
    Debugging: [----------] NULL
    Err Check: [----------] NULL
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
      int computerGuess, meatbagGuess, primeStat;
      double numGenA = Math.random();
      double numGenB = (numGenA*10);
      int queryNum = (int)numGenB;
      int contin = 0;
      int response = 0;
      boolean respBool;
      
      //Prime Checker
      //checks whether an int is prime or not.
      boolean isPrime(queryNum) {
          //check if n is a multiple of 2
          if (queryNum%2==0) return false;
          //if not, then just check the odds
          for(int i=3;i*i<=queryNum;i+=2) {
              if(queryNum%i==0)
                  return false;
          }
          return true;
      }

    //Interaction
      System.out.println("Hello and welcome to the Second Edition  of the PrimeGame!");
      System.out.println("Please select one of the following opitons.\n");
      System.out.println("To commence with the game, enter the number \'1\'.");
      System.out.println("To Terminate this programs operation, enter the number \'01010001\'.");
      contin = input.nextInt();

      if (contin == 1) {
        do {
          for (int loop; loop > 20; loop++) {
            System.out.println("_");
          }
          System.out.println("There is a number. This number is " + queryNum + ".");
          System.out.println("Is the number, " + queryNum + ", a prime number?");
          System.out.println("Note: Prime numbers are divisible by only themselves.");
          System.out.println("If you believe the number to be prime, press \'1\'. If you believe the number to be non-prime, press \'2\'");
          response = input.nextInt();

          if () {

          }





        } while ();
      }
      }
    }
  }
