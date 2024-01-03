package Udemy.Practice;

import java.util.Arrays;

// 編寫一個名為"reverseArray()”的函數，參數為一個array of Integers，return type為int[]，返回的值為將array of Integers全部反轉後的新array。

public class A4 {

  public static void main(String[] args) {

    int[] array = {4, 3, 6, 7, 9, 10, 33, 0, -4, 12, 400, 133, 324, 1234231, 12334};

    int[] reversedArray = reverseArray(array);

    for (int i : reversedArray) {
        System.out.println(i);
    }
    

  }

  public static int[] reverseArray(int[] targetArray) {

    int[] result = new int[targetArray.length];

    int count = 0;

    for (int i = targetArray.length - 1; i > -1; i--) {

      result[count] = targetArray[i];   

      count++;

    }

    return result;

  }
  
}
