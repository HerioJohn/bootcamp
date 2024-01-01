package SelfNote.Week4.Bonus.Inheritance;

public class Dog extends Animal{

  private int walkDistance;

  public int getWalkDistance() {
    return walkDistance;
  }

  public void setWalkDistance(int walkDistance) {
    this.walkDistance = walkDistance;
  }

  public void bark() {
    System.out.println("Woof!");
  }

  @Override // Not a must, but good when working with other
  public void eat() {
    System.out.println("Yum Yum!");
  }
  
}
