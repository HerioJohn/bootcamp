
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class DemoOperator {

  public static void main(String[] args) {
    BinaryOperator<String> concatStrings = (s1, s2) -> s1.concat(s2);
    BiFunction<String, String, String> concatStrings2 = (s1, s2) -> s1.concat(s2);
  }
  
}
