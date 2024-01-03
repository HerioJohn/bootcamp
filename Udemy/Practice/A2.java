package Udemy.Practice;

// 編寫一個名為“ninetable()”的函數，它打印出九九乘法表的內容。

public class A2 {

  public static void main(String[] args) {

    ninetable();

  }

  public static void ninetable() {
    for (int i = 1; i < 10; i++) {
      for (int j = 1; j < 10; j++) {
        System.out.println(i + " * " + j + " = " + (i * j));
      }

    }

  }

}