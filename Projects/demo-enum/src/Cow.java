public class Cow extends Animal {

  public String eat(String food) {
    return "[Cow] i am eating " + food + " ...";
  }

  // Polymorphism + Overloading (Not Overriding)

  public static void main(String[] args) {
    Animal cow = new Cow();

    cow.eat();
    cow.eat("sushhi");
  }
  
}
