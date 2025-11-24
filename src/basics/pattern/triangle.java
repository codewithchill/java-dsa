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
          System.out.print((char)(i + 'A' - 1) + " ");
        System.out.println();
      }
      System.out.println();

      for (int i = 1; i <= num; i++) {
        for (int j = 1; j <= i; j++)
          if (i % 2 == 0)
            System.out.print((char)(j + 'A' - 1) + " ");
          else
            System.out.print(j + " ");
        System.out.println();
      }
      System.out.println();

    }
  }
}
