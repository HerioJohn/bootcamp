public class Note_6_PrimitiveAndOverflow {
  
  // Casting primitive data tpyes allow us to convert a piece of data from one type to another

  // "Widening" means converting to a data type with either more precision or more space

  // "Narrowing" means converting to a data type with either less precision or less space

  double a = 3.0; // Stack side: a = 3.0

  double b = 4; // Widening happens automatically -> Stack side: b = 4.0

  double c = (double) 5; // Manually Widening, not a must, but good when working with other -> Stack side: c = 5.0

  // int d = c; Error: can't convert double to int

  int d = (int) c; // Stack side: d = 5;

  int e = (int) 3.95; // Stack side: e = 3;

  //----------------------------[Overflow]-------------------------

  public static void main(String[] args) {
    
  int x = 1000; // int can hold -2,147,483,648 to 2,147,483,647

  byte y; // byte can hold from -128 to 127

  y = (byte) x;

  System.out.println("y = " + y); // -24 (Overflow, byte can't store a value of 1000)

  // When a byte, short, int or long "overflow", they will "wrap around"

  // double and float won't wrap around, but will go to infinity or -infinity

  }



}
