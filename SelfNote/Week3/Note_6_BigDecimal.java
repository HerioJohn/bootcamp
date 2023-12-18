import java.math.BigDecimal;

public class Note_6_BigDecimal {

  public static void main(String[] args) {

    double d1 = 0.8;
    double d2 = 0.1;

    double d3 = d1 - d2; // <= We expecte the d3 is 0.7, but...

    System.out.println("d3 = " + d3); // d3 = 0.7000000000000001 

    float f1 = 0.3f;
    float f2 = 0.1f;

    float f3 = f1 - f2; // <= We expect the f3 is 0.2, but... 

    System.out.println("f3 = " + f3); // f3 = 0.20000002

    // Features of BigDecimal
    // 1. Scaling and Rounding modes
    // 2. No Overloaded operators
    // 3. Use compareTo() to compare BigDecimals not equals()
    // 4. BigDecimals are immutable

    // Wrong Approach
    BigDecimal bdA = new BigDecimal(d1);
    BigDecimal bdB = new BigDecimal(d2);

    System.out.println("(Wrong Approach) bd1 + bd2 is: " + bdA.add(bdB)); // 0.9000000000000000499600361081320443190634250640869140625

    // Correct Approach
    BigDecimal bd1 = BigDecimal.valueOf(d1);
    BigDecimal bd2 = BigDecimal.valueOf(d2);

    System.out.println("(Correct Approach) bd1 + bd2 is: " + bd1.subtract(bd2)); // 0.7

    //BigDecimal bd3 = BigDecimal.valueOf(f1);
    //BigDecimal bd4 = BigDecimal.valueOf(f2);

    BigDecimal bd3 = new BigDecimal(Float.toString(f1));
    BigDecimal bd4 = new BigDecimal(Float.toString(f2));

    System.out.println("(Correct Approach) bd3 + bd4 is: " + bd3.add(bd4)); // 0.4








  }


  
}
