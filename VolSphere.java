/**
 * Its Hello World, but with style.
 *
 * @author Kevin Csiffary
 * @version 1.0
 * @since 2024-02-15
 */
import java.util.Scanner;

public final class VolSphere {
  /** Private constructor to prevent instantiation of this utility class. */
  private VolSphere() {
    // Prevents instantiation.
  }

  /**
   * Create main function.
   *
   * @param args Command line arguments.
   */
  public static void main(final String[] args) {

    // Create the scanner.
    Scanner sc = new Scanner(System.in);

    // Ask user for their radius.
    System.out.println(
        "This program calculates the volume of a sphere!!\nWhat is the radius of your sphere?");
    String radString = sc.nextLine();

    // Cast the input to a double.
    double radDouble = Double.parseDouble(radString);

    if (radDouble < 0) {
      // Tell user they cant have a negative number.
      System.out.println("You can't have a negative radius!");
    } else {
      // Calculate volume.
      double volume = ((4 / 3.0) * Math.PI * Math.pow(radDouble, 3));

      // Display the volume to the user.
      System.out.println("The volume of your sphere is: " + volume);
    }
  }
}
