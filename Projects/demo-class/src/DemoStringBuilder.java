public class DemoStringBuilder {

  public static void main(String[] args) {
    
    // String: +=, concat()
    String x = "abc";

    x += "def";

    x = x.concat("def");
    System.out.println(x); //abcdefdef

    // StringBuilder

    StringBuilder sb = new StringBuilder("abc");
    sb.append("def").append("def");
    System.out.println(sb.toString()); //abcdefdef

    // While loop -> counter
    // 123 456 789 101112 ...
    int counter = 4; // 123 456 789 101112
    // counter = 3 // 123 456 789

    StringBuilder sb2 = new StringBuilder("");
    int num = 0;
    int count = 0;

    while (counter-- > 0){
      //sb2.append(++num).append(++num).append(++num);
      for (int i = 0; i < 3; i++) {
        sb2.append(++num);
      }
      if (counter > 0)
      sb2.append(" ");
    }

    sb2.setLength(0);

    counter = 4; // aaa bbb ccc ddd
    int z = 97;
    while (counter-- > 0) {
      for (int i = 0; i < 3; i++) {
        sb2.append((char) z);
      }
      if (counter > 0) {
        sb2.append(" ");
      }
      z++;
    }

    System.out.println(sb2.toString()); //aaa bbb ccc ddd

    System.out.println(sb2.reverse().toString()); //ddd ccc bbb aaa

    System.out.println(sb2.insert(4, "bootcamp").toString()); //ddd bootcampccc bbb aaa

    System.out.println(sb2.delete(0, 6).toString()); // otcampccc bbb aaa

    sb2.setCharAt(2, 'J');
    System.out.println(sb2.toString()); // 'J'

    sb2.replace(2, 6, "abc");
    System.out.println(sb2.toString()); // otabbcccc bbb aaa

    sb2.isEmpty();
    sb2.length();

    StringBuilder s1 = new StringBuilder("abc");
    StringBuilder s2 = new StringBuilder("abc");
    System.out.println(s1.toString().equals(s2.toString())); // false
    System.out.println(s1 == s2); //false
    System.out.println(s1.toString().equals(s2.toString())); //true

    System.out.println(s1.compareTo(s2)); //0

  }

      public static long stringConcat() {
      long start = System.nanoTime();
      String s = "";
      for (int i = 0; i < 1000; i++) {
        s = s.concat("a");
      }

      long end = System.nanoTime();
      return end - start;
    }

    public static long stringBuilderAppend() {
      long start = System.nanoTime();
      StringBuilder s = new StringBuilder();
      for (int i = 0; i < 1000; i++) {
        s.append("a");
      }
      long end = System.nanoTime();
      return end - start;
    }
  
}
