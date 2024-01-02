package SelfNote.Week6.Note_1_Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
  
  public static void main(String[] args) {

    Printer<Integer> printer_1 = new Printer(23);
    printer_1.print();

    // Generic Type don't work with primitive type (int, float, double...etc)
    // Printer <double> printer_2 = new Printer (10.5); <- this is wrong

    Printer<Double> printer_2 = new Printer(10.5);
    printer_2.print();

    shout("I am superman"); // Example 1

    shout2("I like Apple","I like Pizza"); // Example 2

    System.out.println(returnType(100.5)); // Example 3

    List<Integer> intList = new ArrayList<>(); // Example 4
    intList.add(3);
    printList(intList);

    List<String> stringList = new ArrayList<>(); // Example 4
    stringList.add("Sushi");
    printList(stringList);

  }

  // Example 1
  private static <T> void shout (T thingToShout) {
    System.out.println(thingToShout + "!!!!");
  }

  // Example 2
  private static <T,V> void shout2 (T thingToShout, V otherThingToShout) {
    System.out.println(thingToShout + "!!!!");
    System.out.println(otherThingToShout + "!!!!");
  }

  // Example 3
  private static <T> T returnType (T thingToReturn) {
    return thingToReturn;
  }

  // Example 4
  private static void printList(List<?> myList) { // the ? is wildcard, tell Java that this Method accept everything.
    System.out.println(myList);
  }
  
}
