import java.util.HashMap;
import java.util.Map;

/**
 * Expected Output:
 * Car Year=2020, Car Model=ModelY
 */
public class JavaQuest19_Submission {
  // Declare instance variables carYear and carModel

  int CarYear;

  // Constructor with variables carYear and carModel

  String carModel;

  public JavaQuest19_Submission(int carYear, String carModel) {

    this.CarYear = carYear;
    this.carModel = carModel;
    System.out.println("Car Year=" + this.CarYear + ", " + "Car Model=" + carModel);
  }



  public static void main(String[] args) {
    // Create an instance of class JavaQuest19, with carYear 2020, and carModel
    // "ModelY"
    // print the expected output

    JavaQuest19_Submission car = new JavaQuest19_Submission(2020, "ModelY");


  }
}