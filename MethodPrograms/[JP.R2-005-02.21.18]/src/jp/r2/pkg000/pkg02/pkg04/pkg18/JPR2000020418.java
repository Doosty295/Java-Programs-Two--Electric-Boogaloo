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


public class JPR2000020418 {

  public static void main(String[] args) {

		double posXselect = (Math.random()*1000);
		double posYselect = (Math.random()*1000);
		
		int xPos = 0;
		int yPos = 0;
		
		if (posXselect > 333){
		    xPos = 1;
		} 
		
		if (posXselect < 666){
		    xPos = 2
		}
		
		else xPos = 3;
		
		if (posYselect > 333){
		    yPos = 1;
		} 
		
		if (posYselect < 666){
		    yPos = 2
		}
		
		else yPos = 3;
		
		
    

  }

}
