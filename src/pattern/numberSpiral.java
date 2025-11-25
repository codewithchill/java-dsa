package pattern;

import java.util.Scanner;

public class numberSpiral {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the number of lines: ");
      int num = sc.nextInt();
      int size = 2 * num - 1;
      for (int i = 1; i <= size; i++) {
        for (int j = 1; j <= size; j++) {
          int a = i, b = j;
          if (i > num)
            a = 2 * num - i;
          if (j > num)
            b = 2 * num - j;
          System.out.print(((a > b) ? b : a) + " ");
        }
        System.out.println();
      }
    }
  }
}
