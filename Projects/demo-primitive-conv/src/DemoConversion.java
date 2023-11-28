public class DemoConversion {
    public static void main(String[] args) throws Exception {
        // byte -> short -> int -> long

        byte b = 2;
        short s1 = b; // OK, upcast, no precision loss 可以升級，沒有精度損失
        int n1 = s1; 
        long l1 = n1;

        // long -> int -> short -> byte

        long l2 = 4L;
        // short s2 = l2; Not OK, potentially precision loss, 它不會在乎數字是多少
        short s2 = (short)l2; // Fixed but Risky
        l2 = 40000; // 40000 -> int value 
        s2 = (short) l2; // overflow
        System.out.println("s2=" + s2); //-25536

        short s3 = 130;
        byte b2 = (byte) s3; // overflow 
        System.out.println("b2=" + b2); //-126

        byte b3 = 127; //int value
        
        float f1 = (float) 1.3d; //downcast
        double d1 = 5.2f; //upcast

        // float vs long

        float f2 = 3.5f;
        long l3 = (long)f2; // downcast
        float f3 = 10L; // upcast

        // char vs int
        int i3 = 'a'; //char to int, 97, upcast
        int i4 = 65610; // 65610 - 65535 // char 沒有負數
        char c3 = (char) i4; //downcast
        System.out.println("c3 (int) = " + (int) c3); // 74
        System.out.println("c3 (char) = " + c3); // J
  }
}
