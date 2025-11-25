package pattern;

import java.util.Scanner;

public class diamond {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter number: ");
      int rows = sc.nextInt();

      //? Can also be done using nsp/nst method
      //* Upper Pyramid */
      for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= (rows - i + 1); j++)
          System.out.print("  ");
        for (int j = 1; j <= (2 * i - 1); j++)
          System.out.print("* ");
        System.out.println();
      }
      //* Lower Pyramid */
      for (int i = 1; i <= rows - 1; i++) {
        for (int j = 0; j <= i; j++)
          System.out.print("  ");
        for (int j = ((2 * (rows - i)) - 1); j >= 1; j--)
          System.out.print("* ");
        System.out.println();
      }
    }
  }
}
