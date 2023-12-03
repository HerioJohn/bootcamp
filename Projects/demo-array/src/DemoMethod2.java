import java.util.Arrays;

public class DemoMethod2 {

  public static void main(String[] args) {
    int[] arr = new int[] { 3, 5, 10 };

    System.out.println("sum is" + sum(arr));

    System.out.println("Before AddOne(): " + Arrays.toString(arr) );
    addOne(arr);
    System.out.println(("After AddOne(): " + Arrays.toString(arr)));

    System.out.println(concatHello("Wahaha"));
    //System.out.println(addOne(arr));

  }

  public static int sum(int[] arr) {

    int sum = 0;

    for (int i = 0; i < arr.length ; i++) {
    sum += arr[i];
    }

    return sum;

  }

  public static void addOne(int[] arr){ // Pass by Reference

    for (int i = 0; i < arr.length ; i++) {
      arr[i]++;
    }
  }

  // Wrong
  public static String concatHello(String s) { // String is Pass by value
    s = s.concat("hello");
    return s;
  }

  // Primitives + Wrapper Classes + String (17 types) -> Pass by value
  // array and classes -> Pass by reference

}
