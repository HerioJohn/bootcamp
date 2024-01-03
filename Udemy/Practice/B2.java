package Udemy.Practice;

import java.util.InputMismatchException;
import java.util.Scanner;

// 輸入某年某月某日，讓程式判斷這一天是這一年的第幾天？使用者可以透過用System.in來給定年月日這三個數字。

public class B2 {

  public static void main(String[] args) {
    
  int year = 0;
  int month = 0;
  int date = 0;

  Scanner scanner = new Scanner(System.in);

  try {

  System.out.println("Please enter the year: ");
  year = scanner.nextInt();

  }
  catch (InputMismatchException ime) {
    System.out.println("Please enter only number!")
  }



  if (year <= 0) {
    System.out.println("year should be bigger than 0!");
  }

  System.out.println("Please enter the month: ");
  month = scanner.nextInt();

  if (month <= 0 || month > 12) {
    System.out.println("month should be bigger than 0 and smaller than 12!");  
  }



  }




  
}
