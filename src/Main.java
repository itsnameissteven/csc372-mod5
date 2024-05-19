import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int total = product(0, 0);
    System.out.println("Total: " + total);
  }


  static int product(int count, int number) {
    try(Scanner scnr = new Scanner(System.in)) {
      // Stop program after count hits five with the product
      if(count == 5) return number;

      // Print appropriate message and set initial number to 1
      if(count == 0) {
        number = 1;
        System.out.print("Enter a number: ");
      } else {
        System.out.print("Enter another number: ");
      }

      // Get user number input or print error message
      int userInput;
      while (true) {
        try {
          userInput = scnr.nextInt();
          // Multiply number by user input and increase number
          number = number * userInput;
          count++;
          // Use new values and recursively call function.
          return product(count, number);
        } catch (InputMismatchException error) {
          // 
          System.out.println("Incorrect input entered, a valid number");
          scnr.next();
        }
      }

    }

  }
}
