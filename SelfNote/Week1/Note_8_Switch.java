public class Note_8_Switch {

  // switch = statement that allows a variable to be tested for equality aginst a
  // list of values.

  public static void main(String[] args) {

    String day = "Friday";

    switch (day) {
      case "Sunday":System.out.println("It is Sunday!");
        break;
      case "Monday":System.out.println("It is Monday!");
        break;
      case "Tuesday":System.out.println("It is Tuesday!");
        break;
      case "Wednesday":System.out.println("It is Wednesday!");
        break;
      case "Thursday":System.out.println("It is Thursday!");
        break;
      case "Friday":System.out.println("It is Friday! Yeah! :D");
        break;
      case "Saturday":System.out.println("It is Saturday!");
        break;
      default: System.out.println("That is not a day!");
    }

  }

}
