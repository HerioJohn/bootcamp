public class DemoStringMethod {

  public static void main(String[] args) {
    String str = " hello world! ";

    // empty
    if (str.isEmpty()){
      System.out.println("String=" + str);
    }
    System.out.println("str length");

    // even number index of the character in string
    for (int i = 0; i < str.length(); i++){
      if (i % 2 == 0){
        System.out.println(str.charAt(i));
      }
    }

    // substring()
    String s = "hello";
    String newStr = s.substring(2,4); // index start from 0
    System.out.println("newStr - substring 2,4 : " + newStr); // ll , print -> index from 2 to 3
    System.out.println("newStr : " + newStr.substring(0)); // ll

    // trim()
    String s2 = " Hurray! ";
    System.out.println(s2.trim()); // "Hurray!" -> 刪除頭尾空格

    // toUpperCase() & toLowerCase()
    String s3 = "i HaVe an AppLE!";
    System.out.println(s3.toUpperCase()); // "I HAVE AN APPLE!"
    System.out.println(s3.toLowerCase()); // "i have an apple!"

    // equals()
    // equalsIgnoreCase()
    System.out.println("OrANge".equals("orange")); //false
    System.out.println("OrANge".equalsIgnoreCase("orange")); //true
    System.out.println("AppLe".equalsIgnoreCase("orange")); //false

    // startsWith("")
    // endsWith ("")
    String s4 = "Banana in the busket!";
    System.out.println("s4 - startsWith_1: " + s4.startsWith("Banana")); //true
    System.out.println("s4 - startsWith_2: " + s4.startsWith("BANANA")); //false
    System.out.println("s4 - startsWith_3: " + s4.startsWith("B")); //true
    System.out.println("s4 - startsWith_4: " + s4.startsWith(" ")); //false
    System.out.println("s4 - startsWith_5: " + s4.startsWith("")); //true

    System.out.println("s4 - endsWith_1: " + s4.endsWith("busket!")); //true
    System.out.println("s4 - endsWith_2: " + s4.endsWith("busket")); //false
    System.out.println("s4 - endsWith_3: " + s4.endsWith("!")); //true
    System.out.println("s4 - endsWith_4: " + s4.endsWith(" ")); //false
    System.out.println("s4 - endsWith_5: " + s4.endsWith("")); //true

    // Exercise
    String s5 = "1234567890";
    // try 2 string methods, and use && operator to check trye/false
    System.out.println("Exercise s5 Answer 1 :" + (s5.startsWith("1") && s5.endsWith("0")));
    System.out.println("Exercise s5 Answer 2 :" + (s5.length() == 10 && s5.equalsIgnoreCase("1234567890")));

    // indexOf()
    String s6 = "ABCDEFG";

    System.out.println("The index of D in s6 is: " + s6.indexOf('D')); //3
    System.out.println("The index of H in s6 is: " + s6.indexOf('H')); //-1 不存在

    // searching 'D' starting from index 5
    System.out.println("In s6, starting from index 5, I am looking for D, and the result is: " + s6.indexOf('D',5)); //-1 找不到（不存在）
    // searching 'D' starting from index 3
    System.out.println("In s6, starting from index 3, I am looking for D, and the result is: " + s6.indexOf('D',3)); //3

    // lastIndexOf()
    String s7 = "1234512345";
    System.out.println("Index 5 of s7 is: " + s7.indexOf('5')); //4
    System.out.println("Last Index 5 of s7 is: " + s7.lastIndexOf('5')); //9
    System.out.println("Last Index H of s7 is: " + s7.lastIndexOf('H')); //-1 不存在

    System.out.println("Last Index 3 of s7, starting from 1 is: " + (s7.lastIndexOf('3', 1))); //由第 1 個index開始，向後尋找 3 -> -1
    System.out.println("Last Index 3 of s7, starting from 5 is: " + s7.lastIndexOf('3', 5)); //由第 5 個index開始，向後尋找 3 -> 2

    // Exercise
    // All Must True
    String s8 = "ABabcxabcdef";
    System.out.println((s8.lastIndexOf("abc")) == 6);
    System.out.println((s8.endsWith("def")));
    System.out.println((s8.indexOf("abc")));
    System.out.println((s8.startsWith("ABa")));
    System.out.println((s8.length() > 10));

    //concat
    String s9 = "abc";
    String s10 = "def";
    System.out.println(s9 + s10); //abcdef
    System.out.println(s9.concat(s10)); //abcdef

    //contains
    String s11 = "XYZ321";
    System.out.println(s11.indexOf("XYZ") != -1); //true
    System.out.println(s11.contains("XYZ")); //true
    System.out.println(s11.contains("ABC")); //false

    //Method Combination
    String s12 = "mango and berry!";
    System.out.println(s12.toUpperCase().substring(2,5)); //NGO
    System.out.println(s12.toUpperCase().equals("MANGO AND BERRY!")); //true
    System.out.println(s11.concat(s12).length());



  }
  
}
