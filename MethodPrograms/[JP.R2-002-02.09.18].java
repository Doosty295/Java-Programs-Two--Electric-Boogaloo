/*
Title: Methodical Banking
  Intent:  Do banking things with methods.
  Created: [02/09/2018, 14:40]
  Updated: [02/14/2018, 15:40]
Programmer: LeGars, Dustin
  Editor: Atom 1.24.0 x64
  Compiler: [Compiling Program]
Program Identifier: [JP.R2-002-02.09.18]
Status: [Incomplete]
  Progress:    [/////////////////---] 85%
    Writing:   [/////////-] 90%
    Compiling: [----------] Null%
    Debugging: [----------] Null%
    Err Check: [----------] Null%
Imports: 1
  Scanner
GitHub Link: https://github.com/Doosty295/Java-Programs-Two--Electric-Boogaloo/blob/master/MethodPrograms/%5BJP.R2-002-02.09.18%5D.java
Additional Information: Banking Stuff
    -=#I_HAVE_NO_IDEA_WHAT_I_AM_DOING#=-




*/

import java.util.Scanner;

public class Program {

  public static void main(String[] args) {

    //Variables
      double prevBalance = 0;
      double currentBalance = 0;
      double prevDeposit = 0;
      double prevWithdraw = 0;
      double inputVal;

      int choice;

      Scanner input = new Scanner(System.in);

    do {
      System.out.println("Hello! Welcome to the Apreture Financial Systems Account Interface.");
      System.out.println("Would you like to: \nView Account Status \nDeposit Currency \nWithdraw Currency \nor\nTerminate this program? \n(1, 2, 3, or 8)");
      choice = input.nextInt();

      if (choice == 1) {
        read(currentBalance, prevBalance);
      }
      else if (choice == 2) {
        deposit(currentBalance);
      }
      else if (choice == 3) {
        withdraw(currentBalance);
      }
      else if (choice == 8) {
        System.end();
      }
      else {
        System.out.println("Please choose one of the available options.");
      }
    } while ();



  }

  public static deposit(double currBal){

    System.out.println("Please input the amount of currency to transfer.");
    double inpt = input.nextDouble();

    currBal += inpt;
    return currBal;

  }

  public static withdraw(double currBal){

    System.out.println("Please input the amount of currency to transfer.");
    double inpt = input.nextDouble();

    if (inpt > currBal) {
      System.out.println("You cannot withdraw more than $" + currBal + " from this account.");
    }
    else  currBal -= inpt;

    return currBal;
  }

  public static void read(double currBal, prevBal){
    System.out.println("This account's current balance is: $" + currBal);
    System.out.println("This account's previous balance was: $" + prevBal);
    System.out.println("That is a difference of " + (currBal - prevBal));
  }



}
