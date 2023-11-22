public class DemoInt {
    public static void main(String[] args) {

        // "" -> String
        // number

        System.out.println("2 abc");
        System.out.println(2);
        System.out.println(2.3);
        
        // monthlySalary & age & i are both "variable" 變量
        // "int age" -> Delaraction, int -> "integer" 整數
        // "age = 30" -> assign the value 30 to the variable 

        int monthlySalary = 20000;
        int age = 30;
        int i = 2;

        System.out.println("I am now " + age + " years old, and my monthly salary is " + monthlySalary );

        int level; // Declaration (We can't Re-Declaration)
        level = 1; // Assignment
        level = 10; // Re-assignment 

        level = level + 3; // 10 + 3 = 13
        level += 4; // level = level + 4 = 13 + 4 = 17

        level = level - 3; // 17 - 3 = 14
        level -= 4; // level = level - 4 = 14 - 4 = 10
        
        level *= 3; // 10 x 3 = 30

        level /= 7; // 30 / 7 = 4

        level++; // 4 + 1 = 5

        ++level; // 5 + 1 = 6

        level--; // 6 - 1 = 5

        --level; // 5 - 1 = 4

         System.out.println("Before reminder is:" + " " + level);

        int remainder = level % 3; // 4 - (4 / 3) = 1

        System.out.println("The final number of the remainder is:" + " " + remainder);

        // 儲存整數除了int還有其他方式，一共是 byte, short, int, long (primitive 原始)
        byte b = 127; // byte is only integer from -128 to 127

        short s = -32768; // short is only integer from -32768 to 32767
        
        int i2 = -2147483648; // int is only integer from -2147483648 to 2147483647

        long l1 = 2147483649L; // long is integer and support Very High Number // The L is a notation -> long value

        int i5 = 100; //The value 100 has no notation -> default is an int value 
        byte b4 = 100; // Java implicitly convery the int to byte
        short s4 = 100; // Java implicitly convery the int to short

        l1 += 10L; //2147483649 + 10
        System.out.println(l1);



    }
}
