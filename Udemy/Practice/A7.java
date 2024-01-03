package Udemy.Practice;

  // 編寫一個名為“confirmEnding”的函數，它將 2 個String作為input，並返回一個boolean，該boolean指示第一個input是否以第二個input結束。

public class A7 {

  public static void main(String[] args) {
    System.out.println(confirmEnding("Bastian", "n"));
    System.out.println(confirmEnding("Connor", "n"));
    System.out.println(confirmEnding("Open sesame", "same"));
}

  public static boolean confirmEnding(String a, String b) {

    if (a.endsWith(b))
    return true;

    return false;

  }
  
}
