public class Note_5_ForLoop {

  public static void main(String[] args) {
    
    for (int i = 0; i < 10; i++) { // 只要 i 小於 10，會不斷進行這個迴圈，每一個迴圈 i 自行 +1
      System.out.println("i = " + i);
    }

    System.out.println("We finish the i for loop! Yeah!"); //上面那個迴圈完成後，才會 print out 這句
 
// continue

// 使用continue，只 print out 雙數。

    for (int a = 0; a < 10; a++) {
      if (a % 2 != 0){
        continue;
      }
      
        System.out.println("a = " + a);  
    }

// break

// 使用 break，在 b 大於或等於 5 的時候強制停止。

      for (int b = 0; b < 10; b++) {

          System.out.println("b = " + b);

        if (b >= 5) {
          System.out.println("b is bigger or equal to 5! Break this loop now!");
          break;

        }

      }
  }
  
}
