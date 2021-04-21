import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
    
    Scanner in = new Scanner(System.in);
    // System.out.print("Please enter a number: "); // For some reason this user prompt gives an error in github
    int user_num = in.nextInt();

    System.out.println(/*"The square of this number is: "*/ + (user_num * user_num));
  }
}
