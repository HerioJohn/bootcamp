public class DemoStaticNestedClass {

  public static class Calculator {
    // attributes
    // constructor
    // instance method
  }

  public static void main(String[] args) {
    DemoStaticNestedClass d = new DemoStaticNestedClass();

    DemoStaticNestedClass.Calculator c = new DemoStaticNestedClass().Calculator();

    Calculator calculator = new Calculator();
  }
  
}
