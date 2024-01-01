package SelfNote.Week3;

public class Note_4_StringBuffer {

  /*

  StringBuffer 是 Java 中的一個類，用於處理可變的字符串（mutable strings）。它提供了許多操作字符串的方法，例如添加字符、插入字符、刪除字符、替換字符等。

  與 String 類不同，StringBuffer 對象的內容可以被修改，而不需要創建新的對象。這使得 StringBuffer 在需要頻繁修改字符串的場景下非常有用，例如在追加大量文本或連續修改字符串時。

  以下是一些常用的 StringBuffer 方法：

  append(String str): 在字符串的末尾追加指定的字符串。
  insert(int offset, String str): 在指定位置插入指定的字符串。
  delete(int start, int end): 刪除指定範圍內的字符。
  replace(int start, int end, String str): 用指定的字符串替換指定範圍內的字符。
  reverse(): 反轉字符串的字符順序。


  與 StringBuilder 的差別：

  StringBuffer 和 StringBuilder 是 Java 中用於處理可變字符串的兩個類，它們在功能上非常相似，但有一些區別。

  主要區別如下：

  線程安全性： StringBuffer 是線程安全的，它的方法都使用了同步（synchronized）來保證多線程環境下的安全性。
  這使得 StringBuffer 在多線程環境中使用時是可靠的，但也導致了一定的性能開銷。而 StringBuilder 則沒有提供線程安全性，所以在單線程環境下效能更好。

  效能： 由於 StringBuffer 的同步機制，它的性能通常比 StringBuilder 稍差。在單線程環境下，建議使用 StringBuilder，因為它沒有同步開銷。

  可變性： 兩者都是用於處理可變字符串的，可以使用相似的方法來修改字符串，
  例如 append、insert、delete 等。它們都提供了一個可變的內部緩衝區（buffer），以便支持字符串的修改操作。

  總結來說，如果你的代碼在單線程環境下運行並且不需要線程安全性，則建議使用 StringBuilder，
  因為它具有更好的性能。如果你的代碼在多線程環境下運行或需要線程安全性，則應該使用 StringBuffer。

  需要注意的是，由於 StringBuffer 和 StringBuilder 的方法和用法基本相同，
  你可以根據需要在兩者之間進行切換，而不需要修改太多的代碼。

   */

  public static void main(String[] args) {
    
    StringBuffer sb = new StringBuffer("Hello");

    sb.append(", my name is Tommy.");

    System.out.println(sb); // Hello, my name is Tommy.

    sb.insert(7, "World, ");

    System.out.println(sb); // Hello, World, my name is Tommy.

    sb.deleteCharAt(5);

    System.out.println(sb); // Hello World, my name is Tommy.

    System.out.println(sb.length()); //30

    System.out.println(sb.deleteCharAt(0)); // ello World, my name is Tommy.

    sb.setLength(50);

    System.out.println(sb.length()); //50

    String str = sb.toString(); // convert to String

  }
  
}
