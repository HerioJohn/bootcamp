public class DemoUncheckedException {

  public static void main(String[] args) {
    double result;

    try {
      result = divide(10.0d, 0.0d);
    } catch (ArithmeticExceptio e) {
      System.out.println("ArithmeticException");
      result = 0.0d;
    }
    System.out.println("result=" + result);
  }

  // Example 2: double / double

  try {
    System.out.println("before");
  } catch (ArithmeticException e) {
    System.out.println("ArithmeticException");
    result = 0.0d;
  }

  public double divide(double x, double y) {
    return x / y; // Potentially run time exception - ArithmeticException
  }
  
}
