/*
Title: [TicTacToe]
  Intent:  [To play Tic Tac Toe]
  Created: [02/21/2018, 09:58]
  Updated: [034/19/2018, 10:23]
Programmer: LeGars, Dustin
  Editor: Atom 1.24.1 x64
  Compiler: [NetBeans IDE]
Program Identifier: [JP.R2-000-02.04.18]
Status: [I GIVE UP]
  Progress:    {\\\\\\[--------------------] -30%
    Writing:   [/////-----] 50%
    Compiling: [//--------] 20%
    Debugging: {\\\\\\\\\\[----------] -100%
    Err Check: {\\\\\\\\\\[----------] -100%
Imports: [Number of Import Statements]
  [Import Statement Names]
GitHub Link: [https://github.com/Doosty295/Java-Programs-Two--Electric-Boogaloo/blob/master/MethodPrograms/%5BJP.R2-005-02.21.18%5D/src/jp/r2/pkg000/pkg02/pkg04/pkg18/JPR2000020418.java]
Additional Information:




*/
package jp.r2.pkg000.pkg02.pkg04.pkg18;

import java.util.Scanner;

public class JPR2000020418 {

  public static void main(String[] args) {

    int c1r1 = 0;
    int c1r2 = 0;
    int c1r3 = 0;
    int c2r1 = 0;
    int c2r2 = 0;
    int c2r3 = 0;
    int c3r1 = 0;
    int c3r2 = 0;
    int c3r3 = 0;

    Scanner input = new Scanner(System.in);


    System.out.println("Would you like to play a game? 1=Yes, anything else = No.");
    int play = input.nextInt();

while (play == 1) {

  System.out.println("  --1---2---3--");
  System.out.println("1 | " + c1r1 + " | " + c2r1 + " | " + c3r1 + " |");
  System.out.println("  -------------");
  System.out.println("2 | " + c1r2 + " | " + c2r2 + " | " + c3r2 + " |");
  System.out.println("  -------------");
  System.out.println("3 | " + c1r3 + " | " + c2r3 + " | " + c3r3 + " |");
  System.out.println("  -------------");

    System.out.println("Pick a column to mark. (1, 2, 3)");
    int colChoice = input.nextInt();
    if (colChoice == 1) {
      System.out.println("Pick a row to mark. (1, 2, 3)");
      int rowChoice = input.nextInt();
      if (rowChoice == 1) {
        if (c1r1 != 0) {
          System.out.println("ლ(▀̿Ĺ̯▀̿ ̿ლ)\ny u do dis?\n\n");
        }
        else {
          c1r1 = 4;
        }
      }
      if (rowChoice == 2) {
        if (c1r2 != 0) {
          System.out.println("ლ(▀̿Ĺ̯▀̿ ̿ლ)\ny u do dis?\n\n");
        }
        else {
          c1r2 = 4;
        }

      }
      if (rowChoice == 3) {
        if (c1r3 != 0) {
          System.out.println("ლ(▀̿Ĺ̯▀̿ ̿ლ)\ny u do dis?\n\n");
        }
        else {
          c1r3 = 4;
        }

      }
    }
    else if (colChoice == 2) {
      System.out.println("Pick a row to mark. (1, 2, 3)");
      int rowChoice = input.nextInt();
      if (rowChoice == 1) {
        if (c2r1 != 0) {
          System.out.println("ლ(▀̿Ĺ̯▀̿ ̿ლ)\ny u do dis?\n\n");
        }
        else {
          c2r1 = 4;
        }

      }
      if (rowChoice == 2) {
        if (c2r2 != 0) {
          System.out.println("ლ(▀̿Ĺ̯▀̿ ̿ლ)\ny u do dis?\n\n");
        }
        else {
          c2r2 = 4;
        }

      }
      if (rowChoice == 3) {
        if (c2r3 != 0) {
          System.out.println("ლ(▀̿Ĺ̯▀̿ ̿ლ)\ny u do dis?\n\n");
        }
        else {
          c2r3 = 4;
        }

      }
    }
    else if (colChoice == 3) {
      System.out.println("Pick a row to mark. (1, 2, 3)");
      int rowChoice = input.nextInt();
      if (rowChoice == 1) {
        if (c3r1 != 0) {
          System.out.println("ლ(▀̿Ĺ̯▀̿ ̿ლ)\ny u do dis?\n\n");
        }
        else {
          c3r1 = 4;
        }

      }
      if (rowChoice == 2) {
        if (c3r2 != 0) {
          System.out.println("ლ(▀̿Ĺ̯▀̿ ̿ლ)\ny u do dis?\n\n");
        }
        else {
          c3r2 = 4;
        }

      }
      if (rowChoice == 3) {
        if (c3r3 != 0) {
          System.out.println("ლ(▀̿Ĺ̯▀̿ ̿ლ)\ny u do dis?\n\n");
        }
        else {
          c3r3 = 4;
        }

      }
    }
    System.out.println("Computer turn.");
    double vertCom = Math.random();
    double horizCom = Math.random();

    if (horizCom < 0.33) {
      if (vertCom < 0.33 & c1r1 != 0) {
        System.out.println("The computer attempted to take an already claimed space. Fail.");
      }
      else {
        c1r1 = 8;
      }
      if (vertCom < 0.66 & vertCom > 0.33 & c1r2 != 0) {
        System.out.println("The computer attempted to take an already claimed space. Fail.");
      }
      else {
        c1r2 = 8;
      }
      if (vertCom > 0.66 & c1r3 != 0) {
        System.out.println("The computer attempted to take an already claimed space. Fail.");
      }
      else {
        c1r3 = 8;
      }
    }
    if (horizCom < 0.66 & horizCom > 0.33) {
      if (vertCom < 0.33 & c2r1 != 0) {
        System.out.println("The computer attempted to take an already claimed space. Fail.");
      }
      else {
        c2r1 = 8;
      }
      if (vertCom < 0.66 & vertCom > 0.33 & c2r2 != 0) {
        System.out.println("The computer attempted to take an already claimed space. Fail.");
      }
      else {
        c2r2 = 8;
      }
      if (vertCom > 0.66 & c2r3 != 0) {
        System.out.println("The computer attempted to take an already claimed space. Fail.");
      }
      else {
        c2r3 = 8;
      }
    }
    if (horizCom > 0.66) {
      if (vertCom < 0.33 & c3r1 != 0) {
        System.out.println("The computer attempted to take an already claimed space. Fail.");
      }
      else {
        c3r1 = 8;
      }
      if (vertCom < 0.66 & vertCom > 0.33 & c3r2 != 0) {
        System.out.println("The computer attempted to take an already claimed space. Fail.");
      }
      else {
        c3r2 = 8;
      }
      if (vertCom > 0.66 & c3r3 != 0) {
        System.out.println("The computer attempted to take an already claimed space. Fail.");
      }
      else {
        c3r3 = 8;
      }

    }
          System.out.println("99 Logical Bugs in the code, 99 Logical Bugs!\nTake one down and patch it around, 117 Logical Bugs in the code!"); System.end();
}


  }

}
