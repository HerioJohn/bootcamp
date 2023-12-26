public class Note_8_PassByValue {

    // 在 Java 中，參數傳遞分為「按值傳遞」（pass by value）和「按引用傳遞」（pass by reference）。
    // 按值傳遞（pass by value）：當將一個變數作為參數傳遞給一個 Method 時，
    //                           實際上是將變數的值進行了複製，傳遞給了 Method。這意味著在方法內部對參數進行修改不會影響原始變數。

    // Java is always Pass By Value

  public static void main(String[] args) {

    int num = 10; 
    modifyNumberTo100(num); // 100
    System.out.println("num = " + num); // num is still 10

  }

  public static void modifyNumberTo100(int number) {
    
    number = 100;
    System.out.println("After perform the method, num = " + number);

  }

}
