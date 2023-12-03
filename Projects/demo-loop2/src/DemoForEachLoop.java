public class DemoForEachLoop {

  public static void main(String[] args) {
    Integer[] int_array = new Integer[]{100, -30, 20};

    // For Loop

    for (int i = 0; i < int_array.length; i++){
      System.out.println("(For Loop) i= " + int_array[i] );

    }

    // For Each Loop

    for (Integer i : int_array) {
      System.out.println("(For Each Loop) i= " + i);
    }

    // Split
    String str = "Welcome,to,the,world!";

    String[] parts = str.split(",",4);

    for (String newSentence : parts){
    System.out.println(newSentence);
    }

    //-------------------------------------

    String str2 = "hello";
    str = new String ("hello");
    str = String.valueOf("hello");

    System.out.println(String.valueOf(1));
    System.out.println(String.valueOf(1.0d));
    System.out.println(String.valueOf(1L));
    System.out.println(String.valueOf(new char[] {'a','b'})); //a b
    // System.out.println(String.valueOf(new int[]{1, 2, 3})); // NOT OK

    // Replace (String method)
    String str4 = "abcabcabcabc";
    String result = str4.replace('a', 'c');
    System.out.println(("result = " + result));
    String result2 = str4.replace("abc", "def");
    System.out.println(("result 2 = " + result2));

    //-------------------------------------

    String str5 = "abcdefghijk";
    String str51 = "cawerty";
    String str52 = "lwownfin";
    //char array

    System.out.println("Final String=" + evenIdx(str5));
    System.out.println("Final String=" + evenIdx(str51));
    System.out.println("Final String=" + evenIdx(str52));

    //-------------------------------------

    // Given String "abcdefg" 
    // finalString -> "gfedcba"
    // must use char array

    String str6 = "abcdefg";

    System.out.println("Reverb String = " + reverbString(str6));

  }

  public static String evenIdx(String s) {

    char[] chararray = s.toCharArray();

    int arrLength = s.length() % 2 == 0 ? s.length() / 2 : s.length() / 2 + 1;

    char[] result = new char[arrLength];
    int idx = 0;

    for (int i = 0; i < chararray.length; i++){
      if (i % 2 == 0){
        result[idx++] = chararray[i];
      }
    }
  
  }

    public static String reverbString(String s) {

      char[] chararray = s.toCharArray();

      char[] result = new char[s.length()];

      for (int i = 0; i < chararray.length; i++){
        result[i] = chararray[chararray.length - i - 1];

      }

      return String.valueOf(result);
     }
  
}
