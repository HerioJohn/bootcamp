public class DemoASCII {

  public static void main (String[] args){

  // 每個字符背後都有ASCII編碼 ( “0” 是 48，“A” 是 65，“a” 是 97)

  char value = 'C';
  int ascii = value;
  System.out.println(ascii); //67 

  System.out.println(value == 'C'); //true
  System.out.println(value == 67); //true
  System.out.println(value > 64); //true
  System.out.println(value < 64); //false

  //compareTo()

  String s1 = "ABC";
  String s2 = "CBA";
  String s3 = "banana";
  String s4 = "ABCDEFG";
  String s5 = "aBCa";

  System.out.println(s2.compareTo(s1)); //C - A -> 67 - 65 -> 2
  System.out.println(s1.compareTo(s3)); //A - b -> 65 - 98 -> -33
  System.out.println(s4.compareTo(s1)); //if same character, will compare the length -> 4


  }

}
