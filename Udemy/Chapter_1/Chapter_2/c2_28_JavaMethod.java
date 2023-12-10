package Udemy.Chapter_1.Chapter_2;

public class c2_28_JavaMethod {

  // Method 是一段代碼，只有在被調用才會運行。
  // 你可以將數據（parameter）傳遞給 method。

  // 一個 method 的 declaration 分成：
  // 1. 修飾符 （modifier）
  // 2. 返回類型 （return type）
  // 3. 名稱 （name）
  // 4. 參數列表 （formal parameter or parameter list）

  public void sayHelloWorld(){
    System.out.println("Hello World!");
  }

  public int multiply(int a, int b){  // 括號裡面的東西名叫 parameter list；而 a 和 b 為 formal parameter
    return a * b;
  }

  public static void main(String[] args) {

    c2_28_JavaMethod m = new c2_28_JavaMethod();

    m.sayHelloWorld(); // Hello World

    System.out.println(m.multiply(5, 4)); //20

    System.out.println(m.multiply(2, 2) + (m.multiply(3, 3))); // 2 * 2 + 3 + 3 = 13
    

  }
 
}
