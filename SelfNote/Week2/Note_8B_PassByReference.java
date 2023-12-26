public class Note_8B_PassByReference {

  // 按引用傳遞（pass by reference）：
  // 在 Java 中，除了基本數據類型（如 int、float、String 等）之外，對象類型的參數傳遞是按引用傳遞的。
  // 這意味著傳遞給方法的是指向對象的引用，而不是對象本身。
  // 因此，在方法內部對參數所引用的對象進行修改，將會影響原始對象。

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Hello");
    modifyStringBuilder(sb);
    System.out.println("sb = " + sb); // Hello World!
  }

  public static void modifyStringBuilder(StringBuilder target) {
    target.append(" World!");
    System.out.println("After modify the text, target text = " + target);
  }
  
}
