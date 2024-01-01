package SelfNote.Week3.Bonus;

public class Dog {

  // set these to private so that other class can't change them directly

  private String name;
  private int age;
  private String breed;
  private String color;
  private int numberOfLegs;

  // Static
  static int dogCount;

  // Empty Constructor
  public Dog() {

    this.name = "Dog";
    dogCount++;

  }

  // Constructor
  public Dog(String nameInput, int ageInput) {

    this.name = nameInput;
    this.age = ageInput;

    dogCount++;
  }

  // Getter
  public int getAge() {
    return age;

  }

  // Setter
  public void setAge(int newAge) {
    
    if (newAge < 0) {
      return;
    }

    this.age = newAge;
    
  }

  // Instance Method
  public void bark() {
    System.out.println("Bark! My name is " + name);
  }

  // Static Method
  public static void presentDogCount() {
    System.out.println("The current dog count is: " + dogCount);
  }
  
}
