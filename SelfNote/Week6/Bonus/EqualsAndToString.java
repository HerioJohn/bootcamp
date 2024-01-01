package SelfNote.Week6.Bonus;

public class EqualsAndToString {

  public static void main(String[] args) {
    
    Dog myDog = new Dog();

    myDog.setName("Tommy");

    System.out.println(myDog); // SelfNote.Week6.Bonus.Dog@7a81197d, but after adding toString Method: Tommy

  }
  
}
