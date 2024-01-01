package SelfNote.Week3.Bonus;

public class StaticExample_John {

  public static void main(String[] args) {

    Dog myDog = new Dog();

    myDog.bark();  
    //Dog.bark(); Error: Cannot make a static reference to the non-static method bark() from the type DogJava

    // Call Static Method from Dog Class
    Dog.presentDogCount();
    
    // myDog.presentDogCount(); : Legal but don't do this


  }

}
