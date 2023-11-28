public class DemoNestedLoop {

  public static void main(String[] args) {

    for (int i = 0; i < 5; i++) { // outer loop

      for (int j = 0; j < 4; j++) { // inner loop // i 每迴圈 1 次，j 已經迴圈了 4 次
        System.out.println("i=" + i + " " + "j=" + j);
      }
    }

    // -------------------------------------------------//

    // i < 5
    // j < 4
    // System.out.println(); -> print & newline
    // System.out.print(); -> print only

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < (4 - i); j++) {

        System.out.print("*"); // 20 times
      }
      System.out.println("");

    }

    // -------------------------------------------------//

    String str = "abcdefghijk";

    for (int i = 0; i < str.length();i++) {
      //nested loop, 4 character in a row
      // abcd
      // efgh
      // ijk
      System.out.print(str.charAt(i));

      if (str.charAt(i) % 4 == 0 || str.length() - 1 - i == 0)
      System.out.println("");
      
    } 

    // -------------------------------------------------//

    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 3; j++) {
          System.out.print("*** ");  
      }     
    }
      //System.out.print("***");

    

  }

}
