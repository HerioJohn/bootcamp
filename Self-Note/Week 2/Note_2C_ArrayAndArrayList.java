import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Note_2C_ArrayAndArrayList {

    // 陣列（Array）以及動態陣列（Arraylist）
    //
    // Array 用於在單個變量中存儲多個值，而不是為每個值declare單獨的變量。
    // 要declare一個Array，需用 [] 定義變量類型。
    //
    // ArrayList 是一個可調整大小的Array，可以在 java.util.ArrayList 中找到。
    // Java 的 Array和ArrayList的區別在於，Array的大小不能修改。
    // 如果要在Array添加或刪減元素數量，必須創建一個全新的數組。

  public static void main(String[] args) {

    // ----- Array -----

    String[] friends = {"Tommy", "Grace", "Mary", "Peter", "Zoey"};
    System.out.println(friends); //@36baf30c <= 16進制數 （電腦的地址）

    // ----- Array List -----

    ArrayList<String> game = new ArrayList<>();
    game.add("Super Smash Bro");
    game.add("Mortal Kombat");
    game.add("Counter Strike");
    System.out.println("My game size is: " + game.size()); //3

    Collections.sort(game); //排序
    System.out.println("My game Collection is: " + game); // [Counter Strike, Mortal Kombat, Super Smash Bro]

    game.clear();
    System.out.println(game); // []

    



  }
  
}
