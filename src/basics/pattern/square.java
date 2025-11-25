package basics.pattern;

import java.util.Scanner;

public class square {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {

      System.out.print("Enter the number(Enter odd number for special figures): ");
      int n = sc.nextInt();
      for (int i = 0; i < n; i++) {
        for (int j = 1; j <= n; j++) {
          System.out.print(j + "  ");
        }
        System.out.println();
      }
      System.out.println("------------");

      for (int i = 0; i < n; i++) {
        for (int j = 'A'; j <= ('A' + n - 1); j++) {
          char l = (char) j;
          System.out.print(l + "  ");
        }
        System.out.println();
      }
      System.out.println("------------");

      for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
          if (i % 2 == 0)
            System.out.print((char) (i + 'A' - 1) + "  ");
          else
            System.out.print((char) (i + 'a' - 1) + "  ");
        }
        System.out.println();
      }
      System.out.println("------------");

      if (n % 2 != 0) {
        for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= n; j++) {
            if ((j == (n / 2 + 1)) || (i == (n / 2 + 1)))
              System.out.print("* ");
            else
              System.out.print("  ");
          }
          System.out.println();
        }
        System.out.println("------------");
      }
      if (n % 2 != 0) {
        // ? Print the following pattern for n is odd
        /*
         * *
         * *
         *
         * *
         * *
         */
        for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= n; j++) {
            if (i == j || j == (n - i + 1))
              System.out.print("* ");
            else
              System.out.print("  ");
          }
          System.out.println();
        }
        System.out.println("------------");
      }

      //* Rhombus */
      for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n - i; j++)
          System.out.print("  ");
        for (int j = 1; j <= n; j++)
          System.out.print("* ");
        System.out.println();
      }
      System.out.println("------------");

      //* Special Structure */
      for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n - i; j++)
          System.out.print("  ");
        for (int j = i; j <= n; j++)
          System.out.print("* ");
        System.out.println();
      }
      System.out.println("------------");
    }
  }
}
