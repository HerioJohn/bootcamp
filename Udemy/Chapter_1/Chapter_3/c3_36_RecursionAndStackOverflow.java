package Udemy.Chapter_1.Chapter_3;

public class c3_36_RecursionAndStackOverflow {

  // recursive method 遞迴函數

  public static void printHi(){
    System.out.println("Hi");
    printHi();                      // <= 自己執行自己，無限迴圈
  }

  public static void printHi2(int i){

    if (i == 0) {
      return;                           // <= 讓遞迴停下來的方法
    }

    System.out.println("The current i is: " + i);
    printHi2(i - 1);
    System.out.println("I am finish, the current i is:" + i);
  }

  public static void main(String[] args) {
    //printHi();
    printHi2(10);
  }
  
}
