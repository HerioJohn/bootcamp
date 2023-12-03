public class Cat {

  private static int catCount = 0;

  public static final int MAX_LIVES = 9;

  //以上是 static，可以理解為他是一個被世界使用的變數。

  String name;

  int age;

  int livesRemaining;

  public void meow(){
    System.out.println("Meow");
  }

  public Cat (){
    catCount++;
    livesRemaining = MAX_LIVES;
  }

  public static int getCatCount(){
    return catCount;
  }

  // 這是一個藍圖 blueprint
  // 以上全部那些 name ， age 等等都不是 static，意思是他們只會適用於獨立的 Cat Object，而不是 Cat Class 本身。
  
}
