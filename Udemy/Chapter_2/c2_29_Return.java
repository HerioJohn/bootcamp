package Udemy.Chapter_2;

public class c2_29_Return {

  // Java return - 退出 method 並指示 Java 繼續執行主程序。
  // return 可以將 method 所指定的值發送回主程序；返回值可以是 void，String，int，double 或 reference data type。
  //
  // 注意事項：
  // 1. 如果 return 放在 Loop 中，它將終止所有 Loop 的執行。
  // 2. 在 return 之下的程式碼全部不會被執行。
  // 3. 一個 method 只可以 return 一個值。

  public int multiply(int a, int b){  
    return a * b; // 將 method 所指定的值發送回主程序
  }

  public void looping(){
    for (int i = 0; i < 5; i++) {
      if (i == 3){
        return; // return 終結了 Loop
      }
      System.out.println("i = " + i); // 只會執行 i = 0，i = 1 ，i = 2
    }
  }

  public void NestedLooping(){

    for (int j = 0; j < 5; j++) {

      System.out.println("j = " + j); // 只會執行 j = 0

      for (int i = 0; i < 5; i++) {
        if (i == 3){
          return; // return 終結了所有的 Loop，包括 j 的 Loop
      }
      System.out.println("i = " + i); // 只會執行 i = 0，i = 1 ，i = 2
    }
    }
  }

  public int returnNumber3(){
    return 3;
  }

  public static void main(String[] args) {

    c2_29_Return m = new c2_29_Return();

    System.out.println(m.multiply(2, 3)); // 2 * 3 = 6

    m.looping();

    m.NestedLooping();

    System.out.println("After perform returnNumber3 method, the result is: " + m.returnNumber3()); // 3

  }
 
}