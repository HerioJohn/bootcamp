package src;

public class DemoCache {

  public static void main(String[] args){
   
  String s1 = "John";
  String s2 = "John";

  System.out.println(s1.equals(s2)); //true (same value)
  // == , chheck if they are same object
  System.out.println(s1 == s2); //true, check if s1 and s2 are same object

  String s3 = new String("John"); //強行開新Object
  System.out.println(s1.equals(s3)); //true, same value
  System.out.println(s1 == s3); //false, different object

  String s4 = String.valueOf("John");
  System.out.println(s1.equals(s4)); // true (same value)
  System.out.println(s1 == s4); // true , s4's String Object is in Literal Pool
  System.out.println(s2 == s4); //true , s4's String Object is in Literal Pool
  System.out.println(s3 == s4); //false

  s1 = "John2";
  System.out.println(s1 == s4); //false

  s2 = s2 + "3";
  System.out.println(s1 == s4); //false

  s2 = s2 + "2"; // "John2"
  System.out.println(s1.equals(s2)); //true
  System.out.println(s1 == s2); //false

  }




  }
  

