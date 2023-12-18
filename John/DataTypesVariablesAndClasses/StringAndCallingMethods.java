package John.DataTypesVariablesAndClasses;

public class StringAndCallingMethods {

  public static void main(String[] args) {
    
    String firstName = "John";
    String lastName = "Peterson";

    String fullName = firstName + " " + lastName;

    int fullNameLength = fullName.length();

    System.out.println(fullName); //John Peterson

    System.out.println(fullNameLength); //13

    System.out.println(fullName.charAt(3)); //n

    System.out.println(fullName.toUpperCase()); //JOHN PETERSON (this did not change the original String, it create a new one)


  }
  
}
