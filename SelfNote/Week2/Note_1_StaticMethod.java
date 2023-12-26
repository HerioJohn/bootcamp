public class Note_1_StaticMethod {

  public static void main (String[] args) {

    // Instance Method
    // 1. Belongs to the object 
    // 2. Able to control the instance variable by "this"

    // Static Method
    // 1. Belongs to the class
    // 2. Not able to read/write instance variable
    // 3. The return value completely derived by the input parameters
    
    
    // Static Method: Class Itself
    sayHi();

    // Non-Static Method - Instance Method: Instance of Class
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
