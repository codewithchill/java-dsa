package pattern;

import java.util.Scanner;

public class binaryTriangle {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter a number: ");
      int num = sc.nextInt();

      // ? Normal solution */
      System.out.println("Normal Solution:");
      for (int i = 1; i <= num; i++) {
        if (i % 2 == 0) {
          for (int j = 1; j <= i; j++) {
            if (j % 2 == 0)
              System.out.print("1 ");
            else
              System.out.print("0 ");
          }
        } else {
          for (int j = 1; j <= i; j++) {
            if (j % 2 == 0)
              System.out.print("0 ");
            else
              System.out.print("1 ");
          }
        }
        System.out.println();
      }
      System.out.println();

      // * Optimised solution */
      System.out.println("Optimised Solution:");
      for (int i = 1; i <= num; i++) {
        for (int j = 1; j <= i; j++) {
          if ((i + j) % 2 == 0)
            System.out.print("1 ");
          else
            System.out.print("0 ");
        }
        System.out.println();
      }
      System.out.println();
    }
  }
}
