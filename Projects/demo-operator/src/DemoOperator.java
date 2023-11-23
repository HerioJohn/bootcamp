public class DemoOperator {
    public static void main(String[] args) throws Exception {
        int x = 2;
        x++;
        ++x;
        x += 1;
        x = x + 1; //6

        // difference between a++ and ++a
        int a = 5;
        int preIncrement = ++a; // a is increment by 1 first, and then being assigned  //先對 a 進行 +1 的處理，然後再使用 a 的值
        // a -> 6 first, then preIncrement -> 6
        System.out.println("preIncrement = " + preIncrement);
        System.out.println("a = " + a);

        int b = 5;
        int postIncrement = b++; //assign the value of variabble b to postIncrement //先使用 b 的值，然後再對 b 進行 +1 的處理
        // postIncrement -> 5,  b -> 6
        System.out.println("postIncrement = " + postIncrement);
        System.out.println("b = " + b);

        int c = 1;
        c++;

        //Conditional Operators
        // &&  || ! 
        // && 同時
        // || 或者
        // ！不

        String h = "Hello";
        
        if (c == 2 && (b == 4 || "Hello".equals(h))){
            System.out.println("Yes");         // (c == 2) -> true
                                               // (b == 4) -> false
        }
        else{
            System.out.println("No");  
        }

        int English = 80;
        int Chinese = 75;
        int Math = 82;
        int Physcis = 99;
        int History = 10;

        int GoodResult_Number = 0;

        if (English >= 80)
        {
            GoodResult_Number++;
        }
        if (Chinese >= 80)
        {
            GoodResult_Number++;
        }
        if (Math >= 80)
        {
            GoodResult_Number++;
        }
        if (Physcis >= 80)
        {
            GoodResult_Number++;
        }
        if (History >= 80)
        {
            GoodResult_Number++;
        }

        if (GoodResult_Number >= 3)
        {
            System.out.println("I Pass The Exam!");
        }

        // && 會優先於 || 即使沒有（）也一樣

        if (c == 1 || b == 4 && "hello".equals(h))
        {

        }

        // boolean -> && ||, without using if statement

        boolean b1 = true;
        boolean b2 = false;

        boolean b1_b2_result = b1 || b2; // true || false = true

        if (b1) // another approach, represent if b1 == true
        {
            System.out.println("I don't need to use b1 == true! HAHA!");
        }

        if (!b2) // another approach, represent if b2 == false
        {

        }

        //Approach 1

        int g = 0;
        if (b1 == false)
        {
            g = 10;
        }

        // Approach 2

        int k = b1 == false ? 10 : 0;
        // if b1 is false, assign 10 to k, otherwise 0

        int a1 = 10;
        int a2 = 4;

        int min = a2 < a1 ? a2 : a1;
        System.out.println(min);

//------------------------------------------------------------------------------//

        int number = 13;
        boolean isOdd;
        int remainder = number % 2;

        if (remainder != 0 ) {
            System.out.println(number + " is an Odd number!");
        }
        else {
            System.out.println(number + " is not an Odd number!");
        }

//------------------------------------------------------------------------------//

        double totalAmount;
        double itemTotal = 3100;
        double transportationFee = 0.03;

        // if itemTotal >= 3000, No transportation fee, otherwise +3% transportation fee

        if (itemTotal >= 3000)
        {
            totalAmount = itemTotal;
        }
        else
        {
            totalAmount = itemTotal + itemTotal * transportationFee;
        }

        System.out.println("The Total Amount will be " + totalAmount);

//------------------------------------------------------------------------------//

        String applewebsite = "www.apple.com";
        if (applewebsite.length() < 10 || "apple".equals(applewebsite)){
            System.out.println("length < 10 or www.apple.com");
        }

        String s = ""; // empty string, length = 0
        System.out.println(s.length()); //0
        s += "hello";

        if (!s.isEmpty()){ // if string s is not Empty
            System.out.println("s is NOT empty!");
        }


            



        





        




 




    }
}
