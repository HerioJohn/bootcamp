package Udemy.Practice;

  // 編寫一個名為"pyramid()”的函數，唯一的參數為一個大於0的整數，功能為打印出如下規律的金字塔:

public class A9 {

  public static void main(String[] args) {
    pyramid(1);
    System.out.println("====================");
    pyramid(3);
    System.out.println("====================");
    pyramid(5);


}

    public static void pyramid(int num) {

      String s = "";

      for (int i = 0; i < num; i++) {
        s += "*";
        System.out.println(s);
      }
      
    }

  
}
