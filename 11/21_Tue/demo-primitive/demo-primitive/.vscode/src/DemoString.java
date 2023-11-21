public class DemoString {

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

  }
  
}
