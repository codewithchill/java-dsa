package basics;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter a number: ");
      int x = sc.nextInt();
      int number = 0, counter = 0;
      while (x != 0) {
        number = (number * 10) + x % 10;
        x /= 10;
        counter++;
      }
      if (counter == 4) {
        System.out.println("Entered number is of four digits");
      } else {
        System.out.println("Entered number is not of four digits");
      }
    }
  }
}
