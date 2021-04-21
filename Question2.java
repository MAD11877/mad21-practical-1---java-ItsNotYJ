import java.util.Scanner;
import java.lang.Math;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Question2
{
  private static DecimalFormat df = new DecimalFormat("0.00");

  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
    df.setRoundingMode(RoundingMode.DOWN);
    Scanner user = new Scanner(System.in);
    System.out.print("Enter your height(m): ");
    double height = user.nextDouble();

    System.out.print("Enter your weight(kg): ");
    double weight = user.nextDouble();

    double bmi = weight / (height * height);

    System.out.print("Your BMI is: " + df.format(bmi));
  }
}
