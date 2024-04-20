import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int total = product(0, 1);
    System.out.println("Total: " + total);
  }

  static int product(int count, int number) {
    try(Scanner scnr = new Scanner(System.in)) {
      if(count == 5) return number;
      if(count == 0) {
        System.out.println("Enter a number");
      } else {
        System.out.print("Enter another number:");
      }
      int userInput = scnr.nextInt();
      int newInt = number * userInput;
      count++;
      return product(count, newInt);
    }

  }
}
