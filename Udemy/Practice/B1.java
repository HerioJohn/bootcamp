package Udemy.Practice;

import java.util.Scanner;

// 落地問題: 一球從 h 米高度自由落下，每次落地後反跳回原高度的一半，再落下。求小球在第 n 次落地時，共經過多少公尺？高度 h 以及落地次數 n 為使用者可以輸入的整數，用System.in讀取。

public class B1 {

  public static void main(String[] args) {

    int h = 0;
    int n = 0;
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter height (h)");
    h = scanner.nextInt();

    System.out.println("Please enter ground hit amount (n)");
    n = scanner.nextInt();

    System.out.println("The total travel amount is: " + TravelAmount(h, n));

  }

  public static int TravelAmount(int h, int n) {

    int amount = h;
    int currentHeight = h;

    for (int i = 1; i < n; i++) {
      amount += currentHeight;
      currentHeight /=  2;
    }

    return amount;

  }


  
}
