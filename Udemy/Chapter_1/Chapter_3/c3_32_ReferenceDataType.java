package Udemy.Chapter_1.Chapter_3;

public class c3_32_ReferenceDataType {

  // reference data type (non-primitive data type)

  public static void changeA(int a) {
    a = 20;
  }

  public static void main(String[] args) {
    int a = 10;
    changeA(a); //copy by value
    System.out.println("a = " + a); // 10

    // Java's primitive data type used as an actual parameter
    // Java will copy by value
    
  }
  
}
