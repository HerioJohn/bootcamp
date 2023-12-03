package src;

import java.util.Random;
import java.util.Scanner;;

public class DemoRandom {

  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input a number: ");
    int user_number = scanner.nextInt();

   // int target = new Random().nextInt(3);
  // System.out.println("random number = " + target); //0, 1, 2

    int target = new Random().nextInt(3) + 1;
    System.out.println("random numbber = " + target); // 1, 2, 3

    while (user_number != target)
    { 
      System.out.println("Opps! Wrong Number! Try again!");
      main(args);
    }
    
    System.out.println("You guess the correct number! You Win!");
    return;

  }
  
}
