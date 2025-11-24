package basics;

import java.util.Scanner;

public class scanner {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {

      final double PI = 3.141592;
      boolean validInput = false;

      while (!validInput) {
        try {
          double r = 0;
          System.out.print("Enter the radius: ");
          r = sc.nextDouble();
          System.out.println("The area of the circle is: " + (PI * r * r));
          validInput = true;
        } catch (Exception e) {
          System.out.println("You entered a invalid type!");
          System.out.println("Exception: \033[31m" + e + "\033[0m");
          sc.next();
        }
      }

      validInput = false;
      while (!validInput) {
        String str = "";
        try {
          System.out.print("Enter a character: ");
          str = sc.next();
          char c = str.charAt(0);
          System.out.println("You entered: " + c);
          validInput = true;
        } catch (Exception e) {
          System.out.println("Exception: \033[31m" + e + "\033[0m");
          sc.next();
        }
      }

    }
  }
}
