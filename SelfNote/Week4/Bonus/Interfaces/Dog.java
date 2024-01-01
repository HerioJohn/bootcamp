package SelfNote.Week4.Bonus.Interfaces;

public class Dog implements MakeNoise {

  public static void main(String[] args) {
    

  }

  @Override // Not a must, but good to add for reminder
  public void makeNoise() { // We must add this method since this class implements from MakeNoise Interface
    System.out.println("Woof!");
  }

  
}
