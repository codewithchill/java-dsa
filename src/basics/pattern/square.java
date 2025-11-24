package basics.pattern;

import java.util.Scanner;

public class square {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {

      System.out.print("Enter the number: ");
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

    }
  }
}
