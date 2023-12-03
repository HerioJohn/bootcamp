package src;
public class DemoMethod {

  // main -> method name
  // public -> or pruvate
  // static method -> tool
  // void -> return type -> no return type
  public static void main(String[] args) {
    // javac -> compile command, converting .java -> .class
    // java -> run .class file

    // Trigger Method
    int result = sum(3, 5);
    System.out.println(result); // 8
    System.out.println(sum(2, 4)); // 6
    System.out.println(sum(-10, -30)); // -40

    int result2 = multiply(3, 5);
    System.out.println(result2); // 15
    System.out.println(multiply(2, 4)); // 8
    System.out.println(multiply(-10, -30)); // -300

  }

  public static void sound(String animal) {

    // Early Return
     if ("ABC".equals(animal)) {
      return; //similar to break
    } 

    if ("Dog".equals(animal)) {
      System.out.println("wo wo");
      return;
    } else if ("Cat".equals(animal)) {
      System.out.println("meow");
      return;
    } 

    System.out.println("Default sound...");
  }

    public static String sound2(String animal) {


     if ("ABC".equals(animal)) {
      return "This is not animal"; //similar to break
    } 

    if ("Dog".equals(animal)) {
      return "wo wo";
    } else if ("Cat".equals(animal)) {
      return "meow";
    } 

    return "Default sound";
  }

  //-------------------------

  public static void notifycustomer(){
    if (sendEmail()){
      return;
    }

    sendSMS();
  }

    public static boolean sendEmail(){
    return false;
  }

    public static boolean sendSMS(){
    return false;
  }

  //-------------------------------

    public static boolean notifycustomer2(){

      if (sendEmail() || sendSMS()){
        return true;
      }
      return false;

      }


  //-------------------------------

      public static boolean notifycustomer3(){

      return sendEmail() || sendSMS();

      }

  //----------------------------------

    public static int sum(int x, int y) {

    int sum = x + y;
    return sum;

  }

  public static int minus(int x, int y) {

    int minus = x - y;
    return minus;

  }

  public static int multiply(int x, int y) {

    int multiply = x * y;
    return multiply;

  }

  public static int divide(int x, int y) {

    int divide = x / y;
    return divide;
  }


}