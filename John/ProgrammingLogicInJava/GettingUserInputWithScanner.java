package John.ProgrammingLogicInJava;

import java.util.Scanner;

public class GettingUserInputWithScanner {

  public static void main(String[] args) {

    String name;
    int age;
    float shoeSize;

    System.out.println("Please enter the name: ");
    Scanner userInput = new Scanner(System.in);

    name = userInput.nextLine();

    System.out.println("The name is: " + name);
    
  }


  
}
