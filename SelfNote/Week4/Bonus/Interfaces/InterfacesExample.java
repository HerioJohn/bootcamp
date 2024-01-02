package SelfNote.Week4.Bonus.Interfaces;

public class InterfacesExample {

  public static void main(String[] args) {

    Dog myDog = new Dog();

    makeTheNoise(myDog);
    
  }

  private static void makeTheNoise(MakeNoise makesNoise) { // take in Interface
    makesNoise.makeNoise();
  }
   
}
