package pattern;

import java.util.Scanner;

public class rectangle {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the number of rows: ");
      int rows = sc.nextInt();
      System.out.print("Enter the number of columns: ");
      int columns = sc.nextInt();

      System.out.println();
      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++)
          System.out.print("* ");
        System.out.println();
      }
      System.out.println();

      for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= columns; j++) {
          if (i == 1 || i == rows)
            System.out.print("* ");
          else {
            if (j == 1 || j == columns) {
              System.out.print("* ");
            } else {
              System.out.print("  ");
            }
          }
        }
        System.out.println();
      }
      System.out.println();
    }
  }
}
