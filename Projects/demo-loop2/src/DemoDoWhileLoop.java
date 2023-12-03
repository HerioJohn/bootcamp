public class DemoDoWhileLoop {

  public static void main(String[] args){

    System.out.println("Begin");
    
    int j = 0;

    while (j == 100){ //不符合條件，永遠不進入

    }

    for (int i = 0; i > 100; i++){ //不符合條件，永遠不進入

    }

    // Do-while 無論條件如何，都會至少跑一次
    do {
      System.out.println("Hello");
    } while (j > 0);

    while (++j < 3) {
      // j=1
      // j=2
      // j=3
      // j=4
      // j=5
      System.out.println("j = " + j);
    }

  }
  
}
