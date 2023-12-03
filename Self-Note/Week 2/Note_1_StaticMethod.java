public class Note_1_StaticMethod {

  public static void main (String[] args) {
    
    
    // Static Method: Class Itself
    sayHi();

    // Non-Static Method: Instance of Class
    Note_1_StaticMethod n = new Note_1_StaticMethod();
    n.sayPancake();

  }

  static void sayHi() {
    System.out.println("Hello!");
  }

  void sayPancake() {
    System.out.println("pancack!");
  }


  
}
