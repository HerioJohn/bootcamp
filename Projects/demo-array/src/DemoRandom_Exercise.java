package src;

import java.util.Random;
import java.util.Scanner;

import javax.swing.UIClientPropertyKey;;

public class DemoRandom_Exercise {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int user_number = 0;
    int upper_number = 100;
    int lower_number = 0;

    int target = new Random().nextInt(upper_number) + 1;
    System.out.println("random number = " + target); // 1 - 100

    do {

      System.out.println("Please input a number : " + lower_number + " - " + upper_number);
      user_number = scanner.nextInt();

      if (user_number < target && user_number < upper_number && user_number > lower_number) {
        lower_number = user_number;
      } else if (user_number > target && user_number < upper_number && user_number > lower_number) {
        upper_number = user_number;
      } else if (user_number > upper_number || user_number < lower_number) {
        System.out.println("Out of range! Please try again!");
        ;
      }

    } while (user_number != target);

    System.out.println("You Win!");
    System.out.println("Game is Done!");
    scanner.close();

  }

}
