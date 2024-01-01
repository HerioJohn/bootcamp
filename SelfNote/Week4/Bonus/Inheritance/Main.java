package SelfNote.Week4.Bonus.Inheritance;

public class Main {

  public static void main(String[] args) {

    Animal myAnimal = new Animal();
    myAnimal.eat();

    Dog myDog = new Dog();
    myDog.bark();

    // using method from Animal Class
    myDog.eat();
    
  }
  
}
