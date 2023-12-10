package Udemy.Chapter_1.Chapter_3;

public class c3_31_StaticContext {

  // static method 可以在 static main 裡執行，而無需 set up class

  public static int add(int x, int y){
    return x + y;
  }

  public static void main(String[] args) {

    System.out.println(add(1, 2)); // 3
    
  }
  
}
