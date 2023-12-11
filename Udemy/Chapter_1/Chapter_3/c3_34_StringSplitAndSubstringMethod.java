package Udemy.Chapter_1.Chapter_3;

public class c3_34_StringSplitAndSubstringMethod {

  public static void main(String[] args) {
    String s = "Hello, my name is Tommy!";

    String[] stringArray = s.split(" ");

    for (int i = 0; i < stringArray.length; i++){
      System.out.println(stringArray[i]);
    }
    s = s.substring(0,5);
    System.out.println(s); // Hello

  }
  
}
