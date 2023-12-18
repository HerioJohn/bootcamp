package John.DataTypesVariablesAndClasses;

public class ClassesAndObjects {

  // work with Dog.java

  public static void main(String[] args) {

    Dog dog_1 = new Dog(); //constructor
    
    dog_1.name = "Peter";
    dog_1.age = 10;
    dog_1.breed = "Golden Dog";
    dog_1.numberOfLegs = 4;
    dog_1.color = "Gold";

    System.out.println("dog_1's name is: " + dog_1.name);
    dog_1.bark();

    Dog dog_2 = new Dog();
    dog_2.name = "Mary";
    System.out.println("dog_2's name is: " + dog_2.name);    
    dog_2.bark();


  }
  
}
