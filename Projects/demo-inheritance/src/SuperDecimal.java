import java.math.BigDecimal;

public class SuperDecimal extends BigDecimal{

  public SuperDecimal() {
    super("0, 0");
  }

 
  public SuperDecimal(double value){
    super(String.valueOf(value)); // new BigDecimal("3.0")
  }

  public static SuperDecimal valueOf(double value){
    return new SuperDecimal(value);
  }

  public static void main(String[] args) {
    // SuperDecimal sd = new SuperDecimal(); // calling BigDecimal()
    // 3.0 x 4.0
    SuperDecimal sd2 = new SuperDecimal(3.0);
    SuperDecimal sd3 = SuperDecimal.valueOf(4.0);
  }



}
  

