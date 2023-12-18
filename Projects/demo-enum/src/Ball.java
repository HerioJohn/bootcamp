public class Ball {

  // 
  private Color color;

  public Ball (Color color) {
    this.color = color;
  }

  public Color getColor() {
    return this.color;
  }

  public static void main(String[] args) {
    // Before the main() starts, class load -> new Color("Red")
    // Color.RED (something like public static final, but Color.RED is an object)
    // You cannot "new" the Color object by yourself

    Ball b1 = new Ball(Color.RED);
    Ball b2 = new Ball(Color.BLACK);
    Ball b3 = new Ball(Color.BLACK);
    Ball b4 = new Ball(Color.Yellow);

    if (b1.getColor() == b2.getColor()) {
      System.out.println("Same color");
    }

    if (b1.getColor() != b2.getColor()) {
      System.out.println("Different color");
    }

  }
  
}
