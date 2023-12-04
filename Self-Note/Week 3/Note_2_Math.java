public class Note_2_Math {

  public static void main(String[] args) {


    // pow()
    System.out.println(Math.pow(2.0, 10)); // inside is double // 2 ^ 10

    System.out.println(Math.pow(2.0, -1)); // 1 / (2^1)

    System.out.println(Math.pow(-2.0, 3)); // -2 ^ 3

    //sqrt()

    System.out.println(Math.sqrt(81)); //9.0
    System.out.println(Math.sqrt(-81)); //NaN

    // abs() -> absolute value
    System.out.println(Math.abs(3.2)); // 3.2
    System.out.println(Math.abs(-3.2)); // 3.2

    // ceil() 

    System.out.println(Math.ceil(3.1)); // 4.0

    // floor()

    System.out.println(Math.floor(3.9)); // 3.0
    
    // round()

    System.out.println(Math.round(3.4)); // 3
    System.out.println(Math.round(3.8)); // 4

    // max()

    System.out.println(Math.min(7.5, 6.8)); // 7.5

    // min()
    
    System.out.println(Math.min(7.5, 6.8)); // 6.8

    // random()

    System.out.println(Math.random()); // 0.0 - 1.0

    // random() 1 - 10

    int random2 = (int)(Math.random() * 10 + 1);

    System.out.println(random2);



    



  }
  
}
