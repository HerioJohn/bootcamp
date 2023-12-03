public class DemoWrapper {
    public static void main(String[] args) throws Exception {
        // int -> Integer

        int i1 = 3;
        Integer i2 = 3; // 3 is int value -> autobox
        int i3 = i2; // auto-unbox

        Integer i4 = new Integer(5);
        Integer i5 = Integer.valueOf(3);

        int result = i4.compareTo(i2); // 1
        System.out.println(result);
        int result2 = i2.compareTo(i4); // -1
        System.out.println(result2);

        if (i2 > i4){ // comparing the 2 int value , !!! DONT DO THIS! USE compareTo instead. !!!

        }

        if (i2.compareTo(i4) == 0) { // asking if i2 == i4

        }


        // double
        double d0 = 3.5d;
        Double d1 = 3.5d;
        Double d2 = Double.valueOf(3.5d);
        Double d3 = new Double(3.5d);

        float f1 = 3.5f;

        // char
        // boolean

        boolean isOkay = true;
        Boolean isPassed = true; //autobox
        Boolean isPassed2 = Boolean.valueOf(true);
        Boolean isPassed3 = new Boolean(true);

        // Long
        Long l1 = 10L; // 10L is long value, auto-box
        // Long -> Integer, how to fix?
        Integer i6 = (int) (long)l1; // int -> Integer (autobox)
        Long l2 = (long) i6; // long -> Long (autobox)



    }
}
