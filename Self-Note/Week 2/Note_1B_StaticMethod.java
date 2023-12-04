public class Note_1B_StaticMethod {

  public static void main(String[] args) {

    // Method 1

    int a = 1;
    int b = 1;
    int c = sum(a, b);
    System.out.println("The value of c is: " + c);

    // Method 2

    String s = "This is a very Longggggggggggggggggggggggggggggggg sentencesssss.";
    System.out.println("The original long sentence will become: " + empty(s));
  }

  // Method 1

  static int sum(int x, int y){
    int total = x + y;
    return total;
  }

  // Method 2

  static String empty(String s){
    String result = "";
    return result;
  }
  
}
