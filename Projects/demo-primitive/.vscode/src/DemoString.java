public class DemoString {

  // String 並不是 primitive 原始數

  public static void main (String[] args) {

    String emailAddress = "heriojohnlifeofgame@gmail.com";

    System.out.println(emailAddress);

    // Operations -> append
    String str = "hello" + " " + "world";
    System.out.println(str); // = System.out.println("hello" + " " + "world");

    String str1 = "hello";
    System.out.print(str1.length()); //String 擁有功能性 //列出 hello 一共有多少字母

    //String Support "+" & "+="

    str1 = str1 + "world"; //hello後面加上world

    System.out.print(str1.length()); //列出 helloworld 一共有多少字母

    str1 += "!!!"; //自己后面加上!!!

    System.out.print(str1.length()); //列出 helloworld!!! 一共有多少字母

    // In String, there is no " / " , " - " , " + "

    //#### 11/22 Wed

    // if , = , == // = 是 assignment，== 意思是檢查是否相等

    int x = 0;
    int x2 = 3;
    if (x == x2) {
      // "x == x2" return false, so the flow will not fall into this block
      System.out.println("Yo! x is equals to x2! This is awesome!");
    }
    else
    {
      System.out.println("Oh No! x is not equals to x2");
    }

    // String is not a primitive, so you cannot use == to compare their values.
    String s1 = "hellohello";
    String s2 = "hello";

    if (s1.equals(s2)) {
      System.out.println("s1 is equals to s2");
    }

    if ("hello".equals(s1)) { // comparing string value to a string variable //!!!! NEVER  code in this way: if (s1.equals("hello")) !!!! 
      System.out.println("s1 is hello");
    }

    // charAt()
    // 4 is an index of String.
    // Example: "hello", h -> index =0
    // e -> index = 1
    // l -> index = 2
    // l -> index = 3
    // o -> index = 4 
    char c = s1.charAt(4); //0
    System.out.println(c);

    s1 = "Vincent";
    // what if we always get the last character of the String
    // length() charAt()

    //Method 1
    int lastCharIndex = s1.length() - 1;
    char lastChar = s1.charAt(lastCharIndex);

    //Method 2
    //char lastChar = s1.charAt(s1.length() - 1);
    

  }
  
}
