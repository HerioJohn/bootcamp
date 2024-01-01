package SelfNote.Week2;

import java.util.Random;

public class Note_11_Random {

  public static void main(String[] args) {
    
    Random num = new Random();

    int x = num.nextInt(1,6); // or int x = num.nextInt(6) + 1; 

    System.out.println("The Random number x is: " + x);

    // Random double

    double y = num.nextDouble();

    System.out.println("The Random number y is: " + y);

    // Random boolean

    boolean i = num.nextBoolean();

    System.out.println("True or flase? The answer is: " + i);

    // Generating random characters within a custom range (ASCII code)

    char j = (char)(num.nextInt(65,90)); // int -> char, downcast

    System.out.println("The random character (A - Z) is: " + j);

  }
  
}
