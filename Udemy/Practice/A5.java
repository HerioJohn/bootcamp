package Udemy.Practice;

// 編寫一個名為"addUpTo()”的函數，參數為一個整數n，return type為int，return應為 1 + 2 + 3 + … + (n - 1) + n 的值。

public class A5 {

  public static void main(String[] args) {
    System.out.println(addUpTo(10));
    System.out.println(addUpTo(100));
    System.out.println(addUpTo(1000));
    System.out.println(addUpTo(10000));
}

  public static int addUpTo(int number) {

    return ((number + 1) * number / 2);

  }
  
}
