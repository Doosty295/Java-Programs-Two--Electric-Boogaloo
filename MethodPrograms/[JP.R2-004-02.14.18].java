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

    int continue;

    System.out.println("Hello! Please select a course of action.");
    System.out.println("Option One: Play the game.");
    System.out.println("Option Two: Terminate this program.");

    while (continue == 1) {
      System.out.println("Guess if the randomly generated number is Prime.");
      System.out.println("Type '1' for 'yes/is prime' and type '2' for 'no/ not prime'");
      int userResponse = input.nextInt();

      int generatedNumber = RNG();

      int compGuess = 0;
      if (Math.random() > .5) {
        compGuess = 1;
      }
      int result = CheckCorrect(compGuess, userResponse, Primecheck());

    }
  }


  public static CheckCorrect(int cmpAns, usrAns, correctAns){
    if (cmpAns == correctAns) {

    }

  }

  public static RNG(){
    double a = (Math.random() * 10);
    double b = (Math.random() * 10);
    double c = (Math.random() * 10);
    double d = (Math.random() * 10);

    int e = (int)double a
    int f = (int)double b
    int g = (int)double c
    int h = (int)double d

    double avgDub = (e + f + g + h)/4
    int avg = (int)avgDub;
    return avg;
  }

  public static Primecheck(int n){
    //checks whether an int is prime or not.
      boolean isPrime(n) {
    //check if n is a multiple of 2
      if (n%2==0) return false;
    //if not, then just check the odds
      for(int i=3;i*i<=n;i+=2) {
          if(n%i==0)
            return false;
          }
        return true;
      }
  }
}
