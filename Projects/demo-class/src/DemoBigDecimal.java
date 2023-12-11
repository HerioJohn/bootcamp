import java.math.BigDecimal;

public class DemoBigDecimal {

  public static void main(String[] args) {

    // Problem statment: Addition (0.2 + 0.1)
    
    double d = 0.2 + 0.1;

    System.out.println("d=" + d); // d = 0.30000000000000004

    if (d > 0.3) {
      System.out.println("d > 0.3 , but this is not true.");
    }

    // Solution
    BigDecimal bd1 = new BigDecimal("0.2");
    BigDecimal bd2 = new BigDecimal("0.1");

    BigDecimal bd3 = bd1.add(bd2);

    System.out.println("I use static method to create: " + doubleSum(0.1, 0.2));

    System.out.println("result = " + bd1); //0.2

    System.out.println(bd3.doubleValue()); // 0.3

    // Solution 2

    BigDecimal bd4 = BigDecimal.valueOf(0.2);
    BigDecimal bd5 = BigDecimal.valueOf(0.1);

    BigDecimal result = bd4.add(bd5);
    System.out.println("result = " + result.doubleValue()); // 0.3

    // Problem statement: Subtraction (0.3 - 0.1)

    double s2 = 0.3 - 0.1;

    System.out.println(s2);// s2 = 0.19999999999999998

    // Solution

    BigDecimal b1 = BigDecimal.valueOf(0.3).divide(BigDecimal.valueOf(0.1));

    // multiply 0.1 * 0.2

    double s3 = 0.1 * 0.2;
    System.out.println(s3); // 0.020000000000000004

    BigDecimal b3 = BigDecimal.valueOf(0.1).multiply(BigDecimal.valueOf(0.2));
    System.out.println("result = " + b3); //0.02

    // divide 0.3 / 0.1

    double s4 = 0.3 / 0.1;
    System.out.println(s4); // 2.9999999999999996

    BigDecimal b4 = BigDecimal.valueOf(0.3).divide(BigDecimal.valueOf(0.1));
    System.out.println("result = " + b4); //3

    


  }

  public static double doubleSum(double d1, double d2){
    return BigDecimal.valueOf(d1).add(BigDecimal.valueOf(d2).doubleValue());
  }




}



  

