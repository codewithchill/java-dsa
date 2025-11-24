package basics;

import java.util.Scanner;

public class loops {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter a number: ");
      int num = sc.nextInt();
      for (int i = 1; i <= num; i++)
        if (i % 2 != 0) {
          for (int j = 1; j <= i; j++)
            if (j % 2 != 0)
              System.out.print(j + " ");
          System.out.println();
        }
    }
  }
}
