package SelfNote.Week6.Bonus;

import java.util.EmptyStackException;

import javax.crypto.ExemptionMechanismException;

public class ExceptionHandling {

  public static void main(String[] args) {
    
    printInt("8");

    printInt("cheese"); // will cause runtime Error: java.lang.NumberFormatException, unless we use try and catch.

    System.out.println("Program Ended.");
  }

  private static void printInt(String numberString) {

    try {

      int myInt = Integer.parseInt(numberString); // parseInt: Take a String, return value as an int 
      System.out.println("If there is exception. I will never get printed.");

    }
    catch (NumberFormatException nfe) { // Catch specific exception

      System.out.println("Caught an exception: Number format problem.");

    }
    catch (Exception e) { // Catch all exception

      System.out.println("I don't know what exception is that, but I catch it.");

    }
    finally { // Will be executed no matter what

      System.out.println("No matter there is exception or not. I will be printed.");

    }
  }
  
}
