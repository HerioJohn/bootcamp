
import java.util.function.Function;

public class DemoFunction {

  public static void main(String[] args) {
    
    // f(x) = x + 3
    // y = x + 3

    // R apply(T t), R -> Integer, T -> String
    Function<String, Integer> stringLength = (str) -> {
      return str.length(); // return Integer object
    };

    System.out.println(stringLength.apply("hello")); // 5
    System.out.println(stringLength.apply("abc")); // 3

    //
    Function<String, String> concatFunction = s1 -> s1.concat("hello");

  }


  
}
