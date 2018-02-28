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

    //Interaction
      System.out.println("Hello and welcome to the Second Edition  of the PrimeGame!");
      System.out.println("Please select one of the following opitons.\n");
      System.out.println("To commence with the game, enter the number '1'.");
      System.out.println("To Terminate this programs operation, enter the number '01010001'.");
      contin = input.nextInt();

      if (contin == 1) {
        do {
          for (int loop; loop > 20; loop++) {
            System.out.println("_");
          }

          
        } while ();
      }
      }
    }
  }
