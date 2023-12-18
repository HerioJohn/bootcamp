public class Note_3_StringNotImmutable {

  public static void main(String[] args) {
    
    String firstName = "Tommy";

    String secondName = "Tommy"; // <- JAVA 創建了一個變數，並在 String Pool 裡找尋相同的對象，最後指向了相同的對象 - Tommy

    String thirdName = new String ("Tommy"); // <- 這個 Tommy 是不一樣的對象，他不在 String Pool 裡 

    System.out.println(firstName == secondName); // true
    System.out.println(firstName == thirdName); // false

    /*

     String 不可變性（immutability）可以增加程序的安全性，這是由以下原因造成的：

    緩存哈希碼： String 在創建時會計算並緩存其哈希碼（hash code），因為它是不可變的。這樣，在需要多次使用字符串的哈希值時，
    不需要每次都重新計算，提高了性能。同時，由於哈希碼不會改變，String 可以安全地用作 HashMap 或 HashSet 的鍵。

    緩存字符串常量池： 字符串常量池（String pool）是 Java 中的一個內存區域，它存儲了所有字符串字面值（literal）的唯一實例。
    由於 String 是不可變的，它們可以被安全地共享和重用。這種緩存機制可以節省內存空間，提高性能。

    多線程安全： 字符串的不可變性使其在多線程環境中是線程安全的。多個線程可以同時訪問和共享同一個字符串對象，而不需要擔心競爭條件或同步問題。

    安全傳遞： 字符串作為方法參數傳遞時是安全的，因為它們不能被修改。這消除了對於傳遞引用對象時的意外修改或破壞的風險。

    總體而言，String 的不可變性使得它們更加可靠和可預測。可以在多個上下文中使用字符串，而不需要擔心它們被修改。
    這種特性對於代碼的可維護性和可靠性非常重要，並消除了一些常見的錯誤和安全漏洞。

     */

    }

  }
  
