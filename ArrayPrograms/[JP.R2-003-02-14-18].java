/*
Title: Methodical Arrays
  Intent:  Get minimum element from an array.
  Created: [02/14/2018, 14:30]
  Updated: [02/14/2018, 16:20]
Programmer: LeGars, Dustin
  Editor: Atom 1.24.0 x64
  Compiler: [None]
Program Identifier: [JP.R2-003-02.14.18]
Status: [Complete]
  Progress:    [///////////////////] 100%
    Writing:   [//////////] 100%
    Compiling: [----------] NULL
    Debugging: [----------] NULL
    Err Check: [----------] NULL
Imports: [0]
  [None]
GitHub Link: https://github.com/Doosty295/Java-Programs-Two--Electric-Boogaloo/blob/master/ArrayPrograms/%5BJP.R2-002-02-06-18%5D.java
Additional Information:
Use methods and arrays.



*/



public class Methods_n_Arrays {

  public static void main(String[] args) {

    int minVal;

    int[] list = new int[10];
      list[0] = 75;
      list[1] = 65;
      list[2] = 24;
      list[3] = 11;
      list[4] = 45;
      list[5] = 32;
      list[6] = 22;
      list[7] = 3;
      list[8] = 54;
      list[9] = 5;

      minimum(list[0,1,2,3,4,5,6,7,8,9]);

  }

  public static minimum(int[] list){

    int currentMin = 0;
    int[] list = new int[10];

    for (int i; i<10; i++) {
      if (list[i] < currentMin) {
        currentMin = list[i];
      }
    }

    System.out.println("The lowest value of the given list is " + currentMin + ".");

  }

}
