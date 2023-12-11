package Udemy.Chapter_1.Chapter_3;

public class c3_32B_ReferenceDataType {

  // primitive data type
  // assignment operator => copy by value

  public static void main(String[] args) {

    int a = 10;
    int b = a; // copy by value, b 在 RAM 世界裡佔據著另一位置
    a = 30;

    System.out.println("a = " + a + ", " + "b = " + b);
    
  }


  
}
