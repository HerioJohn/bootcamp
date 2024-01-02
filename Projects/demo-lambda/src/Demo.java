
public class Demo {

  public static void main(String[] args) {
    Walkable person = new Walkable() {
      @Override
      public void walk() {
        System.out.println("walking...");
      }
    };
    person.walk();

    // Lambda Expression
    // 1. We don't need to write down method signature for the walk() method. Why?
    // because the interface has only one method, so compiler knows the code block must refer to the walk method.
    // 2. "()" is the input parameters of the walk method.
    // 3. As walk method is void returnb type, you don't have to return anything inside the code block.
    Walkalbe person2 = () -> {
      System.out.prinln("hello");
      System.out.println("hello world");
    };
    person2.walk();
  }
  
}
