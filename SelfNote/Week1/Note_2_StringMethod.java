public class Note_2_StringMethod {

//------------------------------------------------[String Method]---------------------------------------------------------------------

  public static void main(String[] args) {

    String name = "Tommy";

//-----------------------------------------------------------------------------------

    // length()

    int sentenceNumber = name.length();

    System.out.println("The number of character of name is: " + sentenceNumber); // 5

//-----------------------------------------------------------------------------------

    // charAt()

    char charResult = name.charAt(2);

    System.out.println("The second charAt position in name is: " + charResult); // m

//-----------------------------------------------------------------------------------

    // isEmpty()

    boolean emptyResult = name.isEmpty();

    System.out.println("Does name is a empty string? The answer is: " + emptyResult); // false

//-----------------------------------------------------------------------------------

    // isBlank()

    String str1 = "";
    String str2 = "Hello";
    String str3 = " ";

    System.out.println(str1.isBlank()); //true
    System.out.println(str2.isBlank()); //false
    System.out.println(str3.isBlank()); //true

//-----------------------------------------------------------------------------------

    // substring()

    String substringTarget = "I love dog, how about you?";

    System.out.println(substringTarget.substring(7,10)); // dog
    System.out.println(substringTarget.substring(12)); // how about you?

//-----------------------------------------------------------------------------------

    // toUpperCase()

    String uppercaseResult = name.toUpperCase();

    System.out.println("After I change the name to all Uppercase, it will become: " + uppercaseResult); // TOMMY

//-----------------------------------------------------------------------------------

    // toLowerCase()

    String lowercaseResult = name.toLowerCase();

    System.out.println("After I change the name to all Lowercase, it will become: " + lowercaseResult); // tommy

//-----------------------------------------------------------------------------------

    // replace()

    String replaceResult = name.replace('m', 'c');
    System.out.println("After replace, the name will become: " + replaceResult); // Tommy -> Toccy

    String replaceResult2 = name.replace("Tommy", "Mary");
    System.out.println("If I replace Tommy to Mary, it will become: " + replaceResult2); // Tommy -> Mary

//-----------------------------------------------------------------------------------

    // contain()

    System.out.println("Does the name contain omm? The answer is: " + name.contains("omm")); //true

//-----------------------------------------------------------------------------------

    // startsWith()

    System.out.println("Does the name start with t? The answer is: " + name.startsWith("t")); //false
    System.out.println("Does the name start with T? The answer is: " + name.startsWith("T")); //True

//-----------------------------------------------------------------------------------

    // endsWith()

    System.out.println("Does the name end with y? The answer is: " + name.endsWith("y")); //true
    System.out.println("Does the name end with Y? The answer is: " + name.endsWith("Y")); //false

//-----------------------------------------------------------------------------------

    // trim()

    String target = "          ReadyToBeTrim         ";

    System.out.println("After trim, target will become: " + target.trim()); //ReadyToBeTrim

//-----------------------------------------------------------------------------------

    // equals()

    boolean result = name.equals("Tommy");
    
    System.out.println("The result of equals is: " + result); // true

//-----------------------------------------------------------------------------------

    // equalsIgnoreCase()

    boolean result2 = name.equalsIgnoreCase("tommY");

    System.out.println("The result2 of equlsIgnoreCase is: " + result2); // true

//-----------------------------------------------------------------------------------

    // indexOf(int ch)

    int indexResult = name.indexOf('y');
    int indexResult2 = name.indexOf('c');

    System.out.println("The index of y in name is: " + indexResult); // 4
    System.out.println("The index of c in name is: " + indexResult2); // -1 (Not Found)

//-----------------------------------------------------------------------------------

    // indexOf(String str)

    int indexResult3 = name.indexOf("ommy");

    System.out.println("The index of ommy in name is: " + indexResult3); // 1

//-----------------------------------------------------------------------------------

    // lastIndexOf(int ch)

    String o_Garden = "There are many letter o here: o, o, o, o, o.";

    int lastIndexResult = o_Garden.lastIndexOf('o');

    System.out.println("The last index of o in o_Garden is: " + lastIndexResult); //42

//-----------------------------------------------------------------------------------

    // lastIndexOf(String str)

    String y_Garden = "There are many letter y here: yb, yc, yc, ya, ye, yf.";

    int lastIndexResult2 = y_Garden.lastIndexOf("yc");

    System.out.println("The last index of yc in y_Garden is: " + lastIndexResult2); //38

//-----------------------------------------------------------------------------------

    
    // concat()

    String concatTarget_1 = "Hello, ";

    String concatTarget_2 = "My name is Mary.";

    System.out.println("After concat, target will becom: " + concatTarget_1.concat(concatTarget_2)); // Hello, My name is Mary.

//-----------------------------------------------------------------------------------

    // compareTo() ： 用於比較兩個對象的順序

    String compareTarget_1 = "A";

    String compareTarget_2 = "B";

    System.out.println("Using compareTo method, the result will be: " + compareTarget_1.compareTo(compareTarget_2)); // A 位於 B 前面，因此 return -1

//-----------------------------------------------------------------------------------

    // valueOf()

    int num = 100;

    String numText = String.valueOf(num);

    System.out.println("I turn the int into a String! Here is the result: " + numText); //100
    
  }
  
}
