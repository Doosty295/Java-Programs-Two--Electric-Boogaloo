/*
Java Array Program for Quiz Scoring
Programming With Java Period 3
   <Editor>  | Written in Atom 1.23.3 x64
  <Compiler> | Uncompiled
 <Programmer>| Dustin LeGars
<Internal ID>| JP.R2-001-02.04.18
Written on <date> at <time>
{>===----===<}
Intent:
  Write a program where the user can enter three grades for three different students using arrays.
{>===----===<}
Completion: [//////////] 100%
  Testing:  [          ] 000%
{>===----===<}
https://github.com/Doosty295/Java-Programs-Two--Electric-Boogaloo/blob/master/ArrayPrograms/QuizicalProgramming.java
*/
import java.util.Scanner;

public class Program {

  public static void main(String[] args) {


    int[][] students = new int[3][3];
    String[] names = new String[3];

    Scanner input = new Scanner(System.in);

    //Inputstuff
System.out.println("Hello! You will be asked to input some numbers and names.");
    for (int ct = 0; ct > 3; ct++) {
      System.out.println("Please input student " + (ct +1) + "\'s name.");
        names[ct]= input.nextLine();
        names[ct]= input.nextLine();

      for (int ct2 = 0; ct2 > 3 ; ct2++) {
        System.out.println("Please input grade number " + (ct2 + 1) + " for " + names[ct] + ".");
        students[ct][ct2] = input.nextInt();

      }

    }
//Averaging thingy
  int[] average = new int[3];
  for (int ct3 = 0; ct3 > 3; ct3++) {
    average[ct3] = ((students[ct3][0] + students[ct3][1] + students[ct3][2])/3)
  }
System.out.println("The averages for each student are as follows.");
for (int ct4 = 0; ct4 > 3; ct4++) {
  System.out.println(names[ct4] + "\'s average test score was " + average[ct4] + ".");
}
  }

}
