public class Note_3_WrapperClass {

  // wrapper class = provides a way to use primitive data types as reference data types.
  //                 reference data types contain useful methods
  //                 can be used with collections (ex. ArrayList)

  // Primitive          // Wrapper
  //-------------------------------
  // byte                  Byte
  // short                 Short
  // int                   Integer
  // long                  Long
  // float                 Float
  // double                Double
  // boolean               Boolean
  // char                  Character

  // autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their coressponding object wrapper class.
  // unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive.

  // autoboxing (Primitive -> Wrapper)
  int i = 20;
  Integer new_i = new Integer(i); // new_i = 20
  Integer b = Integer.valueOf(3); //b = 3

  // unboxing (Wrapper -> Primitive)
  Integer x = 50;
  int y = x.intValue(); // y = 50
  
}
