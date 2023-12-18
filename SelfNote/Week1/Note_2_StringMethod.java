public class Note_2_StringMethod {

//------------------------------------------------[String Method]---------------------------------------------------------------------

  public static void main(String[] args) {

    String name = "Tommy";

    // equals()

    boolean result = name.equals("Tommy");
    
    System.out.println("The result of equals is: " + result); // true

    // equalsIgnoreCase()

    boolean result2 = name.equalsIgnoreCase("tommY");

    System.out.println("The result2 of equlsIgnoreCase is: " + result); // true

    // length()

    int sentenceNumber = name.length();

    System.out.println("The number of character of name is: " + sentenceNumber); // 5

    // charAt()

    char charResult = name.charAt(2);

    System.out.println("The second charAt position in name is: " + charResult); // m

    // indexOf()

    int indexResult = name.indexOf("y");

    System.out.println("The index of y in name is: " + indexResult); // 4

    // isEmpty()

    boolean emptyResult = name.isEmpty();

    System.out.println("Does name is a empty string? The answer is: " + emptyResult); // false

    // toUpperCase()

    String uppercaseResult = name.toUpperCase();

    System.out.println("After I change the name to all Uppercase, it will become: " + uppercaseResult); // TOMMY

    // toLowerCase()

    String lowercaseResult = name.toLowerCase();

    System.out.println("After I change the name to all Lowercase, it will become: " + lowercaseResult); // tommy
    
    // trim()

    String target = "          ReadyToBeTrim         ";

    System.out.println("After trim, target will become: " + target.trim());

    // concat()

    String concatTarget_1 = "Hello, ";

    String concatTarget_2 = "My name is Mary.";

    System.out.println("After concat, target will becom: " + concatTarget_1.concat(concatTarget_2)); // Hello, My name is Mary.

    // substring()

    String substringTarget = "I love dog.";

    System.out.println(substringTarget.substring(7,10)); // dog

    // replace()

    String replaceResult = name.replace('m', 'c');

    System.out.println("After replace, the name will become: " + replaceResult); // Tommy -> Toccy

    // valueOf()

    int num = 100;

    String numText = String.valueOf(num);

    System.out.println("I turn the int into a String! Here is the result: " + numText); //100
    
  }
  
}
