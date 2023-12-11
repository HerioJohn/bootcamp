public class Cat extends Animal {

  // Cat Class inherit all public attribbutes, methods
  // Cat 

  public Cat() {

  }

  public static void main(String[] args) {
    
    Cat cat = new Cat(); // Create a Cat Object -> Cat() -> call Animal()
    cat.setAge(2);
    System.out.println(cat.getAge());


  }
  
}
