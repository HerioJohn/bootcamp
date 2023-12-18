public class Taxi implements Vehicle { // Class Signature

  private int speed;

  private int capacity;

  public static int MAX_SPEED = 100;

  public Taxi() {

  }

  public Taxi(int speed) {
    this.speed = speed;
  }

  private Taxi(int capacity,int speed) {
    this.capacity = capacity;
    this.speed = speed;
  }

  private static Taxi small() {
    return new Taxi(0,4);
  }

  private static Taxi big() {
    return new Taxi(0,5);
  }

  //---------------------

  public int getSpeed() {
    return this.speed;
  }

  public boolean isOn() {
    return this.speed > 0;
  }

  public boolean isStopped() {
    return this.speed <= 0;
  }

  public boolean isOverMaxSpeed() {
    return this.speed > Taxi.MAX_SPEED;
  }

  @Override
  public boolean start(){
    if (isOn())
    return false;
    this.speed = 10;
    return true;
  }

  @Override
  public boolean stop(){
    if (isStopped())
    return false;
    this.speed = 0;
    return true;
  }

  @Override
  public boolean accelerate(){
    if (isStopped())
      return false;

    this.speed += 10;

    if (isOverMaxSpeed())
    this.speed = Taxi.MAX_SPEED;

    return true;
  }

  @Override
  public void brake(){
    this.speed -= 10;
  }

  //--------------------

  public static void main(String[] args) {
    Taxi t1 = Taxi.small();
    t1.start();
    t1.accelerate();
    t1.accelerate();
    t1.brake();
    t1.stop();

  }
  
}
