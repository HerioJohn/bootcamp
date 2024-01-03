package Udemy.Practice;

// 編寫一個名為“findSmallCount()”的函數，它以一個整數array和一個整數n作為參數，並返回一個整數，表示array中有多少元素小於輸入整數n。

public class A10 {

  public static void main(String[] args) {
    System.out.println(findSmallCount(new int[] {1, 2, 3}, 2));
    System.out.println(findSmallCount(new int[] {1, 2, 3, 4, 5}, 0));
}

public static int findSmallCount(int[] array, int num) {

  int count = 0;

  for (int i = 0; i < array.length; i++) {
    if (array[i] < num)
      count++;
  }

  return count;

}
  
}
