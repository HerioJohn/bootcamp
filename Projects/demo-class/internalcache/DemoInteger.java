package internalcache;

public class DemoInteger {

  public static void main(String[] args) {
    
    Integer i1 = 10; //auto-box
    System.out.println ("i1 = " + i1);

    Integer i2 = new Integer(10);
    System.out.println("i2 = " + i2);

    System.out.println(i1 == i2); // false, because of "new"
    System.out.println(i1.compareTo(i2)); // 0
    System.out.println(i1.equals(i2)); // true
    
    Integer i3 = 10;
    System.out.println(i1 == i3); // true, Integer Cache (-128 to 127)

    Integer i4 = 127;
    Integer i5 = 127;
    System.out.println(i4 == i5); // true, Integer Cache (-128 to 127)

    Integer i6 = 128;
    Integer i7 = 128;
    System.out.println(i6 == 17); // false, out of Integer Cache
  }
  
}
