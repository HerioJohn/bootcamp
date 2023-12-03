public class Circle {

  private double radius;


  // Empty Constructor
  public Circle() {

  }

  // Argument Constructor
  public Circle (double x){
    this.radius = x;
  }

  public double diameter(double x) { 
    return x;
  }

  // Getter
  public double getRadius(){
    return this.radius;
  }

    // Getter  // Setter
  public void setRadius(double x) {
    this.radius = x;
  }

  public static void main(String[] args){
    Circle circle_A = new Circle(); // radius = 0.0
    circle_A.setRadius(3.5);
    System.out.println("The radius of circle A is: " + circle_A.radius);
    System.out.println();
  }


  
}
