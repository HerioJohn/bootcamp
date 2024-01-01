package SelfNote.Week2;

import java.util.Scanner;

public class Note_10_Scanner {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("What is your name?");
    String name = scanner.nextLine();

    System.out.println("Hello there! " + name + ", how old are you?");
    int age = scanner.nextInt();
    scanner.nextLine(); // consume the newline character
    
    System.out.println("So " + name + ", you are " + age + " years old!");

    System.out.println("Tell me, " + name + ", what is your favoritie food?");
    String food = scanner.nextLine();
    
    System.out.println("I love " + food + " too! :D");

  }

}
