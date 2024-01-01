public class Note_4_Operators {

  public static void main(String[] args) {

  // operators = >, <, >=, <=, ==, !, ?, :, &&, ||

  int apple = 10;
  int banana = 5;

  boolean b1 = apple > banana; // > 大於
  System.out.println("answer of b1 is: " + b1); // true

  boolean b2 = apple < banana; // < 小於
  System.out.println("answer of b2 is: " + b2); // false

  boolean b3 = apple >= banana; // >= 大於或等於
  System.out.println("answer of b3 is: " + b3); // true

  boolean b4 = apple <= banana; // <= 小於或等於
  System.out.println("answer of b4 is: " + b4); // false

  boolean b5 = apple == banana; // == 等於
  System.out.println("answer of b5 is: " + b5); // false

  boolean b6 = apple != banana; // != 不等於
  System.out.println("answer of b6 is: " + b6); // true

  int number = apple > banana ? 5 : 2; //如果 apple 大於 banana，number = 5；否則，number = 2
  System.out.println("The number is: " + number);

// && ||

  if (apple == 10 && banana == 5){ // && 共同條件
    System.out.println("Tommy"); //Tommy
  }

  if (apple == 10 || banana == 100) { // || 或者條件
    System.out.println("Mary"); //Mary
  }

  if (apple == 5 || apple == 10 && banana == 1) { // && 會被優先計算
    System.out.println("Peter"); //不會print out
  }

















    
  }



}