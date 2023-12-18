import java.text.DecimalFormat;
import java.util.Scanner;

public class BMICalculator {

  public static void main(String[] args) {

    // BMI Calculator (kg / m^2)

    String pattern = "0.00";
    DecimalFormat df = new DecimalFormat(pattern);

    Scanner scanner = new Scanner(System.in);

    System.out.print("Please enter your weight (kg) :");
    double weight = scanner.nextDouble();

    System.out.print("Please enter your hight (cm) :");
    double height = scanner.nextDouble() / 100;

    double bmi = Double.parseDouble(df.format(weight / (height * height)));
    System.out.println("Your BMI is: " + bmi);

    if (bmi < 18.5) 
      System.out.println("You are very underweight!");
    else if (bmi < 24)
      System.out.println("You are underweight!");
    else if (bmi < 30)
      System.out.println("You are overweight!");
    else
      System.out.println("You are very overweight!");

  }
  
}
