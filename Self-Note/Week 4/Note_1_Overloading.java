
public class Note_1_Overloading {

  public static int add(int x, int y) {
    return x + y;
  }

public static void main(String[] args) {
  //System.out.println(add(1.0, 2.0)); Error:The method add(int, int) in the type Note_1_Overloading is not applicable for the arguments (double, double)
  System.out.println(add((int)1.0, (int)3.0)); //4


}

  
}
