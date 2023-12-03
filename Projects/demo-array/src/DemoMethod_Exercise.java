package src;
public class DemoMethod_Exercise {

  public static void main(String[] args)
  {
    int result = sum(1,2,3,'A');
    System.out.println(result);

    double divide_result = divide(7,2);
    System.out.println(divide_result);

    String string_result = combineString("Hello", "World");
    System.out.println(string_result);
  }








  public static int sum(int x, int y) {
    int sum = x + y;
    return sum;
  }

  public static int sum(int x, int y, int z) {
    int sum = x + y + z;
    return sum;
  }

  public static int sum(int x, int y, int z, char a) {
    int sum = x + y + z + a;
    return sum;
  }

  public static double divide(int x, int y) {
    double divide = (double) x / y;
    return divide;
  }

  public static String combineString(String x, String y){
    String combineString = x + " " + y;
    return combineString;
  }




}