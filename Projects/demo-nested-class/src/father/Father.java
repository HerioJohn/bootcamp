public class father {

  public static void main(String[] args) {
    Driver driver = new Father();
    driver.drive();

    Driver driver2 = new Driver() {
      @Override
      public void drive() {
        System.out.println("Anonymouse Inner Class ... driving ...");
      }
    };

    driver2.drive();
  }
  
}
