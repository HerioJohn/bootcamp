package SelfNote.Week3;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Note_5_BigDecimal {
  
  public static void main(String[] args) {

  // We should not use double / float to solve decimal Math problem, because...  
    
  double d1 = 0.1 + 0.2;
  System.out.println(d1); // 0.30000000000000004

  double d2 = 0.3 - 0.1;
  System.out.println(d2); // 0.19999999999999998

  float f1 = 0.1f * 0.2f;
  System.out.println(f1); // 0.020000001

  float f2 = 0.3f / 0.1f;
  System.out.println(f2); // 2.9999998

  // BigDeciaml in Java is a class that provides high-precision arithmetic 高精度算術 for deciaml numbers.

  BigDecimal num1 = new BigDecimal("0.1");
  BigDecimal num2 = new BigDecimal("0.2");

  // Or using valueOf() method
  BigDecimal num3 = BigDecimal.valueOf(0.2);

//--------------- Basic Arithmetic Operations ---------------

  // add
  BigDecimal sum = num1.add(num2); // 0.3

  // subtract
  BigDecimal difference = num2.subtract(num1); //0.1
  
  // multiply 
  BigDecimal product = num1.multiply(num2); // 0.2

  // divide
  BigDecimal quotient = num2.divide(num1); // 2

//--------------- Comparison Operations ---------------

// compareTo(BigDecimal other) : Compare this with other. 
//                               Returns -1, 0, or 1 if this is less than, equal to, or greater than other.

  BigDecimal a = new BigDecimal("0.1");
  BigDecimal b = new BigDecimal("0.2");

  int comparision = num1.compareTo(num2);

  if (comparision < 0) {

    System.out.println("a is less than b.");

  } else if (comparision > 0) {

    System.out.println("a is greater than b.");

  } else if (comparision == 0) {

    System.out.println("a is equal to b.");

  }

//--------------- Rounding ---------------

// SetScale(int newScale, Rounding roundingMode): Handle Rounding

  BigDecimal x = new BigDecimal("10.5467");
  BigDecimal rounded_x = x.setScale(2, RoundingMode.UP);

  System.out.println(rounded_x); // 10.55







    


  }


  
}
