package Udemy.Practice;

// 編寫一個名為“printEvery3()”的函數，它打印出等差數列 1, 4, 7, …, 88。

public class A1 {

  public static void main(String[] args) {
    
      printEvery3();

  }

  public static void printEvery3() {

  int number = 1;

  while (number < 89) {
    System.out.println(number);
    number += 3;
  }

  // Best Answer
  // for (int i = 1; i <= 88; i += 3) {
  //   System.out.println(i);
  // }

  }

  
}


