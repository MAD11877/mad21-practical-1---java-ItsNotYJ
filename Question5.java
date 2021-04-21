import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    Scanner in = new Scanner(System.in);
    // System.out.print("Please enter the number of integers you will enter: "); // For some reason this user prompt gives an error in github
    
    ArrayList<Integer> numbers = new ArrayList<>();
    int no_of_entries = in.nextInt();
    
    int x = 0;
    while (x < no_of_entries) {
      // System.out.print("Please enter a number: "); // For some reason this user prompt gives an error in github
      numbers.add(in.nextInt()); // Append each input into arrayList
      x++;
    }
    
    Collections.sort(numbers); // Sorting the arrayList

    int num_count = 0; // Actually count of the mode
    int num_mode = numbers.get(0);

    int temp_num = 0; // To store the current num
    int temp_count = 0; // Temp count for current temp number

    for (int p = 0; p < numbers.size(); p++) {
      if (numbers.get(p) == num_mode) {
        temp_count += 1; // Count number of appearences

        if (temp_count > num_count) {
          num_mode = numbers.get(p); // Set new mode
          num_count = temp_count; // Set new mode count
        }
      }
      else if (numbers.get(p) == temp_num) {
        temp_count += 1;

        if (temp_count > num_count) {
          num_mode = numbers.get(p); // Set new mode
          num_count = temp_count; // Set new mode count
        }
      }
      else {
        temp_num = numbers.get(p); // Reset current number
        temp_count = 1;  // Reset current count

        continue;
      }
    }

    System.out.println(num_mode);
  }
}
