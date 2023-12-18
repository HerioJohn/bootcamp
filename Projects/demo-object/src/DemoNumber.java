public class DemoNumber {

  public static void main(String[] args) {
    Float f1 = Float.valueOf(6000.0f);
    Number n1 = f1;
    System.out.println(n1.shortValue());

    add(1, 2);

  }

  public static Number add(Integer x, Integer y) {
    return 2;
  }

  public static Number add(Number x, Number y) {
    if (x instanceof Long) {
      Long l = (Long) x;
    } else if (x instanceof Short) {

    } else if (x instanceof Byte) {

    } else if (x instanceof Integer) {

    }
  }

  if (y instanceof Long) {
    Long l2 = (Long) y;
  } else if (y instanceof Short) {

  } else if (y instanceof Byte) {

  } else if (y instanceof Integer) {

  }
  return 
}
