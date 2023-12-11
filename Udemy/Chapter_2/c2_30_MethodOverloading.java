package Udemy.Chapter_2;

public class c2_30_MethodOverloading {

  // 方法多載（Method Overloading）
  // 一個 Method 的簽名（signature）是指 method 的 name + parameter type and order 用以決定 method 的唯一性。
  // Method Overloading：當我們有多個具有相同名稱但參數類型不同的 method (換句話說，不同的 signature)，我們就是在使用 method overloading。

  public int multiply(int a, int b){
    return a * b;
  }

  public int multiply(int a, int b, int c){ // 相同 Method 名稱 但 parameter 不一樣
    return a * b * c;
  }

  public static void main(String[] args) {

    c2_30_MethodOverloading m = new c2_30_MethodOverloading();

    System.out.println(m.multiply(3, 2)); // 3 * 2 = 6

    System.out.println(m.multiply(2,3,4)); // 2 * 3 * 4 = 24
    
  }
  
}
