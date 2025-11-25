package pattern;

import java.util.Scanner;

public class pyramid {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the number of lines: ");
      int rows = sc.nextInt();

      for (int i = 1; i <= rows; i++) {
        for (int j = i; j <= rows - 1; j++)
          System.out.print("  ");
        for (int j = 1; j <= (i * 2 - 1); j++)
          System.out.print("* ");
        System.out.println();
      }
      System.out.println();
    }
  }
}
