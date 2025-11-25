package basics.pattern;

import java.util.Scanner;

public class triangle {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter a number: ");
      int num = sc.nextInt();

      for (int i = 1; i <= num; i++) {
        for (int j = 1; j <= i; j++)
          System.out.print("* ");
        System.out.println();
      }
      System.out.println();

      for (int i = 1; i <= num; i++) {
        for (int j = 1; j <= i; j++)
          System.out.print(j + " ");
        System.out.println();
      }
      System.out.println();

      for (int i = 1; i <= num; i++) {
        for (int j = 1; j <= i; j++)
          System.out.print((char) (i + 'A' - 1) + " ");
        System.out.println();
      }
      System.out.println();

      for (int i = 1; i <= num; i++) {
        for (int j = 1; j <= i; j++)
          if (i % 2 == 0)
            System.out.print((char) (j + 'A' - 1) + " ");
          else
            System.out.print(j + " ");
        System.out.println();
      }
      System.out.println();

      for (int i = 1; i <= num; i++) {
        for (int j = i; j <= num; j++)
          System.out.print(j + " ");
        System.out.println();
      }
      System.out.println();

      for (int i = 1; i <= num; i++) {
        for (int j = 1; j <= num - i + 1; j++)
          System.out.print((char) (i + 'A' - 1) + " ");
        System.out.println();
      }
      System.out.println();

      for (int i = 1; i <= num; i++) {
        for (int j = 1; j <= num - i + 1; j++)
          System.out.print((char) (j + 'A' - 1) + " ");
        System.out.println();
      }
      System.out.println();

      // * Floyd's Triangle */
      int count = 1;
      for (int i = 1; i <= num; i++) {
        for (int j = 1; j <= i; j++) {
          System.out.printf("%-4d", count);
          count++;
        }
        System.out.println();
      }
      System.out.println();

      //* Odd number Triangle */
      for (int i = 0; i <= num; i++) {
        for (int j = 1; j <= i; j++)
          System.out.print((2 * j - 1) + " ");
        System.out.println();
      }
      System.out.println();

      //* Vertically Flipped Star Triangle */
      for (int i = 1; i <= num; i++) {
        for (int j = 1; j <= num; j++) {
          if (j <= num - i)
            System.out.print("  ");
          else
            System.out.print("* ");
        }
        System.out.println();
      }
      System.out.println();

      //* Vertically Flipped Number Triangle */
      for (int i = 1; i <= num; i++) {
        for (int j = 1; j <= num - i; j++)
            System.out.print("  ");
        for (int j = 1; j <= i; j++)
            System.out.print(j + " ");
        System.out.println();
      }
      System.out.println();

      //* Vertically Flipped alphabet Triangle */
      for (int i = 1; i <= num; i++) {
        for (int j = 1; j <= num - i; j++)
            System.out.print("  ");
        for (int j = 1; j <= i; j++)
            System.out.print((char)(i + 'A' - 1) + " ");
        System.out.println();
      }
      System.out.println();
    }
  }
}
