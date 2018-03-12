/*
Title: [TicTacToe]
  Intent:  [To play Tic Tac Toe]
  Created: [02/21/2018, 09:58]
  Updated: [02/21/2018, 09:58]
Programmer: LeGars, Dustin
  Editor: Atom 1.24.0 x64
  Compiler: [Compiling Program]
Program Identifier: [JP.R2-000-02.04.18]
Status: [Incomplete/Complete/Deprecated]
  Progress:    [--------------------] 0%
    Writing:   [----------] 0%
    Compiling: [----------] 0%
    Debugging: [----------] 0%
    Err Check: [----------] 0%
Imports: [Number of Import Statements]
  [Import Statement Names]
GitHub Link: [Link]
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
        c1r1 = 1;
      }
      if (rowChoice == 2) {
        c1r2 = 1;
      }
      if (rowChoice == 3) {
        c1r3 = 1;
      }
    }
    else if (colChoice == 2) {
      System.out.println("Pick a row to mark. (1, 2, 3)");
      int rowChoice = input.nextInt();
      if (rowChoice == 1) {
        c2r1 = 1;
      }
      if (rowChoice == 2) {
        c2r2 = 1;
      }
      if (rowChoice == 3) {
        c2r3 = 1;
      }
    }
    else if (colChoice == 3) {
      System.out.println("Pick a row to mark. (1, 2, 3)");
      int rowChoice = input.nextInt();
      if (rowChoice == 1) {
        c3r1 = 1;
      }
      if (rowChoice == 2) {
        c3r2 = 1;
      }
      if (rowChoice == 3) {
        c3r3 = 1;
      }
    }


  }

}
