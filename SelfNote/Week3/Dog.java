public class Dog {

  // Check Note_3_Constructor

  String name;
  int age;

  public Dog() { // <= This is Empty Constructor

  }

  public Dog(String name) {  // <= This is Constructor
    this.name = name; // <= "this" is refer to non static object
  }

  public Dog(int age) {  // <= This is Constructor
    this.age = age;
  }

  public Dog(String name, int age) {  // <= This is Constructor
    this.name = name;
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
  
  
}
