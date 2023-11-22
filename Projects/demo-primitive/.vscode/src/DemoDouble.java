public class DemoDouble {

  public static void main(String[] args){

    double d1 = 0.2; // If no notation, default it is double type value.
    double d2 = 0.3;
    double d3 = d1 + d2;
    System.out.println(d3);

    // There is some problem with double, for example: 0.1 + 0.2 will screw things up

    float f1 = 0.2f; //For float, must add notation, otherwise will cause error.
    float f2 = 1000.1234567890f; 
    System.out.println(f2); //1000.1235

  }
  
}
