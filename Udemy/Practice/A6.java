package Udemy.Practice;

// 編寫一個名為“position()”的函數，input為String。函數沒有任何return type，但需要打印出第一個大寫字母及其index位置。 如果未找到，則打印 -1。

public class A6 {

  public static void main(String[] args) {
    position("abcd"); // prints -1
    position("AbcD"); // prints A 0
    position("abCD"); // prints C 2
}

  public static void position(String text) {

    for (int i = 0; i < text.length(); i++) {

      char character = text.charAt(i);

      if (Character.toUpperCase(character) == character) {
        System.out.println(character + " " + i);
        return;
      }
    }

    System.out.println(-1);


  }
  
}
