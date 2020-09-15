import java.util.Scanner;

/** This program will tell you what to say durring FizzBuzz
 *
 * @author Isaac
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * 
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a number to play FizzBuzz.");
    int number = input.nextInt();
    double number_Fizz = number % 3;
    double number_Buzz = number % 5;
    if (number_Buzz == 0 && number_Fizz == 0) {
      System.out.println("You should say FizzBuzz");
    } else if (number_Fizz == 0) {
      System.out.println("You should say Fizz.");
    } else if (number_Buzz == 0) {
      System.out.println("You should say Buzz.");
    } else if (number_Fizz ==1 ) {
      System.out.println("You should say " + number + ".");

    }

  }

}
