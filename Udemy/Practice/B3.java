package Udemy.Practice;

// 給定一個句子，請判斷它是不是迴文，即正著讀或反著讀都一樣的句子。例如:【上海自來水來自海上】是迴文。

// 例如：ABCDEDCBA = true
//       ABCDEFGHI = false

public class B3 {

  public static void main(String[] args) {

    System.out.println(CheckPalindrome("ABC")); // false
    System.out.println(CheckPalindrome("ABCDE")); // false
    System.out.println(CheckPalindrome("ABBA")); // true
    System.out.println(CheckPalindrome("ABCDEDCBA")); // true

  }

  public static boolean CheckPalindrome(String text) {

    int count = 0;

      for (int i = 0; i < text.length() / 2; i++) {
        if (text.charAt(i) != text.charAt(text.length() - 1 - count)) 
          return false;
        count++;
      }

      return true;

  }

}
