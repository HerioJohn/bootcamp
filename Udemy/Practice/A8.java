package Udemy.Practice;

  // 編寫一個名為“findDuplicate()”的函數，將一個整數array作為參數，並檢查array中是否有重複值。如果有，則return true，否則return false。

public class A8 {

  public static void main(String[] args) {
    findDuplicate(new int[] {1, 3, 5, 7, 9, 3});
    findDuplicate(new int[] {}); // returns false
    findDuplicate(new int[] {3, 4, 5, 6, 7, 10000, 0});
}

  public static boolean findDuplicate(int[] array) {

    if (array.length == 0) {
      System.out.println("false");
      return false;
    }


    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {

        if (array[i] == array[j]) {
          System.out.println("true");
          return true;
        }
      }
    }

    System.out.println("false");
    return false;

  }
  
}
