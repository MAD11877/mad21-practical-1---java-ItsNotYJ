import java.util.Scanner;

public class Question4 {
  public static void main(String[] args) {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the
     * integer given. e.g. > 5 
     
     *****
     **** 
     *** 
     ** 
     *

     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */



    /* Hi, this is my code but I just answered the question in reverse, if need I can just reverse the code to flip the right angle triangle where the base is on top and not below :))
    */
    Scanner in = new Scanner(System.in);
    System.out.print("Please enter a number: ");

    int user_num = in.nextInt();

    int i = 0;

    while (i < user_num) {
      for (int x = 0; x <= i; x++) {
        System.out.print("*");
      }
      System.out.println();
      i++;
    }
  }
}
