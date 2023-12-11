package Udemy.Chapter_3;

public class c3_32C_ReferenceDataType {

  public static void main(String[] args) {
    
    int[] myArray1 = {10,20,30};
    int[] myArray2 = myArray1; // copy by reference
    myArray1[0] = 100;

    for (int i : myArray1) {
      System.out.println("Array 1: " + i);
    }

    for (int i : myArray2) {
      System.err.println("Array 2: " + i); //myArray2 裡的[0]位置的數值跟著變成 100
    }

  }
  
}
