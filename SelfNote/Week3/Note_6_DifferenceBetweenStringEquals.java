package SelfNote.Week3;
public class Note_6_DifferenceBetweenStringEquals {

  public static void main(String[] args) {

    // equals <= check if it is same value
    // == <= check if it is same object
     
    String str1 = "hello";
    String str2 = "hello"; // check if "hello" exists in String Literal Pool
    // so that JV< can reuse "hello" object byvarious object reference

    System.out.println(str1.equals(str2)); //true
    System.out.println(str1 == str2); //true

    String str3 = "hello!";
    System.out.println(str1.equals(str3)); //false
    System.out.println(str1 == str3); //false, different value

    String str4 = new String ("hello");
    System.out.println(str1.equals(str4)); // true
    System.out.println(str1 == str4); // false, "new" force creating an object

    String str5 = String.valueOf("hello");
    System.out.println(str1 == str5); // true, look up literal
    System.out.println(str4.equals(str5)); // true
    System.out.println(str4 == str5); // false

    if ("hello".equals(str5)) { // true
      System.out.println("str5 is equal to hello"); 
    }

    // JAVA Compiler would NOT look at the value assigned to object reference during the compile time
    String str6 = null;
    if (str6.equals("hello")) {
      System.out.println("It is bad practice to check string value");
    }

    // ----- Concatentation -----

    String str7 = "abc";
    String str8 = str7 + "def"; // there will be 2 string object in literal pool

    String str9 = "aaa";
    String str10 = new String ("aaabbb");
    String str11 = "aaabbb";
    System.out.println(str10 == str11); //faslse

    String str12 = "aaa";
    String str13 = new String("aaabbb").intern();
    String str14 = "aaabbb";
    System.out.println(str13 == str14); //true

    if ("hello".equals(str5)) { // best practice to check the value of String
      System.out.println("str5 is equal to hello");
    }



  }
  
}
