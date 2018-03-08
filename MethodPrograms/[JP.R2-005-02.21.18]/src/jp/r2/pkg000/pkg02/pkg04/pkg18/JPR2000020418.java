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

    char c1r1 = ' ';
    char c1r2 = ' ';
    char c1r3 = ' ';
    char c2r1 = ' ';
    char c2r2 = ' ';
    char c2r3 = ' ';
    char c3r1 = ' ';
    char c3r2 = ' ';
    char c3r3 = ' ';

    Scanner input = new Scanner(System.in);

    System.out.println("  --A---B---C--");
    System.out.println("A | " + c1r1 + " | " + c2r1 + " | " + c3r1 + " |");
    System.out.println("  -------------");
    System.out.println("B | " + c1r2 + " | " + c2r2 + " | " + c3r2 + " |");
    System.out.println("  -------------");
    System.out.println("C | " + c1r3 + " | " + c2r3 + " | " + c3r3 + " |");
    System.out.println("  -------------");


    System.out.println("Pick a column to mark. (A, B, C)");

    System.out.println("Pick a row to mark. (A, B, C)");


  }

}
